package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalenderView extends JFrame {

    private Calendar currentMonth;
    private JLabel monthLabel;
    private JPanel calendarPanel;
    private JTextField startDateField;
    private JTextField endDateField;
    private JTextField datumEintrag;

    private int selectedDay = -1;
    private int startDay = -1;
    private int endDay = -1;

    public CalenderView(JTextField startDateField, JTextField endDateField, JTextField datumEintrag) {
        this.startDateField = startDateField;
        this.endDateField = endDateField;
        this.datumEintrag = datumEintrag;
        currentMonth = Calendar.getInstance();

        initComponents();
    }

    private void initComponents() {
        setTitle("Calendar");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        monthLabel = new JLabel();
        monthLabel.setHorizontalAlignment(SwingConstants.CENTER);
        updateMonthLabel();

        JButton previousButton = new JButton("<");
        previousButton.setFont(new Font("Arial", Font.BOLD, 14));
        previousButton.setPreferredSize(new Dimension(50, 30));
        previousButton.setBackground(Color.WHITE);
        previousButton.setForeground(Color.BLACK);
        previousButton.addActionListener(e -> {
            currentMonth.add(Calendar.MONTH, -1);
            updateMonthLabel();
            updateCalendar();
        });

        JButton nextButton = new JButton(">");
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        nextButton.setPreferredSize(new Dimension(50, 30));
        nextButton.setBackground(Color.WHITE);
        nextButton.setForeground(Color.BLACK);
        nextButton.addActionListener(e -> {
            currentMonth.add(Calendar.MONTH, 1);
            updateMonthLabel();
            updateCalendar();
        });

        JPanel buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.add(previousButton, BorderLayout.WEST);
        buttonPanel.add(monthLabel, BorderLayout.CENTER);
        buttonPanel.add(nextButton, BorderLayout.EAST);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        updateCalendar();

        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Arial", Font.BOLD, 14));
        okButton.setPreferredSize(new Dimension(100, 40));
        okButton.setBackground(Color.WHITE);
        okButton.setForeground(Color.BLACK);
        okButton.addActionListener(e -> {
            setVisible(false);
        });

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(calendarPanel, BorderLayout.CENTER);
        mainPanel.add(okButton, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);

        setLocationRelativeTo(null);
    }

    private void updateMonthLabel() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
        monthLabel.setText(sdf.format(currentMonth.getTime()));
    }

    private void updateCalendar() {
        calendarPanel.removeAll();
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        for (String day : daysOfWeek) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 12));
            label.setForeground(Color.BLUE);
            calendarPanel.add(label);
        }

        Calendar calendar = (Calendar) currentMonth.clone();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int maxDays = currentMonth.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        for (int i = 1; i <= maxDays; i++) {
            int day = i;
            JLabel label = new JLabel(String.valueOf(day), SwingConstants.CENTER);
            label.setOpaque(true);
            label.setBackground(Color.WHITE);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            label.setFont(new Font("Arial", Font.PLAIN, 12));
            label.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    dayClicked(day);
                }
            });
            calendarPanel.add(label);
        }

        revalidate();
        repaint();
    }

    private void dayClicked(int day) {
        if (startDay == -1) {
            startDay = day;
            setDatumEintrag(getFormattedDate(startDay));
        } else if (endDay == -1) {
            endDay = day;
            setDatumEintrag(getFormattedDate(startDay) + " - " + getFormattedDate(endDay));
        } else {
            startDay = day;
            endDay = -1;
            setDatumEintrag(getFormattedDate(startDay));
        }
    }

    private String getFormattedDate(int day) {
        return currentMonth.get(Calendar.YEAR) + "/" + (currentMonth.get(Calendar.MONTH) + 1) + "/" + day;
    }

    public void setDatumEintrag(String text) {
        datumEintrag.setText(text);
    }

    public JTextField getEndDateField() {
        return endDateField;
    }

}
