/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyecto.GUI;

/**
 *
 * @author user
 */
public class Partido extends javax.swing.JFrame {

    /**
     * Creates new form Partido
     */
    public Partido() {
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

        jLabel2 = new javax.swing.JLabel();
        Bg_4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_defensas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        LIsta_arqueros = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        LIsta_medios = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lista_delanteros = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        Lista_seleccionados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnSeleccionados = new javax.swing.JButton();
        AñadirArquerosBtn = new javax.swing.JButton();
        AñadirDefensasBts = new javax.swing.JButton();
        AñadirMedioBtn = new javax.swing.JButton();
        AñadirDelanteroBtn = new javax.swing.JButton();
        VolverDel2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lista_defensas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista_defensas);

        Bg_4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 280));

        LIsta_arqueros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(LIsta_arqueros);

        Bg_4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 280));

        LIsta_medios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(LIsta_medios);

        Bg_4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, 280));

        Lista_delanteros.setBorder(null);
        Lista_delanteros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(Lista_delanteros);

        Bg_4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 130, 280));

        Lista_seleccionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(Lista_seleccionados);

        Bg_4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 130, 280));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione los Jugadores:");
        Bg_4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Seleccionados:");
        Bg_4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        BtnSeleccionados.setText("LIsto");
        BtnSeleccionados.setBorder(null);
        Bg_4.add(BtnSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 100, 40));

        AñadirArquerosBtn.setText("Añadir");
        AñadirArquerosBtn.setBorder(null);
        Bg_4.add(AñadirArquerosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 40));

        AñadirDefensasBts.setText("Añadir");
        AñadirDefensasBts.setBorder(null);
        Bg_4.add(AñadirDefensasBts, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 100, 40));

        AñadirMedioBtn.setText("Añadir");
        AñadirMedioBtn.setBorder(null);
        Bg_4.add(AñadirMedioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 100, 40));

        AñadirDelanteroBtn.setText("Añadir");
        AñadirDelanteroBtn.setBorder(null);
        Bg_4.add(AñadirDelanteroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 100, 40));

        VolverDel2.setText("<");
        Bg_4.add(VolverDel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 38, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_4, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirArquerosBtn;
    private javax.swing.JButton AñadirDefensasBts;
    private javax.swing.JButton AñadirDelanteroBtn;
    private javax.swing.JButton AñadirMedioBtn;
    private javax.swing.JPanel Bg_4;
    private javax.swing.JButton BtnSeleccionados;
    private javax.swing.JList<String> LIsta_arqueros;
    private javax.swing.JList<String> LIsta_medios;
    private javax.swing.JList<String> Lista_defensas;
    private javax.swing.JList<String> Lista_delanteros;
    private javax.swing.JList<String> Lista_seleccionados;
    private javax.swing.JButton VolverDel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
