package Presentacion;

import AD.*;
import Entidades.*;
import static Presentacion.zmenu.internal;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import recursos.ExportarExcel;
import recursos.Formatos;
import recursos.dashtyped;

/**
 *
 * @author kflores
 */
public final class FIUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     * @throws java.text.ParseException
     */
    public FIUsuario() throws ParseException {
        initComponents();
        try {
            cargarconfig();
            cargartabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        /*VARIABLES NECESARIAS*/
    TableRowSorter s;
    DefaultTableModel modelo;
    int filaseleccionada;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnpnuevo = new javax.swing.JButton();
        btnpguardar = new javax.swing.JButton();
        btnpeditar = new javax.swing.JButton();
        btnpexportaexcel = new javax.swing.JButton();
        btnpimprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbpfiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txpdetalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txusuario_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txusuario_nombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txusuario_dni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txusuario_fechan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnusuario_perfil = new javax.swing.JButton();
        btnusuario_fleje = new javax.swing.JButton();
        txusuario_usuario = new javax.swing.JTextField();
        txusuario_perfil = new javax.swing.JTextField();
        txusuario_fleje = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txusuario_apellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txusuario_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnusuario_resetearclave = new javax.swing.JButton();
        btnusuario_avistas = new javax.swing.JButton();
        btnusuario_aprivilegios = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txusuario_clave = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsttablausuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icono.png"))); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnpnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new.png"))); // NOI18N
        btnpnuevo.setFocusable(false);
        btnpnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnpnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpnuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpnuevo);

        btnpguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save.png"))); // NOI18N
        btnpguardar.setFocusable(false);
        btnpguardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnpguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpguardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpguardar);

        btnpeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        btnpeditar.setFocusable(false);
        btnpeditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnpeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpeditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpeditar);

        btnpexportaexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export_excel.png"))); // NOI18N
        btnpexportaexcel.setToolTipText("");
        btnpexportaexcel.setFocusable(false);
        btnpexportaexcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnpexportaexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpexportaexcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpexportaexcel);

        btnpimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/print.png"))); // NOI18N
        btnpimprimir.setFocusable(false);
        btnpimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnpimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpimprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpimprimir);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda avanzada"));

        jLabel1.setText("Filtrar por");

        txpdetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpdetalleKeyTyped(evt);
            }
        });

        jLabel2.setText("Detalle");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbpfiltro, 0, 161, Short.MAX_VALUE)
                    .addComponent(txpdetalle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbpfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del usuario"));

        jLabel3.setText("ID");

        txusuario_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_nombresKeyTyped(evt);
            }
        });

        jLabel5.setText("Nombres");

        jLabel6.setText("DNI");

        txusuario_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_dniKeyTyped(evt);
            }
        });

        jLabel7.setText("Usuario");

        jLabel8.setText("Clave");

        jLabel9.setText("Perfil");

        jLabel10.setText("Fecha N.");

        txusuario_fechan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_fechanKeyTyped(evt);
            }
        });

        jLabel11.setText("Fleje");

        btnusuario_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnusuario_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuario_perfilActionPerformed(evt);
            }
        });

        btnusuario_fleje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnusuario_fleje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuario_flejeActionPerformed(evt);
            }
        });

        txusuario_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_usuarioKeyTyped(evt);
            }
        });

        txusuario_perfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_perfilKeyTyped(evt);
            }
        });

        txusuario_fleje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_flejeKeyTyped(evt);
            }
        });

        jLabel12.setText("Apellidos");

        txusuario_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_apellidosKeyTyped(evt);
            }
        });

        txusuario_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_emailKeyTyped(evt);
            }
        });

        jLabel13.setText("Email");

        btnusuario_resetearclave.setText("Resetar clave");
        btnusuario_resetearclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuario_resetearclaveActionPerformed(evt);
            }
        });

        btnusuario_avistas.setText("Asignar vistas");

        btnusuario_aprivilegios.setText("Asignar privilegios");

        txusuario_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txusuario_claveKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnusuario_resetearclave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txusuario_perfil)
                            .addComponent(txusuario_fleje, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnusuario_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnusuario_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnusuario_aprivilegios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnusuario_avistas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txusuario_fechan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(28, 28, 28)
                                .addComponent(txusuario_email))
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txusuario_apellidos))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jLabel3)))
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txusuario_clave)
                                    .addComponent(txusuario_nombres)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txusuario_id, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txusuario_dni)
                                        .addGap(4, 4, 4))
                                    .addComponent(txusuario_usuario))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txusuario_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txusuario_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txusuario_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txusuario_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txusuario_fechan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txusuario_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txusuario_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txusuario_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txusuario_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnusuario_perfil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnusuario_fleje)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txusuario_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnusuario_resetearclave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnusuario_aprivilegios, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnusuario_avistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        txusuario_nombres.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de usuarios"));

        lsttablausuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        lsttablausuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lsttablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lsttablausuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lsttablausuarios.getTableHeader().setResizingAllowed(false);
        lsttablausuarios.getTableHeader().setReorderingAllowed(false);
        lsttablausuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsttablausuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsttablausuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lsttablausuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsttablausuariosMouseClicked
             filaseleccionada = lsttablausuarios.getSelectedRow();
             btnpeditar.setEnabled(zmenu.P_USUARIO[1]=='0');
             txusuario_clave.setEnabled(false);
             pasarDatosFila();
    }//GEN-LAST:event_lsttablausuariosMouseClicked

    private void btnpnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpnuevoActionPerformed
    setEnabledDatosP(zmenu.P_USUARIO[0]=='0'); //Verificar si puede crear
    limpiarcampos();
    }//GEN-LAST:event_btnpnuevoActionPerformed

    private void txpdetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpdetalleKeyTyped
    // TODO add your handling code here:
    new dashtyped().control_maxdigitos(evt, txpdetalle, 25); 
        txpdetalle.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txpdetalle.getText());
                txpdetalle.setText(cadena.toUpperCase());
                repaint();
                filtro();
            }
        });
        s = new TableRowSorter(lsttablausuarios.getModel());
        lsttablausuarios.setRowSorter(s);

    }//GEN-LAST:event_txpdetalleKeyTyped

    private void btnpguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpguardarActionPerformed
        try {
            if (txusuario_id.getText().isEmpty()||txusuario_dni.getText().isEmpty()||txusuario_nombres.getText().isEmpty()||
                    txusuario_dni.getText().isEmpty()||txusuario_fechan.getText().isEmpty()) {
                JOptionPane.showInternalMessageDialog(internal, "Debe completar todos los campos","Validar datos",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                                Usuario p = new Usuario();
                                p.setIDUSUARIO(Integer.parseInt(txusuario_id.getText()));
                                p.setDNI(txusuario_dni.getText());
                                p.setNOMBRES(txusuario_nombres.getText().toUpperCase());
                                p.setAPELLIDOS(txusuario_apellidos.getText());
                                p.setFCHNAC(txusuario_fechan.getText());
                                p.setUSUARIO(txusuario_usuario.getText());
                                p.setCLAVE(txusuario_clave.getText());
                                p.setEMAIL(txusuario_email.getText());
                                p.setPERFIL(Integer.parseInt(txusuario_perfil.getText()));
                                p.setFLGELI(txusuario_fleje.getText().charAt(0));
                                p.setFCHMOD(zmenu.lbhorasistema.getText());
                                p.setUSRMOD(zmenu.lbnombreusuario.getText());
                                if (ADUsuario.Guardar(p)) {
                                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txpdetalle.setText("");
                                txusuario_id.setText("");
                                txpdetalle.requestFocus();
                                setEnabledDatosP(false);
                                }else{
                                JOptionPane.showInternalMessageDialog(internal, "Intente nuevamente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);      
                                }
                
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FIUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpguardarActionPerformed

    private void btnpeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpeditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (lsttablausuarios.getSelectedRow()<0){
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una fila","Validar datos",JOptionPane.INFORMATION_MESSAGE);
            } else {
                    pasarDatosFila();
                    setEnabledDatosP(zmenu.P_PRODUCTO[1]=='0'); //Verificar si puede modificar
                    txusuario_clave.setEnabled(false);
            }
        }catch (HeadlessException ex){
            JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnpeditarActionPerformed
public static int usuario_idtabla;
public static String usuario_titulo;
    private void btnusuario_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuario_perfilActionPerformed
        try {
            usuario_idtabla=0; //tabla estado de producto
            usuario_titulo="Perfil";
            FIDUsuarioTD d=new FIDUsuarioTD();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnusuario_perfilActionPerformed

    private void btnusuario_flejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuario_flejeActionPerformed
        try {
            usuario_idtabla=103; //tabla flgeli
            usuario_titulo="Fleje";
            FIDUsuarioTD d=new FIDUsuarioTD();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnusuario_flejeActionPerformed

    private void btnpexportaexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpexportaexcelActionPerformed
        try {
            
            ExportarExcel obj = new ExportarExcel();
            JTable tablatemp = new JTable();
            String[] columnas = {"IDUSUARIO","NOMBRES","APELLIDOS","PERFIL","USUARIO","EMAIL","FLEJE"};
            String copiatemp [] = new String[7];
            DefaultTableModel mtablatemp =new DefaultTableModel (null,columnas);
            for (int f = 0; f < lsttablausuarios.getRowCount(); f++) {
                    copiatemp[0]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 0).toString();
                    copiatemp[1]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 2).toString();
                    copiatemp[2]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 3).toString();
                    copiatemp[3]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 6).toString();
                    copiatemp[4]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 7).toString();
                    copiatemp[5]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 9).toString();
                    copiatemp[6]=lsttablausuarios.getModel().getValueAt(lsttablausuarios.convertRowIndexToModel(f), 10).toString();
                   mtablatemp.addRow(copiatemp);
            }
            tablatemp.setModel(mtablatemp);
            obj.exportarExcel(tablatemp);
        } catch (IOException ex) {
           JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnpexportaexcelActionPerformed

    private void btnpimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpimprimirActionPerformed
                  try {
              // tabla1.print();//envia los datos de la tabla a la impresora
                     MessageFormat headerFormat = new MessageFormat("Sistore - Productos "+Formatos.sdfruta.format(new Date()));
                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
                     lsttablausuarios.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
                                         
                     
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido imprimir correctamente, intentalo más tarde.");
            }  
    }//GEN-LAST:event_btnpimprimirActionPerformed

    private void txusuario_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_nombresKeyTyped
 new dashtyped().control_maxdigitos(evt, txusuario_nombres, 40);
    }//GEN-LAST:event_txusuario_nombresKeyTyped

    private void txusuario_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_dniKeyTyped
 new dashtyped().control_dni(evt, txusuario_dni);
    }//GEN-LAST:event_txusuario_dniKeyTyped

    private void txusuario_fechanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_fechanKeyTyped
 //crear control para fechas
    }//GEN-LAST:event_txusuario_fechanKeyTyped

    private void txusuario_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_usuarioKeyTyped
 new dashtyped().control_maxdigitos(evt, txusuario_usuario, 20);
    }//GEN-LAST:event_txusuario_usuarioKeyTyped

    private void txusuario_perfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_perfilKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txusuario_perfil, 4);
    }//GEN-LAST:event_txusuario_perfilKeyTyped

    private void txusuario_flejeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_flejeKeyTyped
