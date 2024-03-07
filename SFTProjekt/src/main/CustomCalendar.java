package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class CustomCalendar extends JFrame {

    private JPanel calendarPanel;
    private JTextArea notesTextArea;
    private JLabel monthYearLabel;
    private JLabel timeLabel;
    private JLabel dateLabel;
    private Calendar currentCalendar;
    private SimpleDateFormat dateFormat;
    private JTextField TitelEingabe;
    private JLabel lastClickedLabel = null;
    private DayView dayView;
    private JTextField datumEintrag;
    private JLabel selectedLabel = null;
    private Map<String, String> eventsMap = new HashMap<>();
    private Map<String, String> eventNotes; 
    private Map<String, Color> eventDates; 

    private MouseListener mouseClickListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() instanceof JLabel) {
                JLabel clickedLabel = (JLabel) e.getSource();
                if (SwingUtilities.isLeftMouseButton(e)) {
                    // Überprüfen, ob ein vorheriger Tag ausgewählt wurde
                    if (selectedLabel != null) {
                        // Setze den Hintergrund des vorherigen Tags auf Weiß
                        selectedLabel.setBackground(Color.WHITE);
                        selectedLabel.setForeground(Color.BLACK);
                        // Repaint, um die Änderungen anzuzeigen
                        selectedLabel.repaint();
                    }
                    // Setze den Hintergrund des aktuellen Tags auf Blau
                    clickedLabel.setBackground(Color.BLUE);
                    clickedLabel.setForeground(Color.WHITE);
                    // Repaint, um die Änderungen anzuzeigen
                    clickedLabel.repaint();
                    // Setze den aktuellen Tag als ausgewählt
                    selectedLabel = clickedLabel;

                    // Füge das Ereignis zum ausgewählten Datum hinzu
                    String date = clickedLabel.getText();

                } else if (SwingUtilities.isRightMouseButton(e)) {
                    if (dayView == null || !dayView.isVisible()) {
                        // Öffne das DayView-Fenster nur, wenn es noch nicht geöffnet ist
                        dayView = new DayView(new Date());
                        dayView.setVisible(true);
                    }
                }
            }
        }
    };

    private String selectedDate;

    public CustomCalendar() {
        
        
           eventNotes = new HashMap<>();
        eventDates = new HashMap<>();
        
        TitelEingabe = new JTextField();
        datumEintrag = new JTextField();
        initCustomComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1100, 800));

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBackground(Color.GRAY);
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JPanel timePanel = new JPanel(new GridBagLayout());
        timePanel.setBackground(Color.BLUE);

        GridBagConstraints timeLabelConstraints = new GridBagConstraints();
        timeLabelConstraints.gridx = 0;
        timeLabelConstraints.gridy = 0;
        timeLabelConstraints.insets = new Insets(10, 10, 10, 10);
        timeLabelConstraints.anchor = GridBagConstraints.CENTER;

        GridBagConstraints dateLabelConstraints = new GridBagConstraints();
        dateLabelConstraints.gridx = 0;
        dateLabelConstraints.gridy = 1;
        dateLabelConstraints.insets = new Insets(10, 10, 10, 10);
        dateLabelConstraints.anchor = GridBagConstraints.CENTER;

        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 60));
        timePanel.add(timeLabel, timeLabelConstraints);

        dateLabel = new JLabel("", SwingConstants.CENTER);
        dateLabel.setForeground(Color.WHITE);
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        timePanel.add(dateLabel, dateLabelConstraints);

        mainPanel.add(timePanel, BorderLayout.WEST);

        JPanel navigationPanel = new JPanel(new BorderLayout());
        navigationPanel.setBackground(Color.GRAY);

        ImageIcon backIcon = new ImageIcon(getClass().getResource("/icon/back.png"));
        JButton backButton = new JButton(backIcon);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCalendar.add(Calendar.MONTH, -1);
                updateCalendar();
            }
        });
        navigationPanel.add(backButton, BorderLayout.WEST);

        monthYearLabel = new JLabel("", SwingConstants.CENTER);
        monthYearLabel.setForeground(Color.WHITE);
        navigationPanel.add(monthYearLabel, BorderLayout.CENTER);

        ImageIcon nextIcon = new ImageIcon(getClass().getResource("/icon/next.png"));
        JButton nextButton = new JButton(nextIcon);
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCalendar.add(Calendar.MONTH, 1);
                updateCalendar();
            }
        });
        navigationPanel.add(nextButton, BorderLayout.EAST);

        mainPanel.add(navigationPanel, BorderLayout.NORTH);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        calendarPanel.setBackground(Color.WHITE);
        mainPanel.add(calendarPanel, BorderLayout.CENTER);

        JPanel notesPanel = new JPanel(new BorderLayout());

        notesTextArea = new JTextArea();
        notesTextArea.setEditable(false);
        notesTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
        notesTextArea.setBorder(new EmptyBorder(150, 150, 150, 150));
        JScrollPane scrollPane = new JScrollPane(notesTextArea);
        notesPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel iconPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        iconPanel.setBackground(Color.GRAY);
        iconPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        ImageIcon trashIcon = new ImageIcon(getClass().getResource("/icon/trash.png"));
        JButton trashButton = new JButton(trashIcon);
        trashButton.setContentAreaFilled(false);
        trashButton.setBorderPainted(false);
        iconPanel.add(trashButton);

        ImageIcon addIcon = new ImageIcon(getClass().getResource("/icon/add.png"));
        JButton addButton = new JButton(addIcon);
        addButton.setContentAreaFilled(false);
        addButton.setBorderPainted(false);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventErstellen eventErstellen = new EventErstellen(CustomCalendar.this);

                eventErstellen.getErstellen().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String title = eventErstellen.getTitelEingabe().getText();
                        String date = eventErstellen.getDatumEintrag().getText();

                        // Fügen Sie das Ereignis automatisch zum Kalender hinzu
                        addEventToCalendar(date, title);

                        eventErstellen.dispose();
                    }
                });

                eventErstellen.setVisible(true);; // Zeige das Fenster für das Ereignis an
            }
        });
        iconPanel.add(addButton);

        notesPanel.add(iconPanel, BorderLayout.NORTH);

        mainPanel.add(notesPanel, BorderLayout.EAST);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);

        currentCalendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEEE, dd.MM.yyyy");
        updateTimeAndDate();
        updateCalendar();

    }

    private void updateCalendar() {
        int month = currentCalendar.get(Calendar.MONTH);
        int year = currentCalendar.get(Calendar.YEAR);

        monthYearLabel.setText(new SimpleDateFormat("MMMM yyyy").format(currentCalendar.getTime()));

        calendarPanel.removeAll();

        Calendar calendar = new GregorianCalendar(year, month, 1);
        int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        String[] daysOfWeek = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"};
        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            label.setBackground(Color.LIGHT_GRAY);
            label.setOpaque(true);
            calendarPanel.add(label);
        }

        for (int i = 1; i < firstDayOfMonth; i++) {
            calendarPanel.add(new JLabel(""));
        }

        for (int day = 1; day <= daysInMonth; day++) {
            JLabel label = new JLabel(String.valueOf(day), SwingConstants.CENTER);
            label.addMouseListener(mouseClickListener);
            calendarPanel.add(label);

            label.setOpaque(true); // Stellen Sie sicher, dass das Label undurchsichtig ist
            label.setBackground(Color.WHITE); // Standardhintergrundfarbe
            label.addMouseListener(mouseClickListener); // Fügen Sie den Maus-Listener hinzu
            calendarPanel.add(label);
        }
        monthYearLabel.setText(new SimpleDateFormat("MMMM yyyy").format(currentCalendar.getTime()));
        calendarPanel.revalidate();
        calendarPanel.repaint();

    }

    private void updateTimeAndDate() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLabel.setText(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
                dateLabel.setText(dateFormat.format(Calendar.getInstance().getTime()));
            }
        });
        timer.start();
    }

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());

    }

    public void addEventToSelectedDate(String date, String title) {
        if (date == null || date.isEmpty() || title == null || title.isEmpty()) {
            return;
        }

        // Finden Sie das JLabel für den entsprechenden Tag im Kalender
        JLabel targetLabel = findLabelForDate(date);
        if (targetLabel != null) {
            // Fügen Sie das Ereignis zum JLabel hinzu
            // Wenn bereits ein Ereignis vorhanden ist, fügen Sie den Titel hinzu, sonst setzen Sie ihn
            String existingText = targetLabel.getText();
            if (existingText != null && !existingText.isEmpty()) {
                targetLabel.setText(existingText + ", " + title);
            } else {
                targetLabel.setText(title);
            }
        }
    }

    public void addEventToCalendar(String date, String title) {
        if (date == null || date.isEmpty() || title == null || title.isEmpty()) {
            return;
        }

        // Fügen Sie das Ereignis in die Map ein
        eventsMap.put(date, title);

        // Aktualisieren Sie das JLabel für den entsprechenden Tag im Kalender
        JLabel targetLabel = findLabelForDate(date);
        if (targetLabel != null) {
            // Fügen Sie das Ereignis zum JLabel hinzu
            // Wenn bereits ein Ereignis vorhanden ist, fügen Sie den Titel hinzu, sonst setzen Sie ihn
            String existingText = targetLabel.getText();
            if (existingText != null && !existingText.isEmpty()) {
                targetLabel.setText(existingText + ", " + title);
            } else {
                targetLabel.setText(title);
            }
        }
    }

    public void updateEventTitle(String date, String title) {
        if (eventsMap.containsKey(date)) {
            eventsMap.put(date, title);

            updateNotesTextArea();
        }
    }

    private void updateNotesTextArea() {
        notesTextArea.setText(""); // Leeren Sie zuerst den Inhalt

        for (Map.Entry<String, String> entry : eventsMap.entrySet()) {
            String date = entry.getKey();
            String title = entry.getValue();
            notesTextArea.append(title + " - " + date + "\n");
        }
    }

    private JLabel findLabelForDate(String date) {
        Component[] components = calendarPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                if (label.getText().equals(date)) {
                    return label;
                }
            }
        }
        return null;
    }

    public void addEntryToNotesPanel(String title) {
        notesTextArea.append("Titel" + title + "\n\n");
    }

    public void updateSelectedDate(String date) {
        dateLabel.setText("Date: " + date);
    }

    public JLabel getSelectedLabel() {
        return selectedLabel;
    }
    
       public void addEventToNotes(String title, String date) {
        eventNotes.put(date, title);
    }

    
    public void addEventToCalendarAndMark(String date, String title, Color color) {
        eventDates.put(date, color);
    }

 
    public void markDateWithColor(String date, Color color) {
        eventDates.put(date, color);
    }

    public String getEventTitle(String date) {
        return eventNotes.get(date);
    }

   
    public Color getDateColor(String date) {
        return eventDates.get(date);
    }
public void addEventToCalendarAndMark(String date, String title) {
      addEventToSelectedDate(date, title);

    // Markieren Sie den Tag im Kalender mit der entsprechenden Farbe
    markDateWithColor(date, color);
}
    

    private void markDateAsGreen(String date) {
        JLabel targetLabel = findLabelForDate(date);
        if (targetLabel != null) {
            targetLabel.setBackground(Color.GREEN);
            targetLabel.setOpaque(true);
            targetLabel.repaint();
        }
    }

}
