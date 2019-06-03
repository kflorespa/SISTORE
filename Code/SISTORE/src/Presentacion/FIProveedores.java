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
public final class FIProveedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     * @throws java.text.ParseException
     */
    public FIProveedores() throws ParseException {
        initComponents();
        try {
            cargarconfig();
            cargartabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProveedores.class.getName()).log(Level.SEVERE, null, ex);
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
        txpidproducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txpean = new javax.swing.JTextField();
        txpdescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txppreciocompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txpprecioventa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnpbfleje = new javax.swing.JButton();
        txpcategoria = new javax.swing.JTextField();
        txpfleje = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsttablaproductos = new javax.swing.JTable();

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

        txpean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpeanKeyTyped(evt);
            }
        });

        txpdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpdescripcionKeyTyped(evt);
            }
        });

        jLabel5.setText("Razón Social");

        jLabel6.setText("Dirección");

        txppreciocompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txppreciocompraKeyTyped(evt);
            }
        });

        jLabel7.setText("Rubro");

        jLabel10.setText("Teléfono");

        txpprecioventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpprecioventaKeyTyped(evt);
            }
        });

        jLabel11.setText("Fleje");

        btnpbfleje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnpbfleje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpbflejeActionPerformed(evt);
            }
        });

        txpcategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpcategoriaKeyTyped(evt);
            }
        });

        txpfleje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpflejeKeyTyped(evt);
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
                            .addComponent(txpdescripcion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txpidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txpean, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addComponent(txppreciocompra)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txpfleje, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnpbfleje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txpprecioventa)
                            .addComponent(txpcategoria))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txpean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txppreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txpcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txpfleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(btnpbfleje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txpdescripcion.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de proveedores"));

        lsttablaproductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        lsttablaproductos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lsttablaproductos.setModel(new javax.swing.table.DefaultTableModel(
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
        lsttablaproductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lsttablaproductos.getTableHeader().setResizingAllowed(false);
        lsttablaproductos.getTableHeader().setReorderingAllowed(false);
        lsttablaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsttablaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsttablaproductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
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

    private void lsttablaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsttablaproductosMouseClicked
             filaseleccionada = lsttablaproductos.getSelectedRow();
             btnpeditar.setEnabled(zmenu.P_PRODUCTOS[1]=='0');
             pasarDatosFila();
    }//GEN-LAST:event_lsttablaproductosMouseClicked

    private void btnpnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpnuevoActionPerformed
    setEnabledDatosP(zmenu.P_PRODUCTOS[0]=='0'); //Verificar si puede crear
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
        s = new TableRowSorter(lsttablaproductos.getModel());
        lsttablaproductos.setRowSorter(s);

    }//GEN-LAST:event_txpdetalleKeyTyped

    private void btnpguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpguardarActionPerformed
        try {
            if (txpidproducto.getText().isEmpty()||txpean.getText().isEmpty()||txpdescripcion.getText().isEmpty()||
                    txppreciocompra.getText().isEmpty()||txpprecioventa.getText().isEmpty()) {
                JOptionPane.showInternalMessageDialog(internal, "Debe completar todos los campos","Validar datos",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                                Producto p = new Producto();
                                p.setIDPRODUCTO(Integer.parseInt(txpidproducto.getText()));
                                p.setEAN(txpean.getText());
                                p.setDESCRIPCION(txpdescripcion.getText().toUpperCase());
                                p.setPRECIOCOM(Float.parseFloat(txppreciocompra.getText()));
                                p.setPRECIOVEN(Float.parseFloat(txpprecioventa.getText()));
                                p.setFCHMOD(zmenu.lbhorasistema.getText());
                                p.setUSRMOD(zmenu.lbnombreusuario.getText());
                                p.setIDCATEGORIA(Integer.parseInt(txpcategoria.getText()));
                                p.setFLGELI(txpfleje.getText().charAt(0));
                                if (ADProducto.Guardar(p)) {
                                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txpdetalle.setText("");
                                txpidproducto.setText("");
                                txpdetalle.requestFocus();
                                setEnabledDatosP(false);
                                }else{
                                JOptionPane.showInternalMessageDialog(internal, "Intente nuevamente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);      
                                }
                            
                       
                
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FIProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpguardarActionPerformed

    private void btnpeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpeditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (lsttablaproductos.getSelectedRow()<0){
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una fila","Validar datos",JOptionPane.INFORMATION_MESSAGE);
            } else {
                    pasarDatosFila();
                    setEnabledDatosP(zmenu.P_PRODUCTOS[1]=='0'); //Verificar si puede modificar
            }
        }catch (HeadlessException ex){
            JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnpeditarActionPerformed
public static int idtabla;
public static String titulo;
    private void btnpbflejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpbflejeActionPerformed
        try {
            idtabla=103; //tabla flgeli
            titulo="Fleje";
            FIDPTablaDetalle d=new FIDPTablaDetalle();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnpbflejeActionPerformed

    private void btnpexportaexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpexportaexcelActionPerformed
        try {
            ExportarExcel obj = new ExportarExcel();
            JTable tablatemp = new JTable();
            String[] columnas = {"IDPRODUCTO","EAN","DESCRIPCION","DCATEGORIA","DUME","DESTADO","FLEJE"};
            String copiatemp [] = new String[7];
            DefaultTableModel mtablatemp =new DefaultTableModel (null,columnas);
            for (int f = 0; f < lsttablaproductos.getRowCount(); f++) {
                    copiatemp[0]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 0).toString();
                    copiatemp[1]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 1).toString();
                    copiatemp[2]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 2).toString();
                    copiatemp[3]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 6).toString();
                    copiatemp[4]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 8).toString();
                    copiatemp[5]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 10).toString();
                    copiatemp[6]=lsttablaproductos.getModel().getValueAt(lsttablaproductos.convertRowIndexToModel(f), 12).toString();
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
                     lsttablaproductos.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
                                         
                     
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido imprimir correctamente, intentalo más tarde.");
            }  
    }//GEN-LAST:event_btnpimprimirActionPerformed

    private void txpeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpeanKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txpean, 20);
    }//GEN-LAST:event_txpeanKeyTyped

    private void txpdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpdescripcionKeyTyped
 new dashtyped().control_maxdigitos(evt, txpdescripcion, 40);
    }//GEN-LAST:event_txpdescripcionKeyTyped

    private void txppreciocompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txppreciocompraKeyTyped
 new dashtyped().control_maxdigitos_decimales(evt, txppreciocompra, 6);
    }//GEN-LAST:event_txppreciocompraKeyTyped

    private void txpprecioventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpprecioventaKeyTyped
 new dashtyped().control_maxdigitos_decimales(evt, txpprecioventa, 6);
    }//GEN-LAST:event_txpprecioventaKeyTyped

    private void txpcategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpcategoriaKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txpcategoria, 4);
    }//GEN-LAST:event_txpcategoriaKeyTyped

    private void txpflejeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpflejeKeyTyped
