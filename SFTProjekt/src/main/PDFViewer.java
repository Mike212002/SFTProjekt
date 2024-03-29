package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.DialogTypeSelection;
import javax.print.attribute.standard.JobName;
import main.NewJFrame;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPrintable;
import org.apache.pdfbox.rendering.PDFRenderer;

public class PDFViewer extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private String filePath;
    private int currentPage = 0;
    private int totalPages = 0;
    private JPanel panel;
    private JButton openButton;
    private JButton nextButton;
    private JButton prevButton;
    private JButton printButton;
    private JButton viewSavedPDFsButton;
    private JButton saveButton;
    private List<File> savedPDFs;
    private JButton backButton;

    private static final String SAVED_PDFS_FILE = "saved_pdfs.txt";

    public PDFViewer() {
        savedPDFs = new ArrayList<>();
        loadSavedPDFs();
        initializeUI();
        centerWindow(this);
        initCustomComponents();
    }

    public void display() {
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
        });
    }

    private void initializeUI() {
        setTitle("PDF Viewer");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        openButton = new JButton("PDF öffnen");
        openButton.setBackground(Color.WHITE);
        openButton.setForeground(Color.BLACK);
        openButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        openButton.setPreferredSize(new Dimension(120, 40));
        openButton.addActionListener(e -> openPDF());
        buttonPanel.add(openButton);

        getContentPane().add(buttonPanel, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        nextButton = new JButton("Nächste Seite");
        nextButton.setBackground(Color.WHITE);
        nextButton.setForeground(Color.BLACK);
        nextButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nextButton.setPreferredSize(new Dimension(120, 40));
        nextButton.addActionListener(e -> nextPage());

        prevButton = new JButton("Vorherige Seite");
        prevButton.setBackground(Color.WHITE);
        prevButton.setForeground(Color.BLACK);
        prevButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        prevButton.setPreferredSize(new Dimension(120, 40));
        prevButton.addActionListener(e -> prevPage());

        JButton printButton = new JButton("Drucken");
        printButton.setBackground(Color.WHITE);
        printButton.setForeground(Color.BLACK);
        printButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        printButton.setPreferredSize(new Dimension(120, 40));

       printButton.addActionListener(e -> printPage());

        viewSavedPDFsButton = new JButton("PDF-Liste");
        viewSavedPDFsButton.setBackground(Color.WHITE);
        viewSavedPDFsButton.setForeground(Color.BLACK);
        viewSavedPDFsButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        viewSavedPDFsButton.setPreferredSize(new Dimension(120, 40));
        viewSavedPDFsButton.addActionListener(e -> showSavedPDFs());

        saveButton = new JButton("Speichern");
        saveButton.setBackground(Color.WHITE);
        saveButton.setForeground(Color.BLACK);
        saveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        saveButton.setPreferredSize(new Dimension(120, 40));
        saveButton.addActionListener(e -> savePDF());

        backButton = new JButton("Zurück");
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(Color.BLACK);
        backButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        backButton.setPreferredSize(new Dimension(120, 40));
        backButton.addActionListener(e -> openNewJFrame());

        JPanel buttonPanelSouth = new JPanel(new BorderLayout());

        JPanel centerButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerButtonPanel.add(prevButton);
        centerButtonPanel.add(nextButton);

        JPanel sideButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        sideButtonPanel.add(backButton);
        sideButtonPanel.add(printButton);
        sideButtonPanel.add(saveButton);
        sideButtonPanel.add(viewSavedPDFsButton);

        buttonPanelSouth.add(centerButtonPanel, BorderLayout.CENTER);
        buttonPanelSouth.add(sideButtonPanel, BorderLayout.SOUTH);

        getContentPane().add(buttonPanelSouth, BorderLayout.SOUTH);

        JScrollPane scrollPane = new JScrollPane(panel);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void openPDF() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath = selectedFile.getAbsolutePath();
            renderPDF(selectedFile);
        }
    }

    private void nextPage() {
        if (currentPage < totalPages - 1) {
            currentPage++;
            renderPDF(new File(filePath)); // Nächste Seite rendern
        } else {
            JOptionPane.showMessageDialog(this, "Sie sind bereits auf der letzten Seite.");
        }
    }

    private void prevPage() {
        if (currentPage > 0) {
            currentPage--;
            renderPDF(new File(filePath)); // Vorherige Seite rendern
        } else {
            JOptionPane.showMessageDialog(this, "Sie sind bereits auf der ersten Seite.");
        }
    }

