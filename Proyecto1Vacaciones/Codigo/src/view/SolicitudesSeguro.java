/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BitacoraAseguradora;
import controller.BitacoraVehículos;
import controller.BitacoraIncidente;
import controller.ColaCotizacion;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.event.TableModelListener;
import javax.swing.JTable;

/**
 *
 * @author myria
 */
public class SolicitudesSeguro extends javax.swing.JFrame {
    BitacoraAseguradora ba;
    BitacoraVehículos bv;
    BitacoraIncidente bi;
    ColaCotizacion cola;
    /**
     * Creates new form SolicitudesSeguro
     */
    public SolicitudesSeguro(BitacoraAseguradora ba, BitacoraVehículos bv, BitacoraIncidente bi, ColaCotizacion cola) {
        this.ba = ba;
        this.bv = bv;
        this.bi = bi;
        this.cola = cola;
                            
        initComponents();                
        
        tablaSolicitudes();
    }
    
   
    
    public SolicitudesSeguro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAprobar = new javax.swing.JButton();
        txtRechazar = new javax.swing.JButton();
        txtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solicitudes de Seguro");

        btnAprobar.setText("APROBAR");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        txtRechazar.setText("RECHAZAR");
        txtRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechazarActionPerformed(evt);
            }
        });

        txtCancelar.setText("CANCELAR");
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Solicitudes de seguro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnAprobar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRechazar)
                .addGap(285, 285, 285)
                .addComponent(txtCancelar)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAprobar)
                    .addComponent(txtRechazar)
                    .addComponent(txtCancelar))
                .addGap(645, 645, 645))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, column).toString();
        float DPI = Float.parseFloat(value);
        boolean resultado = cola.updateEstado(DPI);
        
        cola.mostrarCotizacion();
        
        if (resultado) {
            System.out.println("Seguro autorizado correctamente");
        }else{
            System.out.println("Seguro no autorizado");
        }
        
        cola.mostrarCotizacion();

        tablaSolicitudes();
        
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void txtRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechazarActionPerformed
        int column = 0;
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, column).toString();
        float DPI = Float.parseFloat(value);
        boolean resultado = cola.updateEstadoRechazo(DPI);
        
        cola.mostrarCotizacion();
        
        if (resultado) {
            System.out.println("Seguro rechazado correctamente");
        }else{
            System.out.println("Seguro no rechazado");
        }
        
        cola.mostrarCotizacion();

        tablaSolicitudes();
    }//GEN-LAST:event_txtRechazarActionPerformed

    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Administrator Admin = new Administrator(ba, bv, bi, cola);
        Admin.setVisible(true);
    }//GEN-LAST:event_txtCancelarActionPerformed

     public void tablaSolicitudes(){
    
        String nombreColumnas[] = {"DPI", "NOMBRE", "TELEFONO", "TIPO", "DESCRIPCION", "MONTO", "POLIZA", "DEDUCIBLE"};
        String data[][] = cola.getTable();        
        jTable1.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SolicitudesSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudesSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudesSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudesSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitudesSeguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprobar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JButton txtRechazar;
    // End of variables declaration//GEN-END:variables
}
