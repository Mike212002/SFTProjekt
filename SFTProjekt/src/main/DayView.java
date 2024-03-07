package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayView extends JFrame {
    private JLabel dateLabel;
    private JPanel eventsPanel;

  
    public DayView(Date date) {
        setTitle("Day View");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(240, 240, 240));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        dateLabel = new JLabel("Datum: " + date, SwingConstants.CENTER);
        dateLabel.setFont(new Font("Roboto", Font.BOLD, 24));
        dateLabel.setForeground(Color.BLACK);
        mainPanel.add(dateLabel, BorderLayout.NORTH);

        eventsPanel = new JPanel();
        eventsPanel.setLayout(new BoxLayout(eventsPanel, BoxLayout.Y_AXIS));
        eventsPanel.setBackground(Color.WHITE);
        eventsPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        JScrollPane scrollPane = new JScrollPane(eventsPanel);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);

        displayDayEvents(date);
    }

    private void displayDayEvents(Date date) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String dateString = inputFormat.format(date);

            if (!isValidDate(dateString)) {
                dateString = inputFormat.format(Calendar.getInstance().getTime());
            }

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputFormat.parse(dateString));

            dateLabel.setText("Date: " + inputFormat.format(calendar.getTime()));

            for (int i = 0; i < 24; i++) {
                JLabel eventLabel = new JLabel(String.format("%02d:00 - %02d:59", i, i));
                eventLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
                eventLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
                eventsPanel.add(eventLabel);

                if (i < 23) {
                    JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
                    separator.setForeground(Color.LIGHT_GRAY);
                    eventsPanel.add(separator);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void setSelectedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        dateLabel.setText("Date: " + formattedDate);
        displayDayEvents(date);
    }

    public void updateSelectedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        dateLabel.setText("Date: " + formattedDate);
    }
    

}
