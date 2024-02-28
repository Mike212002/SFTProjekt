package main;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.RowFilter;

public class DatenbankTabelleAnzeigen extends javax.swing.JFrame {

  private Timer hideMessageTimer;
  private boolean isSearchTriggered = false;
 



    public DatenbankTabelleAnzeigen() {
        FlatLaf.registerCustomDefaultsSource("main.DatenbankTabelleAnzeigen");
        FlatMacDarkLaf.setup();

        initComponents();
        setTableContents();
        initCustomComponents();
        jTable2.setDefaultRenderer(Object.class, new TableGradientCell());
        jTable2.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:1,1,1,1,$TableHeader.bottomSeparatorColor,,10");
        jTable2.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        scroll.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, "" + "hoverTrackColor:null");
        jLabel2.setForeground(Color.BLACK);
        
      
       Eingabe.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }
        });
    }

     private void filterTable() {
        String eingabe = Eingabe.getText().trim();
 TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable2.getModel());
jTable2.setRowSorter(sorter);
        if (eingabe.isEmpty()) {
            sorter.setRowFilter(null); // Entfernen Sie den Filter, um die gesamte Tabelle anzuzeigen
        } else {
            RowFilter<TableModel, Object> filter = RowFilter.regexFilter("(?i)" + eingabe); // Case-insensitive Suche
            sorter.setRowFilter(filter);
        }
    }
    

    private void setTableContents() {
        Datenbank datenbank = new Datenbank();
        ArrayList<Betrieb> alleBetriebe = datenbank.holeAlleBetriebe();

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[]{"BetriebsID", "Betriebsname", "Straße", "Ort", "PLZ", "Ansprechpartner", "Website", "EMail"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Betrieb betrieb : alleBetriebe) {
            Object[] rowData = {
                betrieb.getBetriebsID(),
                betrieb.getBetriebsname(),
                betrieb.getStraße(),
                betrieb.getOrt(),
                betrieb.getPLZ(),
                betrieb.getAnsprechpartner(),
                betrieb.getWebsite(),
                betrieb.getEMail()
            };

            tableModel.addRow(rowData);
        }

        jTable2.setModel(tableModel);

        jTable2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int column = jTable2.columnAtPoint(e.getPoint());
                int row = jTable2.rowAtPoint(e.getPoint());
                if (row >= 0 && column >= 0) {
                    openCellDataWindow(row);
                }
            }
        });
    }

    private boolean isWindowOpen = false; // Variable zur Überprüfung des Fensterzustands

    private void openCellDataWindow(int row) {
        if (!isWindowOpen) { // Überprüfen, ob kein Fenster geöffnet ist
            isWindowOpen = true; // Fenster wird geöffnet
            JFrame frame = new JFrame("Einzelne Daten");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setMinimumSize(new Dimension(800, 400));

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setFont(new Font("Arial", Font.PLAIN, 24));

            StringBuilder rowData = new StringBuilder();
            rowData.append("BetriebsID: ").append(jTable2.getValueAt(row, 0)).append("\n");
            rowData.append("Betriebsname: ").append(jTable2.getValueAt(row, 1)).append("\n");
            rowData.append("Straße: ").append(jTable2.getValueAt(row, 2)).append("\n");
            rowData.append("Ort: ").append(jTable2.getValueAt(row, 3)).append("\n");
            rowData.append("PLZ: ").append(jTable2.getValueAt(row, 4)).append("\n");
            rowData.append("Ansprechpartner: ").append(jTable2.getValueAt(row, 5)).append("\n");
            rowData.append("Website: ").append(jTable2.getValueAt(row, 6)).append("\n");
            rowData.append("EMail: ").append(jTable2.getValueAt(row, 7)).append("\n");

            textArea.setText(rowData.toString());

            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.add(scrollPane, BorderLayout.CENTER);

            JButton okButton = new JButton("OK");
            okButton.setBackground(Color.BLUE);
            okButton.setForeground(Color.WHITE);
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    isWindowOpen = false;
                }
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(okButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setLocationRelativeTo(null);

            frame.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    centerTextInTextArea(textArea);
                }
            });

            frame.pack();
            frame.setVisible(true);

            frame.addWindowFocusListener(new WindowFocusListener() {
                @Override
                public void windowGainedFocus(WindowEvent e) {

                }

                @Override
                public void windowLostFocus(WindowEvent e) {

                    frame.toFront();
                    frame.setAlwaysOnTop(true);

                }
            });
        }

    }

    private void centerTextInTextArea(JTextArea textArea) {

        int height = textArea.getHeight();
        int textHeight = textArea.getPreferredSize().height;
        int y = (height - textHeight) / 2;
        y = Math.max(0, y);

        int width = textArea.getWidth();
        int textWidth = textArea.getPreferredSize().width;
        int x = (width - textWidth) / 2;
        x = Math.max(250, x);

        textArea.setBounds(x, y, textWidth, textHeight);
    }

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
        
        Zurück.setBackground(Color.WHITE);
        Zurück.setForeground(Color.BLACK);
        Eingabe.setBackground(Color.WHITE);
        Eingabe.setForeground(Color.BLACK);

    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel4 = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        scroll = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        Zurück = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel2 = new javax.swing.JPanel();
        Eingabe = new javax.swing.JTextField();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1479, 75));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Betriebstabelle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.02;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(filler2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(25, 118, 211));
        jPanel4.setToolTipText("");
        jPanel4.setPreferredSize(new java.awt.Dimension(1566, 715));
        jPanel4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.05;
        jPanel4.add(filler3, gridBagConstraints);

        filler4.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.02;
        gridBagConstraints.weighty = 0.1;
        jPanel4.add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.02;
        jPanel4.add(filler5, gridBagConstraints);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BetreibsID", "Betriebsname", "Straße", "Ort", "PLZ", "Ansprechpartner", "Website", "E-Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(scroll, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weighty = 0.01;
        jPanel4.add(filler6, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Zurück.setText("Zurück");
        Zurück.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZurückActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.021;
        gridBagConstraints.weighty = 0.05;
        jPanel1.add(Zurück, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0E-5;
        jPanel1.add(filler9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(filler11, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        Eingabe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eingabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EingabeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.05;
        jPanel2.add(Eingabe, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(jPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        jPanel4.add(filler12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.weighty = 0.011;
        jPanel4.add(filler13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.01;
        jPanel4.add(filler14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.weighty = 0.02;
        jPanel4.add(filler7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel4, gridBagConstraints);

        setSize(new java.awt.Dimension(1582, 917));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void ZurückActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückActionPerformed
        this.dispose();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Navigation navigation = new Navigation();
        navigation.setVisible(true);
    }//GEN-LAST:event_ZurückActionPerformed

    private void EingabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EingabeActionPerformed
   
        
     
    }//GEN-LAST:event_EingabeActionPerformed



private void suchenInTabelle() {
    if (!isSearchTriggered) {
        return; // Suche nur ausführen, wenn der Such-Button geklickt wurde
    }

    String eingabe = Eingabe.getText().trim();

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
    jTable2.setRowSorter(sorter);
    
    if (eingabe.isEmpty()) {
        sorter.setRowFilter(null); 
        return;
    }

    RowFilter<TableModel, Object> filter = new RowFilter<TableModel, Object>() {
        public boolean include(Entry<? extends TableModel, ? extends Object> entry) {
            for (int i = 0; i < entry.getValueCount(); i++) {
                if (entry.getStringValue(i).equals(eingabe)) {
                    return true;
                }
            }
            return false;
        }
    };

    sorter.setRowFilter(filter);

    // Überprüfen, ob Einträge gefunden wurden
    if (sorter.getViewRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Eintrag '" + eingabe + "' nicht gefunden.");
        sorter.setRowFilter(null); // Entfernen Sie den Filter, um die gesamte Tabelle anzuzeigen
        isSearchTriggered = false; // Setzen Sie den Suchauslöser zurück
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Eingabe;
    private javax.swing.JButton Zurück;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    
}
