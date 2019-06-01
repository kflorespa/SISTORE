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
public final class FIProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     * @throws java.text.ParseException
     */
    public FIProductos() throws ParseException {
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
        btnguardar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
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
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icono.png"))); // NOI18N

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

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save.png"))); // NOI18N
        btnguardar.setFocusable(false);
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnguardar);

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        btneditar.setFocusable(false);
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btneditar);

        btnexportaexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export_excel.png"))); // NOI18N
        btnexportaexcel.setToolTipText("");
        btnexportaexcel.setFocusable(false);
        btnexportaexcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnexportaexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportaexcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btnexportaexcel);

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/print.png"))); // NOI18N
        btnimprimir.setFocusable(false);
        btnimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
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

        txean.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txeanKeyTyped(evt);
            }
        });

        txdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txdescripcionKeyTyped(evt);
            }
        });

        jLabel5.setText("Descripcion");

        jLabel6.setText("P. Compra");

        txpreciocompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txpreciocompraKeyTyped(evt);
            }
        });

        jLabel7.setText("Categoria");

        jLabel8.setText("U. Medida");

        jLabel9.setText("Estado");

        jLabel10.setText("P. Venta");

        txprecioventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txprecioventaKeyTyped(evt);
            }
        });

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

        txcategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcategoriaKeyTyped(evt);
            }
        });

        txumedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txumedidaKeyTyped(evt);
            }
        });

        txestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txestadoKeyTyped(evt);
            }
        });

        txfleje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txflejeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(txcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txestado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txumedida, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfleje, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbumedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbfleje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txprecioventa))
                    .addComponent(txdescripcion)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txean)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbcategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txumedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbumedida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbestado))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbfleje)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txdescripcion.getAccessibleContext().setAccessibleName("");

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
        listaproductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
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
    new dashtyped().control_maxdigitos(evt, txdetalle, 50); 
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
                JOptionPane.showInternalMessageDialog(internal, "Debe completar todos los campos","Validar datos",JOptionPane.WARNING_MESSAGE); 
            }
            else{
 
            Categoria cat=new Categoria();
            cat.setIDCATEGORIA(Integer.parseInt(txcategoria.getText()));
                if (ADCategoria.Existe(cat)) {
                 Tabladetalle est=new Tabladetalle();
                est.setIDTABLADETALLE(Integer.parseInt(txestado.getText()));
                        if (ADTabladetalle.Existe(est)) {
                            Tabladetalle um=new Tabladetalle();
                            est.setIDTABLADETALLE(Integer.parseInt(txumedida.getText()));
                            if (ADTabladetalle.Existe(um)) {
                                Producto p = new Producto();
                                p.setIDPRODUCTO(Integer.parseInt(txidproducto.getText()));
                                p.setEAN(txean.getText());
                                p.setDESCRIPCION(txdescripcion.getText().toUpperCase());
                                p.setPRECIOCOM(Float.parseFloat(txpreciocompra.getText()));
                                p.setPRECIOVEN(Float.parseFloat(txprecioventa.getText()));
                                p.setFCHMOD(zmenu.lbhorasistema.getText());
                                p.setUSRMOD(zmenu.lbnombreusuario.getText());
                                p.setCODESTADO(Integer.parseInt(txestado.getText()));
                                p.setIDCATEGORIA(Integer.parseInt(txcategoria.getText()));
                                p.setCODUME(Integer.parseInt(txumedida.getText()));
                                p.setFLGELI(txfleje.getText().charAt(0));
                                if (ADProducto.Guardar(p)) {
                                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txdetalle.setText("");
                                txidproducto.setText("");
                                txdetalle.requestFocus();
                                setEnabledDatosP(false);
                                }else{
                                JOptionPane.showInternalMessageDialog(internal, "Intente nuevamente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);      
                                }
                            }else{
                            JOptionPane.showInternalMessageDialog(internal, "Selecciona unidad de medida válido","Validar datos",JOptionPane.ERROR_MESSAGE);  
                            txumedida.requestFocus();
                            }
                       }else{
                       JOptionPane.showInternalMessageDialog(internal,"Selecciona un estado válido","Validar datos",JOptionPane.ERROR_MESSAGE);
                       txestado.requestFocus();
                       }
                }else{
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una categoria válida","Validar datos",JOptionPane.ERROR_MESSAGE);
                txcategoria.requestFocus();
                }
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (listaproductos.getSelectedRow()<0){
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una fila","Validar datos",JOptionPane.INFORMATION_MESSAGE);
            } else {
                    pasarDatosFila();
                    setEnabledDatosP(zmenu.P_PRODUCTOS[1]=='0'); //Verificar si puede modificar
            }
        }catch (HeadlessException ex){
            JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btneditarActionPerformed
public static int idtabla;
public static String titulo;
    private void btnbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbcategoriaActionPerformed
        try {
            idtabla=0; //categoria
            titulo="Categoria";
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
            titulo="Unidad medida";
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
            titulo="Estado";
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
            titulo="Fleje";
            FIDTabladetalle d=new FIDTabladetalle();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnbflejeActionPerformed

    private void btnexportaexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportaexcelActionPerformed
        try {
            ExportarExcel obj = new ExportarExcel();
            JTable tablatemp = new JTable();
            String[] columnas = {"IDPRODUCTO","EAN","DESCRIPCION","DCATEGORIA","DUME","DESTADO","FLEJE"};
            String copiatemp [] = new String[7];
            DefaultTableModel mtablatemp =new DefaultTableModel (null,columnas);
            for (int f = 0; f < listaproductos.getRowCount(); f++) {
                    copiatemp[0]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 0).toString();
                    copiatemp[1]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 1).toString();
                    copiatemp[2]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 2).toString();
                    copiatemp[3]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 6).toString();
                    copiatemp[4]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 8).toString();
                    copiatemp[5]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 10).toString();
                    copiatemp[6]=listaproductos.getModel().getValueAt(listaproductos.convertRowIndexToModel(f), 12).toString();
                    mtablatemp.addRow(copiatemp);
            }
            tablatemp.setModel(mtablatemp);
            obj.exportarExcel(tablatemp);
        } catch (IOException ex) {
           JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnexportaexcelActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
                  try {
              // tabla1.print();//envia los datos de la tabla a la impresora
                     MessageFormat headerFormat = new MessageFormat("Sistore - Productos "+Formatos.sdfruta.format(new Date()));
                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
                     listaproductos.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
                                         
                     
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido imprimir correctamente, intentalo más tarde.");
            }  
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void txeanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txeanKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txean, 20);
    }//GEN-LAST:event_txeanKeyTyped

    private void txdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txdescripcionKeyTyped
 new dashtyped().control_maxdigitos(evt, txdescripcion, 50);
    }//GEN-LAST:event_txdescripcionKeyTyped

    private void txpreciocompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpreciocompraKeyTyped
 new dashtyped().control_maxdigitos_decimales(evt, txpreciocompra, 5);
    }//GEN-LAST:event_txpreciocompraKeyTyped

    private void txprecioventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txprecioventaKeyTyped
 new dashtyped().control_maxdigitos_decimales(evt, txprecioventa, 5);
    }//GEN-LAST:event_txprecioventaKeyTyped

    private void txcategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcategoriaKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txcategoria, 5);
    }//GEN-LAST:event_txcategoriaKeyTyped

    private void txumedidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txumedidaKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txumedida, 5);
    }//GEN-LAST:event_txumedidaKeyTyped

    private void txestadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txestadoKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txestado, 5);
    }//GEN-LAST:event_txestadoKeyTyped

    private void txflejeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txflejeKeyTyped

    }//GEN-LAST:event_txflejeKeyTyped


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
    public static javax.swing.JTextField txcategoria;
    private javax.swing.JTextField txdescripcion;
    private javax.swing.JTextField txdetalle;
    private javax.swing.JTextField txean;
    public static javax.swing.JTextField txestado;
    public static javax.swing.JTextField txfleje;
    private javax.swing.JTextField txidproducto;
    private javax.swing.JTextField txpreciocompra;
    private javax.swing.JTextField txprecioventa;
    public static javax.swing.JTextField txumedida;
    // End of variables declaration//GEN-END:variables

