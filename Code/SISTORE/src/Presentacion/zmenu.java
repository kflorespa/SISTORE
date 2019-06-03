package Presentacion;

import AD.ADPrivilegio;
import AD.ADSucursal;
import AD.ADUsuario;
import Entidades.Privilegio;
import Entidades.Sucursal;
import Entidades.Usuario;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.Formatos;

public final class zmenu extends javax.swing.JFrame implements Runnable{
    // VARIABLES PARA VISTAS
    public static char []P_ALMACENES;
    public static char []P_VISUALIZARSTOCKS;
    public static char []P_MOVIMIENTOS;
    public static char []P_LISTARITEMSDEMOVIMIENTO;
    public static char []P_PROVEEDORES;
    public static char []P_PRODUCTOS;
    public static char []P_CATEGORIASDEPRODUCTOS;
    public static char []P_USUARIOS;
    public static char []P_SUCURSALES;
    public static char []P_USUARIOSDESUCURSAL;
    public static char []P_VISTAS;
    public static char []P_GRUPOSDEPARAMETROS;
    public static char []P_PARAMETROS;
    public static char []P_PERFILES;
    public static char []P_PRIVILEGIOS;
    public static char []P_TIENDA;
    public static char []P_VISTAUSUARIO;
    public static char []P_REPORTEKARDEXPRODUCTO;
    public static char []P_REPORTEINGRESOSALIDA;
    
    public zmenu(){
        
        try {
            initComponents();
            cargarconfig();
            cargardatos();
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*Variables reloj
    */
    Thread h1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internal = new javax.swing.JDesktopPane();
        plogin = new javax.swing.JPanel();
        pingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txclave = new javax.swing.JPasswordField();
        btnentrar = new javax.swing.JButton();
        btnentrar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbsucursal = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        lbminilogo = new javax.swing.JLabel();
        pbarra = new javax.swing.JPanel();
        lbhorasistema = new javax.swing.JLabel();
        lbsucursal = new javax.swing.JLabel();
        lbnombreusuario = new javax.swing.JLabel();
        lbs = new javax.swing.JLabel();
        lbu = new javax.swing.JLabel();
        lbf = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        jmarchivo = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmtablas = new javax.swing.JMenu();
        ialmacenes = new javax.swing.JMenuItem();
        iproveedores = new javax.swing.JMenuItem();
        iproductos = new javax.swing.JMenuItem();
        icategorias = new javax.swing.JMenuItem();
        jmoperaciones = new javax.swing.JMenu();
        ivisualizarstock = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        imovimientos = new javax.swing.JMenuItem();
        ilistamovimientos = new javax.swing.JMenuItem();
        jmreportes = new javax.swing.JMenu();
        ireportekardexproducto = new javax.swing.JMenuItem();
        ireporteingresosalida = new javax.swing.JMenuItem();
        jmregistros = new javax.swing.JMenu();
        ivistas = new javax.swing.JMenuItem();
        iperfiles = new javax.swing.JMenuItem();
        iusuarios = new javax.swing.JMenuItem();
        itienda = new javax.swing.JMenuItem();
        isucursales = new javax.swing.JMenuItem();
        imasignaciones = new javax.swing.JMenu();
        iasigvistausuario = new javax.swing.JMenuItem();
        iasigusuariosucursal = new javax.swing.JMenuItem();
        iasigprivilegiousuario = new javax.swing.JMenuItem();
        imparametros = new javax.swing.JMenu();
        igrupoparametros = new javax.swing.JMenuItem();
        iagregaparametros = new javax.swing.JMenuItem();
        jmsistema = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmayuda = new javax.swing.JMenu();
        iacercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        internal.setBackground(new java.awt.Color(204, 204, 204));

        plogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pingreso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        txusuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txusuario.setText("KEVIN.FLORES");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        txclave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txclave.setText("123");

        btnentrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/check.png"))); // NOI18N
        btnentrar.setText("Entrar");
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });

        btnentrar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnentrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/no-check.png"))); // NOI18N
        btnentrar1.setText("Cerrar");
        btnentrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrar1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logosistore.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Sucursal");

