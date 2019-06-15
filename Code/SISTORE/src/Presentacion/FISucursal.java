package Presentacion;

import AD.*;
import Entidades.*;
import static Presentacion.zmenu.P_PERFIL;
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
public final class FISucursal extends javax.swing.JInternalFrame {

    /**
     * Creates new form FIProductos
     * @throws java.text.ParseException
     */
    public FISucursal() throws ParseException {
        initComponents();
        try {
            cargarconfig();
            cargartabla();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FISucursal.class.getName()).log(Level.SEVERE, null, ex);
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
        txsucursal_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txsucursal_tienda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnperfil_fleje = new javax.swing.JButton();
        txsucursal_fleje = new javax.swing.JTextField();
        txsucursal_descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnperfil_fleje1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsttablaperfiles = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Sucursales");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de sucursales"));

        jLabel3.setText("ID");

        txsucursal_tienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txsucursal_tiendaKeyTyped(evt);
            }
        });

        jLabel5.setText("Tienda");

        jLabel11.setText("Fleje");

        btnperfil_fleje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnperfil_fleje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperfil_flejeActionPerformed(evt);
            }
        });

        txsucursal_fleje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txsucursal_flejeKeyTyped(evt);
            }
        });

        txsucursal_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txsucursal_descripcionKeyTyped(evt);
            }
        });

        jLabel6.setText("Descripcion");

        btnperfil_fleje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnperfil_fleje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperfil_fleje1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txsucursal_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txsucursal_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnperfil_fleje1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txsucursal_fleje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnperfil_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txsucursal_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txsucursal_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txsucursal_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txsucursal_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnperfil_fleje1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txsucursal_fleje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(btnperfil_fleje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txsucursal_tienda.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de sucursales"));

        lsttablaperfiles = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        lsttablaperfiles.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lsttablaperfiles.setModel(new javax.swing.table.DefaultTableModel(
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
        lsttablaperfiles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lsttablaperfiles.getTableHeader().setResizingAllowed(false);
        lsttablaperfiles.getTableHeader().setReorderingAllowed(false);
        lsttablaperfiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsttablaperfilesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsttablaperfiles);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
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

    private void lsttablaperfilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsttablaperfilesMouseClicked
             filaseleccionada = lsttablaperfiles.getSelectedRow();
             btnceditar.setEnabled(zmenu.P_PERFIL[1]=='0');
             pasarDatosFila();
    }//GEN-LAST:event_lsttablaperfilesMouseClicked

    private void btncnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncnuevoActionPerformed
    setEnabledDatosP(zmenu.P_PERFIL[0]=='0'); //Verificar si puede crear
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
        s = new TableRowSorter(lsttablaperfiles.getModel());
        lsttablaperfiles.setRowSorter(s);

    }//GEN-LAST:event_txcdetalleKeyTyped

    private void btncguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncguardarActionPerformed
        try {
            if (txsucursal_id.getText().isEmpty()||txsucursal_tienda.getText().isEmpty())
                     {
                JOptionPane.showInternalMessageDialog(internal, "Debe completar todos los campos","Validar datos",JOptionPane.WARNING_MESSAGE); 
            }
            else{
                                Perfil p = new Perfil();
                                p.setIDPERFIL(Integer.parseInt(txsucursal_id.getText()));
                                p.setDESCRIPCION(txsucursal_tienda.getText().toUpperCase());
                                p.setFLGELI(txsucursal_fleje.getText().charAt(0));
                                if (ADPerfil.Guardar(p)) {
                                JOptionPane.showInternalMessageDialog(internal, "Se guardaron cambios","Exito",JOptionPane.INFORMATION_MESSAGE);
                                cargartabla();
                                limpiarcampos();
                                txcdetalle.setText("");
                                txsucursal_id.setText("");
                                txcdetalle.requestFocus();
                                setEnabledDatosP(false);
                                }else{
                                JOptionPane.showInternalMessageDialog(internal, "Intente nuevamente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);      
                                }
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(FISucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncguardarActionPerformed

    private void btnceditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceditarActionPerformed
                      
        try{
            //Guardamos en un entero la fila seleccionada.
            if (lsttablaperfiles.getSelectedRow()<0){
                JOptionPane.showInternalMessageDialog(internal, "Selecciona una fila","Validar datos",JOptionPane.INFORMATION_MESSAGE);
            } else {
                    pasarDatosFila();
                    setEnabledDatosP(zmenu.P_PERFIL[1]=='0'); //Verificar si puede modificar
            }
        }catch (HeadlessException ex){
            JOptionPane.showInternalMessageDialog(internal, "Error inesperado, intente más tarde","Validar datos",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnceditarActionPerformed
public static String perfil_titulo;
public static int perfil_idtabla;
    private void btnperfil_flejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperfil_flejeActionPerformed
        try {
            perfil_idtabla=103; //tabla flgeli
            perfil_titulo="Fleje";
            FIDPerfilTD d=new FIDPerfilTD();
            d.setModal(true);
            internal.add(d);
            d.setLocation((internal.getWidth()-d.getWidth())/2,(internal.getHeight()-d.getHeight())/2);
            d.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FISucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnperfil_flejeActionPerformed

    private void btncexportaexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncexportaexcelActionPerformed
        try {
            ExportarExcel obj = new ExportarExcel();
            JTable tablatemp = new JTable();
            String[] columnas = {"IDPERFIL","DESCRIPCION","FLEJE"};  
            String copiatemp [] = new String[3];
            DefaultTableModel mtablatemp =new DefaultTableModel (null,columnas);
            for (int f = 0; f < lsttablaperfiles.getRowCount(); f++) {
                    copiatemp[0]=lsttablaperfiles.getModel().getValueAt(lsttablaperfiles.convertRowIndexToModel(f), 0).toString();
                    copiatemp[1]=lsttablaperfiles.getModel().getValueAt(lsttablaperfiles.convertRowIndexToModel(f), 1).toString();
                    copiatemp[2]=lsttablaperfiles.getModel().getValueAt(lsttablaperfiles.convertRowIndexToModel(f), 2).toString();
     
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
                     lsttablaperfiles.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
                                         
                     
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido imprimir correctamente, intentalo más tarde.");
            }  
    }//GEN-LAST:event_btncimprimirActionPerformed

    private void txsucursal_tiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txsucursal_tiendaKeyTyped
 new dashtyped().control_maxdigitos(evt, txsucursal_tienda, 40);
    }//GEN-LAST:event_txsucursal_tiendaKeyTyped

    private void txsucursal_flejeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txsucursal_flejeKeyTyped
new dashtyped().control_cero_uno(evt, txsucursal_fleje);
    }//GEN-LAST:event_txsucursal_flejeKeyTyped

    private void txsucursal_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txsucursal_descripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txsucursal_descripcionKeyTyped

    private void btnperfil_fleje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperfil_fleje1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnperfil_fleje1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnceditar;
    private javax.swing.JButton btncexportaexcel;
    private javax.swing.JButton btncguardar;
    private javax.swing.JButton btncimprimir;
    private javax.swing.JButton btncnuevo;
    private javax.swing.JButton btnperfil_fleje;
    private javax.swing.JButton btnperfil_fleje1;
    private javax.swing.JComboBox<String> cbfiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable lsttablaperfiles;
    private javax.swing.JTextField txcdetalle;
    private javax.swing.JTextField txsucursal_descripcion;
    public static javax.swing.JTextField txsucursal_fleje;
    private javax.swing.JTextField txsucursal_id;
    private javax.swing.JTextField txsucursal_tienda;
    // End of variables declaration//GEN-END:variables

public void limpiarcampos(){
    txsucursal_id.setText("0");
    txsucursal_tienda.setText("");
    txsucursal_fleje.setText("");
    txsucursal_tienda.requestFocus();
}
  
    private void initabla() {
    String[] columnas = {"IDPERFIL","DESCRIPCION","FLEJE","FLGELI"};    
    modelo = new DefaultTableModel(null,columnas);
    s = new TableRowSorter(modelo);
    lsttablaperfiles.setModel(modelo);
    lsttablaperfiles.setRowSorter(s);
    
    //posiciones de tabla
    int posicion [] = {3};
        for (int i = 0; i < posicion.length; i++) {
            lsttablaperfiles.getColumnModel().getColumn(posicion[i]).setMaxWidth(0);
            lsttablaperfiles.getColumnModel().getColumn(posicion[i]).setMinWidth(0);
            lsttablaperfiles.getColumnModel().getColumn(posicion[i]).setPreferredWidth(0);
        }

    //tamaños de columnas de tabla    
    lsttablaperfiles.getColumnModel().getColumn(0).setPreferredWidth(80);
    lsttablaperfiles.getColumnModel().getColumn(1).setPreferredWidth(250);
    lsttablaperfiles.getColumnModel().getColumn(2).setPreferredWidth(80);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    lsttablaperfiles.setRowSorter(sorteo);
    }
    
        public void setEnabledDatosP(boolean estado){
            txsucursal_tienda.setEnabled(estado);
            txsucursal_fleje.setEnabled(estado);
            btnperfil_fleje.setEnabled(estado);
            btncguardar.setEnabled(estado);
        }
        int columnaABuscar = 0;
        //Filtro de combo para busqueda
        public void filtro() {
            
        if ("IDPERFIL".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 0;
        }
        if ("DESCRIPCION".equals(cbfiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
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
                 for (Perfil p : ADPerfil.Listacompleta()) {
                     modelo.addRow(p.DatosArray());
                 }
                 lsttablaperfiles.setModel(modelo);
             }catch(ClassNotFoundException | NumberFormatException | SQLException e){
             JOptionPane.showMessageDialog(this, e);
             }
        }
 //Carga las opciones de la ventana
 public void cargaopcion(){
         btncnuevo.setEnabled(zmenu.P_PERFIL[0]=='0');  //nuevo 
         btncexportaexcel.setEnabled(zmenu.P_PERFIL[2]=='0'); //exportar
         btncimprimir.setEnabled(zmenu.P_PERFIL[3]=='0'); //imprimir
 }   
        
//Carga toda la configuracion de la ventana
              public void cargarconfig() throws ClassNotFoundException, SQLException {
                  //Cargar combo de Filtros
                  cbfiltro.addItem("DESCRIPCION");
                  cbfiltro.addItem("IDPERFIL");                  
                  cbfiltro.addItem("FLEJE");
                  //Desabilitar campos producto
                  setEnabledDatosP(false);
                  txsucursal_id.setEnabled(false);
                  cargaopcion();
              
              }
//Obtener datos de tabla y pasarlas a fila
    private void pasarDatosFila() {
            txsucursal_id.setText(lsttablaperfiles.getValueAt(lsttablaperfiles.getSelectedRow(), 0).toString());
            txsucursal_tienda.setText(lsttablaperfiles.getValueAt(lsttablaperfiles.getSelectedRow(), 1).toString());
            txsucursal_fleje.setText(lsttablaperfiles.getValueAt(lsttablaperfiles.getSelectedRow(), 3).toString());
    }


}
