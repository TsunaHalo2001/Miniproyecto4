/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyecto.GUI;

import javax.swing.JButton;
import javax.swing.JTextField;

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
        VolverAr2 = new javax.swing.JButton();
        Defensa = new javax.swing.JPanel();
        DefensaE = new javax.swing.JTextField();
        DefensaArr = new javax.swing.JTextField();
        DefensaVe = new javax.swing.JTextField();
        DefensaRe = new javax.swing.JTextField();
        DefensaAgi = new javax.swing.JTextField();
        ActualizarDefensaBtn = new javax.swing.JButton();
        VolverDef2 = new javax.swing.JButton();
        Medio = new javax.swing.JPanel();
        MedioE = new javax.swing.JTextField();
        MedioArr = new javax.swing.JTextField();
        MedioVe = new javax.swing.JTextField();
        MedioRe = new javax.swing.JTextField();
        MedioIQ = new javax.swing.JTextField();
        ActualizarMedioBtn = new javax.swing.JButton();
        VolverMed2 = new javax.swing.JButton();
        Delantero = new javax.swing.JPanel();
        DelanteroE = new javax.swing.JTextField();
        DelanteroArr = new javax.swing.JTextField();
        DelanteroVe = new javax.swing.JTextField();
        DelanteroRe = new javax.swing.JTextField();
        DelanteroPre = new javax.swing.JTextField();
        ActualizarDelanteroBtn = new javax.swing.JButton();
        VolverDel2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Arquero.setPreferredSize(new java.awt.Dimension(700, 450));

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

        VolverAr2.setText("<");

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
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addComponent(VolverAr2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ArqueroLayout.setVerticalGroup(
            ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addComponent(VolverAr2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        DefensaE.setForeground(new java.awt.Color(255, 255, 255));
        DefensaE.setText("Edad");
        DefensaE.setToolTipText("");
        DefensaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        DefensaArr.setForeground(new java.awt.Color(255, 255, 255));
        DefensaArr.setText("Arranque");
        DefensaArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        DefensaVe.setForeground(new java.awt.Color(255, 255, 255));
        DefensaVe.setText("Velocidad");
        DefensaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        DefensaRe.setForeground(new java.awt.Color(255, 255, 255));
        DefensaRe.setText("Resistencia");

        DefensaAgi.setText("Agilidad");

        ActualizarDefensaBtn.setText("Actualizar");
        ActualizarDefensaBtn.setBorder(null);

        VolverDef2.setText("<");

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
                            .addComponent(DefensaE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DefensaArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DefensaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DefensaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DefensaAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
            .addGroup(DefensaLayout.createSequentialGroup()
                .addComponent(VolverDef2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DefensaLayout.setVerticalGroup(
            DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefensaLayout.createSequentialGroup()
                .addComponent(VolverDef2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DefensaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DefensaE))
                .addGap(30, 30, 30)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefensaAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DefensaArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(DefensaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ActualizarDefensaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        Create_Players.addTab("Defensa", Defensa);

        MedioE.setForeground(new java.awt.Color(255, 255, 255));
        MedioE.setText("Edad");
        MedioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        MedioArr.setForeground(new java.awt.Color(255, 255, 255));
        MedioArr.setText("Arranque");
        MedioArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        MedioVe.setForeground(new java.awt.Color(255, 255, 255));
        MedioVe.setText("Velocidad");
        MedioVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        MedioRe.setForeground(new java.awt.Color(255, 255, 255));
        MedioRe.setText("Resistencia");

        MedioIQ.setText("IQ");

        ActualizarMedioBtn.setText("Actualizar");
        ActualizarMedioBtn.setBorder(null);

        VolverMed2.setText("<");

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
                                    .addComponent(MedioE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedioArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedioRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedioIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(MedioVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(MedioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ActualizarMedioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(MedioLayout.createSequentialGroup()
                .addComponent(VolverMed2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MedioLayout.setVerticalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedioLayout.createSequentialGroup()
                .addComponent(VolverMed2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MedioRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedioE))
                .addGap(30, 30, 30)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedioIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedioArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(MedioVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ActualizarMedioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        Create_Players.addTab("Medio", Medio);

        DelanteroE.setForeground(new java.awt.Color(255, 255, 255));
        DelanteroE.setText("Edad");
        DelanteroE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
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

        VolverDel2.setText("<");

        javax.swing.GroupLayout DelanteroLayout = new javax.swing.GroupLayout(Delantero);
        Delantero.setLayout(DelanteroLayout);
        DelanteroLayout.setHorizontalGroup(
            DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelanteroLayout.createSequentialGroup()
                        .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DelanteroE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelanteroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DelanteroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelanteroPre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DelanteroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addComponent(VolverDel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DelanteroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ActualizarDelanteroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        DelanteroLayout.setVerticalGroup(
            DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addComponent(VolverDel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DelanteroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelanteroE))
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelanteroPre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelanteroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(DelanteroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ActualizarDelanteroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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

    public void getActualizarArqueroBtn(java.awt.event.ActionListener evt) {
        ActualizarArqueroBtn.addActionListener(evt);
    }
    public void getActualizarDefensaBtn(java.awt.event.ActionListener evt) {
        ActualizarDefensaBtn.addActionListener(evt);
    }
    public void getActualizarMedioBtn(java.awt.event.ActionListener evt) {
        ActualizarMedioBtn.addActionListener(evt);
    }
    public void getActualizarDelanteroBtn(java.awt.event.ActionListener evt) {
        ActualizarDelanteroBtn.addActionListener(evt);
    }
    public JButton getVolverAr2() {
        return VolverAr2;
    }
    public JButton getVolverDef2() {
        return VolverDef2;
    }
    public JButton getVolverMed2() {
        return VolverMed2;
    }
    public JButton getVolverDel2() {
        return VolverDel2;
    }
        public JTextField getEdadArquero() {
        return ArqueroE;
        }
        public JTextField getArranqueArquero() {
        return ArqueroArr;
        }
        public JTextField getVelocidadArquero() {
        return ArqueroVe;
        }
        public JTextField getResistenciaArquero() {
        return ArqueroRe;
        }
        public JTextField getAlturaArquero() {
        return ArqueroAlt;
        }
        public JTextField getEdadDefensa() {
        return DefensaE;
        }
        public JTextField getArranqueDefensa() {
        return DefensaArr;
        }
        public JTextField getVelocidadDefensa() {
        return DefensaVe;
        }
        public JTextField getResistenciaDefensa() {
        return DefensaRe;
        }
        public JTextField getAgilidadDefensa() {
        return DefensaAgi;
        }
        public JTextField getEdadMedio() {
        return MedioE;
        }
        public JTextField getArranqueMedio() {
        return MedioArr;
        }
        public JTextField getVelocidadMedio() {
        return DefensaVe;
        }
        public JTextField getResistenciaMedio() {
        return MedioRe;
        }
        public JTextField getIQMedio() {
        return MedioIQ;
        }
        public JTextField getEdadDelantero() {
        return DelanteroE;
        }
        public JTextField getArranqueDelantero() {
        return DelanteroArr;
        }
        public JTextField getVelocidadDelantero() {
        return DelanteroVe;
        }
        public JTextField getResistenciaDelantero() {
        return DelanteroRe;
        }
        public JTextField getPrecisionDelantero() {
        return DelanteroPre;
        }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ActualizarArqueroBtn;
    public javax.swing.JButton ActualizarDefensaBtn;
    public javax.swing.JButton ActualizarDelanteroBtn;
    public javax.swing.JButton ActualizarMedioBtn;
    private javax.swing.JPanel Arquero;
    public javax.swing.JTextField ArqueroAlt;
    public javax.swing.JTextField ArqueroArr;
    public javax.swing.JTextField ArqueroE;
    public javax.swing.JTextField ArqueroRe;
    public javax.swing.JTextField ArqueroVe;
    private javax.swing.JPanel Bg_3;
    public javax.swing.JTabbedPane Create_Players;
    private javax.swing.JPanel Defensa;
    public javax.swing.JTextField DefensaAgi;
    public javax.swing.JTextField DefensaArr;
    public javax.swing.JTextField DefensaE;
    public javax.swing.JTextField DefensaRe;
    public javax.swing.JTextField DefensaVe;
    private javax.swing.JPanel Delantero;
    public javax.swing.JTextField DelanteroArr;
    public javax.swing.JTextField DelanteroE;
    public javax.swing.JTextField DelanteroPre;
    public javax.swing.JTextField DelanteroRe;
    public javax.swing.JTextField DelanteroVe;
    private javax.swing.JPanel Medio;
    public javax.swing.JTextField MedioArr;
    public javax.swing.JTextField MedioE;
    public javax.swing.JTextField MedioIQ;
    public javax.swing.JTextField MedioRe;
    public javax.swing.JTextField MedioVe;
    public javax.swing.JButton VolverAr2;
    public javax.swing.JButton VolverDef2;
    public javax.swing.JButton VolverDel2;
    public javax.swing.JButton VolverMed2;
    // End of variables declaration//GEN-END:variables
}
