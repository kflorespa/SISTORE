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
    // VARIABLES PARA VISTAS (TABLAS)
    public static char []P_GRUPOPARAMETRO;
    public static char []P_ALMACEN;
    public static char []P_CATEGORIA;
    public static char []P_DEPOSITO;
    public static char []P_MOVIMIENTO;
    public static char []P_MOVIMIENTODETALLE;
    public static char []P_PERFIL;
    public static char []P_PRIVILEGIO;
    public static char []P_PRODUCTO;
    public static char []P_PROVEEDOR;
    public static char []P_SUCURSAL;
    public static char []P_USUARIOSUCURSAL;
    public static char []P_PARAMETRO;
    public static char []P_TIENDA;
    public static char []P_USUARIO;
    public static char []P_VISTA;
    //OPERACIONES Y REPORTES
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
        ialmacenes = new javax.swing.JMenuItem();
        isucursales = new javax.swing.JMenuItem();
        itienda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        iperfiles = new javax.swing.JMenuItem();
        iusuarios = new javax.swing.JMenuItem();
        iasigvistausuario = new javax.swing.JMenuItem();
        iasigprivilegiousuario = new javax.swing.JMenuItem();
        iasigusuariosucursal = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        icategorias = new javax.swing.JMenuItem();
        iproductos = new javax.swing.JMenuItem();
        iproveedores = new javax.swing.JMenuItem();
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

        jmoperaciones.setText("Operaciones");

        ivisualizarstock.setText("Visualizar stocks");
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

        ialmacenes.setText("Almacenes");
        ialmacenes.setEnabled(false);
        jmregistros.add(ialmacenes);

        isucursales.setText("Sucursales");
        isucursales.setEnabled(false);
        jmregistros.add(isucursales);

        itienda.setText("Tienda");
        itienda.setEnabled(false);
        jmregistros.add(itienda);

        jMenu2.setText("Personal");

        iperfiles.setText("Perfiles");
        iperfiles.setEnabled(false);
        iperfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iperfilesActionPerformed(evt);
            }
        });
        jMenu2.add(iperfiles);

        iusuarios.setText("Usuarios");
        iusuarios.setEnabled(false);
        iusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iusuariosActionPerformed(evt);
            }
        });
        jMenu2.add(iusuarios);

        iasigvistausuario.setText("Asignar vista a usuario");
        iasigvistausuario.setEnabled(false);
        jMenu2.add(iasigvistausuario);

        iasigprivilegiousuario.setText("Asignar privilegios a usuario");
        iasigprivilegiousuario.setEnabled(false);
        jMenu2.add(iasigprivilegiousuario);

        iasigusuariosucursal.setText("Asignar usuario a sucursal");
        iasigusuariosucursal.setEnabled(false);
        jMenu2.add(iasigusuariosucursal);

        jmregistros.add(jMenu2);

        jMenu1.setText("Materiales");

        icategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        icategorias.setText("Categorias");
        icategorias.setEnabled(false);
        icategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icategoriasActionPerformed(evt);
            }
        });
        jMenu1.add(icategorias);

        iproductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iproductos.setText("Productos");
        iproductos.setEnabled(false);
        iproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iproductosActionPerformed(evt);
            }
        });
        jMenu1.add(iproductos);

        iproveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iproveedores.setText("Proveedores");
        iproveedores.setEnabled(false);
        iproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iproveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(iproveedores);

        jmregistros.add(jMenu1);

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
            FIProducto fip=new FIProducto();
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
            FICategoria fip=new FICategoria();
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
            FIProveedor fip=new FIProveedor();
            fip.setSize(internal.getWidth(),internal.getHeight());
            fip.setVisible(true);
            internal.add(fip);
            fip.toFront();
        } catch (ParseException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iproveedoresActionPerformed

    private void iusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iusuariosActionPerformed
          try {
            FIUsuario fip=new FIUsuario();
            fip.setSize(internal.getWidth(),internal.getHeight());
            fip.setVisible(true);
            internal.add(fip);
            fip.toFront();
        } catch (ParseException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iusuariosActionPerformed

    private void iperfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iperfilesActionPerformed
         try {
            FIPerfil fip=new FIPerfil();
            fip.setSize(internal.getWidth(),internal.getHeight());
            fip.setVisible(true);
            internal.add(fip);
            fip.toFront();
        } catch (ParseException ex) {
            Logger.getLogger(zmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iperfilesActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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

    P_ALMACEN= new char[4];
    P_ALMACEN[0] = s.getCREAR();
    P_ALMACEN[1] = s.getMODIFICAR();
    P_ALMACEN[2] = s.getEXPORTAR();
    P_ALMACEN[3] = s.getIMPRIMIR(); 
    break;
     case 101 : 
    ivisualizarstock.setEnabled(true);
    jmoperaciones.setVisible(true);
    P_DEPOSITO= new char[4];
    P_DEPOSITO[0] = s.getCREAR();
    P_DEPOSITO[1] = s.getMODIFICAR();
    P_DEPOSITO[2] = s.getEXPORTAR();
    P_DEPOSITO[3] = s.getIMPRIMIR();
    break;
     case 102 : 
    imovimientos.setEnabled(true);
    P_MOVIMIENTO= new char[4];
    P_MOVIMIENTO[0] = s.getCREAR();
    P_MOVIMIENTO[1] = s.getMODIFICAR();
    P_MOVIMIENTO[2] = s.getEXPORTAR();
    P_MOVIMIENTO[3] = s.getIMPRIMIR();
    break;
     case 103 : 
    ilistamovimientos.setEnabled(true);
    jmoperaciones.setVisible(true);
    P_MOVIMIENTODETALLE= new char[4];
    P_MOVIMIENTODETALLE[0] = s.getCREAR();
    P_MOVIMIENTODETALLE[1] = s.getMODIFICAR();
    P_MOVIMIENTODETALLE[2] = s.getEXPORTAR();
    P_MOVIMIENTODETALLE[3] = s.getIMPRIMIR();
    break;
     case 104 : 
    iproveedores.setEnabled(true);
    P_PROVEEDOR= new char[4];
    P_PROVEEDOR[0] = s.getCREAR();
    P_PROVEEDOR[1] = s.getMODIFICAR();
    P_PROVEEDOR[2] = s.getEXPORTAR();
    P_PROVEEDOR[3] = s.getIMPRIMIR();
    break;
     case 105 : 
    iproductos.setEnabled(true);
    P_PRODUCTO= new char[4];
    P_PRODUCTO[0] = s.getCREAR();
    P_PRODUCTO[1] = s.getMODIFICAR();
    P_PRODUCTO[2] = s.getEXPORTAR();
    P_PRODUCTO[3] = s.getIMPRIMIR();
    break;
     case 106 : 
    icategorias.setEnabled(true);
    P_CATEGORIA= new char[4];
    P_CATEGORIA[0] = s.getCREAR();
    P_CATEGORIA[1] = s.getMODIFICAR();
    P_CATEGORIA[2] = s.getEXPORTAR();
    P_CATEGORIA[3] = s.getIMPRIMIR();
    break;
     case 107 : 
    iusuarios.setEnabled(true);
    jmregistros.setVisible(true);
    P_USUARIO= new char[4];
    P_USUARIO[0] = s.getCREAR();
    P_USUARIO[1] = s.getMODIFICAR();
    P_USUARIO[2] = s.getEXPORTAR();
    P_USUARIO[3] = s.getIMPRIMIR();
    break;
     case 108 : 
    isucursales.setEnabled(true);
    jmregistros.setVisible(true);
    P_SUCURSAL= new char[4];
    P_SUCURSAL[0] = s.getCREAR();
    P_SUCURSAL[1] = s.getMODIFICAR();
    P_SUCURSAL[2] = s.getEXPORTAR();
    P_SUCURSAL[3] = s.getIMPRIMIR(); 
    break; 
     case 109 : 
    iasigusuariosucursal.setEnabled(true);
    jmregistros.setEnabled(true);
    P_USUARIOSUCURSAL= new char[4];
    P_USUARIOSUCURSAL[0] = s.getCREAR();
    P_USUARIOSUCURSAL[1] = s.getMODIFICAR();
    P_USUARIOSUCURSAL[2] = s.getEXPORTAR();
    P_USUARIOSUCURSAL[3] = s.getIMPRIMIR();
    break;
     case 110 : 
    ivistas.setEnabled(true);
    jmregistros.setVisible(true);
    P_VISTA= new char[4];
    P_VISTA[0] = s.getCREAR();
    P_VISTA[1] = s.getMODIFICAR();
    P_VISTA[2] = s.getEXPORTAR();
    P_VISTA[3] = s.getIMPRIMIR();
    break;
     case 111 : 
    igrupoparametros.setEnabled(true);
    imparametros.setEnabled(true);
    jmregistros.setVisible(true);
    P_GRUPOPARAMETRO= new char[4];
    P_GRUPOPARAMETRO[0] = s.getCREAR();
    P_GRUPOPARAMETRO[1] = s.getMODIFICAR();
    P_GRUPOPARAMETRO[2] = s.getEXPORTAR();
    P_GRUPOPARAMETRO[3] = s.getIMPRIMIR();
    break;
     case 112 : 
    iagregaparametros.setEnabled(true);
    imparametros.setEnabled(true);
    jmregistros.setVisible(true);
    P_PARAMETRO= new char[4];
    P_PARAMETRO[0] = s.getCREAR();
    P_PARAMETRO[1] = s.getMODIFICAR();
    P_PARAMETRO[2] = s.getEXPORTAR();
    P_PARAMETRO[3] = s.getIMPRIMIR();
    break;
     case 113 : 
    iperfiles.setEnabled(true);
    jmregistros.setVisible(true);
    P_PERFIL= new char[4];
    P_PERFIL[0] = s.getCREAR();
    P_PERFIL[1] = s.getMODIFICAR();
    P_PERFIL[2] = s.getEXPORTAR();
    P_PERFIL[3] = s.getIMPRIMIR();
    break;
     case 114 : 
    iasigprivilegiousuario.setEnabled(true);
    jmregistros.setVisible(true);    
    P_PRIVILEGIO= new char[4];
    P_PRIVILEGIO[0] = s.getCREAR();
    P_PRIVILEGIO[1] = s.getMODIFICAR();
    P_PRIVILEGIO[2] = s.getEXPORTAR();
    P_PRIVILEGIO[3] = s.getIMPRIMIR();
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
