/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.presentacion.gui;

import hn.uth.poo.p3.negocio.ciudad.CiudadNegocio;
import hn.uth.poo.p3.recursos.clases.Ciudad;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maureen
 */
public class pnlCiudad extends javax.swing.JPanel {

    DefaultTableModel modelo;

    /**
     * Creates new form pnlCiudad
     */
    public pnlCiudad() {
        initComponents();
        inicio();
        Leer();
    }

    private void inicio() {
        txtCodCiudad.setText("0");
        modelo = (DefaultTableModel) tblDatos.getModel();
    }

    private void Leer() {
        try {
            List<Ciudad> listaCiudad = new CiudadNegocio().Leer();
            modelo.setRowCount(0);
            for (Ciudad ciudade : listaCiudad) {
                Object[] registroLeido = {ciudade.getCodCiudad(), ciudade.getNomCiudad()};
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

        btnActualizar = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtCodCiudad = new javax.swing.JTextField();
        lblNomCiudad = new javax.swing.JLabel();
        txtNomCiudad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();

        btnActualizar.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(48, 34, 84));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btnLeer.setForeground(new java.awt.Color(48, 34, 84));
        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(48, 34, 84));
        lblCodigo.setText("Codigo:");

        txtCodCiudad.setEnabled(false);

        lblNomCiudad.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        lblNomCiudad.setForeground(new java.awt.Color(48, 34, 84));
        lblNomCiudad.setText("Nombre:");

        btnGuardar.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(48, 34, 84));
        btnGuardar.setText("Crear");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(48, 34, 84));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(48, 34, 84));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblDatos.setForeground(new java.awt.Color(48, 34, 84));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
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
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        lblTitulo.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(48, 34, 84));
        lblTitulo.setText("Mantenimiento Ciudad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomCiudad)
                                .addGap(152, 152, 152)
                                .addComponent(btnBuscar))
                            .addComponent(lblCodigo)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(txtCodCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(txtNomCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeer))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblTitulo)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomCiudad)
                    .addComponent(txtNomCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLeer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            Ciudad ciudad = new Ciudad();
            ciudad.setCodCiudad(Integer.parseInt(txtCodCiudad.getText()));
            ciudad.setNomCiudad(txtNomCiudad.getText());
            new CiudadNegocio().Actualizar(ciudad);
            JOptionPane.showMessageDialog(null, "Actualizado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Leer();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
        Leer();
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Ciudad ciudad = new Ciudad();
            ciudad.setCodCiudad(Integer.parseInt(txtCodCiudad.getText())+1);
            ciudad.setNomCiudad(txtNomCiudad.getText());
            String respuesta = new CiudadNegocio().Insertar(ciudad);
            JOptionPane.showMessageDialog(null, "Guardado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Leer();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Ciudad ciudad = new Ciudad();
            ciudad.setCodCiudad(Integer.parseInt(txtCodCiudad.getText()));
            ciudad.setNomCiudad(txtNomCiudad.getText());
            new CiudadNegocio().Eliminar(ciudad);
            JOptionPane.showMessageDialog(null, "Eliminado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Leer();
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Ciudad ciudad = new Ciudad();
            ciudad.setNomCiudad(txtNomCiudad.getText());
            List<Ciudad> listaCiudad = new CiudadNegocio().Buscar(ciudad);
            modelo.setRowCount(0);
            for (Ciudad ciudad1 : listaCiudad) {
                Object[] registroLeido = {ciudad1.getCodCiudad(), ciudad1.getNomCiudad()};
                modelo.addRow(registroLeido);
            }
            tblDatos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        // TODO add your handling code here:atos
        int filaseleccionada = tblDatos.getSelectedRow();
        txtCodCiudad.setText(modelo.getValueAt(filaseleccionada, 0).toString());
        txtNomCiudad.setText(modelo.getValueAt(filaseleccionada, 1).toString());

    }//GEN-LAST:event_tblDatosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNomCiudad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCodCiudad;
    private javax.swing.JTextField txtNomCiudad;
    // End of variables declaration//GEN-END:variables
}
