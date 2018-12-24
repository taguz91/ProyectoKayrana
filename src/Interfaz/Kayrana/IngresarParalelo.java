package Interfaz.Kayrana;

import BaseDatos.Conexion_Consultas;
import BaseDatos.SQLCarreras;
import BaseDatos.SQLEstudiante;
import BaseDatos.SQLParalelos;
import Clases.Carrera;
import Clases.Estudiante;
import Clases.Paralelo;
import Interfaz.Administrador.Similitudes;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johnny
 */
public class IngresarParalelo extends javax.swing.JFrame {

    int posFila;
    boolean btnAvilitados = false;
    boolean editando = false;

    int mousex;
    int mousey;

    DefaultTableModel modelTblParalelos;
    String titulo[] = {"id", "Paralelo", "Jornada"};
    String datos[][] = {};

    static Estudiante userEstudiante = null;

    ArrayList<Carrera> carrerasDB = new ArrayList();

    ArrayList<Paralelo> paralelosDB = new ArrayList();

    //Guardaremos las carreras del combo 
    ArrayList<ArrayList<String>> parlJdr = new ArrayList();

    //Guardamos para usarlo en el combo 
    ArrayList<ArrayList<String>> parlJdrEst = new ArrayList();

    public IngresarParalelo() {
        initComponents();
        Conexion_Consultas.conectar();

        try {
            setIconImage(new ImageIcon(getClass().getResource("../img/LogoKayranaCircularV.1.png")).getImage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        modelTblParalelos = new DefaultTableModel(datos, titulo);
        tblParalelos.setModel(modelTblParalelos);

        Similitudes.ocultarID(tblParalelos);
        Similitudes.tituloTbls(tblParalelos);

        carrerasDB = SQLCarreras.cargarCarrerasDB(true);

        comboCarreras.removeAllItems();

        for (int i = 0; i < carrerasDB.size(); i++) {
            comboCarreras.addItem(carrerasDB.get(i).getNombre_Carrera());
        }

        lblErrorNuevoParalelo.setVisible(false);
    }

    public void setEstudiante(Estudiante est) {
        userEstudiante = est;

        actualizarTblParl();
    }

    public void actualizarTblParl() {
        parlJdrEst = SQLEstudiante.cargarParalelosEstudiante(userEstudiante.getIdEstudiante());

        modelTblParalelos.setRowCount(0);

        if (!parlJdrEst.isEmpty()) {
            for (int i = 0; i < parlJdrEst.size(); i++) {

                Object val[] = new Object[parlJdrEst.get(i).size()];
                val = parlJdrEst.get(i).toArray();

                modelTblParalelos.addRow(val);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        comboParalelos = new javax.swing.JComboBox<>();
        comboCarreras = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParalelos = new JTable(){
            @Override 
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false; 
            }
        };
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblErrorNuevoParalelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(201, 211, 200));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(21, 89, 110));
        panelHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHeaderMouseDragged(evt);
            }
        });
        panelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHeaderMousePressed(evt);
            }
        });
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px_1.png"))); // NOI18N
        btnMenu.setToolTipText("Volver al menu");
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMenu.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px_2.png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        panelHeader.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar paralelos");
        panelHeader.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 40));

        getContentPane().add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        jPanel1.setBackground(new java.awt.Color(201, 211, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboParalelos.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPanel1.add(comboParalelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 290, 30));

        comboCarreras.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        comboCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCarrerasActionPerformed(evt);
            }
        });
        jPanel1.add(comboCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 5, 290, 30));

        btnGuardar.setBackground(new java.awt.Color(99, 144, 158));
        btnGuardar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, -1));

        btnEditar.setBackground(new java.awt.Color(118, 125, 127));
        btnEditar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.setOpaque(true);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(118, 125, 127));
        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setOpaque(true);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 110, -1));

        jScrollPane1.setBackground(new java.awt.Color(231, 235, 230));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblParalelos.setBackground(new java.awt.Color(231, 235, 230));
        tblParalelos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblParalelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Paralelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblParalelos.setSelectionBackground(new java.awt.Color(21, 89, 110));
        tblParalelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblParalelosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblParalelos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 460, 120));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 110, 172));
        jLabel5.setText("Seleccionar paralelo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 110, 172));
        jLabel6.setText("Seleccionar carrera:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 1, 180, 40));

        lblErrorNuevoParalelo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblErrorNuevoParalelo.setForeground(new java.awt.Color(173, 46, 25));
        lblErrorNuevoParalelo.setText("Paralelo ya agregado.");
        jPanel1.add(lblErrorNuevoParalelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        boolean guardar = true;

        int posPrl = comboParalelos.getSelectedIndex();
        String fk_paralelo = parlJdr.get(posPrl).get(0);

        ArrayList<ArrayList<String>> existe = SQLEstudiante.consultarParaleloEst(userEstudiante.getIdEstudiante(), Integer.parseInt(fk_paralelo));

        if (!existe.isEmpty()) {
            SQLEstudiante.eliminarParaleloEst(Integer.parseInt(existe.get(0).get(0)), false);
            lblErrorNuevoParalelo.setVisible(true);
            guardar = false;
            actualizarTblParl();
        }

        if (guardar) {
            if (!editando) {
                SQLEstudiante.ingresarParaleloEst(userEstudiante.getIdEstudiante(), Integer.parseInt(fk_paralelo));
            }

            if (editando) {

                SQLEstudiante.modificarParaleloEst(Integer.parseInt(tblParalelos.getValueAt(posFila, 0).toString()), Integer.parseInt(fk_paralelo));
            }

            lblErrorNuevoParalelo.setVisible(false);
            actualizarTblParl();
        }

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        Similitudes.btnEntered(btnGuardar);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        Similitudes.btnExited(btnGuardar);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        try {
            if (posFila >= 0 && btnAvilitados) {

                String parl = tblParalelos.getValueAt(posFila, 1).toString();
                String jord = tblParalelos.getValueAt(posFila, 2).toString();

                comboParalelos.setSelectedItem(parl + " " + jord);

                //Si selecionamos editar deasvilitamos los botones editar y eliminar
                btnAvilitados = Similitudes.btnsModoInactivo(btnEditar, btnEliminar);

                editando = true;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        if (btnAvilitados) {
            Similitudes.btnEntered(btnEditar);
        }
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        if (btnAvilitados) {
            Similitudes.btnExited(btnEditar);
        }
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        try {

            if (posFila >= 0 && btnAvilitados) {
                SQLEstudiante.eliminarParaleloEst(Integer.parseInt(tblParalelos.getValueAt(posFila, 0).toString()), true);

                modelTblParalelos.removeRow(posFila);
            }

            //Cambiamos los botones a inactivos
            btnAvilitados = Similitudes.btnsModoInactivo(btnEditar, btnEliminar);
            editando = false;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error al eliminar actividad: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        if (btnAvilitados) {
            Similitudes.btnEntered(btnEliminar);
        }
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        if (btnAvilitados) {
            Similitudes.btnExited(btnEliminar);
        }
    }//GEN-LAST:event_btnEliminarMouseExited

    private void tblParalelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblParalelosMouseClicked
        try {
            posFila = tblParalelos.getSelectedRow();

            //Activamos nuestros botones
            if (posFila >= 0) {
                btnAvilitados = Similitudes.btnsModoActivo(btnEditar, btnEliminar);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_tblParalelosMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        App app = new App();

        app.setUserEstudiante(userEstudiante);
        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_panelHeaderMousePressed

    private void comboCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCarrerasActionPerformed
        int pos = comboCarreras.getSelectedIndex();

        int fk_carrera = carrerasDB.get(pos).getId_carrera();

        parlJdr = SQLParalelos.cargarJornadaParalelosCarrera(fk_carrera);

        comboParalelos.removeAllItems();

        for (int i = 0; i < parlJdr.size(); i++) {
            System.out.println("Este es el id de parl jdr numero " + parlJdr.get(i).get(0));
            comboParalelos.addItem(parlJdr.get(i).get(1));
        }

    }//GEN-LAST:event_comboCarrerasActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarParalelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> comboCarreras;
    private javax.swing.JComboBox<String> comboParalelos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorNuevoParalelo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblParalelos;
    // End of variables declaration//GEN-END:variables
}