new dashtyped().control_cero_uno(evt, txpfleje);
    }//GEN-LAST:event_txpflejeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpbfleje;
    private javax.swing.JButton btnpeditar;
    private javax.swing.JButton btnpexportaexcel;
    private javax.swing.JButton btnpguardar;
    private javax.swing.JButton btnpimprimir;
    private javax.swing.JButton btnpnuevo;
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
    private javax.swing.JTable lsttablaproductos;
    public static javax.swing.JTextField txpcategoria;
    private javax.swing.JTextField txpdescripcion;
    private javax.swing.JTextField txpdetalle;
    private javax.swing.JTextField txpean;
    public static javax.swing.JTextField txpfleje;
    private javax.swing.JTextField txpidproducto;
    private javax.swing.JTextField txppreciocompra;
    private javax.swing.JTextField txpprecioventa;
    // End of variables declaration//GEN-END:variables

public void limpiarcampos(){
    txpidproducto.setText("0");
    txpean.setText("");
    txpdescripcion.setText("");
    txppreciocompra.setText("");
    txpprecioventa.setText("");
    txpcategoria.setText("");
    txpfleje.setText("");
    txpean.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDPRODUCTO","EAN","DESCRIPCION","PRECIOCOM","PRECIOVEN","IDCATEGORIA","DCATEGORIA","CODUME","DUME","CODESTADO","DESTADO","FLGELI","FLEJE","FC","UC","FM","UM"};    
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    lsttablaproductos.setModel(modelo);
    lsttablaproductos.setRowSorter(s);
    
    //posiciones de tabla
    int posicion [] = {16,15,14,13,11,9,7,5,4,3};
        for (int i = 0; i < posicion.length; i++) {
            lsttablaproductos.getColumnModel().getColumn(posicion[i]).setMaxWidth(0);
            lsttablaproductos.getColumnModel().getColumn(posicion[i]).setMinWidth(0);
            lsttablaproductos.getColumnModel().getColumn(posicion[i]).setPreferredWidth(0);
        }

    //tamaños de columnas de tabla    
    lsttablaproductos.getColumnModel().getColumn(0).setPreferredWidth(60);
    lsttablaproductos.getColumnModel().getColumn(1).setPreferredWidth(80);
    lsttablaproductos.getColumnModel().getColumn(2).setPreferredWidth(250);
    lsttablaproductos.getColumnModel().getColumn(6).setPreferredWidth(120);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    lsttablaproductos.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txpean.setEnabled(estado);
            txpdescripcion.setEnabled(estado);
            txppreciocompra.setEnabled(estado);
            txpprecioventa.setEnabled(estado);
            txpcategoria.setEnabled(estado);
            txpfleje.setEnabled(estado);
            btnpbfleje.setEnabled(estado);
            btnpguardar.setEnabled(estado);
        }
        int columnaABuscar = 0;
        //Filtro de combo para busqueda
        public void filtro() {
            
        if ("IDPRODUCTO".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("DESCRIPCION".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
        if ("EAN".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
         if ("CATEGORIA".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 6;
        }
         if ("ESTADO".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 10;
        }
         if ("FLEJE".equals(cbpfiltro.getSelectedItem().toString())) {
            columnaABuscar = 12;
        }
        s.setRowFilter(RowFilter.regexFilter(txpdetalle.getText(), columnaABuscar));
    }
    
        //Carga la lista de producto en la tabla
        public void cargartabla() throws ClassNotFoundException, SQLException, ParseException {
        initabla();
        try {
                 for (Producto p : ADProducto.Listar()) {
                     modelo.addRow(p.DatosArray());
                 }
                 lsttablaproductos.setModel(modelo);
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
 //Carga las opciones de la ventana
 public void cargaopcion(){
         btnpnuevo.setEnabled(zmenu.P_PRODUCTOS[0]=='0');  //nuevo 
         btnpexportaexcel.setEnabled(zmenu.P_PRODUCTOS[2]=='0'); //exportar
         btnpimprimir.setEnabled(zmenu.P_PRODUCTOS[3]=='0'); //imprimir
 }   
        
//Carga toda la configuracion de la ventana
              public void cargarconfig() throws ClassNotFoundException, SQLException {
                  //Cargar combo de Filtros
                  cbpfiltro.addItem("DESCRIPCION");
                  cbpfiltro.addItem("IDPRODUCTO");
                  cbpfiltro.addItem("EAN");
                  cbpfiltro.addItem("CATEGORIA");
                  cbpfiltro.addItem("ESTADO");
                  cbpfiltro.addItem("FLEJE");
                  //Desabilitar campos producto
                  setEnabledDatosP(false);
                  txpidproducto.setEnabled(false);
                  cargaopcion();
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txpidproducto.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 0).toString());
            txpean.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 1).toString());
            txpdescripcion.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 2).toString());
            txppreciocompra.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 3).toString());
            txpprecioventa.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 4).toString());
            txpcategoria.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 5).toString());
            txpfleje.setText(lsttablaproductos.getValueAt(lsttablaproductos.getSelectedRow(), 11).toString());
    }


}
