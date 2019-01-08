/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DistributivoVJohnny.vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Distributivo extends javax.swing.JFrame {

    /**
     * Creates new form Distributivo
     */
    
    //Variables para mover la ventana  
    int mouseX; 
    int mouseY; 
    
    public Distributivo() {
        initComponents();
    }

    public JButton getBtnClasificar() {
        return btnClasificar;
    }

    public JButton getBtnDocentes() {
        return btnDocentes;
    }

    public JButton getBtnMaterias() {
        return btnMaterias;
    }

    public JButton getBtnParalelos() {
        return btnParalelos;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JComboBox<String> getCbPeriodoLectivo() {
        return cbPeriodoLectivo;
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public JButton getBtnInformacion() {
        return btnInformacion;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cbPeriodoLectivo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnClasificar = new javax.swing.JButton();
        btnParalelos = new javax.swing.JButton();
        btnDocentes = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(102, 102, 102));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Distributivo");
        pnlHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Cancel_26px.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Cancel_26px_1.png"))); // NOI18N
        pnlHeader.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        cbPeriodoLectivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPeriodoLectivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlHeader.add(cbPeriodoLectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 380, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eliga el periodo lectivo");
        pnlHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 30));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        pnlMenu.setBackground(new java.awt.Color(153, 153, 153));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClasificar.setText("Clasificar");
        pnlMenu.add(btnClasificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 30));

        btnParalelos.setText("Paralelos");
        pnlMenu.add(btnParalelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        btnDocentes.setText("Docentes");
        pnlMenu.add(btnDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 80, 30));

        btnMaterias.setText("Materias");
        pnlMenu.add(btnMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, 30));

        btnInformacion.setText("Informacion");
        pnlMenu.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 90, 30));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 30));

        pnlPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        pnlPrincipal.setLayout(new java.awt.CardLayout());

        pnlInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlPrincipal.add(pnlInicio, "card2");

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 700, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY(); 
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int x = evt.getXOnScreen(); 
        int y = evt.getYOnScreen(); 
        
        this.setLocation(x - mouseX, y - mouseY); 
    }//GEN-LAST:event_pnlHeaderMouseDragged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Distributivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Distributivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Distributivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Distributivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Distributivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClasificar;
    private javax.swing.JButton btnDocentes;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnMaterias;
    private javax.swing.JButton btnParalelos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbPeriodoLectivo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
