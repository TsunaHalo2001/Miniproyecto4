/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyecto.GUI;

/**
 *
 * @author user
 */
public class Crear extends javax.swing.JFrame {

    /**
     * Creates new form Crear
     */
    public Crear() {
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

        jPanel2 = new javax.swing.JPanel();
        Bg_2 = new javax.swing.JPanel();
        Create_Players = new javax.swing.JTabbedPane();
        Arquero = new javax.swing.JPanel();
        ArqueroN = new javax.swing.JTextField();
        ArqueroE = new javax.swing.JTextField();
        ArqueroArr = new javax.swing.JTextField();
        ArqueroVe = new javax.swing.JTextField();
        ArqueroRe = new javax.swing.JTextField();
        ArqueroAlt = new javax.swing.JTextField();
        GuardarArqueroBtn = new javax.swing.JButton();
        VolverAr = new javax.swing.JButton();
        Defensa = new javax.swing.JPanel();
        DefensaNom = new javax.swing.JTextField();
        DefensaEd = new javax.swing.JTextField();
        DefensaArr = new javax.swing.JTextField();
        DefensaVel = new javax.swing.JTextField();
        DefensaRe = new javax.swing.JTextField();
        DefensaAgi = new javax.swing.JTextField();
        GuardarDefensaBtn = new javax.swing.JButton();
        VolverDef = new javax.swing.JButton();
        Medio = new javax.swing.JPanel();
        MedioNom = new javax.swing.JTextField();
        MedioEdad = new javax.swing.JTextField();
        MedioArr = new javax.swing.JTextField();
        DefensaVe = new javax.swing.JTextField();
        MedioRe = new javax.swing.JTextField();
        MedioIQ = new javax.swing.JTextField();
        GuardarArqueroBtn2 = new javax.swing.JButton();
        VolverMed = new javax.swing.JButton();
        Delantero = new javax.swing.JPanel();
        DelanteroNom = new javax.swing.JTextField();
        DelanteroEdad = new javax.swing.JTextField();
        DelanteroArr = new javax.swing.JTextField();
        DelanteroVe = new javax.swing.JTextField();
        DelanteroRe = new javax.swing.JTextField();
        DelanteroPre = new javax.swing.JTextField();
        GuardarDelanteroBtn = new javax.swing.JButton();
        VolverDel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArqueroN.setForeground(new java.awt.Color(255, 255, 255));
        ArqueroN.setText("Nombre");
        ArqueroN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArqueroNActionPerformed(evt);
            }
        });

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

        GuardarArqueroBtn.setText("Agregar");
        GuardarArqueroBtn.setBorder(null);

        VolverAr.setText("<");

        javax.swing.GroupLayout ArqueroLayout = new javax.swing.GroupLayout(Arquero);
        Arquero.setLayout(ArqueroLayout);
        ArqueroLayout.setHorizontalGroup(
            ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArqueroLayout.createSequentialGroup()
                        .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArqueroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ArqueroLayout.createSequentialGroup()
                                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArqueroN, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArqueroE, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ArqueroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ArqueroAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(ArqueroLayout.createSequentialGroup()
                        .addComponent(ArqueroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarArqueroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addComponent(VolverAr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ArqueroLayout.setVerticalGroup(
            ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArqueroLayout.createSequentialGroup()
                .addComponent(VolverAr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArqueroN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArqueroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ArqueroAlt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ArqueroE, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(ArqueroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ArqueroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArqueroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarArqueroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Create_Players.addTab("Arquero", Arquero);

        DefensaNom.setForeground(new java.awt.Color(255, 255, 255));
        DefensaNom.setText("Nombre");
        DefensaNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefensaNomActionPerformed(evt);
            }
        });

        DefensaEd.setForeground(new java.awt.Color(255, 255, 255));
        DefensaEd.setText("Edad");
        DefensaEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefensaEdActionPerformed(evt);
            }
        });

        DefensaArr.setForeground(new java.awt.Color(255, 255, 255));
        DefensaArr.setText("Arranque");
        DefensaArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefensaArrActionPerformed(evt);
            }
        });

        DefensaVel.setForeground(new java.awt.Color(255, 255, 255));
        DefensaVel.setText("Velocidad");
        DefensaVel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefensaVelActionPerformed(evt);
            }
        });

        DefensaRe.setForeground(new java.awt.Color(255, 255, 255));
        DefensaRe.setText("Resistencia");

        DefensaAgi.setText("Agilidad");

        GuardarDefensaBtn.setText("Agregar");
        GuardarDefensaBtn.setBorder(null);

        VolverDef.setText("<");

        javax.swing.GroupLayout DefensaLayout = new javax.swing.GroupLayout(Defensa);
        Defensa.setLayout(DefensaLayout);
        DefensaLayout.setHorizontalGroup(
            DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefensaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DefensaLayout.createSequentialGroup()
                        .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DefensaArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DefensaLayout.createSequentialGroup()
                                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DefensaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DefensaEd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DefensaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DefensaAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(DefensaLayout.createSequentialGroup()
                        .addComponent(DefensaVel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarDefensaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(DefensaLayout.createSequentialGroup()
                .addComponent(VolverDef, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DefensaLayout.setVerticalGroup(
            DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefensaLayout.createSequentialGroup()
                .addComponent(VolverDef, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DefensaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DefensaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DefensaAgi, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DefensaEd, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(DefensaArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(DefensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefensaVel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarDefensaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Create_Players.addTab("Defensa", Defensa);

        MedioNom.setForeground(new java.awt.Color(255, 255, 255));
        MedioNom.setText("Nombre");
        MedioNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioNomActionPerformed(evt);
            }
        });

        MedioEdad.setForeground(new java.awt.Color(255, 255, 255));
        MedioEdad.setText("Edad");
        MedioEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioEdadActionPerformed(evt);
            }
        });

        MedioArr.setForeground(new java.awt.Color(255, 255, 255));
        MedioArr.setText("Arranque");
        MedioArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioArrActionPerformed(evt);
            }
        });

        DefensaVe.setForeground(new java.awt.Color(255, 255, 255));
        DefensaVe.setText("Velocidad");
        DefensaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefensaVeActionPerformed(evt);
            }
        });

        MedioRe.setForeground(new java.awt.Color(255, 255, 255));
        MedioRe.setText("Resistencia");

        MedioIQ.setText("IQ");

        GuardarArqueroBtn2.setText("Agregar");
        GuardarArqueroBtn2.setBorder(null);

        VolverMed.setText("<");

        javax.swing.GroupLayout MedioLayout = new javax.swing.GroupLayout(Medio);
        Medio.setLayout(MedioLayout);
        MedioLayout.setHorizontalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedioLayout.createSequentialGroup()
                        .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedioArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MedioLayout.createSequentialGroup()
                                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedioNom, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedioEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MedioRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MedioIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(MedioLayout.createSequentialGroup()
                        .addComponent(DefensaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarArqueroBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(MedioLayout.createSequentialGroup()
                .addComponent(VolverMed, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MedioLayout.setVerticalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedioLayout.createSequentialGroup()
                .addComponent(VolverMed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MedioNom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedioRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MedioIQ, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(MedioEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(MedioArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DefensaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarArqueroBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Create_Players.addTab("Medio", Medio);

        DelanteroNom.setForeground(new java.awt.Color(255, 255, 255));
        DelanteroNom.setText("Nombre");
        DelanteroNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelanteroNomActionPerformed(evt);
            }
        });

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
        DelanteroPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelanteroPreActionPerformed(evt);
            }
        });

        GuardarDelanteroBtn.setText("Agregar");
        GuardarDelanteroBtn.setBorder(null);

        VolverDel.setText("<");

        javax.swing.GroupLayout DelanteroLayout = new javax.swing.GroupLayout(Delantero);
        Delantero.setLayout(DelanteroLayout);
        DelanteroLayout.setHorizontalGroup(
            DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelanteroLayout.createSequentialGroup()
                        .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DelanteroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DelanteroLayout.createSequentialGroup()
                                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DelanteroNom, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DelanteroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DelanteroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DelanteroPre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(DelanteroLayout.createSequentialGroup()
                        .addComponent(DelanteroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarDelanteroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addComponent(VolverDel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DelanteroLayout.setVerticalGroup(
            DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelanteroLayout.createSequentialGroup()
                .addComponent(VolverDel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DelanteroNom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelanteroRe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DelanteroPre, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(DelanteroEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(DelanteroArr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(DelanteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelanteroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarDelanteroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Create_Players.addTab("Delantero", Delantero);

        Bg_2.add(Create_Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArqueroNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroNActionPerformed

    private void ArqueroEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroEActionPerformed

    private void ArqueroArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroArrActionPerformed

    private void ArqueroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArqueroVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArqueroVeActionPerformed

    private void DefensaNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefensaNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefensaNomActionPerformed

    private void DefensaEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefensaEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefensaEdActionPerformed

    private void DefensaArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefensaArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefensaArrActionPerformed

    private void DefensaVelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefensaVelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefensaVelActionPerformed

    private void MedioNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioNomActionPerformed

    private void MedioEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioEdadActionPerformed

    private void MedioArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioArrActionPerformed

    private void DefensaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefensaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefensaVeActionPerformed

    private void DelanteroNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroNomActionPerformed

    private void DelanteroEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroEdadActionPerformed

    private void DelanteroArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroArrActionPerformed

    private void DelanteroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroVeActionPerformed

    private void DelanteroPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelanteroPreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelanteroPreActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arquero;
    public javax.swing.JTextField ArqueroAlt;
    public javax.swing.JTextField ArqueroArr;
    public javax.swing.JTextField ArqueroE;
    public javax.swing.JTextField ArqueroN;
    public javax.swing.JTextField ArqueroRe;
    public javax.swing.JTextField ArqueroVe;
    private javax.swing.JPanel Bg_2;
    public javax.swing.JTabbedPane Create_Players;
    private javax.swing.JPanel Defensa;
    public javax.swing.JTextField DefensaAgi;
    public javax.swing.JTextField DefensaArr;
    public javax.swing.JTextField DefensaEd;
    public javax.swing.JTextField DefensaNom;
    public javax.swing.JTextField DefensaRe;
    public javax.swing.JTextField DefensaVe;
    public javax.swing.JTextField DefensaVel;
    private javax.swing.JPanel Delantero;
    public javax.swing.JTextField DelanteroArr;
    public javax.swing.JTextField DelanteroEdad;
    public javax.swing.JTextField DelanteroNom;
    public javax.swing.JTextField DelanteroPre;
    public javax.swing.JTextField DelanteroRe;
    public javax.swing.JTextField DelanteroVe;
    public javax.swing.JButton GuardarArqueroBtn;
    public javax.swing.JButton GuardarArqueroBtn2;
    public javax.swing.JButton GuardarDefensaBtn;
    public javax.swing.JButton GuardarDelanteroBtn;
    private javax.swing.JPanel Medio;
    public javax.swing.JTextField MedioArr;
    public javax.swing.JTextField MedioEdad;
    public javax.swing.JTextField MedioIQ;
    public javax.swing.JTextField MedioNom;
    public javax.swing.JTextField MedioRe;
    public javax.swing.JButton VolverAr;
    public javax.swing.JButton VolverDef;
    private javax.swing.JButton VolverDel;
    public javax.swing.JButton VolverMed;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
