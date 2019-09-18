package core;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * @author Ammar Yasser
 */
public class Generator extends JFrame {

    private int xOnScreen, yOnScreen, x, y;
    private final JLabel infoLabel, blogLabel;
    private static boolean appeared = false;
    private static final Color MY_GREEN = new Color(100, 225, 100);

    public Generator() {
        initComponents();
        generate();

        infoLabel = new JLabel("Developed by: Ammar Yasser AllaiThy");
        infoLabel.setBounds(0, getHeight() / 2 - 20, getWidth(), 30);
        infoLabel.setFont(new Font("calibri", Font.PLAIN, 20));
        infoLabel.setHorizontalAlignment(JLabel.CENTER);
        infoLabel.setVerticalAlignment(JLabel.BOTTOM);

        blogLabel = new JLabel("for more info, visit My Blog");
        blogLabel.setBounds(0, getHeight() / 2 + 20, getWidth(), 30);
        blogLabel.setFont(new Font("calibri", Font.PLAIN, 18));
        blogLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        blogLabel.setForeground(new Color(50, 50, 200));
        blogLabel.setHorizontalAlignment(JLabel.CENTER);
        blogLabel.setVerticalAlignment(JLabel.TOP);
        blogLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().browse(new URI("https://ammaryasserallaithy.000webhostapp.com/"));
                        blogLabel.setForeground(new Color(150, 50, 200));
                    } else {
                        JOptionPane.showMessageDialog(Generator.this, "There is problem in your browser", "Can't Open Browser", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException | URISyntaxException ex) {
                    JOptionPane.showMessageDialog(Generator.this, ex.getMessage(), ex.getClass().toString(), JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        infoIconLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        areaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        attrPanel = new javax.swing.JPanel();
        lenLabel = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();
        capChBox = new javax.swing.JCheckBox();
        smlChBox = new javax.swing.JCheckBox();
        numChBox = new javax.swing.JCheckBox();
        symChBox = new javax.swing.JCheckBox();
        genPanel = new javax.swing.JPanel();
        genLabel = new javax.swing.JLabel();
        copyPanel = new javax.swing.JPanel();
        copyLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");
        setUndecorated(true);

        titleBar.setBackground(new java.awt.Color(64, 64, 64));
        titleBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Password Generator");
        titleLabel.setToolTipText("");
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setIconTextGap(5);
        titleLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        infoIconLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/icons8_Info_25px.png"))); // NOI18N
        infoIconLabel.setToolTipText("");
        infoIconLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoIconLabelMouseClicked(evt);
            }
        });

        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/icons8_Multiply_30px.png"))); // NOI18N
        closeLabel.setToolTipText("");
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout titleBarLayout = new org.jdesktop.layout.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titleBarLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(titleLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(infoIconLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(closeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(infoIconLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(titleBarLayout.createSequentialGroup()
                .add(titleBarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(titleLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(closeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        container.setBackground(new java.awt.Color(125, 125, 125));

        areaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textarea.setEditable(false);
        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        textarea.setLineWrap(true);
        textarea.setRows(3);
        textarea.setTabSize(4);
        textarea.setWrapStyleWord(true);
        textarea.setBorder(null);
        jScrollPane1.setViewportView(textarea);

        org.jdesktop.layout.GroupLayout areaPanelLayout = new org.jdesktop.layout.GroupLayout(areaPanel);
        areaPanel.setLayout(areaPanelLayout);
        areaPanelLayout.setHorizontalGroup(
            areaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(areaPanelLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(jScrollPane1)
                .add(5, 5, 5))
        );
        areaPanelLayout.setVerticalGroup(
            areaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(areaPanelLayout.createSequentialGroup()
                .add(5, 5, 5)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5))
        );

        attrPanel.setBackground(new java.awt.Color(255, 255, 255));

        lenLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lenLabel.setLabelFor(slider);
        lenLabel.setText("20");

        slider.setBackground(attrPanel.getBackground());
        slider.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        slider.setForeground(titleBar.getBackground());
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setValue(20);
        slider.setFocusable(false);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        capChBox.setBackground(MY_GREEN);
        capChBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        capChBox.setSelected(true);
        capChBox.setText("Uppercase");
        capChBox.setFocusPainted(false);
        capChBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                capChBoxStateChanged(evt);
            }
        });

        smlChBox.setBackground(MY_GREEN);
        smlChBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        smlChBox.setSelected(true);
        smlChBox.setText("Lowercase");
        smlChBox.setFocusPainted(false);
        smlChBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                smlChBoxStateChanged(evt);
            }
        });

        numChBox.setBackground(attrPanel.getBackground());
        numChBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        numChBox.setText("Numbers");
        numChBox.setFocusPainted(false);
        numChBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numChBoxStateChanged(evt);
            }
        });

        symChBox.setBackground(attrPanel.getBackground());
        symChBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        symChBox.setText("Symbols");
        symChBox.setFocusPainted(false);
        symChBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                symChBoxStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout attrPanelLayout = new org.jdesktop.layout.GroupLayout(attrPanel);
        attrPanel.setLayout(attrPanelLayout);
        attrPanelLayout.setHorizontalGroup(
            attrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(attrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(attrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(slider, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(attrPanelLayout.createSequentialGroup()
                        .add(capChBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(smlChBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(numChBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(symChBox)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(lenLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        attrPanelLayout.setVerticalGroup(
            attrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(attrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(lenLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(slider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(attrPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(capChBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(smlChBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(numChBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(symChBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, 0))
        );

        genPanel.setBackground(new java.awt.Color(245, 245, 245));

        genLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/icons8_Reset_30px.png"))); // NOI18N
        genLabel.setToolTipText("");
        genLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genLabelMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout genPanelLayout = new org.jdesktop.layout.GroupLayout(genPanel);
        genPanel.setLayout(genPanelLayout);
        genPanelLayout.setHorizontalGroup(
            genPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        genPanelLayout.setVerticalGroup(
            genPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(genLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        copyPanel.setBackground(new java.awt.Color(245, 245, 245));

        copyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/core/icons8_Copy_30px.png"))); // NOI18N
        copyLabel.setToolTipText("");
        copyLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copyLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                copyLabelMouseExited(evt);
            }
        });

        org.jdesktop.layout.GroupLayout copyPanelLayout = new org.jdesktop.layout.GroupLayout(copyPanel);
        copyPanel.setLayout(copyPanelLayout);
        copyPanelLayout.setHorizontalGroup(
            copyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(copyLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        copyPanelLayout.setVerticalGroup(
            copyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(copyLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout containerLayout = new org.jdesktop.layout.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(attrPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(containerLayout.createSequentialGroup()
                        .add(areaPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(0, 0, 0)
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, genPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, copyPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(containerLayout.createSequentialGroup()
                .addContainerGap()
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(areaPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(containerLayout.createSequentialGroup()
                        .add(genPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, 0)
                        .add(copyPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(attrPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(titleBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(container, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(titleBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(container, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int xDist = evt.getXOnScreen() - xOnScreen,
                yDist = evt.getYOnScreen() - yOnScreen;
        this.setLocation(xOnScreen + xDist - x, yOnScreen + yDist - y);
    }//GEN-LAST:event_titleBarMouseDragged
    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xOnScreen = evt.getXOnScreen();
        yOnScreen = evt.getYOnScreen();
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        lenLabel.setText(slider.getValue() + "");
        generate();
    }//GEN-LAST:event_sliderStateChanged

    private void genLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genLabelMouseClicked
        generate();
    }//GEN-LAST:event_genLabelMouseClicked

    private void copyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyLabelMouseClicked
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(textarea.getText()), null);
        copyPanel.setBackground(container.getBackground());
    }//GEN-LAST:event_copyLabelMouseClicked
    private void copyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyLabelMouseExited
        copyPanel.setBackground(genPanel.getBackground());
    }//GEN-LAST:event_copyLabelMouseExited

    private void infoIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoIconLabelMouseClicked
        if (!appeared) {
            container.setVisible(false);
            this.add(infoLabel);
            this.add(blogLabel);
            appeared = true;
        } else {
            this.remove(infoLabel);
            this.remove(blogLabel);
            container.setVisible(true);
            appeared = false;
        }
    }//GEN-LAST:event_infoIconLabelMouseClicked

    private void capChBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_capChBoxStateChanged
        checkBoxState(evt);
    }//GEN-LAST:event_capChBoxStateChanged
    private void smlChBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_smlChBoxStateChanged
        checkBoxState(evt);
    }//GEN-LAST:event_smlChBoxStateChanged
    private void numChBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numChBoxStateChanged
        checkBoxState(evt);
    }//GEN-LAST:event_numChBoxStateChanged
    private void symChBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_symChBoxStateChanged
        checkBoxState(evt);
    }//GEN-LAST:event_symChBoxStateChanged
    private void checkBoxState(javax.swing.event.ChangeEvent evt) {
        JCheckBox box = (JCheckBox) evt.getSource();
        box.setBackground(box.isSelected() ? MY_GREEN : attrPanel.getBackground());
    }

    private void generate() {
        int len = slider.getValue();
        textarea.setText(generate(
                len,
                capChBox.isSelected(),
                smlChBox.isSelected(),
                numChBox.isSelected(),
                symChBox.isSelected()
        ));
    }

    public String generate(int len, boolean upper, boolean lower, boolean numbers, boolean symbols) {
        StringBuilder AllChars = new StringBuilder();
        StringBuilder Pass = new StringBuilder();

        if (upper) {
            for (char i = 65; i <= 90; i++) {
                AllChars.append(i);
            }
        }
        if (lower) {
            for (char i = 97; i <= 122; i++) {
                AllChars.append(i);
            }
        }
        if (numbers) {
            for (char i = 48; i <= 57; i++) {
                AllChars.append(i);
            }
        }
        if (symbols) {
            AllChars.append("!@#$%&*()");
        }

        while (len-- != 0) {
            Pass.append(AllChars.charAt(new Random().nextInt(AllChars.length())));
        }
        return Pass.toString();
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            String osName = System.getProperty("os.name"),
                    UIname = osName.equals("Linux") ? "GTK+"
                    : osName.startsWith("Windows") ? "Windows"
                    : "Nimbus";
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (UIname.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Generator().setVisible(true);
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" Variables declaration - do not modify ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaPanel;
    private javax.swing.JPanel attrPanel;
    private javax.swing.JCheckBox capChBox;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel copyLabel;
    private javax.swing.JPanel copyPanel;
    private javax.swing.JLabel genLabel;
    private javax.swing.JPanel genPanel;
    private javax.swing.JLabel infoIconLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lenLabel;
    private javax.swing.JCheckBox numChBox;
    private javax.swing.JSlider slider;
    private javax.swing.JCheckBox smlChBox;
    private javax.swing.JCheckBox symChBox;
    private javax.swing.JTextArea textarea;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
