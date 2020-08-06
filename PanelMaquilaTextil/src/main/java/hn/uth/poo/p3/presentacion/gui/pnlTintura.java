/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.presentacion.gui;

import hn.uth.poo.p3.negocio.Tintura.TinturaNegocio;
import hn.uth.poo.p3.recursos.clases.Tintura;
import java.awt.HeadlessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARLON HERNANDEZ
 */
public class pnlTintura extends javax.swing.JPanel {
    
    DefaultTableModel modelo;

    
    /**
     * Creates new form pnlTintura
     */
    public pnlTintura() {
        initComponents();
        inicio();
        Leer();
    }
    
    private void inicio() {
        txtCodTintura.setText("0");
        modelo = (DefaultTableModel) tblDatos.getModel();
    }
    
    private void Leer() {
        try {
            List<Tintura> listaTintura = new TinturaNegocio().Leer();
            modelo.setRowCount(0);
            for (Tintura tintura : listaTintura) {
                Object[] registroLeido = {tintura.getCodTintura(), tintura.getDesTintura()};
                modelo.addRow(registroLeido);

            }
            tblDatos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCodTintura = new javax.swing.JLabel();
        txtCodTintura = new javax.swing.JTextField();
        lblDesTintura = new javax.swing.JLabel();
        txtDesTintura = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(48, 34, 84));
        lblTitulo.setText("Mantinimiento Tintura");

        lblCodTintura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodTintura.setForeground(new java.awt.Color(48, 34, 84));
        lblCodTintura.setText("Codigo:");

        lblDesTintura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDesTintura.setForeground(new java.awt.Color(48, 34, 84));
        lblDesTintura.setText("Descripcion:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(48, 34, 84));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(48, 34, 84));
        btnGuardar.setText("Crear");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(48, 34, 84));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(48, 34, 84));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLeer.setForeground(new java.awt.Color(48, 34, 84));
        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLeer))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDesTintura)
                                    .addComponent(lblCodTintura))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesTintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodTintura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodTintura)
                    .addComponent(txtCodTintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesTintura)
                    .addComponent(txtDesTintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLeer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Tintura tintura = new Tintura();
            tintura.setCodTintura(Integer.parseInt(txtCodTintura.getText())+1);
            tintura.setDesTintura(txtDesTintura.getText());
            String respuesta = new TinturaNegocio().Insertar(tintura);
            JOptionPane.showMessageDialog(null, "Guardado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Leer();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(pnlTintura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            Tintura tintura = new Tintura();
            tintura.setCodTintura(Integer.parseInt(txtCodTintura.getText()));
            tintura.setDesTintura(txtDesTintura.getText());
            new TinturaNegocio().Actualizar(tintura);
            JOptionPane.showMessageDialog(null, "Actualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Leer();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(pnlTintura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Tintura tintura = new Tintura();
            tintura.setCodTintura(Integer.parseInt(txtCodTintura.getText()));
            tintura.setDesTintura(txtDesTintura.getText());
            new TinturaNegocio().Eliminar(tintura);
            JOptionPane.showMessageDialog(null, "Eliminado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Leer();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(pnlTintura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
        Leer();
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {Tintura tintura = new Tintura();
            tintura.setDesTintura(txtDesTintura.getText());
            List<Tintura> listaTintura = new TinturaNegocio().Buscar(tintura);
            modelo.setRowCount(0);
            for (Tintura tintura1 : listaTintura) {
                Object[] registroLeido = {tintura1.getCodTintura(), tintura1.getDesTintura()};
                modelo.addRow(registroLeido);
            }
            tblDatos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodTintura;
    private javax.swing.JLabel lblDesTintura;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCodTintura;
    private javax.swing.JTextField txtDesTintura;
    // End of variables declaration//GEN-END:variables
}
