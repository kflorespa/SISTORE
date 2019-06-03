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
public final class FICategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     * @throws java.text.ParseException
     */
    public FICategoria() throws ParseException {
        initComponents();
        try {
            cargarconfig();
            cargartabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FICategoria.class.getName()).log(Level.SEVERE, null, ex);
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
        btncnuevo = new javax.swing.JButton();
        btncguardar = new javax.swing.JButton();
        btnceditar = new javax.swing.JButton();
        btncexportaexcel = new javax.swing.JButton();
        btncimprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbfiltro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txcdetalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txcategoria_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txcategoria_descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btncategoria_fleje = new javax.swing.JButton();
        txcategoria_diaretiro = new javax.swing.JTextField();
        txcategoria_fleje = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsttablacategorias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Categorias");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icono.png"))); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btncnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new.png"))); // NOI18N
        btncnuevo.setFocusable(false);
        btncnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncnuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btncnuevo);

        btncguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save.png"))); // NOI18N
        btncguardar.setFocusable(false);
        btncguardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncguardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btncguardar);

        btnceditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit.png"))); // NOI18N
        btnceditar.setFocusable(false);
        btnceditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnceditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnceditar);

        btncexportaexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export_excel.png"))); // NOI18N
        btncexportaexcel.setToolTipText("");
        btncexportaexcel.setFocusable(false);
        btncexportaexcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncexportaexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncexportaexcelActionPerformed(evt);
            }
        });
        jToolBar1.add(btncexportaexcel);

        btncimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/print.png"))); // NOI18N
        btncimprimir.setFocusable(false);
        btncimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncimprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btncimprimir);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda avanzada"));

        jLabel1.setText("Filtrar por");

        txcdetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcdetalleKeyTyped(evt);
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
                    .addComponent(txcdetalle))
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
                    .addComponent(txcdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de categoria para productos"));

        jLabel3.setText("ID");

        txcategoria_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcategoria_descripcionKeyTyped(evt);
            }
        });

        jLabel5.setText("Descripcion");

        jLabel7.setText("Día retiro");

        jLabel11.setText("Fleje");

        btncategoria_fleje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btncategoria_fleje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoria_flejeActionPerformed(evt);
            }
        });

        txcategoria_diaretiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcategoria_diaretiroKeyTyped(evt);
            }
        });

        txcategoria_fleje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcategoria_flejeKeyTyped(evt);
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txcategoria_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txcategoria_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel11))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txcategoria_diaretiro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(txcategoria_fleje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncategoria_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txcategoria_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txcategoria_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txcategoria_diaretiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncategoria_fleje)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txcategoria_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        txcategoria_descripcion.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de categorias"));

        lsttablacategorias = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        lsttablacategorias.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lsttablacategorias.setModel(new javax.swing.table.DefaultTableModel(
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
        lsttablacategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lsttablacategorias.getTableHeader().setResizingAllowed(false);
        lsttablacategorias.getTableHeader().setReorderingAllowed(false);
        lsttablacategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsttablacategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsttablacategorias);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
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

    private void lsttablacategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsttablacategoriasMouseClicked
             filaseleccionada = lsttablacategorias.getSelectedRow();
             btnceditar.setEnabled(zmenu.P_CATEGORIA[1]=='0');
             pasarDatosFila();
    }//GEN-LAST:event_lsttablacategoriasMouseClicked

    private void btncnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncnuevoActionPerformed
    setEnabledDatosP(zmenu.P_CATEGORIA[0]=='0'); //Verificar si puede crear
    limpiarcampos();
    }//GEN-LAST:event_btncnuevoActionPerformed

    private void txcdetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcdetalleKeyTyped
    // TODO add your handling code here:
    new dashtyped().control_maxdigitos(evt, txcdetalle, 25); 
        txcdetalle.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txcdetalle.getText());
                txcdetalle.setText(cadena.toUpperCase());
                repaint();
                filtro();
            }
        });
        s = new TableRowSorter(lsttablacategorias.getModel());
        lsttablacategorias.setRowSorter(s);

    }//GEN-LAST:event_txcdetalleKeyTyped

    private void btncguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncguardarActionPerformed
        try {
            if (txcategoria_id.getText().isEmpty()||txcategoria_descripcion.getText().isEmpty())
                     {
                JOptionPane.showInternalMessageDialog(internal, "Debe completar todos los campos","Validar datos",JOptionPane.WARNING_MESSAGE); 
            }
            else{
 
                                Categoria p = new Categoria();
                                p.setIDCATEGORIA(Integer.parseInt(txcategoria_id.getText()));
                                p.setDESCRIPCION(txcategoria_descripcion.getText().toUpperCase());
                                p.setDIARETIRO(Integer.parseInt(txcategoria_diaretiro.getText()));
                                p.setFLGELI(txcategoria_fleje.getText().charAt(0));
                                if (ADCategoria.Guardar(p)) {
                                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txcdetalle.setText("");
                                txcategoria_id.setText("");
                                txcdetalle.requestFocus();
                                setEnabledDatosP(false);
                                }else{
                                JOptionPane.showInternalMessageDialog(internal, "Intente nuevamente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);      
                                }
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FICategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncguardarActionPerformed

    private void btnceditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (lsttablacategorias.getSelectedRow()<0){
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una fila","Validar datos",JOptionPane.INFORMATION_MESSAGE);
            } else {
                    pasarDatosFila();
                    setEnabledDatosP(zmenu.P_CATEGORIA[1]=='0'); //Verificar si puede modificar
            }
        }catch (HeadlessException ex){
            JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnceditarActionPerformed
public static String c_titulo;
public static int c_idtabla;
    private void btncategoria_flejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoria_flejeActionPerformed
        try {
            c_idtabla=103; //tabla flgeli
            c_titulo="Fleje";
            FIDCategoriaTD d=new FIDCategoriaTD();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FICategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncategoria_flejeActionPerformed

    private void btncexportaexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncexportaexcelActionPerformed
        try {
            ExportarExcel obj = new ExportarExcel();
            JTable tablatemp = new JTable();
            String[] columnas = {"IDCATEGORIA","DESCRIPCION","DIARETIRO","FLEJE"};  
            String copiatemp [] = new String[4];
            DefaultTableModel mtablatemp =new DefaultTableModel (null,columnas);
            for (int f = 0; f < lsttablacategorias.getRowCount(); f++) {
                    copiatemp[0]=lsttablacategorias.getModel().getValueAt(lsttablacategorias.convertRowIndexToModel(f), 0).toString();
                    copiatemp[1]=lsttablacategorias.getModel().getValueAt(lsttablacategorias.convertRowIndexToModel(f), 1).toString();
                    copiatemp[2]=lsttablacategorias.getModel().getValueAt(lsttablacategorias.convertRowIndexToModel(f), 3).toString();
                    copiatemp[3]=lsttablacategorias.getModel().getValueAt(lsttablacategorias.convertRowIndexToModel(f), 4).toString();
                    mtablatemp.addRow(copiatemp);
            }
            tablatemp.setModel(mtablatemp);
            obj.exportarExcel(tablatemp);
        } catch (IOException ex) {
           JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btncexportaexcelActionPerformed

    private void btncimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncimprimirActionPerformed
                  try {
              // tabla1.print();//envia los datos de la tabla a la impresora
                     MessageFormat headerFormat = new MessageFormat("Sistore - Categorias "+Formatos.sdfruta.format(new Date()));
                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
                     lsttablacategorias.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
                                         
                     
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido imprimir correctamente, intentalo más tarde.");
            }  
    }//GEN-LAST:event_btncimprimirActionPerformed

    private void txcategoria_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcategoria_descripcionKeyTyped
 new dashtyped().control_maxdigitos(evt, txcategoria_descripcion, 40);
    }//GEN-LAST:event_txcategoria_descripcionKeyTyped

    private void txcategoria_diaretiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcategoria_diaretiroKeyTyped
 new dashtyped().control_maxdigitos_numeros(evt, txcategoria_diaretiro, 4);
    }//GEN-LAST:event_txcategoria_diaretiroKeyTyped

    private void txcategoria_flejeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcategoria_flejeKeyTyped
new dashtyped().control_cero_uno(evt, txcategoria_fleje);
    }//GEN-LAST:event_txcategoria_flejeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncategoria_fleje;
    private javax.swing.JButton btnceditar;
    private javax.swing.JButton btncexportaexcel;
    private javax.swing.JButton btncguardar;
    private javax.swing.JButton btncimprimir;
    private javax.swing.JButton btncnuevo;
    private javax.swing.JComboBox<String> cbfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable lsttablacategorias;
    private javax.swing.JTextField txcategoria_descripcion;
    public static javax.swing.JTextField txcategoria_diaretiro;
    public static javax.swing.JTextField txcategoria_fleje;
    private javax.swing.JTextField txcategoria_id;
    private javax.swing.JTextField txcdetalle;
    // End of variables declaration//GEN-END:variables

public void limpiarcampos(){
    txcategoria_id.setText("0");
    txcategoria_descripcion.setText("");
    txcategoria_diaretiro.setText("");
    txcategoria_fleje.setText("");
    txcategoria_descripcion.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDCATEGORIA","DESCRIPCION","DIARETIRO","FLEJE","FLGELI"};    
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    lsttablacategorias.setModel(modelo);
    lsttablacategorias.setRowSorter(s);
    
    //posiciones de tabla
    int posicion [] = {4};
        for (int i = 0; i < posicion.length; i++) {
            lsttablacategorias.getColumnModel().getColumn(posicion[i]).setMaxWidth(0);
            lsttablacategorias.getColumnModel().getColumn(posicion[i]).setMinWidth(0);
            lsttablacategorias.getColumnModel().getColumn(posicion[i]).setPreferredWidth(0);
        }

    //tamaños de columnas de tabla    
    lsttablacategorias.getColumnModel().getColumn(0).setPreferredWidth(80);
    lsttablacategorias.getColumnModel().getColumn(1).setPreferredWidth(250);
    lsttablacategorias.getColumnModel().getColumn(3).setPreferredWidth(80);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    lsttablacategorias.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txcategoria_descripcion.setEnabled(estado);
            txcategoria_diaretiro.setEnabled(estado);
            txcategoria_fleje.setEnabled(estado);
            btncategoria_fleje.setEnabled(estado);
            btncguardar.setEnabled(estado);
        }
        int columnaABuscar = 0;
        //Filtro de combo para busqueda
        public void filtro() {
            
        if ("IDCATEGORIA".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("DESCRIPCION".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("DIARETIRO".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
         if ("FLEJE".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
        s.setRowFilter(RowFilter.regexFilter(txcdetalle.getText(), columnaABuscar));
    }
    
        //Carga la lista de producto en la tabla
        public void cargartabla() throws ClassNotFoundException, SQLException, ParseException {
        initabla();
        try {
                 for (Categoria p : ADCategoria.Listacompleta()) {
                     modelo.addRow(p.Lista());
                 }
                 lsttablacategorias.setModel(modelo);
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
 //Carga las opciones de la ventana
 public void cargaopcion(){
         btncnuevo.setEnabled(zmenu.P_CATEGORIA[0]=='0');  //nuevo 
         btncexportaexcel.setEnabled(zmenu.P_CATEGORIA[2]=='0'); //exportar
         btncimprimir.setEnabled(zmenu.P_CATEGORIA[3]=='0'); //imprimir
 }   
        
//Carga toda la configuracion de la ventana
              public void cargarconfig() throws ClassNotFoundException, SQLException {
                  //Cargar combo de Filtros
                  cbfiltro.addItem("DESCRIPCION");
                  cbfiltro.addItem("IDCATEGORIA");                  
                  cbfiltro.addItem("DIARETIRO");
                  cbfiltro.addItem("FLEJE");
                  //Desabilitar campos producto
                  setEnabledDatosP(false);
                  txcategoria_id.setEnabled(false);
                  cargaopcion();
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txcategoria_id.setText(lsttablacategorias.getValueAt(lsttablacategorias.getSelectedRow(), 0).toString());
            txcategoria_descripcion.setText(lsttablacategorias.getValueAt(lsttablacategorias.getSelectedRow(), 1).toString());
            txcategoria_diaretiro.setText(lsttablacategorias.getValueAt(lsttablacategorias.getSelectedRow(), 2).toString());
            txcategoria_fleje.setText(lsttablacategorias.getValueAt(lsttablacategorias.getSelectedRow(), 4).toString());
    }


}
