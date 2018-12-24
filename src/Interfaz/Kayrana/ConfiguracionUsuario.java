/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Kayrana;

import BaseDatos.SQLUsuario;
import Clases.Docente;
import Clases.Estudiante;
import Clases.Validaciones;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Johnny
 */
public class ConfiguracionUsuario extends javax.swing.JFrame {

    //Usuarios 
    static Docente userDocente = null;
    static Estudiante userEstudiante = null;

    boolean btnsActivos = false;

    DateFormat fechaCorta = new SimpleDateFormat("dd/MM/yyyy");

    int mousex;
    int mousey;

    public ConfiguracionUsuario() {
        initComponents();

        //Icono de la palicacion 
                try {
            setIconImage(new ImageIcon(getClass().getResource("../img/LogoKayranaCircularV.1.png")).getImage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        ocultarErrores();

        //Creamos el grupo de los botones 
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rdBtnFemenino);
        grupo.add(rdBtnMasculino);

        btnGuardarDatos.setEnabled(false);

    }

    public void cambioPanel(JPanel padre, JPanel panel) {
        padre.removeAll();
        padre.repaint();
        padre.revalidate();

        padre.add(panel);
        padre.repaint();
        padre.revalidate();
    }

    public void ocultarErrores() {
        lblErrorNick.setVisible(false);
        lblErrorNombre.setVisible(false);
        lblErrorApellido.setVisible(false);
        lblErrorFechaNacimiento.setVisible(false);
        lblErrorTitulo.setVisible(false);
        lblErrorObligatorio.setVisible(false);
        lblErrorContraActual.setVisible(false);
        lblErrorContraNueva.setVisible(false);
        lblErrorContraNuevamente.setVisible(false);
        lblErrorCorreo.setVisible(false);
    }

    public void desactivarCampos() {
        txtNickName.setEditable(false);
        txtNombre.setEditable(false);
        txtApellido.setEditable(false);
        txtFechaNacimiento.setEditable(false);
        txtAtributoUnico.setEditable(false);
        txtCorreo.setEditable(false);
        rdBtnFemenino.setEnabled(false);
        rdBtnMasculino.setEnabled(false);

        btnEditarDatos.setEnabled(true);
    }

    public void setDocente(Docente docen) {
        ConfiguracionUsuario.userDocente = docen;

        txtNickName.setText(userDocente.getNickUsuario());
        txtNombre.setText(userDocente.getNombreUsuario());
        txtApellido.setText(userDocente.getApellidoUsuario());
        txtCorreo.setText(userDocente.getCorreoUsuario());
        txtFechaNacimiento.setText(fechaCorta.format(userDocente.getFecNacUsuario()));
        txtAtributoUnico.setText(userDocente.getTituloDocente());

        char sexo = userDocente.getSexoUsuario();
        if (sexo == 'M') {
            rdBtnMasculino.setSelected(true);
        } else if (sexo == 'F') {
            rdBtnFemenino.setSelected(true);
        }

        desactivarCampos();

        System.out.println("Entramos como docente");
    }

    public void setEstudinate(Estudiante est) {
        ConfiguracionUsuario.userEstudiante = est;

        txtNickName.setText(userEstudiante.getNickUsuario());
        txtNombre.setText(userEstudiante.getNombreUsuario());
        txtApellido.setText(userEstudiante.getApellidoUsuario());
        txtCorreo.setText(userEstudiante.getCorreoUsuario());
        txtFechaNacimiento.setText(fechaCorta.format(userEstudiante.getFecNacUsuario()));
        txtAtributoUnico.setText(userEstudiante.getColegioEstudiante());

        char sexo = userEstudiante.getSexoUsuario();
        if (sexo == 'M') {
            rdBtnMasculino.setSelected(true);
        } else if (sexo == 'F') {
            rdBtnFemenino.setSelected(true);
        }

        desactivarCampos();

        System.out.println("Entramos como estudiante");
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
        btnDatosPersonales = new javax.swing.JButton();
        btnCambiarContra = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        panelCuerpo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNickName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rdBtnMasculino = new javax.swing.JRadioButton();
        rdBtnFemenino = new javax.swing.JRadioButton();
        btnGuardarDatos = new javax.swing.JButton();
        btnEditarDatos = new javax.swing.JButton();
        txtAtributoUnico = new javax.swing.JTextField();
        lblAtributoUnico = new javax.swing.JLabel();
        lblErrorTitulo = new javax.swing.JLabel();
        lblErrorNick = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorApellido = new javax.swing.JLabel();
        lblErrorFechaNacimiento = new javax.swing.JLabel();
        lblErrorCorreo = new javax.swing.JLabel();
        panelContra = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtContraNuevaNuevamente = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtContraActual = new javax.swing.JPasswordField();
        txtContraNueva = new javax.swing.JPasswordField();
        btnGuardarContra = new javax.swing.JButton();
        lblErrorContraNuevamente = new javax.swing.JLabel();
        lblErrorContraActual = new javax.swing.JLabel();
        lblErrorContraNueva = new javax.swing.JLabel();
        lblErrorObligatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(21, 89, 110));
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

        btnDatosPersonales.setBackground(new java.awt.Color(201, 211, 200));
        btnDatosPersonales.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnDatosPersonales.setForeground(new java.awt.Color(21, 89, 110));
        btnDatosPersonales.setText("Datos Personales");
        btnDatosPersonales.setBorderPainted(false);
        btnDatosPersonales.setContentAreaFilled(false);
        btnDatosPersonales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatosPersonales.setFocusPainted(false);
        btnDatosPersonales.setOpaque(true);
        btnDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosPersonalesActionPerformed(evt);
            }
        });
        panelHeader.add(btnDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 40));

        btnCambiarContra.setBackground(new java.awt.Color(21, 89, 110));
        btnCambiarContra.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnCambiarContra.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarContra.setText("Cambiar Contraseña");
        btnCambiarContra.setBorderPainted(false);
        btnCambiarContra.setContentAreaFilled(false);
        btnCambiarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarContra.setFocusPainted(false);
        btnCambiarContra.setOpaque(true);
        btnCambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraActionPerformed(evt);
            }
        });
        panelHeader.add(btnCambiarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 40));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px_1.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_20px_2.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        panelHeader.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 41, -1));

        getContentPane().add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        panelCuerpo.setBackground(new java.awt.Color(40, 39, 38));
        panelCuerpo.setLayout(new java.awt.CardLayout());

        panelDatos.setBackground(new java.awt.Color(201, 211, 200));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 110, 172));
        jLabel4.setText("Nick:");
        panelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNickName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNickName.setOpaque(false);
        panelDatos.add(txtNickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 110, 172));
        jLabel5.setText("Sexo:");
        panelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCorreo.setOpaque(false);
        panelDatos.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 110, 172));
        jLabel6.setText("Nombre:");
        panelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNombre.setOpaque(false);
        panelDatos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 160, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 110, 172));
        jLabel7.setText("F/N");
        jLabel7.setToolTipText("Fecha nacimiento");
        panelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, -1));

        txtFechaNacimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtFechaNacimiento.setOpaque(false);
        panelDatos.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 110, 172));
        jLabel8.setText("Apellido:");
        panelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtApellido.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtApellido.setOpaque(false);
        panelDatos.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 30));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(20, 110, 172));
        jLabel9.setText("Correo:");
        panelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        rdBtnMasculino.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rdBtnMasculino.setText("Maculino");
        rdBtnMasculino.setOpaque(false);
        panelDatos.add(rdBtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        rdBtnFemenino.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rdBtnFemenino.setText("Femenino");
        rdBtnFemenino.setOpaque(false);
        panelDatos.add(rdBtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        btnGuardarDatos.setBackground(new java.awt.Color(118, 125, 127));
        btnGuardarDatos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnGuardarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarDatos.setText("Guardar");
        btnGuardarDatos.setBorderPainted(false);
        btnGuardarDatos.setContentAreaFilled(false);
        btnGuardarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarDatos.setFocusPainted(false);
        btnGuardarDatos.setOpaque(true);
        btnGuardarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarDatosMouseClicked(evt);
            }
        });
        panelDatos.add(btnGuardarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 110, -1));

        btnEditarDatos.setBackground(new java.awt.Color(99, 144, 158));
        btnEditarDatos.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnEditarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDatos.setText("Editar");
        btnEditarDatos.setBorderPainted(false);
        btnEditarDatos.setContentAreaFilled(false);
        btnEditarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarDatos.setOpaque(true);
        btnEditarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarDatosMouseClicked(evt);
            }
        });
        panelDatos.add(btnEditarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 110, -1));

        txtAtributoUnico.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtAtributoUnico.setOpaque(false);
        panelDatos.add(txtAtributoUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 240, 30));

        lblAtributoUnico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblAtributoUnico.setForeground(new java.awt.Color(20, 110, 172));
        lblAtributoUnico.setText("Titulo:");
        panelDatos.add(lblAtributoUnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 20));

        lblErrorTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorTitulo.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorTitulo.setText("Solo puede ingresar letras.");
        panelDatos.add(lblErrorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 160, 20));

        lblErrorNick.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorNick.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorNick.setText("No puede ingresar \"@#~€¬|");
        panelDatos.add(lblErrorNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 160, 20));

        lblErrorNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorNombre.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorNombre.setText("Solo puede ingresar letras.");
        panelDatos.add(lblErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, 20));

        lblErrorApellido.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorApellido.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorApellido.setText("Solo puede ingresar letras.");
        panelDatos.add(lblErrorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 20));

        lblErrorFechaNacimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorFechaNacimiento.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorFechaNacimiento.setText("Ingrese una fecha valida.");
        panelDatos.add(lblErrorFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, 20));

        lblErrorCorreo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorCorreo.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorCorreo.setText("Ingrese un correo valido.");
        panelDatos.add(lblErrorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, 20));

        panelCuerpo.add(panelDatos, "card3");

        panelContra.setBackground(new java.awt.Color(201, 211, 200));
        panelContra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(20, 110, 172));
        jLabel10.setText("<html>Ingrese nuevamente su contraseña:</html>");
        panelContra.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, 50));

        txtContraNuevaNuevamente.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtContraNuevaNuevamente.setOpaque(false);
        panelContra.add(txtContraNuevaNuevamente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 240, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(20, 110, 172));
        jLabel11.setText("<html>Ingrese su contraseña actual:</html>");
        panelContra.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(20, 110, 172));
        jLabel12.setText("<html>Ingrese su nueva contraseña:</html>");
        panelContra.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 240, -1));

        txtContraActual.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtContraActual.setOpaque(false);
        panelContra.add(txtContraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 30));

        txtContraNueva.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        txtContraNueva.setOpaque(false);
        panelContra.add(txtContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 30));

        btnGuardarContra.setBackground(new java.awt.Color(99, 144, 158));
        btnGuardarContra.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnGuardarContra.setText("Guardar");
        btnGuardarContra.setBorderPainted(false);
        btnGuardarContra.setContentAreaFilled(false);
        btnGuardarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarContra.setOpaque(true);
        btnGuardarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarContraMouseClicked(evt);
            }
        });
        panelContra.add(btnGuardarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, 30));

        lblErrorContraNuevamente.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorContraNuevamente.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorContraNuevamente.setText("No puede ingresar \"@#~€¬|");
        panelContra.add(lblErrorContraNuevamente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 160, 20));

        lblErrorContraActual.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorContraActual.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorContraActual.setText("No puede ingresar \"@#~€¬|");
        panelContra.add(lblErrorContraActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 20));

        lblErrorContraNueva.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lblErrorContraNueva.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorContraNueva.setText("No puede ingresar \"@#~€¬|");
        panelContra.add(lblErrorContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 20));

        lblErrorObligatorio.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lblErrorObligatorio.setForeground(new java.awt.Color(99, 46, 52));
        lblErrorObligatorio.setText("No puede ingresar \"@#~€¬|");
        panelContra.add(lblErrorObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 20));

        panelCuerpo.add(panelContra, "card3");

        getContentPane().add(panelCuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        App app = new App();

        if (userDocente != null) {
            app.setUserDocente(userDocente);
            //Esto le agregue
            app.bienvenida(userDocente.getNickUsuario());
        } else if (userEstudiante != null) {
            app.setUserEstudiante(userEstudiante);
            //Esto tambien le agrege  
            app.bienvenida(userEstudiante.getNickUsuario());
        } else {
            System.out.println("No es ninguno de los usuarios no se los puedo pasar a app");
        }

        app.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnGuardarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarDatosMouseClicked

        if (btnsActivos) {
            boolean guardar = true;
            Validaciones val = new Validaciones();

            String nick = txtNickName.getText();
            if (!val.esLetras(nick)) {
                guardar = false;
                lblErrorNick.setVisible(true);
            }
            String nombre = txtNombre.getText();
            if (!val.esLetras(nombre)) {
                guardar = false;
                lblErrorNombre.setVisible(true);
            }
            String apellido = txtApellido.getText();
            if (!val.esLetras(apellido)) {
                guardar = false;
                lblErrorApellido.setVisible(true);
            }
            char sexo;
            if (rdBtnMasculino.isSelected()) {
                sexo = 'M';
            } else if (rdBtnFemenino.isSelected()) {
                sexo = 'F';
            } else {
                sexo = 'S';
            }

            String fechaNac = txtFechaNacimiento.getText();
            if (!val.esFecha(fechaNac)) {
                guardar = false;
                lblErrorFechaNacimiento.setVisible(true);
            }

            DateFormat completo = new SimpleDateFormat("dd/MM/yyyy");
            Date nacimiento = new Date();
            System.out.println("Fecha antes de tranformar " + fechaNac);

            try {
                nacimiento = completo.parse(fechaNac);
            } catch (ParseException ex) {
                System.out.println("Se me murio y no transformo a fecha en configuracion");
            }

            System.out.println("Fecha luego de transformar " + nacimiento);

            String atributo = txtAtributoUnico.getText();
            if (!val.esLetras(atributo)) {
                guardar = false;
                lblErrorTitulo.setVisible(true);
            }

            String correo = txtCorreo.getText();
            if (!val.esCorreo(correo)) {
                lblErrorCorreo.setVisible(true);
                guardar = false;
            }

            if (guardar) {

                if (userDocente != null) {

                    Docente doc = new Docente();
                    doc.setCedulaUsuario(userDocente.getCedulaUsuario());
                    doc.setCorreoUsuario(correo);
                    doc.setNickUsuario(nick);
                    doc.setNombreUsuario(nombre);
                    doc.setApellidoUsuario(apellido);
                    doc.setSexoUsuario(sexo);
                    doc.setFecNacUsuario(nacimiento);
                    doc.setTituloDocente(atributo);

                    SQLUsuario.editarDocente(doc);

                    System.out.println("Editamos docente");

                } else if (userEstudiante != null) {
                    Estudiante est = new Estudiante();

                    est.setCedulaUsuario(userEstudiante.getCedulaUsuario());
                    est.setCorreoUsuario(correo);
                    est.setNickUsuario(nick);
                    est.setNombreUsuario(nombre);
                    est.setApellidoUsuario(apellido);
                    est.setSexoUsuario(sexo);
                    est.setFecNacUsuario(nacimiento);
                    est.setColegioEstudiante(atributo);

                    SQLUsuario.editarEstudiante(est);

                    System.out.println("Editamos estudiante");
                } else {
                    System.out.println("No es ninguno de los dos tipos de usaurio no se puede editar.");
                }

                ocultarErrores();

                btnEditarDatos.setEnabled(true);
                btnEditarDatos.setBackground(new Color(99, 144, 158));
                btnGuardarDatos.setBackground(new Color(118, 125, 127));
            }
        }


    }//GEN-LAST:event_btnGuardarDatosMouseClicked

    private void btnEditarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarDatosMouseClicked
        btnGuardarDatos.setEnabled(true);

        txtNickName.setEditable(true);
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        txtFechaNacimiento.setEditable(true);
        txtAtributoUnico.setEditable(true);
        txtCorreo.setEditable(true);

        rdBtnFemenino.setEnabled(true);
        rdBtnMasculino.setEnabled(true);

        btnEditarDatos.setEnabled(false);

        btnEditarDatos.setBackground(new Color(118, 125, 127));

        btnGuardarDatos.setBackground(new Color(99, 144, 158));

        btnsActivos = true;
    }//GEN-LAST:event_btnEditarDatosMouseClicked

    private void btnGuardarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarContraMouseClicked
        boolean editar = true;
        Validaciones val = new Validaciones();

        String contraActual = String.valueOf(txtContraActual.getPassword());
        String contraNueva = String.valueOf(txtContraNueva.getPassword());
        String contraNuevamente = String.valueOf(txtContraNuevaNuevamente);

        if (contraActual.length() == 0 || contraNueva.length() == 0 || contraNuevamente.length() == 0) {
            lblErrorObligatorio.setVisible(true);
            editar = false;
        }

        if (userDocente != null) {
            if (!contraActual.equals(userDocente.getContrasenaUsuario())) {
                editar = false;
                lblErrorContraActual.setVisible(false);
            }
        } else if (userEstudiante != null) {
            if (!contraActual.equals(userEstudiante.getContrasenaUsuario())) {
                editar = false;
                lblErrorContraActual.setVisible(true);
            }
        }

        if (!val.esContrasena(contraNueva)) {
            editar = false;
            lblErrorContraNueva.setVisible(true);
        }

        if (contraNueva.length() > 19) {
            editar = false;
            lblErrorContraNueva.setVisible(true);
        }

        if (!contraNueva.equals(contraNuevamente)) {
            editar = false;
            lblErrorContraNuevamente.setVisible(false);
        }

        if (editar) {
            ocultarErrores();

            if (userDocente != null) {
                SQLUsuario.editarContrasena(userDocente.getCedulaUsuario(), contraNueva);
            } else if (userEstudiante != null) {
                SQLUsuario.editarContrasena(userEstudiante.getCedulaUsuario(), contraNueva);
            } else {
                System.out.println("No es ninguno de los usuarios no se peude actualizar la contraseña.");
            }
        }
    }//GEN-LAST:event_btnGuardarContraMouseClicked

    private void btnCambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraActionPerformed
        if (btnCambiarContra.getText().equals("Datos Personales")) {
            cambioPanel(panelCuerpo, panelDatos);
            btnDatosPersonales.setText("Datos Personales");
            btnCambiarContra.setText("Cambiar Contraseña");
            System.out.println("Se cambio");
        } else {
            desactivarCampos();
            ocultarErrores();
            cambioPanel(panelCuerpo, panelContra);
            btnDatosPersonales.setText("Cambiar Contraseña");
            btnCambiarContra.setText("Datos Personales");
        }

    }//GEN-LAST:event_btnCambiarContraActionPerformed

    private void btnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPersonalesActionPerformed
        if (btnDatosPersonales.getText().equals("Cambiar Contraseña")) {
            desactivarCampos();
            ocultarErrores();
            cambioPanel(panelCuerpo, panelContra);
            btnDatosPersonales.setText("Cambiar Contraseña");
            btnCambiarContra.setText("Datos Personales");
        } else {
            cambioPanel(panelCuerpo, panelDatos);
            btnDatosPersonales.setText("Datos Personales");
            btnCambiarContra.setText("Cambiar Contraseña");
        }
    }//GEN-LAST:event_btnDatosPersonalesActionPerformed

    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_panelHeaderMousePressed

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_panelHeaderMouseDragged

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
            java.util.logging.Logger.getLogger(ConfiguracionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguracionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarContra;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDatosPersonales;
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JButton btnGuardarContra;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAtributoUnico;
    private javax.swing.JLabel lblErrorApellido;
    private javax.swing.JLabel lblErrorContraActual;
    private javax.swing.JLabel lblErrorContraNueva;
    private javax.swing.JLabel lblErrorContraNuevamente;
    private javax.swing.JLabel lblErrorCorreo;
    private javax.swing.JLabel lblErrorFechaNacimiento;
    private javax.swing.JLabel lblErrorNick;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorObligatorio;
    private javax.swing.JLabel lblErrorTitulo;
    private javax.swing.JPanel panelContra;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JRadioButton rdBtnFemenino;
    private javax.swing.JRadioButton rdBtnMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAtributoUnico;
    private javax.swing.JPasswordField txtContraActual;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JPasswordField txtContraNuevaNuevamente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNickName;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
