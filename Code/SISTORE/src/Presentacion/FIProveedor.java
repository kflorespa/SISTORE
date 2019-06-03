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
public final class FIProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     * @throws java.text.ParseException
     */
    public FIProveedor() throws ParseException {
        initComponents();
        try {
            cargarconfig();
            cargartabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProveedor.class.getName()).log(Level.SEVERE, null, ex);
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
        txproveedor_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txproveedor_ruc = new javax.swing.JTextField();
        txproveedor_razonsocial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tx_proveedor_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txproveedor_telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnproveedor_fleje = new javax.swing.JButton();
        txproveedor_rubro = new javax.swing.JTextField();
        txproveedor_fleje = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsttablaproveedores = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Proveedores");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del proveedor"));

        jLabel3.setText("ID");

        jLabel4.setText("RUC");

        txproveedor_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txproveedor_rucKeyTyped(evt);
            }
        });

        txproveedor_razonsocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txproveedor_razonsocialKeyTyped(evt);
            }
        });

        jLabel5.setText("Razón Social");

        jLabel6.setText("Dirección");

        tx_proveedor_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_proveedor_direccionKeyTyped(evt);
            }
        });

        jLabel7.setText("Rubro");

        jLabel10.setText("Teléfono");

        txproveedor_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txproveedor_telefonoKeyTyped(evt);
            }
        });

        jLabel11.setText("Fleje");

        btnproveedor_fleje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnproveedor_fleje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedor_flejeActionPerformed(evt);
            }
        });

        txproveedor_rubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txproveedor_rubroKeyTyped(evt);
            }
        });

        txproveedor_fleje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txproveedor_flejeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txproveedor_razonsocial)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txproveedor_id, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txproveedor_ruc, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addComponent(tx_proveedor_direccion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txproveedor_rubro)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txproveedor_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(28, 28, 28)
                                .addComponent(txproveedor_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnproveedor_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txproveedor_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txproveedor_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txproveedor_razonsocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_proveedor_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txproveedor_rubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txproveedor_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txproveedor_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(btnproveedor_fleje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txproveedor_razonsocial.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de proveedores"));

        lsttablaproveedores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        lsttablaproveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lsttablaproveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        lsttablaproveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lsttablaproveedores.getTableHeader().setResizingAllowed(false);
        lsttablaproveedores.getTableHeader().setReorderingAllowed(false);
        lsttablaproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsttablaproveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsttablaproveedores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
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

    private void lsttablaproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsttablaproveedoresMouseClicked
             filaseleccionada = lsttablaproveedores.getSelectedRow();
             btnpeditar.setEnabled(zmenu.P_PROVEEDOR[1]=='0');
             pasarDatosFila();
    }//GEN-LAST:event_lsttablaproveedoresMouseClicked

    private void btnpnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpnuevoActionPerformed
    setEnabledDatosP(zmenu.P_PROVEEDOR[0]=='0'); //Verificar si puede crear
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
        s = new TableRowSorter(lsttablaproveedores.getModel());
        lsttablaproveedores.setRowSorter(s);

    }//GEN-LAST:event_txpdetalleKeyTyped

    private void btnpguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpguardarActionPerformed
        try {
            if (txproveedor_id.getText().isEmpty()||txproveedor_ruc.getText().isEmpty()||txproveedor_razonsocial.getText().isEmpty()||
                    tx_proveedor_direccion.getText().isEmpty()||txproveedor_telefono.getText().isEmpty()) {
                JOptionPane.showInternalMessageDialog(internal, "Debe completar todos los campos","Validar datos",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                                Proveedor p = new Proveedor();
                                p.setIDPROVEEDOR(Integer.parseInt(txproveedor_id.getText()));
                                p.setRUC(txproveedor_ruc.getText());
                                p.setRAZONSOCIAL(txproveedor_razonsocial.getText().toUpperCase());
                                p.setDIRECCION(tx_proveedor_direccion.getText());
                                p.setTELEFONO(txproveedor_telefono.getText());
                                p.setFCHMOD(zmenu.lbhorasistema.getText());
                                p.setUSRMOD(zmenu.lbnombreusuario.getText());
                                p.setRUBRO(txproveedor_rubro.getText());
                                p.setFLGELI(txproveedor_fleje.getText().charAt(0));
                                if (ADProveedor.Guardar(p)) {
                                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txpdetalle.setText("");
                                txproveedor_id.setText("");
                                txpdetalle.requestFocus();
                                setEnabledDatosP(false);
                                }else{
                                JOptionPane.showInternalMessageDialog(internal, "Intente nuevamente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);      
                                }
                            
                       
                
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FIProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpguardarActionPerformed

    private void btnpeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpeditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (lsttablaproveedores.getSelectedRow()<0){
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una fila","Validar datos",JOptionPane.INFORMATION_MESSAGE);
            } else {
                    pasarDatosFila();
                    setEnabledDatosP(zmenu.P_PROVEEDOR[1]=='0'); //Verificar si puede modificar
            }
        }catch (HeadlessException ex){
            JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnpeditarActionPerformed
public static int proveedores_idtabla;
public static String proveedores_titulo;
    private void btnproveedor_flejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedor_flejeActionPerformed
        try {
            proveedores_idtabla=103; //tabla flgeli
            proveedores_titulo="Fleje";
            FIDProductoTD d=new FIDProductoTD();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnproveedor_flejeActionPerformed

    private void btnpexportaexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpexportaexcelActionPerformed
        try {
            ExportarExcel obj = new ExportarExcel();
            JTable tablatemp = new JTable();
            String[] columnas = {"IDPROVEEDOR","RUC","RAZÓN SOCIAL","DIRECCION","TELEFONO","RUBRO","FLEJE"};
            String copiatemp [] = new String[7];
            DefaultTableModel mtablatemp =new DefaultTableModel (null,columnas);
            for (int f = 0; f < lsttablaproveedores.getRowCount(); f++) {
                    copiatemp[0]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 0).toString();
                    copiatemp[1]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 1).toString();
                    copiatemp[2]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 2).toString();
                    copiatemp[3]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 3).toString();
                    copiatemp[4]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 4).toString();
                    copiatemp[5]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 5).toString();
                    copiatemp[6]=lsttablaproveedores.getModel().getValueAt(lsttablaproveedores.convertRowIndexToModel(f), 11).toString();
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
                     lsttablaproveedores.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
                                         
                     
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido imprimir correctamente, intentalo más tarde.");
            }  
    }//GEN-LAST:event_btnpimprimirActionPerformed

    private void txproveedor_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txproveedor_rucKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txproveedor_ruc, 20);
    }//GEN-LAST:event_txproveedor_rucKeyTyped

    private void txproveedor_razonsocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txproveedor_razonsocialKeyTyped