private void printPage() {
    try (PDDocument document = PDDocument.load(new File(filePath))) {
        PrinterJob job = PrinterJob.getPrinterJob();

        
        job.printDialog();

        job.print();
    } catch (IOException | PrinterException e) {
        e.printStackTrace();
    }
}
 
 
    private void savePDF() {
        if (filePath != null && !filePath.isEmpty()) {
            
            String fileName = JOptionPane.showInputDialog(this, "Bitte geben Sie den Dateinamen ein:");

            if (fileName != null && !fileName.isEmpty()) {
                
                if (!fileName.toLowerCase().endsWith(".pdf")) {
                    fileName += ".pdf";
                }

                File destinationFile = new File(fileName); 
                File sourceFile = new File(filePath);

                try {
                    Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    savedPDFs.add(destinationFile);
                    renderPDF(destinationFile); 
                    JOptionPane.showMessageDialog(this, "PDF erfolgreich im Fenster gespeichert als: " + fileName);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Fehler beim Speichern der PDF: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ungültiger Dateiname.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Keine PDF-Datei geöffnet.");
        }
    }

    private void downloadPDF() {
        if (filePath == null || filePath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Keine PDF-Datei geöffnet.");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String destinationPath = selectedFile.getAbsolutePath();

            try {
                File sourceFile = new File(filePath);
                File destinationFile = new File(destinationPath);

                Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                savedPDFs.add(destinationFile);
                JOptionPane.showMessageDialog(this, "PDF erfolgreich heruntergeladen.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Fehler beim Herunterladen der PDF: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }

    private void renderPDF(File pdfFile) {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            totalPages = document.getNumberOfPages();
            PDFRenderer renderer = new PDFRenderer(document);
            BufferedImage img = renderer.renderImageWithDPI(currentPage, 100);
            JLabel label = new JLabel(new ImageIcon(img));
            panel.removeAll();
            panel.add(label, BorderLayout.CENTER);
            panel.revalidate();
            panel.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSavedPDFs() {
        JFrame savedPDFsFrame = new JFrame("Gespeicherte PDFs");
        savedPDFsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initCustomComponents(savedPDFsFrame);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> pdfList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(pdfList);

        for (File pdf : savedPDFs) {
            listModel.addElement(pdf.getName());
        }

        pdfList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        pdfList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
                return label;

            }
        });

        JButton openButton = new JButton("Öffnen");
        JButton deleteButton = new JButton("Löschen");
        JButton backButton = new JButton("Zurück");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savedPDFsFrame.dispose();
            }
        });

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = pdfList.getSelectedIndex();
                if (selectedIndex != -1) {
                    File selectedFile = savedPDFs.get(selectedIndex);
                    try {
                        Desktop.getDesktop().open(selectedFile);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = pdfList.getSelectedIndex();
                if (selectedIndex != -1) {
                    File selectedFile = savedPDFs.get(selectedIndex);
                    int option = JOptionPane.showConfirmDialog(savedPDFsFrame, "Möchten Sie die Datei wirklich löschen?", "Datei löschen", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {

                        listModel.removeElementAt(selectedIndex);
                        deletePDFFromList(selectedFile);
                        JOptionPane.showMessageDialog(savedPDFsFrame, "Datei erfolgreich aus der Liste gelöscht.");
                    }
                }
            }
        });

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        buttonPanel.add(backButton);
        buttonPanel.add(openButton);
        buttonPanel.add(deleteButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        savedPDFsFrame.add(mainPanel);
        savedPDFsFrame.setSize(400, 300);
        savedPDFsFrame.setVisible(true);

        centerWindow(savedPDFsFrame);
        savedPDFsFrame.setVisible(true);
    }

    private void deletePDFFromList(File pdfFile) {
        if (savedPDFs.contains(pdfFile)) {
            savedPDFs.remove(pdfFile);
            savePDFListToFile();
        }

    }

    private void savePDFListToFile() {
        try (PrintWriter writer = new PrintWriter(SAVED_PDFS_FILE)) {
            for (File pdf : savedPDFs) {
                writer.println(pdf.getAbsolutePath());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadSavedPDFs() {
        File file = new File(SAVED_PDFS_FILE);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    savedPDFs.add(new File(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void initCustomComponents(JFrame frame) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        frame.setIconImage(icon.getImage());
        frame.pack(); // Aktualisieren des Frames nach dem Hinzufügen des Icons
        frame.revalidate();
        frame.repaint();
    }

    private void openNewJFrame() {
        NewJFrame frame = new NewJFrame();
        frame.setVisible(true);
        this.dispose();
    }

    private void centerWindow(Window window) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
    window.setLocation(x, y);
}

    private void initCustomComponents() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.png"));
        this.setIconImage(icon.getImage());
    }

}
