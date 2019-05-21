package Presentacion;

import AD.ADPrivilegio;
import AD.ADSucursal;
import AD.ADUsuario;
import Entidades.Privilegio;
import Entidades.Sucursal;
import Entidades.Usuario;
import java.sql.SQLException;
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
        lbminilogo = new javax.swing.JLabel();
        pbarra = new javax.swing.JPanel();
        lbhorasistema = new javax.swing.JLabel();
        lbsucursal = new javax.swing.JLabel();
        lbnombreusuario = new javax.swing.JLabel();
        lbs = new javax.swing.JLabel();
        lbu = new javax.swing.JLabel();
        lbf = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        ialmacenes = new javax.swing.JMenuItem();
        iproveedores = new javax.swing.JMenuItem();
        iproductos = new javax.swing.JMenuItem();
        icategorias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        imovimientos = new javax.swing.JMenuItem();
        ilistamovimientos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ivisualizarstock = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ivistas = new javax.swing.JMenuItem();
        iperfiles = new javax.swing.JMenuItem();
        iusuarios = new javax.swing.JMenuItem();
        itienda = new javax.swing.JMenuItem();
        isucursales = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        iasigvistausuario = new javax.swing.JMenuItem();
        iasigusuariosucursal = new javax.swing.JMenuItem();
        iasigprivilegiousuario = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        igrupoparametros = new javax.swing.JMenuItem();
        iagregaparametros = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
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
        btnentrar.setText("Entrar");
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });

        btnentrar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnentrar1.setText("Salir");
        btnentrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrar1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Sucursal");

        javax.swing.GroupLayout pingresoLayout = new javax.swing.GroupLayout(pingreso);
        pingreso.setLayout(pingresoLayout);
        pingresoLayout.setHorizontalGroup(
            pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pingresoLayout.createSequentialGroup()
                .addGroup(pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(cbsucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pingresoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pingresoLayout.setVerticalGroup(
            pingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
                .addContainerGap(68, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbf)
                .addGap(10, 10, 10)
                .addComponent(lbhorasistema, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jMenu3.setText("Tablas");

        ialmacenes.setText("Almacenes");
        jMenu3.add(ialmacenes);

        iproveedores.setText("Proveedores");
        jMenu3.add(iproveedores);

        iproductos.setText("Productos");
        iproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iproductosActionPerformed(evt);
            }
        });
        jMenu3.add(iproductos);

        icategorias.setText("Categorias");
        icategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icategoriasActionPerformed(evt);
            }
        });
        jMenu3.add(icategorias);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Operaciones");

        imovimientos.setText("Movimientos");
        jMenu2.add(imovimientos);

        ilistamovimientos.setText("Listar items de movimientos");
        ilistamovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilistamovimientosActionPerformed(evt);
            }
        });
        jMenu2.add(ilistamovimientos);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Reportes");

        ivisualizarstock.setText("Visualizar de stocks");
        jMenu4.add(ivisualizarstock);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Registros");

        ivistas.setText("Vistas");
        jMenu1.add(ivistas);

        iperfiles.setText("Perfiles");
        jMenu1.add(iperfiles);

        iusuarios.setText("Usuarios");
        jMenu1.add(iusuarios);

        itienda.setText("Tienda");
        jMenu1.add(itienda);

        isucursales.setText("Sucursales");
        jMenu1.add(isucursales);

        jMenu11.setText("Asignaciones");

        iasigvistausuario.setText("Asignar vista a usuario");
        jMenu11.add(iasigvistausuario);

        iasigusuariosucursal.setText("Asignar usuario a sucursal");
        jMenu11.add(iasigusuariosucursal);

        iasigprivilegiousuario.setText("Asignar privilegios a usuario");
        jMenu11.add(iasigprivilegiousuario);

        jMenu1.add(jMenu11);

        jMenu10.setText("Parámetros");

        igrupoparametros.setText("Grupo de parámetros");
        jMenu10.add(igrupoparametros);

        iagregaparametros.setText("Agregar items parámetros");
        jMenu10.add(iagregaparametros);

        jMenu1.add(jMenu10);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Ayuda");

        iacercade.setText("Acerca de");
        jMenu5.add(iacercade);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internal)
            .addComponent(pbarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        FIProductos fip=new FIProductos();
        fip.setSize(internal.getWidth(),internal.getHeight());
        fip.setVisible(true);
        internal.add(fip);
    }//GEN-LAST:event_iproductosActionPerformed

    private void icategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icategoriasActionPerformed

    private void ilistamovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilistamovimientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ilistamovimientosActionPerformed

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
    private javax.swing.JDesktopPane internal;
    private javax.swing.JMenuItem iperfiles;
    private javax.swing.JMenuItem iproductos;
    private javax.swing.JMenuItem iproveedores;
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
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbf;
    public static javax.swing.JLabel lbhorasistema;
    private javax.swing.JLabel lbminilogo;
    public static javax.swing.JLabel lbnombreusuario;
    private javax.swing.JLabel lbs;
    private javax.swing.JLabel lbsucursal;
    private javax.swing.JLabel lbu;
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
       this.setTitle("Sistema de logística para bodegas | Allqu Systems");
        pbarra.setVisible(false);
        lbminilogo.setVisible(false);
        //LISTA DE OPCIONES
        //iproductos.setEnabled(false);
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
    try {
    for (Privilegio s : ADPrivilegio.Listar(u)) {
        switch(s.getIDPRIVILEGIO()){
    case 100 : ialmacenes.setEnabled(true);
    P_ALMACENES= new char[4];
    P_ALMACENES[0] = s.getCREAR();
    P_ALMACENES[1] = s.getMODIFICAR();
    P_ALMACENES[2] = s.getEXPORTAR();
    P_ALMACENES[3] = s.getIMPRIMIR(); 
    break;
     case 101 : ivisualizarstock.setEnabled(true);
     P_VISUALIZARSTOCKS= new char[4];
    P_VISUALIZARSTOCKS[0] = s.getCREAR();
    P_VISUALIZARSTOCKS[1] = s.getMODIFICAR();
    P_VISUALIZARSTOCKS[2] = s.getEXPORTAR();
    P_VISUALIZARSTOCKS[3] = s.getIMPRIMIR();
    break;
     case 102 : imovimientos.setEnabled(true);
    P_MOVIMIENTOS= new char[4];
    P_MOVIMIENTOS[0] = s.getCREAR();
    P_MOVIMIENTOS[1] = s.getMODIFICAR();
    P_MOVIMIENTOS[2] = s.getEXPORTAR();
    P_MOVIMIENTOS[3] = s.getIMPRIMIR();
    break;
     case 103 : ilistamovimientos.setEnabled(true);
    P_LISTARITEMSDEMOVIMIENTO= new char[4];
    P_LISTARITEMSDEMOVIMIENTO[0] = s.getCREAR();
    P_LISTARITEMSDEMOVIMIENTO[1] = s.getMODIFICAR();
    P_LISTARITEMSDEMOVIMIENTO[2] = s.getEXPORTAR();
    P_LISTARITEMSDEMOVIMIENTO[3] = s.getIMPRIMIR();
    break;
     case 104 : iproveedores.setEnabled(true);
     P_PROVEEDORES= new char[4];
    P_PROVEEDORES[0] = s.getCREAR();
    P_PROVEEDORES[1] = s.getMODIFICAR();
    P_PROVEEDORES[2] = s.getEXPORTAR();
    P_PROVEEDORES[3] = s.getIMPRIMIR();
    break;
     case 105 : iproductos.setEnabled(true);
     P_PRODUCTOS= new char[4];
    P_PRODUCTOS[0] = s.getCREAR();
    P_PRODUCTOS[1] = s.getMODIFICAR();
    P_PRODUCTOS[2] = s.getEXPORTAR();
    P_PRODUCTOS[3] = s.getIMPRIMIR();
    break;
     case 106 : icategorias.setEnabled(true);
     P_CATEGORIASDEPRODUCTOS= new char[4];
    P_CATEGORIASDEPRODUCTOS[0] = s.getCREAR();
    P_CATEGORIASDEPRODUCTOS[1] = s.getMODIFICAR();
    P_CATEGORIASDEPRODUCTOS[2] = s.getEXPORTAR();
    P_CATEGORIASDEPRODUCTOS[3] = s.getIMPRIMIR();
    break;
     case 107 : iusuarios.setEnabled(true);
     P_USUARIOS= new char[4];
    P_USUARIOS[0] = s.getCREAR();
    P_USUARIOS[1] = s.getMODIFICAR();
    P_USUARIOS[2] = s.getEXPORTAR();
    P_USUARIOS[3] = s.getIMPRIMIR();
    break;
     case 108 : isucursales.setEnabled(true);
    P_SUCURSALES= new char[4];
    P_SUCURSALES[0] = s.getCREAR();
    P_SUCURSALES[1] = s.getMODIFICAR();
    P_SUCURSALES[2] = s.getEXPORTAR();
    P_SUCURSALES[3] = s.getIMPRIMIR(); 
    break;
     case 109 : iasigusuariosucursal.setEnabled(true);
     P_USUARIOSDESUCURSAL= new char[4];
    P_USUARIOSDESUCURSAL[0] = s.getCREAR();
    P_USUARIOSDESUCURSAL[1] = s.getMODIFICAR();
    P_USUARIOSDESUCURSAL[2] = s.getEXPORTAR();
    P_USUARIOSDESUCURSAL[3] = s.getIMPRIMIR();
    break;
     case 110 : ivistas.setEnabled(true);
     P_VISTAS= new char[4];
    P_VISTAS[0] = s.getCREAR();
    P_VISTAS[1] = s.getMODIFICAR();
    P_VISTAS[2] = s.getEXPORTAR();
    P_VISTAS[3] = s.getIMPRIMIR();
    break;
     case 111 : igrupoparametros.setEnabled(true);
     P_GRUPOSDEPARAMETROS= new char[4];
    P_GRUPOSDEPARAMETROS[0] = s.getCREAR();
    P_GRUPOSDEPARAMETROS[1] = s.getMODIFICAR();
    P_GRUPOSDEPARAMETROS[2] = s.getEXPORTAR();
    P_GRUPOSDEPARAMETROS[3] = s.getIMPRIMIR();
    break;
     case 112 : iagregaparametros.setEnabled(true);
     P_PARAMETROS= new char[4];
    P_PARAMETROS[0] = s.getCREAR();
    P_PARAMETROS[1] = s.getMODIFICAR();
    P_PARAMETROS[2] = s.getEXPORTAR();
    P_PARAMETROS[3] = s.getIMPRIMIR();
    break;
     case 113 : iperfiles.setEnabled(true);
     P_PERFILES= new char[4];
    P_PERFILES[0] = s.getCREAR();
    P_PERFILES[1] = s.getMODIFICAR();
    P_PERFILES[2] = s.getEXPORTAR();
    P_PERFILES[3] = s.getIMPRIMIR();
    break;
     case 114 : iasigprivilegiousuario.setEnabled(true);
     P_PRIVILEGIOS= new char[4];
    P_PRIVILEGIOS[0] = s.getCREAR();
    P_PRIVILEGIOS[1] = s.getMODIFICAR();
    P_PRIVILEGIOS[2] = s.getEXPORTAR();
    P_PRIVILEGIOS[3] = s.getIMPRIMIR();
    break;
     case 115 : itienda.setEnabled(true);
    P_TIENDA= new char[4];   
    P_TIENDA[0] = s.getCREAR();
    P_TIENDA[1] = s.getMODIFICAR();
    P_TIENDA[2] = s.getEXPORTAR();
    P_TIENDA[3] = s.getIMPRIMIR();
    break;
        case 116 : iasigvistausuario.setEnabled(true);
    P_VISTAUSUARIO= new char[4];   
    P_VISTAUSUARIO[0] = s.getCREAR();
    P_VISTAUSUARIO[1] = s.getMODIFICAR();
    P_VISTAUSUARIO[2] = s.getEXPORTAR();
    P_VISTAUSUARIO[3] = s.getIMPRIMIR();
    break;
    
     default: break;
            }
    }

//iagregaparametros;
//ialmacenes;
//iasigprivilegiousuario;
//iasigusuariosucursal;
//iasigvistausuario;
//icategorias;
//igrupoparametros;
//ilistamovimientos;
//imovimientos;
//iperfiles;
//iproductos;
//iproveedores;
//isucursales;
//itienda;
//iusuarios;
//ivistas;
//ivisualizarstock;
  
    
    }catch(ClassNotFoundException | NumberFormatException | SQLException e){
    JOptionPane.showMessageDialog(this, e);
    }
    }
    

            
}