new dashtyped().control_maxdigitos(evt, txproveedor_razonsocial, 40);
    }//GEN-LAST:event_txproveedor_razonsocialKeyTyped

    private void tx_proveedor_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_proveedor_direccionKeyTyped
new dashtyped().control_maxdigitos(evt, tx_proveedor_direccion, 40);
    }//GEN-LAST:event_tx_proveedor_direccionKeyTyped

    private void txproveedor_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txproveedor_telefonoKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txproveedor_telefono, 10);
    }//GEN-LAST:event_txproveedor_telefonoKeyTyped

    private void txproveedor_rubroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txproveedor_rubroKeyTyped
new dashtyped().control_maxdigitos(evt, txproveedor_rubro, 40);
    }//GEN-LAST:event_txproveedor_rubroKeyTyped

    private void txproveedor_flejeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txproveedor_flejeKeyTyped
new dashtyped().control_cero_uno(evt, txproveedor_fleje);
    }//GEN-LAST:event_txproveedor_flejeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpeditar;
    private javax.swing.JButton btnpexportaexcel;
    private javax.swing.JButton btnpguardar;
    private javax.swing.JButton btnpimprimir;
    private javax.swing.JButton btnpnuevo;
    private javax.swing.JButton btnproveedor_fleje;
    private javax.swing.JComboBox<String> cbpfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable lsttablaproveedores;
    private javax.swing.JTextField tx_proveedor_direccion;
    private javax.swing.JTextField txpdetalle;
    public static javax.swing.JTextField txproveedor_fleje;
    private javax.swing.JTextField txproveedor_id;
    private javax.swing.JTextField txproveedor_razonsocial;
    public static javax.swing.JTextField txproveedor_rubro;
    private javax.swing.JTextField txproveedor_ruc;
    private javax.swing.JTextField txproveedor_telefono;
    // End of variables declaration//GEN-END:variables