new dashtyped().control_cero_uno(evt, txusuario_fleje);
    }//GEN-LAST:event_txusuario_flejeKeyTyped

    private void txusuario_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_apellidosKeyTyped
 new dashtyped().control_maxdigitos(evt, txusuario_apellidos, 30);
    }//GEN-LAST:event_txusuario_apellidosKeyTyped

    private void txusuario_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_emailKeyTyped
 new dashtyped().control_maxdigitos(evt, txusuario_email, 30);
    }//GEN-LAST:event_txusuario_emailKeyTyped

    private void txusuario_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txusuario_claveKeyTyped
new dashtyped().control_maxdigitos(evt, txusuario_clave, 30);
    }//GEN-LAST:event_txusuario_claveKeyTyped

    private void btnusuario_resetearclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuario_resetearclaveActionPerformed
        Usuario u=new Usuario();
        
        try {
            if (txusuario_id.getText().isEmpty()||txusuario_id.getText().equals("0")) {
            JOptionPane.showInternalMessageDialog(internal, "Debes seleccionar un usuario válido","Validar datos",JOptionPane.ERROR_MESSAGE);    
            }else{
            u.setIDUSUARIO(Integer.parseInt(txusuario_id.getText()));
                if (ADUsuario.resetclave(u)) {
                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txpdetalle.setText("");
                                txusuario_id.setText("");
                                txpdetalle.requestFocus();
                                setEnabledDatosP(false);
                }
                
            }            
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FIUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnusuario_resetearclaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpeditar;
    private javax.swing.JButton btnpexportaexcel;
    private javax.swing.JButton btnpguardar;
    private javax.swing.JButton btnpimprimir;
    private javax.swing.JButton btnpnuevo;
    private javax.swing.JButton btnusuario_aprivilegios;
    private javax.swing.JButton btnusuario_avistas;
    private javax.swing.JButton btnusuario_fleje;
    private javax.swing.JButton btnusuario_perfil;
    private javax.swing.JButton btnusuario_resetearclave;
    private javax.swing.JComboBox<String> cbpfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable lsttablausuarios;
    private javax.swing.JTextField txpdetalle;
    private javax.swing.JTextField txusuario_apellidos;
    private javax.swing.JPasswordField txusuario_clave;
    private javax.swing.JTextField txusuario_dni;
    public static javax.swing.JTextField txusuario_email;
    private javax.swing.JTextField txusuario_fechan;
    public static javax.swing.JTextField txusuario_fleje;
    private javax.swing.JTextField txusuario_id;
    private javax.swing.JTextField txusuario_nombres;
    public static javax.swing.JTextField txusuario_perfil;
    public static javax.swing.JTextField txusuario_usuario;
    // End of variables declaration//GEN-END:variables

public void limpiarcampos(){
    txusuario_id.setText("0");
    txusuario_dni.setText("");
    txusuario_nombres.setText("");
    txusuario_dni.setText("");
    txusuario_fechan.setText("");
    txusuario_usuario.setText("");
    txusuario_clave.setText("");
    txusuario_perfil.setText("");
    txusuario_fleje.setText("");
    txusuario_apellidos.setText("");
    txusuario_email.setText("");
    txusuario_dni.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDUSUARIO","DNI","NOMBRES","APELLIDOS","FCHNAC","IDPERFIL","PERFIL","USUARIO","CLAVE","EMAIL","FLEJE","FLGELI","FCHCREA","USRCREA","FCHMOD","USRMOD"};    
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    lsttablausuarios.setModel(modelo);
    lsttablausuarios.setRowSorter(s);
    
    //posiciones de tabla
    int posicion [] = {15,14,13,12,11,8,5,4,1};
        for (int i = 0; i < posicion.length; i++) {
            lsttablausuarios.getColumnModel().getColumn(posicion[i]).setMaxWidth(0);
            lsttablausuarios.getColumnModel().getColumn(posicion[i]).setMinWidth(0);
            lsttablausuarios.getColumnModel().getColumn(posicion[i]).setPreferredWidth(0);
        }

    //tamaños de columnas de tabla    
    lsttablausuarios.getColumnModel().getColumn(9).setPreferredWidth(200);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    lsttablausuarios.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txusuario_dni.setEnabled(estado);
            txusuario_nombres.setEnabled(estado);
            txusuario_dni.setEnabled(estado);
            txusuario_fechan.setEnabled(estado);
            txusuario_usuario.setEnabled(estado);
            txusuario_clave.setEnabled(estado);
            txusuario_perfil.setEnabled(estado);
            txusuario_fleje.setEnabled(estado);
            txusuario_apellidos.setEnabled(estado);
            txusuario_email.setEnabled(estado);
            btnusuario_perfil.setEnabled(estado);
            btnusuario_fleje.setEnabled(estado);
            btnpguardar.setEnabled(estado);
        }
        
        int columnaABuscar = 0;
        //Filtro de combo para busqueda
        public void filtro() {
            
        if ("USUARIO".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 7;
        }
        if ("IDUSUARIO".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
         if ("NOMBRES".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
         if ("APELLIDOS".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
         if ("FLEJE".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 10;
        }
        s.setRowFilter(RowFilter.regexFilter(txpdetalle.getText(), columnaABuscar));
    }
    
        //Carga la lista de producto en la tabla
        public void cargartabla() throws ClassNotFoundException, SQLException, ParseException {
        initabla();
        try {
                 for (Usuario p : ADUsuario.Listar()) {
                     modelo.addRow(p.DatosArray());
                 }
                 lsttablausuarios.setModel(modelo);
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
 //Carga las opciones de la ventana
 public void cargaopcion(){
         btnpnuevo.setEnabled(zmenu.P_USUARIO[0]=='0');  //nuevo 
         btnpexportaexcel.setEnabled(zmenu.P_USUARIO[2]=='0'); //exportar
         btnpimprimir.setEnabled(zmenu.P_USUARIO[3]=='0'); //imprimir
 }   
        
//Carga toda la configuracion de la ventana
              public void cargarconfig() throws ClassNotFoundException, SQLException {
                  //Cargar combo de Filtros
                  cbpfiltro.addItem("USUARIO");
                  cbpfiltro.addItem("IDUSUARIO");
                  cbpfiltro.addItem("NOMBRES");
                  cbpfiltro.addItem("APELLIDOS");
                  cbpfiltro.addItem("FLEJE");
                  //Desabilitar campos producto
                  setEnabledDatosP(false);
                  txusuario_id.setEnabled(false);
                  cargaopcion();
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txusuario_id.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 0).toString());
            txusuario_dni.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 1).toString());
            txusuario_nombres.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 2).toString());
            txusuario_apellidos.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 3).toString());
            txusuario_fechan.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 4).toString());
            txusuario_usuario.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 7).toString());
            txusuario_perfil.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 5).toString());
            txusuario_email.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 9).toString());
            txusuario_fleje.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 11).toString());
            txusuario_clave.setText(lsttablausuarios.getValueAt(lsttablausuarios.getSelectedRow(), 8).toString());
    }


}
