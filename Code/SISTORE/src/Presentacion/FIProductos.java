package Presentacion;

import AD.*;
import Entidades.*;
import static Presentacion.zmenu.internal;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kflores
 */
public final class FIProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     */
    public FIProductos() {
        initComponents();
        try {
            cargarconfig();
            cargartabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
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
        btnnuevo = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnexportaexcel = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbfiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txdetalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txidproducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txean = new javax.swing.JTextField();
        txdescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txpreciocompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txprecioventa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnbcategoria = new javax.swing.JButton();
        btnbumedida = new javax.swing.JButton();
        btnbestado = new javax.swing.JButton();
        btnbfleje = new javax.swing.JButton();
        txcategoria = new javax.swing.JTextField();
        txumedida = new javax.swing.JTextField();
        txestado = new javax.swing.JTextField();
        txfleje = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaproductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Productos");
        setFrameIcon(null);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new.png"))); // NOI18N
        btnnuevo.setFocusable(false);
        btnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnuevo);

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        btneditar.setFocusable(false);
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btneditar);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save.png"))); // NOI18N
        btnguardar.setFocusable(false);
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnguardar);

        btnexportaexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export_excel.png"))); // NOI18N
        btnexportaexcel.setToolTipText("");
        btnexportaexcel.setFocusable(false);
        btnexportaexcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(btnexportaexcel);

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/print.png"))); // NOI18N
        btnimprimir.setFocusable(false);
        btnimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(btnimprimir);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda avanzada"));

        jLabel1.setText("Filtrar por");

        txdetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txdetalleKeyTyped(evt);
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
                    .addComponent(cbfiltro, 0, 161, Short.MAX_VALUE)
                    .addComponent(txdetalle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del producto"));

        jLabel3.setText("ID");

        jLabel4.setText("Ean");

        jLabel5.setText("Descripcion");

        jLabel6.setText("P. Compra");

        jLabel7.setText("Categoria");

        jLabel8.setText("U. Medida");

        jLabel9.setText("Estado");

        jLabel10.setText("P. Venta");

        jLabel11.setText("Fleje");

        btnbcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbcategoriaActionPerformed(evt);
            }
        });

        btnbumedida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnbumedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbumedidaActionPerformed(evt);
            }
        });

        btnbestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbestadoActionPerformed(evt);
            }
        });

        btnbfleje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnbfleje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbflejeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txumedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txestado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfleje, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnbumedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnbestado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnbfleje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(txcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(btnbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txean))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txdescripcion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnbcategoria)
                    .addComponent(txcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txumedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbumedida))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(btnbestado))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnbfleje))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de productos"));

        listaproductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        listaproductos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        listaproductos.setModel(new javax.swing.table.DefaultTableModel(
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
        listaproductos.getTableHeader().setResizingAllowed(false);
        listaproductos.getTableHeader().setReorderingAllowed(false);
        listaproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaproductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaproductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaproductosMouseClicked
             filaseleccionada = listaproductos.getSelectedRow();
             btneditar.setEnabled(zmenu.P_PRODUCTOS[1]=='0');
             pasarDatosFila();
    }//GEN-LAST:event_listaproductosMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
    setEnabledDatosP(zmenu.P_PRODUCTOS[0]=='0'); //Verificar si puede crear
    limpiarcampos();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txdetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txdetalleKeyTyped
    // TODO add your handling code here:
        txdetalle.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txdetalle.getText());
                txdetalle.setText(cadena.toUpperCase());
                repaint();
                filtro();
            }
        });
        s = new TableRowSorter(listaproductos.getModel());
        listaproductos.setRowSorter(s);

    }//GEN-LAST:event_txdetalleKeyTyped

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try {
            if (txidproducto.getText().isEmpty()||txean.getText().isEmpty()||txdescripcion.getText().isEmpty()||
                    txpreciocompra.getText().isEmpty()||txprecioventa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            }
            else{
               Producto p = new Producto();
            p.setIDPRODUCTO(Integer.parseInt(txidproducto.getText()));
            p.setEAN(txean.getText());
            p.setDESCRIPCION(txdescripcion.getText().toUpperCase());
            p.setPRECIOCOM(Float.parseFloat(txpreciocompra.getText()));
            p.setPRECIOVEN(Float.parseFloat(txprecioventa.getText()));
            p.setFCHMOD(zmenu.lbhorasistema.getText());
            p.setUSRMOD(zmenu.lbnombreusuario.getText());
            if (ADProducto.Guardar(p)) {
             JOptionPane.showMessageDialog(this, "Se guardaron cambios");
             cargartabla();
             limpiarcampos();
             txdetalle.setText("");
             txidproducto.setText("");
             txdetalle.requestFocus();
             setEnabledDatosP(false);
            }else{
             JOptionPane.showMessageDialog(this, "Intente nuevamente más tarde");   
            } 
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (filaseleccionada == -1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {
                    setEnabledDatosP(zmenu.P_PRODUCTOS[1]=='0'); //Verificar si puede modificar
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);}
        
    }//GEN-LAST:event_btneditarActionPerformed
public static int idtabla;

    private void btnbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbcategoriaActionPerformed
        try {
            idtabla=0;
            FIDTabladetalle d=new FIDTabladetalle();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbcategoriaActionPerformed

    private void btnbumedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbumedidaActionPerformed
        try {
            idtabla=100; //tabla unidad de medida
            FIDTabladetalle d=new FIDTabladetalle();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbumedidaActionPerformed

    private void btnbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbestadoActionPerformed
        try {
            idtabla=104; //tabla estado de producto
            FIDTabladetalle d=new FIDTabladetalle();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbestadoActionPerformed

    private void btnbflejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbflejeActionPerformed
        try {
            idtabla=103; //tabla flgeli
            FIDTabladetalle d=new FIDTabladetalle();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbflejeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbcategoria;
    private javax.swing.JButton btnbestado;
    private javax.swing.JButton btnbfleje;
    private javax.swing.JButton btnbumedida;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexportaexcel;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cbfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable listaproductos;
    private javax.swing.JTextField txcategoria;
    private javax.swing.JTextField txdescripcion;
    private javax.swing.JTextField txdetalle;
    private javax.swing.JTextField txean;
    private javax.swing.JTextField txestado;
    private javax.swing.JTextField txfleje;
    private javax.swing.JTextField txidproducto;
    private javax.swing.JTextField txpreciocompra;
    private javax.swing.JTextField txprecioventa;
    private javax.swing.JTextField txumedida;
    // End of variables declaration//GEN-END:variables
    
public void limpiarcampos(){
    txidproducto.setText("0");
    txean.setText("");
    txdescripcion.setText("");
    txpreciocompra.setText("");
    txprecioventa.setText("");
    txean.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDPRODUCTO","EAN","DESCRIPCION","PRECIOCOM","PRECIOVEN","CATEGORIA","CODUME","CODESTADO","FLEJE","D","U","D","U"};    
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    listaproductos.setModel(modelo);
    listaproductos.setRowSorter(s);
    listaproductos.getColumnModel().getColumn(0).setPreferredWidth(80);
    listaproductos.getColumnModel().getColumn(1).setPreferredWidth(80);
    listaproductos.getColumnModel().getColumn(2).setPreferredWidth(250);
    listaproductos.getColumnModel().getColumn(5).setPreferredWidth(100);
    listaproductos.removeColumn(listaproductos.getColumnModel().getColumn(12));
    listaproductos.removeColumn(listaproductos.getColumnModel().getColumn(11));
    listaproductos.removeColumn(listaproductos.getColumnModel().getColumn(10));
    listaproductos.removeColumn(listaproductos.getColumnModel().getColumn(9));
    listaproductos.removeColumn(listaproductos.getColumnModel().getColumn(4));
    listaproductos.removeColumn(listaproductos.getColumnModel().getColumn(3));
    
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    listaproductos.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txean.setEnabled(estado);
            txdescripcion.setEnabled(estado);
            txpreciocompra.setEnabled(estado);
            txprecioventa.setEnabled(estado);
            btnguardar.setEnabled(estado);
        }
        
        //Filtro de combo para busqueda
        public void filtro() {
        int columnaABuscar = 0;
        if ("Descripcion".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
        if ("IDProducto".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("Ean".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
         if ("Categoria".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 5;
        }
         if ("Estado".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 7;
        }
         if ("Fleje".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 8;
        }
        s.setRowFilter(RowFilter.regexFilter(txdetalle.getText(), columnaABuscar));
    }
    
        //Carga la lista de producto en la tabla
        public void cargartabla() throws ClassNotFoundException, SQLException {
        initabla();
        try {
            int aux=0;
                 for (Producto p : ADProducto.Listar()) {
                     modelo.addRow(p.DatosArray());
                     if (modelo.getValueAt(aux, 8).equals("0")) {
                         modelo.setValueAt("REGISTRADO", aux, 8);
                     }else{
                         modelo.setValueAt("ELIMINADO", aux, 8);
                     }
                     aux++;
                 }
                 listaproductos.setModel(modelo);
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
 //Carga las opciones de la ventana
 public void cargaopcion(){
         btnnuevo.setEnabled(zmenu.P_PRODUCTOS[0]=='0');  //nuevo 
         btnexportaexcel.setEnabled(zmenu.P_PRODUCTOS[2]=='0'); //exportar
         btnimprimir.setEnabled(zmenu.P_PRODUCTOS[3]=='0'); //imprimir
 }   
        
//Carga toda la configuracion de la ventana
              public void cargarconfig() throws ClassNotFoundException, SQLException {
                  //Cargar combo de Filtros
                  cbfiltro.addItem("Descripcion");
                  cbfiltro.addItem("ID Producto");
                  cbfiltro.addItem("Ean");
                  cbfiltro.addItem("Categoria");
                  cbfiltro.addItem("Estado");
                  cbfiltro.addItem("Fleje");
                  //Desabilitar campos producto
                  setEnabledDatosP(false);
                  txidproducto.setEnabled(false);
                  cargaopcion();
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txidproducto.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 0).toString());
            txean.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 1).toString());
            txdescripcion.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 2).toString());
            txpreciocompra.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 3).toString());
            txprecioventa.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 4).toString());
}


}
