package Presentacion;

import AD.*;
import Entidades.*;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kflores
 */
public class FIProductos extends javax.swing.JInternalFrame {

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
    JInternalFrame FIDTabladetalle;
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
        cbcategoria = new javax.swing.JComboBox<>();
        cbumedida = new javax.swing.JComboBox<>();
        cbestado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txprecioventa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbfleje = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        btnnuevo.setText("Nuevo");
        btnnuevo.setFocusable(false);
        btnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnuevo);

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        btneditar.setText("Editar");
        btneditar.setFocusable(false);
        btneditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btneditar);

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setFocusable(false);
        btnguardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnguardar);

        btnexportaexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export_excel.png"))); // NOI18N
        btnexportaexcel.setText("Exportar");
        btnexportaexcel.setToolTipText("");
        btnexportaexcel.setFocusable(false);
        btnexportaexcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToolBar1.add(btnexportaexcel);

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/print.png"))); // NOI18N
        btnimprimir.setText("Imprimir");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txdetalle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
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

        jLabel6.setText("Precio compra");

        jLabel7.setText("Categoria");

        jLabel8.setText("U. Medida");

        jLabel9.setText("Estado");

        jLabel10.setText("Precio venta");

        jLabel11.setText("Fleje");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txean, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txcategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbfleje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbumedida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfleje, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txestado, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(txumedida)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(txcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cbumedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txumedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cbfleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    txpreciocompra.getText().isEmpty()||txprecioventa.getText().isEmpty()||cbcategoria.getSelectedIndex()==0||
                    cbumedida.getSelectedIndex()==0||cbestado.getSelectedIndex()==0) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
            }
            else{
               Producto p = new Producto();
            p.setIDPRODUCTO(Integer.parseInt(txidproducto.getText()));
            p.setEAN(txean.getText());
            p.setDESCRIPCION(txdescripcion.getText().toUpperCase());
            p.setPRECIOCOM(Float.parseFloat(txpreciocompra.getText()));
            p.setPRECIOVEN(Float.parseFloat(txprecioventa.getText()));
            String cat [] = cbcategoria.getSelectedItem().toString().split("-");
             p.setIDCATEGORIA(Integer.parseInt(cat[0]));
            String ume [] = cbumedida.getSelectedItem().toString().split("-");
            p.setCODUME(Integer.parseInt(ume[0]));
            if (cbfleje.getSelectedItem().toString().equals("REGISTRADO")) {
               p.setFLGELI("0".charAt(0)); 
            }else{
                p.setFLGELI("1".charAt(0)); 
            }
            String estado [] = cbestado.getSelectedItem().toString().split("-");
            p.setCODESTADO(Integer.parseInt(estado[0]));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
FIDTabladetalle fi=new FIDTabladetalle();
        fi.setSize(200,200);
        fi.setVisible(true);
        zmenu.internal.add(fi);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexportaexcel;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cbcategoria;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JComboBox<String> cbfiltro;
    private javax.swing.JComboBox<String> cbfleje;
    private javax.swing.JComboBox<String> cbumedida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    cbcategoria.setSelectedIndex(0);
    cbumedida.setSelectedIndex(0);
    cbestado.setSelectedIndex(0);
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
    
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    listaproductos.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txean.setEnabled(estado);
            txdescripcion.setEnabled(estado);
            txpreciocompra.setEnabled(estado);
            txprecioventa.setEnabled(estado);
            cbcategoria.setEnabled(estado);
            cbumedida.setEnabled(estado);
            cbestado.setEnabled(estado);
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
        try {
            //Cargar combo de Filtros
                    cbfiltro.addItem("Descripcion");
                    cbfiltro.addItem("ID Producto");
                    cbfiltro.addItem("Ean");
                    cbfiltro.addItem("Categoria");
                    cbfiltro.addItem("Estado");
                    cbfiltro.addItem("Fleje");
            //Cargar combo de Categorias
                     cbcategoria.addItem("");
                 for (Categoria c : ADCategoria.Listar()) {
                     cbcategoria.addItem(c.getITEM());
                 }
            //Cargar combo de Unidad de Medida / Estado / Flejes
                     cbumedida.addItem("");
                     cbestado.addItem("");
                     cbfleje.addItem("");
                 for (Tabladetalle c : ADTabladetalle.Listar()) {
                     if (c.getDESCRIPCIONTABLA().equals("UME")) {
                          cbumedida.addItem(c.getITEM());
                     }
                      if (c.getDESCRIPCIONTABLA().equals("ESTADO_PRO")) {
                          cbestado.addItem(c.getITEM());
                     }
                      if (c.getDESCRIPCIONTABLA().equals("FLEJE")) {
                          cbfleje.addItem(c.getITEM());
                     }
                 }
             //Desabilitar campos producto
                    setEnabledDatosP(false);
                    txidproducto.setEnabled(false);
                    cargaopcion();
                    
        }catch(ClassNotFoundException | SQLException e){
            
        }
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txidproducto.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 0).toString());
            txean.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 1).toString());
            txdescripcion.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 2).toString());
            txpreciocompra.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 3).toString());
            txprecioventa.setText(listaproductos.getValueAt(listaproductos.getSelectedRow(), 4).toString());
            cbcategoria.setSelectedItem(listaproductos.getValueAt(listaproductos.getSelectedRow(), 5).toString());
            cbumedida.setSelectedItem(listaproductos.getValueAt(listaproductos.getSelectedRow(), 6).toString());
            cbestado.setSelectedItem(listaproductos.getValueAt(listaproductos.getSelectedRow(), 7).toString());
            cbfleje.setSelectedItem(listaproductos.getValueAt(listaproductos.getSelectedRow(), 8).toString());
    }


}
