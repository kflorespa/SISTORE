/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AD.ADCategoria;
import AD.ADTabladetalle;
import Entidades.Categoria;
import Entidades.Tabladetalle;
import static Presentacion.FIProductos.idtabla;
import java.awt.AWTEvent;
import java.awt.ActiveEvent;
import java.awt.Component;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author KFLORES
 */
public class FIDTabladetalle extends javax.swing.JInternalFrame{

    /**
     * Creates new form FIDTabladetalle
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    
    public FIDTabladetalle() throws ClassNotFoundException, SQLException {
        initComponents();
        cargardatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cbcondicion = new javax.swing.JComboBox<>();
        txbusqueda = new javax.swing.JTextField();
        cbcolumna = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setFrameIcon(null);

        tabladetalle = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        tabladetalle.getTableHeader().setResizingAllowed(false);
        tabladetalle.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabladetalle);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        cbcondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contiene", "Es igual", "=/=", ">", "<" }));

        cbcolumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descripción", "Código", "Fleje" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbcolumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbcondicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcolumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/check.png"))); // NOI18N
        jButton1.setText("Aplicar");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/no-check.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

// indica si aquest es modal o no.
    boolean modal = false;

    @Override
    public void show() {
        super.show();
        if (this.modal) {
            startModal();
        }
    }

    @Override
    public void setVisible(boolean value) {
        super.setVisible(value);
        if (modal) {
            if (value) {
                startModal();
            } else {
                stopModal();
            }
        }
    }

    private synchronized void startModal() {

        try {
            if (SwingUtilities.isEventDispatchThread()) {
                java.awt.EventQueue theQueue = getToolkit().getSystemEventQueue();
                while (isVisible()) {
                    AWTEvent event = theQueue.getNextEvent();
                    Object source = event.getSource();
                    boolean dispatch = true;

                    if (event instanceof MouseEvent) {
                        MouseEvent e = (MouseEvent) event;
                        MouseEvent m =
                                SwingUtilities.convertMouseEvent((Component) e.getSource(), e, this);
                        if (!this.contains(m.getPoint()) && e.getID() != MouseEvent.MOUSE_DRAGGED) {
                            dispatch = false;
                        }
                    }

                    if (dispatch) {
                        if (event instanceof ActiveEvent) {
                            ((ActiveEvent) event).dispatch();
                        } else if (source instanceof Component) {
                            ((Component) source).dispatchEvent(
                                    event);
                        } else if (source instanceof MenuComponent) {
                            ((MenuComponent) source).dispatchEvent(
                                    event);
                        } else {
                            System.err.println(
                                    "Unable to dispatch: " + event);
                        }
                    }
                }
            } else {
                while (isVisible()) {
                    wait();
                }
            }
        } catch (InterruptedException ignored) {
        }

    }

    private synchronized void stopModal() {
        notifyAll();
    }

    public void setModal(boolean modal) {
        this.modal = modal;
    }

    public boolean isModal() {
        return this.modal;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcolumna;
    private javax.swing.JComboBox<String> cbcondicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txbusqueda;
    // End of variables declaration//GEN-END:variables
    
    TableRowSorter s;
    DefaultTableModel modelo;
    
    private void cargardatos() throws ClassNotFoundException, SQLException {
    String[] columnas = {"Código","Tabla","Descripción","Fleje"};    
    modelo = new DefaultTableModel(null,columnas); 
    s = new TableRowSorter(modelo);
    
    tabladetalle.setModel(modelo);
    tabladetalle.setRowSorter(s);
    
    tabladetalle.removeColumn(tabladetalle.getColumnModel().getColumn(1));
    //tabladetalle.getColumnModel().getColumn(0).setPreferredWidth(25);
    tabladetalle.getColumnModel().getColumn(1).setPreferredWidth(200);
    TableRowSorter<DefaultTableModel> sorteo = new TableRowSorter<> (modelo);
    tabladetalle.setRowSorter(sorteo);
    
        if (idtabla!=0) {
    for (Tabladetalle c : ADTabladetalle.Listar()) {
    if (c.getIDTABLA()==idtabla) {
    modelo.addRow(c.DatosArray());
    }
    }  
        }else{
    for (Categoria c : ADCategoria.Listar()) {
    modelo.addRow(c.DatosArray());
    }         
        }
    }
}
