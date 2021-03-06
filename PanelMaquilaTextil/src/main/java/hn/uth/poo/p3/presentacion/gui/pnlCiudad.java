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
        pnlEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        btnActualizar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(48, 34, 84));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-actualizar-16.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnActualizar.setBorderPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnLeer.setForeground(new java.awt.Color(48, 34, 84));
        btnLeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lectura-16.png"))); // NOI18N
        btnLeer.setText("Leer");
        btnLeer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLeer.setBorderPainted(false);
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(48, 34, 84));
        lblCodigo.setText("Codigo:");

        txtCodCiudad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCodCiudad.setEnabled(false);

        lblNomCiudad.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        lblNomCiudad.setForeground(new java.awt.Color(48, 34, 84));
        lblNomCiudad.setText("Nombre:");

        txtNomCiudad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnGuardar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(48, 34, 84));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-guardar-16.png"))); // NOI18N
        btnGuardar.setText("Crear");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(48, 34, 84));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eliminar-16.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(48, 34, 84));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-búsqueda-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setOpaque(false);

        tblDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        tblDatos.setCellSelectionEnabled(true);
        tblDatos.setGridColor(new java.awt.Color(179, 179, 179));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        pnlEncabezado.setBackground(new java.awt.Color(48, 34, 84));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 243, 243));
        jLabel1.setText("Ciudad");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ciudad-64.png"))); // NOI18N

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomCiudad)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(txtNomCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomCiudad)
                    .addComponent(txtNomCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLeer))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNomCiudad;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCodCiudad;
    private javax.swing.JTextField txtNomCiudad;
    // End of variables declaration//GEN-END:variables
}
