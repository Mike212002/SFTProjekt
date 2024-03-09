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
    private Map<String, String> eventMap;


    private JLabel lastClickedLabel = null;
    private DayView dayView;

    private JLabel selectedLabel = null;

 
private MouseListener mouseClickListener = new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() instanceof JLabel) {
            JLabel clickedLabel = (JLabel) e.getSource();
            if (SwingUtilities.isLeftMouseButton(e)) {

                if (selectedLabel != null) {
                    selectedLabel.setBackground(Color.WHITE);
                    selectedLabel.setForeground(Color.BLACK);
                    selectedLabel.repaint();
                }

                clickedLabel.setBackground(Color.BLUE);
                clickedLabel.setForeground(Color.WHITE);
                clickedLabel.repaint();

                selectedLabel = clickedLabel;

                String date = clickedLabel.getText();

                // Wenn ein Tag im Kalender geklickt wird, überprüfen Sie, ob ein Ereignis vorhanden ist
                // und zeigen Sie es an
                if (eventMap.containsKey(date)) {
                    String title = eventMap.get(date);
                    // Hier können Sie den Titel für das Datum anzeigen, z.B. in einem Pop-up-Fenster
                    JOptionPane.showMessageDialog(CustomCalendar.this, title);
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

    private String selectedDate;

    public CustomCalendar() {
  eventMap = new HashMap<>();
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
    
 public void addEvent(String date, String title) {
    // Speichern Sie das Ereignis im Ereignis-Map
    eventMap.put(date, title);

    // Aktualisieren Sie das entsprechende JLabel im Kalender
    Component[] components = calendarPanel.getComponents();
    for (Component component : components) {
        if (component instanceof JLabel) {
            JLabel label = (JLabel) component;
            if (label.getText().equals(date)) {
                label.setText("<html>" + date + "<br>" + title + "</html>");
                break;
            }
        }
    }
}



      private void showEventForDate(String date) {
        if (eventMap.containsKey(date)) {
            String title = eventMap.get(date);
            // Hier können Sie den Titel für das Datum anzeigen, z.B. in einem Pop-up-Fenster
            JOptionPane.showMessageDialog(this, title);
        } else {
            // Wenn für das Datum kein Ereignis vorhanden ist, zeigen Sie eine entsprechende Nachricht an
            JOptionPane.showMessageDialog(this, "Kein Ereignis für dieses Datum.");
        }
    }

}
