/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyecto.GUI;

/**
 *
 * @author user
 */
public class Actualizar extends javax.swing.JFrame {

    /**
     * Creates new form Actualizar
     */
    public Actualizar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg_3 = new javax.swing.JPanel();
        Create_Players = new javax.swing.JTabbedPane();
        Arquero = new javax.swing.JPanel();
        ArqueroE = new javax.swing.JTextField();
        ArqueroArr = new javax.swing.JTextField();
        ArqueroVe = new javax.swing.JTextField();
        ArqueroRe = new javax.swing.JTextField();
        ArqueroAlt = new javax.swing.JTextField();
        ActualizarArqueroBtn = new javax.swing.JButton();
        Defensa = new javax.swing.JPanel();
        ArqueroE1 = new javax.swing.JTextField();
        ArqueroArr1 = new javax.swing.JTextField();
        ArqueroVe1 = new javax.swing.JTextField();
        ArqueroRe1 = new javax.swing.JTextField();
        DefensaAgi = new javax.swing.JTextField();
        ActualizarDefensaBtn = new javax.swing.JButton();
        Medio = new javax.swing.JPanel();
        ArqueroE2 = new javax.swing.JTextField();
        ArqueroArr2 = new javax.swing.JTextField();
        ArqueroVe2 = new javax.swing.JTextField();
        ArqueroRe2 = new javax.swing.JTextField();
        ArqueroAlt2 = new javax.swing.JTextField();
        ActualizarMedioBtn = new javax.swing.JButton();
        Delantero = new javax.swing.JPanel();
        DelanteroEdad = new javax.swing.JTextField();
        DelanteroArr = new javax.swing.JTextField();
        DelanteroVe = new javax.swing.JTextField();
        DelanteroRe = new javax.swing.JTextField();
        DelanteroPre = new javax.swing.JTextField();
        ActualizarDelanteroBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArqueroE.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroE.setText("Edad");
        ArqueroE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroEActionPerformed(evt);
            }
        });

        ArqueroArr.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroArr.setText("Arranque");
        ArqueroArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroArrActionPerformed(evt);
            }
        });

        ArqueroVe.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroVe.setText("Velocidad");
        ArqueroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroVeActionPerformed(evt);
            }
        });

        ArqueroRe.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroRe.setText("Resistencia");

        ArqueroAlt.setText("Altura");

        ActualizarArqueroBtn.setText("Actualizar");
        ActualizarArqueroBtn.setBorder(null);

        javax.swing.GroupLayout ArqueroLayout = new javax.swing.GroupLayout(Arquero);
        Arquero.setLayout(ArqueroLayout);
        ArqueroLayout.setHorizontalGroup(
            ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArqueroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ActualizarArqueroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(ArqueroLayout.createSequentialGroup()
                        .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArqueroLayout.createSequentialGroup()
                                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArqueroE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArqueroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArqueroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArqueroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ArqueroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        ArqueroLayout.setVerticalGroup(
            ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArqueroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroE))
                .addGap(30, 30, 30)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArqueroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ArqueroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ActualizarArqueroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        Create_Players.addTab("Arquero", Arquero);

        ArqueroE1.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroE1.setText("Edad");
        ArqueroE1.setToolTipText("");
        ArqueroE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroE1ActionPerformed(evt);
            }
        });

        ArqueroArr1.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroArr1.setText("Arranque");
        ArqueroArr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroArr1ActionPerformed(evt);
            }
        });

        ArqueroVe1.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroVe1.setText("Velocidad");
        ArqueroVe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroVe1ActionPerformed(evt);
            }
        });

        ArqueroRe1.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroRe1.setText("Resistencia");

        DefensaAgi.setText("Agilidad");

        ActualizarDefensaBtn.setText("Actualizar");
        ActualizarDefensaBtn.setBorder(null);

        javax.swing.GroupLayout DefensaLayout = new javax.swing.GroupLayout(Defensa);
        Defensa.setLayout(DefensaLayout);
        DefensaLayout.setHorizontalGroup(
            DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefensaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DefensaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ActualizarDefensaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(DefensaLayout.createSequentialGroup()
                        .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ArqueroE1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArqueroArr1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArqueroVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArqueroRe1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DefensaAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        DefensaLayout.setVerticalGroup(
            DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefensaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArqueroRe1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroE1))
                .addGap(30, 30, 30)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefensaAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroArr1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ArqueroVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ActualizarDefensaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        Create_Players.addTab("Defensa", Defensa);

        ArqueroE2.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroE2.setText("Edad");
        ArqueroE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroE2ActionPerformed(evt);
            }
        });

        ArqueroArr2.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroArr2.setText("Arranque");
        ArqueroArr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroArr2ActionPerformed(evt);
            }
        });

        ArqueroVe2.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroVe2.setText("Velocidad");
        ArqueroVe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroVe2ActionPerformed(evt);
            }
        });

        ArqueroRe2.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroRe2.setText("Resistencia");

        ArqueroAlt2.setText("IQ");

        ActualizarMedioBtn.setText("Actualizar");
        ActualizarMedioBtn.setBorder(null);

        javax.swing.GroupLayout MedioLayout = new javax.swing.GroupLayout(Medio);
        Medio.setLayout(MedioLayout);
        MedioLayout.setHorizontalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedioLayout.createSequentialGroup()
                        .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MedioLayout.createSequentialGroup()
                                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArqueroE2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArqueroArr2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArqueroRe2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArqueroAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ArqueroVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(MedioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ActualizarMedioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );
        MedioLayout.setVerticalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArqueroRe2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroE2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArqueroAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroArr2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(ArqueroVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ActualizarMedioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        Create_Players.addTab("Medio", Medio);

        DelanteroEdad.setForeground(new java.awt.Color(255, 255, 255));
        DelanteroEdad.setText("Edad");
        DelanteroEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelanteroEdadActionPerformed(evt);
            }
        });

        DelanteroArr.setForeground(new java.awt.Color(255, 255, 255));
        DelanteroArr.setText("Arranque");
        DelanteroArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelanteroArrActionPerformed(evt);
            }
        });

        DelanteroVe.setForeground(new java.awt.Color(255, 255, 255));
        DelanteroVe.setText("Velocidad");
        DelanteroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelanteroVeActionPerformed(evt);
            }
        });

        DelanteroRe.setForeground(new java.awt.Color(255, 255, 255));
        DelanteroRe.setText("Resistencia");

        DelanteroPre.setText("Precision");

        ActualizarDelanteroBtn.setText("Actualizar");
        ActualizarDelanteroBtn.setBorder(null);

        javax.swing.GroupLayout DelanteroLayout = new javax.swing.GroupLayout(Delantero);
        Delantero.setLayout(DelanteroLayout);
        DelanteroLayout.setHorizontalGroup(
            DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelanteroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ActualizarDelanteroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(DelanteroLayout.createSequentialGroup()
                        .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DelanteroLayout.createSequentialGroup()
                                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DelanteroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DelanteroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DelanteroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DelanteroPre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DelanteroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        DelanteroLayout.setVerticalGroup(
            DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DelanteroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelanteroEdad))
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelanteroPre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelanteroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(DelanteroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ActualizarDelanteroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Create_Players.addTab("Delantero", Delantero);

        Bg_3.add(Create_Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArqueroEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroEActionPerformed

    private void ArqueroArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroArrActionPerformed

    private void ArqueroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroVeActionPerformed

    private void ArqueroE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroE1ActionPerformed

    private void ArqueroArr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroArr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroArr1ActionPerformed

    private void ArqueroVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroVe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroVe1ActionPerformed

    private void ArqueroE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroE2ActionPerformed

    private void ArqueroArr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroArr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroArr2ActionPerformed

    private void ArqueroVe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroVe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroVe2ActionPerformed

    private void DelanteroEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroEdadActionPerformed

    private void DelanteroArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroArrActionPerformed

    private void DelanteroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroVeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarArqueroBtn;
    private javax.swing.JButton ActualizarDefensaBtn;
    private javax.swing.JButton ActualizarDelanteroBtn;
    private javax.swing.JButton ActualizarMedioBtn;
    private javax.swing.JPanel Arquero;
    private javax.swing.JTextField ArqueroAlt;
    private javax.swing.JTextField ArqueroAlt2;
    private javax.swing.JTextField ArqueroArr;
    private javax.swing.JTextField ArqueroArr1;
    private javax.swing.JTextField ArqueroArr2;
    private javax.swing.JTextField ArqueroE;
    private javax.swing.JTextField ArqueroE1;
    private javax.swing.JTextField ArqueroE2;
    private javax.swing.JTextField ArqueroRe;
    private javax.swing.JTextField ArqueroRe1;
    private javax.swing.JTextField ArqueroRe2;
    private javax.swing.JTextField ArqueroVe;
    private javax.swing.JTextField ArqueroVe1;
    private javax.swing.JTextField ArqueroVe2;
    private javax.swing.JPanel Bg_3;
    private javax.swing.JTabbedPane Create_Players;
    private javax.swing.JPanel Defensa;
    private javax.swing.JTextField DefensaAgi;
    private javax.swing.JPanel Delantero;
    private javax.swing.JTextField DelanteroArr;
    private javax.swing.JTextField DelanteroEdad;
    private javax.swing.JTextField DelanteroPre;
    private javax.swing.JTextField DelanteroRe;
    private javax.swing.JTextField DelanteroVe;
    private javax.swing.JPanel Medio;
    // End of variables declaration//GEN-END:variables
}
