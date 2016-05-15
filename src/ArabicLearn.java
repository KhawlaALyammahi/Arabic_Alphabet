
import java.applet.*;
import java.net.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ArabicLearn extends javax.swing.JFrame {

    public ArabicLearn() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 204, 255));

        jPanel1.setBackground(new java.awt.Color(172, 216, 237));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jButton1.setBackground(new java.awt.Color(243, 204, 219));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setText("[ أ ]");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(165, 197, 229));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(7, 63, 119));
        jButton2.setText("[ Alphabet Song ]");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(243, 204, 219));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 102));
        jButton3.setText("[ ب ]");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(243, 204, 219));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 102));
        jButton4.setText("[ ت ]");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(243, 204, 219));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 102));
        jButton5.setText("[ ث ]");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(243, 204, 219));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 102));
        jButton6.setText("[ ج ]");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(243, 204, 219));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 102));
        jButton7.setText("[ ح ]");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(243, 204, 219));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 102));
        jButton8.setText("[ خ ]");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(243, 204, 219));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 0, 102));
        jButton9.setText("[ د ]");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(243, 204, 219));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 102));
        jButton10.setText("[ ط ]");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(243, 204, 219));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 102));
        jButton11.setText("[ ض ]");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(243, 204, 219));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 0, 102));
        jButton12.setText("[ ص ]");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(243, 204, 219));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 0, 102));
        jButton13.setText("[ ش ]");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(243, 204, 219));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 0, 102));
        jButton14.setText("[ س ]");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(243, 204, 219));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 0, 102));
        jButton15.setText("[ ز ]");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(243, 204, 219));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 0, 102));
        jButton16.setText("[ ر ]");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(243, 204, 219));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 0, 102));
        jButton17.setText("[ ذ ]");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(243, 204, 219));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 0, 102));
        jButton18.setText("[ ظ ]");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(243, 204, 219));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 0, 102));
        jButton19.setText("[ ع ]");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(243, 204, 219));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 0, 102));
        jButton20.setText("[ غ ]");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(243, 204, 219));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 0, 102));
        jButton21.setText("[ ف ]");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(243, 204, 219));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 0, 102));
        jButton22.setText("[ ق ]");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(243, 204, 219));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 0, 102));
        jButton23.setText("[ ك ]");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(243, 204, 219));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 0, 102));
        jButton24.setText("[ ل ]");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(243, 204, 219));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 0, 102));
        jButton25.setText("[ م ]");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(243, 204, 219));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 0, 102));
        jButton30.setText("[ ي ]");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(243, 204, 219));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 0, 102));
        jButton31.setText("[ و ]");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(243, 204, 219));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 0, 102));
        jButton32.setText("[ هـ ]");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(243, 204, 219));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 0, 102));
        jButton33.setText("[ ن ]");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(254, 254, 195));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(215, 215, 7));
        jButton26.setText("[ Welcome to the letters game      مرحبا بكم في لعبة الحروف  ]");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(172, 216, 237));
        jButton27.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton27.setText("Designer Informations");
        jButton27.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(42, 1, 42), null));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton10)
                        .addGap(28, 28, 28)
                        .addComponent(jButton11)
                        .addGap(27, 27, 27)
                        .addComponent(jButton12)
                        .addGap(27, 27, 27)
                        .addComponent(jButton13)
                        .addGap(26, 26, 26)
                        .addComponent(jButton14)
                        .addGap(26, 26, 26)
                        .addComponent(jButton15)
                        .addGap(28, 28, 28)
                        .addComponent(jButton16)
                        .addGap(26, 26, 26)
                        .addComponent(jButton17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jButton30)
                        .addGap(26, 26, 26)
                        .addComponent(jButton31)
                        .addGap(28, 28, 28)
                        .addComponent(jButton32)
                        .addGap(26, 26, 26)
                        .addComponent(jButton33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton25)
                        .addGap(28, 28, 28)
                        .addComponent(jButton24)
                        .addGap(27, 27, 27)
                        .addComponent(jButton23)
                        .addGap(27, 27, 27)
                        .addComponent(jButton22)
                        .addGap(26, 26, 26)
                        .addComponent(jButton21)
                        .addGap(26, 26, 26)
                        .addComponent(jButton20)
                        .addGap(28, 28, 28)
                        .addComponent(jButton19)
                        .addGap(26, 26, 26)
                        .addComponent(jButton18)))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(28, 28, 28)
                        .addComponent(jButton8)
                        .addGap(27, 27, 27)
                        .addComponent(jButton7)
                        .addGap(27, 27, 27)
                        .addComponent(jButton6)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(201, 201, 201)
                        .addComponent(jButton27)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton26)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton16)
                    .addComponent(jButton15)
                    .addComponent(jButton14)
                    .addComponent(jButton13)
                    .addComponent(jButton12)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton33)
                            .addComponent(jButton32)
                            .addComponent(jButton31)
                            .addComponent(jButton30))
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton27)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/1-alif.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/1-alif.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/Arabic-Alphabet-Song.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/Arabic_Alphabet.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/2-baa.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/2-baa.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/3-ta.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/3-ta.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/4-tha.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/4-tha.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/5-jeem.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/5-jeem.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/6-7a.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/6-7a.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/7-kha.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/7-kha.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/8-dal.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/8-dal.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/16-6a.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/16-6a.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/15-dwad.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/15-dwad.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/14-saad.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/14-saad.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/13-shin.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/13-shin.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/12-sin.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/12-sin.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/11-za.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/11-za.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/10-ra.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/10-ra.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/9-thal.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/9-thal.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/17-6'a.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/17-6'a.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/18-ayn.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/18-ayn.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/19-ghain.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/19-ghain.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/20-fa.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/20-fa.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/21-qaf.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/21-qaf.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/22-kaf.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/22-kaf.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/23-lam.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/23-lam.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/24-meem.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/24-meem.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/28-ya.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/28-ya.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/27-waw.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/27-waw.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/26-ha.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/26-ha.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/25-noun.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

        try {
            BufferedImage img = ImageIO.read(new File("src/images/25-noun.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        try {
            AudioClip clip = Applet.newAudioClip(new URL("file:src/audio/Welcome.wav"));
            clip.play();
        } catch (MalformedURLException murle) {
            System.out.println(murle);
        }

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        try {
            BufferedImage img = ImageIO.read(new File("src/images/Information.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }     }//GEN-LAST:event_jButton27ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArabicLearn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
