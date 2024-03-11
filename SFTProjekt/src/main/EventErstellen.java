package main;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;

/**
 *
 * @author miket
 */
public class EventErstellen extends javax.swing.JFrame {

    private CustomCalendar customCalendar;





    public EventErstellen(CustomCalendar customCalendar) {
            initComponents();
            this.customCalendar = customCalendar;
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Überschrift = new javax.swing.JLabel();
        Titlefield = new javax.swing.JLabel();
        TitelEingabe = new javax.swing.JTextField();
        Datumfield = new javax.swing.JLabel();
        Kalender = new javax.swing.JLabel();
        datumEintrag = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        Timefield = new javax.swing.JLabel();
        TimeBild = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TimeEintrag = new javax.swing.JTextField();
        TimeEintrag2 = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        Beschreibungfield = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        beschreibungEitnrag = new javax.swing.JTextArea();
        Farbauswahlfield = new javax.swing.JLabel();
        Rot = new javax.swing.JLabel();
        Grün = new javax.swing.JLabel();
        Gelb = new javax.swing.JLabel();
        Orange = new javax.swing.JLabel();
        Erstellen = new javax.swing.JButton();
        Abbrechen = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Überschrift.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Überschrift.setText("Erstelle ein neuen Termin");
        jPanel4.add(Überschrift, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 230, 50));

        Titlefield.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titlefield.setText("Titel");
        jPanel4.add(Titlefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        TitelEingabe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitelEingabe.setBorder(null);
        TitelEingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitelEingabeActionPerformed(evt);
            }
        });
        jPanel4.add(TitelEingabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 30));

        Datumfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Datumfield.setText("Datum");
        jPanel4.add(Datumfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 30));

        Kalender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Kalender.png"))); // NOI18N
        Kalender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KalenderMouseClicked(evt);
            }
        });
        jPanel4.add(Kalender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 30));

        datumEintrag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datumEintrag.setBorder(null);
        datumEintrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datumEintragActionPerformed(evt);
            }
        });
        jPanel4.add(datumEintrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 20));

        filler1.setAlignmentX(0.2F);
        filler1.setAlignmentY(0.2F);
        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setOpaque(true);
        jPanel4.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, 400, 3));

        filler2.setAlignmentX(0.2F);
        filler2.setAlignmentY(0.2F);
        filler2.setBackground(new java.awt.Color(0, 0, 0));
        filler2.setOpaque(true);
        jPanel4.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, 3));

        Timefield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Timefield.setText("Time");
        jPanel4.add(Timefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 50, 20));

        TimeBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Zeit.png"))); // NOI18N
        jPanel4.add(TimeBild, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("-");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 292, 20, 30));

        TimeEintrag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimeEintrag.setBorder(null);
        TimeEintrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeEintragActionPerformed(evt);
            }
        });
        jPanel4.add(TimeEintrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, -1));

        TimeEintrag2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimeEintrag2.setBorder(null);
        TimeEintrag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeEintrag2ActionPerformed(evt);
            }
        });
        jPanel4.add(TimeEintrag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 70, -1));

        filler3.setAlignmentX(0.2F);
        filler3.setAlignmentY(0.2F);
        filler3.setBackground(new java.awt.Color(0, 0, 0));
        filler3.setOpaque(true);
        jPanel4.add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 3));

        filler4.setAlignmentX(0.2F);
        filler4.setAlignmentY(0.2F);
        filler4.setBackground(new java.awt.Color(0, 0, 0));
        filler4.setOpaque(true);
        jPanel4.add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 70, 3));

        Beschreibungfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Beschreibungfield.setText("Beschreibung");
        jPanel4.add(Beschreibungfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, -1));

        beschreibungEitnrag.setColumns(20);
        beschreibungEitnrag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        beschreibungEitnrag.setRows(5);
        beschreibungEitnrag.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(beschreibungEitnrag);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 320, 170));

        Farbauswahlfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Farbauswahlfield.setText("Farbauswahl");
        jPanel4.add(Farbauswahlfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 140, 30));

        Rot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Rot.png"))); // NOI18N
        Rot.setToolTipText("");
        Rot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RotMouseClicked(evt);
            }
        });
        jPanel4.add(Rot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        Grün.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Grün.png"))); // NOI18N
        Grün.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrünMouseClicked(evt);
            }
        });
        jPanel4.add(Grün, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, -1));

        Gelb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Gelb.png"))); // NOI18N
        Gelb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GelbMouseClicked(evt);
            }
        });
        jPanel4.add(Gelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        Orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Orange.png"))); // NOI18N
        Orange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrangeMouseClicked(evt);
            }
        });
        jPanel4.add(Orange, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        Erstellen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Erstellen.setText("Erstellen");
        Erstellen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErstellenActionPerformed(evt);
            }
        });
        jPanel4.add(Erstellen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, 90, 30));

        Abbrechen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Abbrechen.setText("Abbrechen");
        Abbrechen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbbrechenActionPerformed(evt);
            }
        });
        jPanel4.add(Abbrechen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, 100, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 830));

        setSize(new java.awt.Dimension(450, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ErstellenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErstellenActionPerformed
   String title = TitelEingabe.getText(); // Titel des Ereignisses
String startTime = TimeEintrag.getText(); // Startzeit des Ereignisses
String endTime = TimeEintrag2.getText(); // Endzeit des Ereignisses
String dateInput = datumEintrag.getText(); // Eingabe des Datums

try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    Date date = dateFormat.parse(dateInput);

    // Überprüfe, ob startTime und endTime im richtigen Format sind
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    timeFormat.setLenient(false); // Setze die strenge Überprüfung für Uhrzeiten

    Date startTimeDate = timeFormat.parse(startTime);
    Date endTimeDate = timeFormat.parse(endTime);

    // Fügen Sie das Ereignis in Ihrem CustomCalendar hinzu
    customCalendar.addEvent(dateInput, title, timeFormat.format(startTimeDate), timeFormat.format(endTimeDate));

    // Schließe das Event-Erstellungs-Fenster
    this.dispose(); 
} catch (ParseException ex) {
    // Zeige eine Fehlermeldung an, wenn das Format ungültig ist
    JOptionPane.showMessageDialog(this, "Ungültiges Datums- oder Uhrzeitformat. Bitte geben Sie gültige Daten und Uhrzeiten ein.");
}


    }//GEN-LAST:event_ErstellenActionPerformed

    private void RotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RotMouseClicked
  
   
    }//GEN-LAST:event_RotMouseClicked

    private void GrünMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrünMouseClicked

    }//GEN-LAST:event_GrünMouseClicked

    private void KalenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KalenderMouseClicked
