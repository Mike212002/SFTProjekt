
package main;

import java.awt.Color;
import static java.awt.Color.WHITE;
import javax.swing.ImageIcon;

/**
 *
 * @author miket
 */




public class EventErtellen extends javax.swing.JFrame {

  
    public EventErtellen() {
        initComponents();
        initCustomComponents();
         Ganztätig.setBackground(WHITE);
         Erstellen.setBackground(Color.BLUE);
         Erstellen.setForeground(WHITE);
         Abbrechen.setBackground(Color.BLUE);
         Abbrechen.setForeground(WHITE);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Überschrift = new javax.swing.JLabel();
        Titlefield = new javax.swing.JLabel();
        TitelEingabe = new javax.swing.JTextField();
        Datumfield = new javax.swing.JLabel();
        KalenderBild = new javax.swing.JLabel();
        DatumEintrag = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        Timefield = new javax.swing.JLabel();
        TimeBild = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ganztätig = new javax.swing.JRadioButton();
        TimeEintrag = new javax.swing.JTextField();
        TimeEintrag2 = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        Beschreibungfield = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BeschreibungEitnrag = new javax.swing.JTextArea();
        Farbauswahlfield = new javax.swing.JLabel();
        Rot = new javax.swing.JLabel();
        Grün = new javax.swing.JLabel();
        Gelb = new javax.swing.JLabel();
        Orange = new javax.swing.JLabel();
        Erstellen = new javax.swing.JButton();
        Abbrechen = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 820));
        setPreferredSize(new java.awt.Dimension(440, 820));
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
        jPanel4.add(TitelEingabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 30));

        Datumfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Datumfield.setText("Datum");
        jPanel4.add(Datumfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 80, 30));

        KalenderBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Kalender.png"))); // NOI18N
        jPanel4.add(KalenderBild, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 30));

        DatumEintrag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DatumEintrag.setBorder(null);
        jPanel4.add(DatumEintrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 20));

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

        Ganztätig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ganztätig.setText("Ganztätig");
        jPanel4.add(Ganztätig, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        TimeEintrag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimeEintrag.setBorder(null);
        jPanel4.add(TimeEintrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, -1));

        TimeEintrag2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimeEintrag2.setBorder(null);
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

        BeschreibungEitnrag.setColumns(20);
        BeschreibungEitnrag.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BeschreibungEitnrag.setRows(5);
        BeschreibungEitnrag.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(BeschreibungEitnrag);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 320, 170));

        Farbauswahlfield.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Farbauswahlfield.setText("Farbauswahl");
        jPanel4.add(Farbauswahlfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 140, 30));

        Rot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Rot.png"))); // NOI18N
        Rot.setToolTipText("");
        jPanel4.add(Rot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        Grün.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Grün.png"))); // NOI18N
        jPanel4.add(Grün, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, -1));

        Gelb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Gelb.png"))); // NOI18N
        jPanel4.add(Gelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        Orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Orange.png"))); // NOI18N
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
        jPanel4.add(Abbrechen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 740, 100, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 440, 830));

        setSize(new java.awt.Dimension(450, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ErstellenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErstellenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ErstellenActionPerformed

   private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abbrechen;
    private javax.swing.JTextArea BeschreibungEitnrag;
    private javax.swing.JLabel Beschreibungfield;
    private javax.swing.JTextField DatumEintrag;
    private javax.swing.JLabel Datumfield;
    private javax.swing.JButton Erstellen;
    private javax.swing.JLabel Farbauswahlfield;
    private javax.swing.JRadioButton Ganztätig;
    private javax.swing.JLabel Gelb;
    private javax.swing.JLabel Grün;
    private javax.swing.JLabel KalenderBild;
    private javax.swing.JLabel Orange;
    private javax.swing.JLabel Rot;
    private javax.swing.JLabel TimeBild;
    private javax.swing.JTextField TimeEintrag;
    private javax.swing.JTextField TimeEintrag2;
    private javax.swing.JLabel Timefield;
    private javax.swing.JTextField TitelEingabe;
    private javax.swing.JLabel Titlefield;
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
