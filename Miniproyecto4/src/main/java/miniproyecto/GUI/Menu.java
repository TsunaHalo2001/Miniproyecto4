package miniproyecto.GUI;

import javax.swing.JButton;
import javax.swing.JList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    public Menu() {
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

        Bg_1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaJ = new javax.swing.JList<>();
        btnDel = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        btnMatch = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        IMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bg_1.setBackground(new java.awt.Color(51, 51, 51));
        Bg_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListaJ.setBackground(new java.awt.Color(153, 153, 153));
        ListaJ.setBorder(null);
        ListaJ.setForeground(new java.awt.Color(0, 0, 0));
        ListaJ.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaJ);

        Bg_1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 170, 360));

        btnDel.setBackground(new java.awt.Color(153, 153, 153));
        btnDel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDel.setForeground(new java.awt.Color(0, 0, 0));
        btnDel.setText("Eliminar");
        btnDel.setBorder(null);
        Bg_1.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 399, 100, 30));

        btnRes.setBackground(new java.awt.Color(51, 51, 51));
        btnRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproyecto/IMG/IMG/Img/Re.png"))); // NOI18N
        btnRes.setBorder(null);
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });
        Bg_1.add(btnRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 399, 40, -1));

        btnMatch.setBackground(new java.awt.Color(153, 153, 153));
        btnMatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMatch.setForeground(new java.awt.Color(0, 0, 0));
        btnMatch.setText("Partido");
        btnMatch.setBorder(null);
        Bg_1.add(btnMatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 29, 150, 60));

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(0, 0, 0));
        btnCreate.setText("Crear");
        btnCreate.setBorder(null);
        Bg_1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 29, 150, 60));

        btnUpd.setBackground(new java.awt.Color(153, 153, 153));
        btnUpd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpd.setForeground(new java.awt.Color(0, 0, 0));
        btnUpd.setText("Actualizar");
        btnUpd.setBorder(null);
        Bg_1.add(btnUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 29, 150, 60));

        IMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproyecto/IMG/IMG/Img/Imagen_inicio.jpg"))); // NOI18N
        Bg_1.add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 109, -1, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResActionPerformed

    private void Lista_SoldadosValueChanged(javax.swing.event.ListSelectionEvent evt) {                                       
    }
        public JList<String> getLista_jugadores() {
        return ListaJ;
    }


    public JButton getBoton_Crear() {
        return btnCreate;
    }

    public JButton getBoton_Actualizar() {
        return btnUpd;
    }

    public JButton getBoton_Partido() {
        return btnMatch;
    }

    public JButton getResetear() {
        return btnRes;
    }

    public JButton getBoton_Eliminar() {
        return btnDel;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg_1;
    private javax.swing.JLabel IMG;
    private javax.swing.JList<String> ListaJ;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnMatch;
    public javax.swing.JButton btnRes;
    private javax.swing.JButton btnUpd;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}