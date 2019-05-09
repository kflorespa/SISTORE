package Presentacion;

import AD.ADSucursal;
import AD.ADUsuario;
import AD.conexionMS;
import Entidades.Sucursal;
import Entidades.Usuario;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import recursos.Formatos;

public final class zmenu extends javax.swing.JFrame implements Runnable{
    conexionMS con;
    public zmenu() throws ClassNotFoundException, SQLException {
        initComponents();
        cargarconfig();
        cargardatos();
        //tab.setFont(new java.awt.Font("Century Gothic", 0, 18));//font de tab
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ilistadostock = new javax.swing.JMenuItem();
        imovimientos = new javax.swing.JMenuItem();
        iproductos = new javax.swing.JMenuItem();
        iproveedores = new javax.swing.JMenuItem();
        iusuarios = new javax.swing.JMenuItem();
        irestablecerclave = new javax.swing.JMenuItem();

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
        jLabel3.setText("jLabel3");
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

        lbminilogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/sistore-mini.png"))); // NOI18N

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
                .addContainerGap(62, Short.MAX_VALUE)
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

        jMenu1.setText("Archivo");

        jMenuItem5.setText("Salir");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");

        ilistadostock.setText("Listado de stocks");
        jMenu2.add(ilistadostock);

        imovimientos.setText("Movimientos");
        jMenu2.add(imovimientos);

        iproductos.setText("Productos");
        jMenu2.add(iproductos);

        iproveedores.setText("Proveedores");
        jMenu2.add(iproveedores);

        iusuarios.setText("Usuarios");
        jMenu2.add(iusuarios);

        irestablecerclave.setText("Reestablecer clave");
        jMenu2.add(irestablecerclave);

        jMenuBar1.add(jMenu2);

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
                cargarusuario();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton btnentrar1;
    private javax.swing.JComboBox<String> cbsucursal;
    private javax.swing.JMenuItem ilistadostock;
    private javax.swing.JMenuItem imovimientos;
    private javax.swing.JDesktopPane internal;
    private javax.swing.JMenuItem iproductos;
    private javax.swing.JMenuItem iproveedores;
    private javax.swing.JMenuItem irestablecerclave;
    private javax.swing.JMenuItem iusuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lbf;
    private javax.swing.JLabel lbhorasistema;
    private javax.swing.JLabel lbminilogo;
    private javax.swing.JLabel lbnombreusuario;
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
    private void cargarusuario() {
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
    
    }


            
}