//        CalenderView calendarView = new CalenderView(dateInputField, endDateField, datumEintrag);
//        calendarView.setVisible(true);
    }//GEN-LAST:event_KalenderMouseClicked


    private void GelbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GelbMouseClicked
   
    }//GEN-LAST:event_GelbMouseClicked

    private void OrangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrangeMouseClicked
       
    }//GEN-LAST:event_OrangeMouseClicked

    private void AbbrechenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbbrechenActionPerformed
        this.dispose();
    }//GEN-LAST:event_AbbrechenActionPerformed

    private void TitelEingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitelEingabeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitelEingabeActionPerformed

    private void datumEintragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datumEintragActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datumEintragActionPerformed

    private void TimeEintragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeEintragActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeEintragActionPerformed

    private void TimeEintrag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeEintrag2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeEintrag2ActionPerformed

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abbrechen;
    private javax.swing.JLabel Beschreibungfield;
    private javax.swing.JLabel Datumfield;
    private javax.swing.JButton Erstellen;
    private javax.swing.JLabel Farbauswahlfield;
    private javax.swing.JLabel Gelb;
    private javax.swing.JLabel Grün;
    private javax.swing.JLabel Kalender;
    private javax.swing.JLabel Orange;
    private javax.swing.JLabel Rot;
    private javax.swing.JLabel TimeBild;
    private javax.swing.JTextField TimeEintrag;
    private javax.swing.JTextField TimeEintrag2;
    private javax.swing.JLabel Timefield;
    private javax.swing.JTextField TitelEingabe;
    private javax.swing.JLabel Titlefield;
    private javax.swing.JTextArea beschreibungEitnrag;
    private javax.swing.JTextField datumEintrag;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel Überschrift;
    // End of variables declaration//GEN-END:variables

    
            
}