        javax.swing.GroupLayout pingresoLayout = new javax.swing.GroupLayout(pingreso);
        pingreso.setLayout(pingresoLayout);
        pingresoLayout.setHorizontalGroup(
            pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(pingresoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pingresoLayout.createSequentialGroup()
                        .addComponent(btnentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnentrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txclave)
                    .addComponent(txusuario)
                    .addComponent(cbsucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pingresoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(25, 25, 25))
        );
        pingresoLayout.setVerticalGroup(
            pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnentrar)
                    .addComponent(btnentrar1))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout ploginLayout = new javax.swing.GroupLayout(plogin);
        plogin.setLayout(ploginLayout);
        ploginLayout.setHorizontalGroup(
            ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ploginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ploginLayout.setVerticalGroup(
            ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ploginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        internal.setLayer(plogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        internal.setLayer(lbminilogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout internalLayout = new javax.swing.GroupLayout(internal);
        internal.setLayout(internalLayout);
        internalLayout.setHorizontalGroup(
            internalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbminilogo)
                .addContainerGap())
            .addGroup(internalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        internalLayout.setVerticalGroup(
            internalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lbminilogo)
                .addContainerGap())
        );

        pbarra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbhorasistema.setText("dd/MM/yyyy  hh:mm:ss");

        lbsucursal.setText(" 0-Ciudad");

        lbnombreusuario.setText(" nombre_usuario");

        lbs.setText("SUCURSAL:");

        lbu.setText("USUARIO:");

        lbf.setText("FECHA:");

        javax.swing.GroupLayout pbarraLayout = new javax.swing.GroupLayout(pbarra);
        pbarra.setLayout(pbarraLayout);
        pbarraLayout.setHorizontalGroup(
            pbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbarraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbs)
                .addGap(10, 10, 10)
                .addComponent(lbsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lbu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lbf)
                .addGap(10, 10, 10)
                .addComponent(lbhorasistema, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pbarraLayout.setVerticalGroup(
            pbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbarraLayout.createSequentialGroup()
                .addGroup(pbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pbarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbhorasistema, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbsucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jmarchivo.setText("Archivo");

        jMenuItem4.setText("Cerrar");
        jmarchivo.add(jMenuItem4);

        menubar.add(jmarchivo);

        jmtablas.setText("Tablas");

        ialmacenes.setText("Almacenes");
        ialmacenes.setEnabled(false);
        jmtablas.add(ialmacenes);

        iproveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iproveedores.setText("Proveedores");
        iproveedores.setEnabled(false);
        iproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iproveedoresActionPerformed(evt);
            }
        });
        jmtablas.add(iproveedores);

        iproductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iproductos.setText("Productos");
        iproductos.setEnabled(false);
        iproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iproductosActionPerformed(evt);
            }
        });
        jmtablas.add(iproductos);

        icategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        icategorias.setText("Categorias");
        icategorias.setEnabled(false);
        icategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icategoriasActionPerformed(evt);
            }
        });
        jmtablas.add(icategorias);

        menubar.add(jmtablas);

        jmoperaciones.setText("Operaciones");

        ivisualizarstock.setText("Visualizar de stocks");
        ivisualizarstock.setEnabled(false);
        jmoperaciones.add(ivisualizarstock);
        jmoperaciones.add(jSeparator2);

        imovimientos.setText("Movimientos");
        imovimientos.setEnabled(false);
        jmoperaciones.add(imovimientos);

        ilistamovimientos.setText("Listar items de movimientos");
        ilistamovimientos.setEnabled(false);
        ilistamovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilistamovimientosActionPerformed(evt);
            }
        });
        jmoperaciones.add(ilistamovimientos);

        menubar.add(jmoperaciones);

        jmreportes.setText("Reportes");

        ireportekardexproducto.setText("Reporte de kardex de productos");
        ireportekardexproducto.setEnabled(false);
        jmreportes.add(ireportekardexproducto);

        ireporteingresosalida.setText("Reportes de ingresos y salidas");
        ireporteingresosalida.setEnabled(false);
        ireporteingresosalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ireporteingresosalidaActionPerformed(evt);
            }
        });
        jmreportes.add(ireporteingresosalida);

        menubar.add(jmreportes);

        jmregistros.setText("Registros");

        ivistas.setText("Vistas");
        ivistas.setEnabled(false);
        jmregistros.add(ivistas);

        iperfiles.setText("Perfiles");
        iperfiles.setEnabled(false);
        jmregistros.add(iperfiles);

        iusuarios.setText("Usuarios");
        iusuarios.setEnabled(false);
        jmregistros.add(iusuarios);

        itienda.setText("Tienda");
        itienda.setEnabled(false);
        jmregistros.add(itienda);

        isucursales.setText("Sucursales");
        isucursales.setEnabled(false);
        jmregistros.add(isucursales);

        imasignaciones.setText("Asignaciones");
        imasignaciones.setEnabled(false);

        iasigvistausuario.setText("Asignar vista a usuario");
        iasigvistausuario.setEnabled(false);
        imasignaciones.add(iasigvistausuario);

        iasigusuariosucursal.setText("Asignar usuario a sucursal");
        iasigusuariosucursal.setEnabled(false);
        imasignaciones.add(iasigusuariosucursal);

        iasigprivilegiousuario.setText("Asignar privilegios a usuario");
        iasigprivilegiousuario.setEnabled(false);
        imasignaciones.add(iasigprivilegiousuario);

        jmregistros.add(imasignaciones);

        imparametros.setText("Parámetros");
        imparametros.setEnabled(false);

        igrupoparametros.setText("Grupo de parámetros");
        igrupoparametros.setEnabled(false);
        imparametros.add(igrupoparametros);

        iagregaparametros.setText("Agregar items parámetros");
        iagregaparametros.setEnabled(false);
        imparametros.add(iagregaparametros);

        jmregistros.add(imparametros);

        menubar.add(jmregistros);

        jmsistema.setText("Sistema");

        jMenuItem1.setText("Cerrar sesión");
        jmsistema.add(jMenuItem1);
        jmsistema.add(jSeparator1);

        jMenuItem2.setText("Mi perfil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmsistema.add(jMenuItem2);

        jMenuItem3.setText("Cambiar contraseña");
        jmsistema.add(jMenuItem3);

        menubar.add(jmsistema);

        jmayuda.setText("Ayuda");

        iacercade.setText("Acerca de");
        jmayuda.add(iacercade);

        menubar.add(jmayuda);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(internal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(internal)
                .addGap(0, 0, 0)
                .addComponent(pbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        Usuario u=new Usuario();
        u.setUSUARIO(txusuario.getText());
        u.setCLAVE(txclave.getText());
        String[] combo = cbsucursal.getSelectedItem().toString().split("-");
        u.setIDSUCURSAL(Integer.parseInt(combo[0]));
        try {
            if (ADUsuario.Login(u)) {
                cargarusuario(u);
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o clave incorrecta.");
            }
                 } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_btnentrarActionPerformed

    private void btnentrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrar1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_btnentrar1ActionPerformed

    private void iproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iproductosActionPerformed
        try {
            FIProductos fip=new FIProductos();
            fip.setSize(internal.getWidth(),internal.getHeight());
            fip.setVisible(true);   
            internal.add(fip);
            fip.toFront();
        } catch (ParseException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iproductosActionPerformed

    private void icategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icategoriasActionPerformed
          try {
            FICategorias fip=new FICategorias();
            fip.setSize(internal.getWidth(),internal.getHeight());
            fip.setVisible(true);
            internal.add(fip);
            fip.toFront();
        } catch (ParseException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_icategoriasActionPerformed

    private void ilistamovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilistamovimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilistamovimientosActionPerformed

    private void ireporteingresosalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ireporteingresosalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ireporteingresosalidaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void iproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iproveedoresActionPerformed
          try {
            FIProveedores fip=new FIProveedores();
            fip.setSize(internal.getWidth(),internal.getHeight());
            fip.setVisible(true);
            internal.add(fip);
            fip.toFront();
        } catch (ParseException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iproveedoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnentrar1;
    private javax.swing.JComboBox<String> cbsucursal;
    private javax.swing.JMenuItem iacercade;
    private javax.swing.JMenuItem iagregaparametros;
    private javax.swing.JMenuItem ialmacenes;
    private javax.swing.JMenuItem iasigprivilegiousuario;
    private javax.swing.JMenuItem iasigusuariosucursal;
    private javax.swing.JMenuItem iasigvistausuario;
    private javax.swing.JMenuItem icategorias;
    private javax.swing.JMenuItem igrupoparametros;
    private javax.swing.JMenuItem ilistamovimientos;
    private javax.swing.JMenu imasignaciones;
    private javax.swing.JMenuItem imovimientos;
    private javax.swing.JMenu imparametros;
    public static javax.swing.JDesktopPane internal;
    private javax.swing.JMenuItem iperfiles;
    private javax.swing.JMenuItem iproductos;
    private javax.swing.JMenuItem iproveedores;
    private javax.swing.JMenuItem ireporteingresosalida;
    private javax.swing.JMenuItem ireportekardexproducto;
    private javax.swing.JMenuItem isucursales;
    private javax.swing.JMenuItem itienda;
    private javax.swing.JMenuItem iusuarios;
    private javax.swing.JMenuItem ivistas;
    private javax.swing.JMenuItem ivisualizarstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenu jmarchivo;
    private javax.swing.JMenu jmayuda;
    private javax.swing.JMenu jmoperaciones;
    private javax.swing.JMenu jmregistros;
    private javax.swing.JMenu jmreportes;
    private javax.swing.JMenu jmsistema;
    private javax.swing.JMenu jmtablas;
    private javax.swing.JLabel lbf;
    public static javax.swing.JLabel lbhorasistema;
    private javax.swing.JLabel lbminilogo;
    public static javax.swing.JLabel lbnombreusuario;
    private javax.swing.JLabel lbs;
    private javax.swing.JLabel lbsucursal;
    private javax.swing.JLabel lbu;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JPanel pbarra;
    private javax.swing.JPanel pingreso;
    private javax.swing.JPanel plogin;
    private javax.swing.JPasswordField txclave;
    private javax.swing.JTextField txusuario;
    // End of variables declaration//GEN-END:variables

    //Cargar datos del combobox sucursal del login
          public void cargardatos() throws ClassNotFoundException, SQLException {
        try {
                 for (Sucursal s : ADSucursal.Listar()) {
                     cbsucursal.addItem(s.getDESCRIPCION());
                 }
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
          
    //Cargar configuración del sistema de arranque
    private void cargarconfig() {
       this.setExtendedState(zmenu.MAXIMIZED_BOTH); //maximizar ventana
       this.setTitle("Sistore | Sistema de logística");
       this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../recursos/icono.png")));
        pbarra.setVisible(false);
        lbminilogo.setVisible(false);
        jmtablas.setVisible(false);
        jmoperaciones.setVisible(false);
        jmreportes.setVisible(false);
        jmregistros.setVisible(false);
        jmsistema.setVisible(false);
    }
   
    //Hilo para correr la hora
    @Override
    public void run() {
    Thread ct = Thread.currentThread();
    while(ct == h1) {   
    lbhorasistema.setText(Formatos.sdflargo.format(new Date()));
    try {
    Thread.sleep(1000);
    }catch(InterruptedException e) {}
    }  
    }

    //Cargar configuración de usuario y mostrar opciones
    private void cargarusuario(Usuario u) throws ClassNotFoundException, SQLException{
    plogin.setVisible(false);
    //Activar menu
    lbminilogo.setVisible(true);
    pbarra.setVisible(true);
    //Activar reloj
    h1 = new Thread(this);
    h1.start();
    //Obtener datos
    lbnombreusuario.setText(txusuario.getText());
    lbsucursal.setText(cbsucursal.getSelectedItem().toString());
    //mostrar pestaña de config sistema
    jmsistema.setVisible(true);

    try {
    for (Privilegio s : ADPrivilegio.Listar(u)) {
        switch(s.getIDPRIVILEGIO()){
    case 100 : 
    ialmacenes.setEnabled(true);
    jmtablas.setVisible(true);
    P_ALMACENES= new char[4];
    P_ALMACENES[0] = s.getCREAR();
    P_ALMACENES[1] = s.getMODIFICAR();
    P_ALMACENES[2] = s.getEXPORTAR();
    P_ALMACENES[3] = s.getIMPRIMIR(); 
    break;
     case 101 : 
    ivisualizarstock.setEnabled(true);
    jmoperaciones.setVisible(true);
    P_VISUALIZARSTOCKS= new char[4];
    P_VISUALIZARSTOCKS[0] = s.getCREAR();
    P_VISUALIZARSTOCKS[1] = s.getMODIFICAR();
    P_VISUALIZARSTOCKS[2] = s.getEXPORTAR();
    P_VISUALIZARSTOCKS[3] = s.getIMPRIMIR();
    break;
     case 102 : 
    imovimientos.setEnabled(true);
    jmtablas.setVisible(true);
    P_MOVIMIENTOS= new char[4];
    P_MOVIMIENTOS[0] = s.getCREAR();
    P_MOVIMIENTOS[1] = s.getMODIFICAR();
    P_MOVIMIENTOS[2] = s.getEXPORTAR();
    P_MOVIMIENTOS[3] = s.getIMPRIMIR();
    break;
     case 103 : 
    ilistamovimientos.setEnabled(true);
    jmoperaciones.setVisible(true);
    P_LISTARITEMSDEMOVIMIENTO= new char[4];
    P_LISTARITEMSDEMOVIMIENTO[0] = s.getCREAR();
    P_LISTARITEMSDEMOVIMIENTO[1] = s.getMODIFICAR();
    P_LISTARITEMSDEMOVIMIENTO[2] = s.getEXPORTAR();
    P_LISTARITEMSDEMOVIMIENTO[3] = s.getIMPRIMIR();
    break;
     case 104 : 
    iproveedores.setEnabled(true);
    jmtablas.setVisible(true);
    P_PROVEEDORES= new char[4];
    P_PROVEEDORES[0] = s.getCREAR();
    P_PROVEEDORES[1] = s.getMODIFICAR();
    P_PROVEEDORES[2] = s.getEXPORTAR();
    P_PROVEEDORES[3] = s.getIMPRIMIR();
    break;
     case 105 : 
    iproductos.setEnabled(true);
    jmtablas.setVisible(true);
    P_PRODUCTOS= new char[4];
    P_PRODUCTOS[0] = s.getCREAR();
    P_PRODUCTOS[1] = s.getMODIFICAR();
    P_PRODUCTOS[2] = s.getEXPORTAR();
    P_PRODUCTOS[3] = s.getIMPRIMIR();
    break;
     case 106 : 
    icategorias.setEnabled(true);
    jmtablas.setVisible(true);
    P_CATEGORIASDEPRODUCTOS= new char[4];
    P_CATEGORIASDEPRODUCTOS[0] = s.getCREAR();
    P_CATEGORIASDEPRODUCTOS[1] = s.getMODIFICAR();
    P_CATEGORIASDEPRODUCTOS[2] = s.getEXPORTAR();
    P_CATEGORIASDEPRODUCTOS[3] = s.getIMPRIMIR();
    break;
     case 107 : 
    iusuarios.setEnabled(true);
    jmregistros.setVisible(true);
    P_USUARIOS= new char[4];
    P_USUARIOS[0] = s.getCREAR();
    P_USUARIOS[1] = s.getMODIFICAR();
    P_USUARIOS[2] = s.getEXPORTAR();
    P_USUARIOS[3] = s.getIMPRIMIR();
    break;
     case 108 : 
    isucursales.setEnabled(true);
    jmregistros.setVisible(true);
    P_SUCURSALES= new char[4];
    P_SUCURSALES[0] = s.getCREAR();
    P_SUCURSALES[1] = s.getMODIFICAR();
    P_SUCURSALES[2] = s.getEXPORTAR();
    P_SUCURSALES[3] = s.getIMPRIMIR(); 
    break; 
     case 109 : 
    iasigusuariosucursal.setEnabled(true);
    imasignaciones.setEnabled(true);
    jmregistros.setEnabled(true);
    P_USUARIOSDESUCURSAL= new char[4];
    P_USUARIOSDESUCURSAL[0] = s.getCREAR();
    P_USUARIOSDESUCURSAL[1] = s.getMODIFICAR();
    P_USUARIOSDESUCURSAL[2] = s.getEXPORTAR();
    P_USUARIOSDESUCURSAL[3] = s.getIMPRIMIR();
    break;
     case 110 : 
    ivistas.setEnabled(true);
    jmregistros.setVisible(true);
    P_VISTAS= new char[4];
    P_VISTAS[0] = s.getCREAR();
    P_VISTAS[1] = s.getMODIFICAR();
    P_VISTAS[2] = s.getEXPORTAR();
    P_VISTAS[3] = s.getIMPRIMIR();
    break;
     case 111 : 
    igrupoparametros.setEnabled(true);
    imparametros.setEnabled(true);
    jmregistros.setVisible(true);
    P_GRUPOSDEPARAMETROS= new char[4];
    P_GRUPOSDEPARAMETROS[0] = s.getCREAR();
    P_GRUPOSDEPARAMETROS[1] = s.getMODIFICAR();
    P_GRUPOSDEPARAMETROS[2] = s.getEXPORTAR();
    P_GRUPOSDEPARAMETROS[3] = s.getIMPRIMIR();
    break;
     case 112 : 
    iagregaparametros.setEnabled(true);
    imparametros.setEnabled(true);
    jmregistros.setVisible(true);
    P_PARAMETROS= new char[4];
    P_PARAMETROS[0] = s.getCREAR();
    P_PARAMETROS[1] = s.getMODIFICAR();
    P_PARAMETROS[2] = s.getEXPORTAR();
    P_PARAMETROS[3] = s.getIMPRIMIR();
    break;
     case 113 : 
    iperfiles.setEnabled(true);
    jmregistros.setVisible(true);
    P_PERFILES= new char[4];
    P_PERFILES[0] = s.getCREAR();
    P_PERFILES[1] = s.getMODIFICAR();
    P_PERFILES[2] = s.getEXPORTAR();
    P_PERFILES[3] = s.getIMPRIMIR();
    break;
     case 114 : 
    iasigprivilegiousuario.setEnabled(true);
    imasignaciones.setEnabled(true);
    jmregistros.setVisible(true);    
    P_PRIVILEGIOS= new char[4];
    P_PRIVILEGIOS[0] = s.getCREAR();
    P_PRIVILEGIOS[1] = s.getMODIFICAR();
    P_PRIVILEGIOS[2] = s.getEXPORTAR();
    P_PRIVILEGIOS[3] = s.getIMPRIMIR();
    break;
     case 115 : 
    itienda.setEnabled(true);
    jmregistros.setVisible(true);
    P_TIENDA= new char[4];   
    P_TIENDA[0] = s.getCREAR();
    P_TIENDA[1] = s.getMODIFICAR();
    P_TIENDA[2] = s.getEXPORTAR();
    P_TIENDA[3] = s.getIMPRIMIR();
    break;
        case 116 : 
    iasigvistausuario.setEnabled(true);
    imasignaciones.setEnabled(true);
    jmregistros.setVisible(true);
    P_VISTAUSUARIO= new char[4];   
    P_VISTAUSUARIO[0] = s.getCREAR();
    P_VISTAUSUARIO[1] = s.getMODIFICAR();
    P_VISTAUSUARIO[2] = s.getEXPORTAR();
    P_VISTAUSUARIO[3] = s.getIMPRIMIR();
    break;
       case 117 : 
    ireportekardexproducto.setEnabled(true);
    jmreportes.setVisible(true);
    P_REPORTEKARDEXPRODUCTO= new char[4];   
    P_REPORTEKARDEXPRODUCTO[0] = s.getCREAR();
    P_REPORTEKARDEXPRODUCTO[1] = s.getMODIFICAR();
    P_REPORTEKARDEXPRODUCTO[2] = s.getEXPORTAR();
    P_REPORTEKARDEXPRODUCTO[3] = s.getIMPRIMIR();
    break;
       case 118 : 
    ireporteingresosalida.setEnabled(true);
    jmreportes.setVisible(true);
    P_REPORTEINGRESOSALIDA= new char[4];   
    P_REPORTEINGRESOSALIDA[0] = s.getCREAR();
    P_REPORTEINGRESOSALIDA[1] = s.getMODIFICAR();
    P_REPORTEINGRESOSALIDA[2] = s.getEXPORTAR();
    P_REPORTEINGRESOSALIDA[3] = s.getIMPRIMIR();
    break;
     default: break;
            }
    }


    }catch(ClassNotFoundException | NumberFormatException | SQLException e){
    JOptionPane.showMessageDialog(this, e);
    }
    }
    

            
}