public void limpiarcampos(){
    txidproducto.setText("0");
    txean.setText("");
    txdescripcion.setText("");
    txpreciocompra.setText("");
    txprecioventa.setText("");
    txcategoria.setText("");
    txumedida.setText("");
    txestado.setText("");
    txfleje.setText("");
    txean.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDPRODUCTO","EAN","DESCRIPCION","PRECIOCOM","PRECIOVEN","IDCATEGORIA","DCATEGORIA","CODUME","DUME","CODESTADO","DESTADO","FLGELI","FLEJE","FC","UC","FM","UM"};    
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    listaproductos.setModel(modelo);
    listaproductos.setRowSorter(s);
    
    //posiciones de tabla
    int posicion [] = {16,15,14,13,11,9,7,5,4,3};
        for (int i = 0; i < posicion.length; i++) {
            listaproductos.getColumnModel().getColumn(posicion[i]).setMaxWidth(0);
            listaproductos.getColumnModel().getColumn(posicion[i]).setMinWidth(0);
            listaproductos.getColumnModel().getColumn(posicion[i]).setPreferredWidth(0);
        }

    //tamaños de columnas de tabla    
    listaproductos.getColumnModel().getColumn(0).setPreferredWidth(60);
    listaproductos.getColumnModel().getColumn(1).setPreferredWidth(80);
    listaproductos.getColumnModel().getColumn(2).setPreferredWidth(250);
    listaproductos.getColumnModel().getColumn(6).setPreferredWidth(120);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    listaproductos.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txean.setEnabled(estado);
            txdescripcion.setEnabled(estado);
            txpreciocompra.setEnabled(estado);
            txprecioventa.setEnabled(estado);
            txcategoria.setEnabled(estado);
            txumedida.setEnabled(estado);
            txestado.setEnabled(estado);
            txfleje.setEnabled(estado);
            btnbcategoria.setEnabled(estado);
            btnbestado.setEnabled(estado);
            btnbfleje.setEnabled(estado);
            btnbumedida.setEnabled(estado);
            btnguardar.setEnabled(estado);
        }
        int columnaABuscar = 0;
        //Filtro de combo para busqueda
        public void filtro() {
            
        if ("IDPRODUCTO".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("DESCRIPCION".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
        if ("EAN".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
         if ("CATEGORIA".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 6;
        }
         if ("ESTADO".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 10;
        }
         if ("FLEJE".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 12;
        }
        s.setRowFilter(RowFilter.regexFilter(txdetalle.getText(), columnaABuscar));
    }
    
        //Carga la lista de producto en la tabla
        public void cargartabla() throws ClassNotFoundException, SQLException, ParseException {
        initabla();
        try {
                 for (Producto p : ADProducto.Listar()) {
                     modelo.addRow(p.DatosArray());
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
                  cbfiltro.addItem("DESCRIPCION");
                  cbfiltro.addItem("IDPRODUCTO");
                  cbfiltro.addItem("EAN");
                  cbfiltro.addItem("CATEGORIA");
                  cbfiltro.addItem("ESTADO");
                  cbfiltro.addItem("FLEJE");
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
            txcategoria.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 5).toString());
            txumedida.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 7).toString());
            txestado.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 9).toString());
            txfleje.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 11).toString());
    }


}