public void limpiarcampos(){
    txproveedor_id.setText("0");
    txproveedor_ruc.setText("");
    txproveedor_razonsocial.setText("");
    tx_proveedor_direccion.setText("");
    txproveedor_telefono.setText("");
    txproveedor_rubro.setText("");
    txproveedor_fleje.setText("");
    txproveedor_ruc.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDPROVEEDOR","RUC","RAZÓN SOCIAL","DIRECCION","TELEFONO","RUBRO","FCHCREA","USRCREA","FCHMOD","USRMOD","FLEJE","FLGELI"};
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    lsttablaproveedores.setModel(modelo);
    lsttablaproveedores.setRowSorter(s);
    
    //posiciones de tabla
    int posicion [] = {11,9,8,7,6};
        for (int i = 0; i < posicion.length; i++) {
            lsttablaproveedores.getColumnModel().getColumn(posicion[i]).setMaxWidth(0);
            lsttablaproveedores.getColumnModel().getColumn(posicion[i]).setMinWidth(0);
            lsttablaproveedores.getColumnModel().getColumn(posicion[i]).setPreferredWidth(0);
        }

    //tamaños de columnas de tabla    
    lsttablaproveedores.getColumnModel().getColumn(0).setPreferredWidth(40);
    lsttablaproveedores.getColumnModel().getColumn(1).setPreferredWidth(60);
    lsttablaproveedores.getColumnModel().getColumn(2).setPreferredWidth(150);
    lsttablaproveedores.getColumnModel().getColumn(3).setPreferredWidth(150);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    lsttablaproveedores.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txproveedor_ruc.setEnabled(estado);
            txproveedor_razonsocial.setEnabled(estado);
            tx_proveedor_direccion.setEnabled(estado);
            txproveedor_telefono.setEnabled(estado);
            txproveedor_rubro.setEnabled(estado);
            txproveedor_fleje.setEnabled(estado);
            btnproveedor_fleje.setEnabled(estado);
            btnpguardar.setEnabled(estado);
        }
        int columnaABuscar = 0;
        //Filtro de combo para busqueda
        public void filtro() {
            
        if ("IDPROVEEDOR".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("RUC".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("RAZONSOCIAL".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
         if ("DIRECCION".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
         if ("TELEFONO".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 4;
        }
         if ("RUBRO".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 5;
        }
         if ("FLEJE".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 11;
        }
        s.setRowFilter(RowFilter.regexFilter(txpdetalle.getText(), columnaABuscar));
    }
    
        //Carga la lista de producto en la tabla
        public void cargartabla() throws ClassNotFoundException, SQLException, ParseException {
        initabla();
        try {
                 for (Proveedor p : ADProveedor.Listacompleta()) {
                     modelo.addRow(p.DatosArray());
                 }
                 lsttablaproveedores.setModel(modelo);
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
 //Carga las opciones de la ventana
 public void cargaopcion(){
         btnpnuevo.setEnabled(zmenu.P_PROVEEDOR[0]=='0');  //nuevo 
         btnpexportaexcel.setEnabled(zmenu.P_PROVEEDOR[2]=='0'); //exportar
         btnpimprimir.setEnabled(zmenu.P_PROVEEDOR[3]=='0'); //imprimir
 }   
        
//Carga toda la configuracion de la ventana
              public void cargarconfig() throws ClassNotFoundException, SQLException {
                  //Cargar combo de Filtros
                  cbpfiltro.addItem("RUC");
                  cbpfiltro.addItem("IDPROVEEDOR");
                  cbpfiltro.addItem("RAZONSOCIAL");
                  cbpfiltro.addItem("DIRECCION");
                  cbpfiltro.addItem("TELEFONO");
                  cbpfiltro.addItem("RUBRO");
                  cbpfiltro.addItem("FLEJE");
                  //Desabilitar campos producto
                  setEnabledDatosP(false);
                  txproveedor_id.setEnabled(false);
                  cargaopcion();
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txproveedor_id.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 0).toString());
            txproveedor_ruc.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 1).toString());
            txproveedor_razonsocial.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 2).toString());
            tx_proveedor_direccion.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 3).toString());
            txproveedor_telefono.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 4).toString());
            txproveedor_rubro.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 5).toString());
            txproveedor_fleje.setText(lsttablaproveedores.getValueAt(lsttablaproveedores.getSelectedRow(), 11).toString());
    }


}
