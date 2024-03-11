package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private Map<String, String> eventMap;
    private JTextField TimeEintrag;
    private JTextField TimeEintrag2;

    private JLabel lastClickedLabel = null;
    private DayView dayView;

    private JLabel selectedLabel = null;

    private MouseListener mouseClickListener = new MouseAdapter() {
     @Override
public void mouseClicked(MouseEvent e) {
    if (e.getSource() instanceof JLabel) {
        JLabel clickedLabel = (JLabel) e.getSource();
        if (SwingUtilities.isLeftMouseButton(e)) {
            // Setze die Hervorhebung für das ausgewählte Label zurück
            if (selectedLabel != null) {
                selectedLabel.setBackground(Color.WHITE);
                selectedLabel.setForeground(Color.BLACK);
                selectedLabel.repaint();
            }

            // Aktualisiere das ausgewählte Label
            clickedLabel.setBackground(Color.BLUE);
            clickedLabel.setForeground(Color.WHITE);
            clickedLabel.repaint();

            selectedLabel = clickedLabel;

            int day = Integer.valueOf(clickedLabel.getText());

            String date = formattedDate(day, currentCalendar.get(Calendar.MONTH) + 1, currentCalendar.get(Calendar.YEAR));

            // Überprüfe, ob ein Ereignis für das Datum vorhanden ist
            if (eventMap.containsKey(date)) {
                // Extrahiere startTime, endTime und title aus dem Ereignisdatum
                String eventDetails = eventMap.get(date);
                String[] timeEntries = eventDetails.split("-");
                if (timeEntries.length == 3) {
                    String startTime = timeEntries[0];
                    String endTime = timeEntries[1];
                    String title = timeEntries[2];

                    // Zeige den Titel und die Uhrzeit im JTextArea-Bereich an
                    showEventInNotesArea(title, startTime, endTime);
                } else {
                    // Fehlerbehandlung, wenn die Ereignisdetails nicht erwartungsgemäß aufgeteilt werden können
                    notesTextArea.setText("Fehler: Ungültiges Ereignisformat.");
                }
            } else {
                // Lösche den Text im notesTextArea, wenn kein Ereignis vorhanden ist
                notesTextArea.setText("");
            }
        } else if (SwingUtilities.isRightMouseButton(e)) {
            if (dayView == null || !dayView.isVisible()) {
                dayView = new DayView(new Date());
                dayView.setVisible(true);
            }
        }
    }
}
    };

    private String formattedDate(int day, int month, int year) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        String formattedYear = String.format("%02d", year);

        return formattedDay + "." + formattedMonth + "." + formattedYear;
    }

    private String selectedDate;

    public CustomCalendar() {
        eventMap = new HashMap<>();
        initCustomComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1400, 1100));

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
notesTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
notesTextArea.setBorder(new EmptyBorder(150, 150, 150, 150));
notesTextArea.setLineWrap(true); 
notesTextArea.setWrapStyleWord(true); 
notesTextArea.setPreferredSize(new Dimension(500, 500)); 
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
                eventErstellen.setVisible(true);
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
            label.setOpaque(true);
            
            String formattedDate = formattedDate(day, currentCalendar.get(Calendar.MONTH)+1, currentCalendar.get(Calendar.YEAR));
            if(eventMap.containsKey(formattedDate)){
                label.setBackground(Color.GREEN); 
            }
            else{
            label.setBackground(Color.WHITE); // Standardhintergrundfarbe
            }
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

    private void showEventForDate(String date) {
        if (eventMap.containsKey(date)) {
            String titleAndTime = eventMap.get(date);
            JOptionPane.showMessageDialog(this, titleAndTime, "Ereignisdetails", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Kein Ereignis für dieses Datum.");
        }
    }

    private String formatTime(String time) {
    try {
        SimpleDateFormat originalFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat targetFormat = new SimpleDateFormat("HH:mm");
        Date date = originalFormat.parse(time);
        return targetFormat.format(date);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return time; // Rückgabe der unveränderten Zeit, falls ein Fehler auftritt
}

private void showEventInNotesArea(String title, String startTime, String endTime) {
    if (notesTextArea != null) {
        String formattedText = "Titel:\n\t" + (title != null ? title : "");

        if (startTime != null && endTime != null) {
            formattedText += "\n\nUhrzeit:\n\t" + startTime + " - " + endTime;
        }

        notesTextArea.setText(formattedText);
    } else {
        System.err.println("notesTextArea is null. Initialization issue!");
    }
}

public void addEvent(String date, String title, String startTime, String endTime) {
    // Füge das Ereignis zur Ereignismap hinzu
    String fullEventDetails = startTime + "-" + endTime + "-" + title;
    eventMap.put(date, fullEventDetails);

    // Überprüfe, ob das hinzugefügte Ereignis dem Datum des ausgewählten Labels entspricht
    if (selectedLabel != null) {
        int day = Integer.parseInt(selectedLabel.getText());
        String selectedDate = formattedDate(day, currentCalendar.get(Calendar.MONTH) + 1, currentCalendar.get(Calendar.YEAR));
        if (date.equals(selectedDate)) {
            // Aktualisiere das JTextArea-Feld mit Titel und Uhrzeit
            showEventInNotesArea(title, startTime, endTime);
        } else {
            // Lösche den Text im JTextArea-Feld, wenn das Datum nicht übereinstimmt
            notesTextArea.setText("");
        }
    }
}



}
