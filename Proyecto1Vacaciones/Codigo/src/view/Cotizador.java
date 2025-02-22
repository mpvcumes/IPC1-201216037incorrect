/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BitacoraAseguradora;
import controller.BitacoraVehículos;
import controller.CalculadoraCotizador;
import controller.ColaCotizacion;
import javax.swing.JOptionPane;
/**
 *
 * @author myria
 */
public class Cotizador extends javax.swing.JFrame {
    
    BitacoraAseguradora ba;
    BitacoraVehículos bv;
    CalculadoraCotizador cc;
    ColaCotizacion cola;
    int contadorDeducibleMas=0;
    int contadorDeducibleMenos=0;
    /**
     * Creates new form Aseguradora
     * @param ba
     * @param bv
     */
    public Cotizador(BitacoraAseguradora ba, BitacoraVehículos bv, ColaCotizacion cola) {
        this.ba = ba;
        this.bv = bv;
        this.cola = cola;
     
        
       
        
        initComponents();
        this.cBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(bv.getTipo()));
        this.cBoxUso.setModel(new javax.swing.DefaultComboBoxModel<>(bv.getUso()));
        this.cBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(bv.getMarca()));
        this.cBoxLinea.setModel(new javax.swing.DefaultComboBoxModel<>(bv.getLinea()));
        this.cBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(bv.getModeloString()));
        this.btnSolicitarSeguro.setEnabled(false);
       
        
       
        
                
    }

    public Cotizador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDPI = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCostoPrima = new javax.swing.JTextField();
        txtDeducible = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPosibleCostoPrima = new javax.swing.JTextField();
        txtPosibleDeducible = new javax.swing.JTextField();
        btnDeducibleMenos = new javax.swing.JButton();
        btnDeducibleMas = new javax.swing.JButton();
        btnSolicitarSeguro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cBoxMarca = new javax.swing.JComboBox<>();
        cBoxLinea = new javax.swing.JComboBox<>();
        cBoxModelo = new javax.swing.JComboBox<>();
        cBoxTipo = new javax.swing.JComboBox<>();
        cBoxUso = new javax.swing.JComboBox<>();
        txtValorVehiculo = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPIActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("DPI");

        jLabel4.setText("Telefono");

        jLabel5.setText("Tipo de vehiculo");

        jLabel6.setText("Uso del vehículo");

        jLabel7.setText("Marca");

        jLabel8.setText("Línea");

        jLabel9.setText("Modelo");

        jLabel10.setText("Valor del vehículo");

        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        jLabel11.setText("Costo Prima ");

        jLabel12.setText("Deducible");

        txtCostoPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoPrimaActionPerformed(evt);
            }
        });

        txtDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeducibleActionPerformed(evt);
            }
        });

        jLabel13.setText("Posible Costo Prima");

        jLabel14.setText("Posible Deducible");

        txtPosibleDeducible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosibleDeducibleActionPerformed(evt);
            }
        });

        btnDeducibleMenos.setText("-Deducible");
        btnDeducibleMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeducibleMenosActionPerformed(evt);
            }
        });

        btnDeducibleMas.setText("+Deducible");
        btnDeducibleMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeducibleMasActionPerformed(evt);
            }
        });

        btnSolicitarSeguro.setText("SOLICITAR SEGURO");
        btnSolicitarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarSeguroActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxMarcaActionPerformed(evt);
            }
        });

        cBoxLinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxLineaActionPerformed(evt);
            }
        });

        cBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxTipoActionPerformed(evt);
            }
        });
        cBoxTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cBoxTipoKeyPressed(evt);
            }
        });

        cBoxUso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBoxUso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxUsoActionPerformed(evt);
            }
        });
        cBoxUso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cBoxUsoKeyPressed(evt);
            }
        });

        txtValorVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(106, 106, 106))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(131, 131, 131)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cBoxTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxMarca, javax.swing.GroupLayout.Alignment.TRAILING, 0, 230, Short.MAX_VALUE)
                            .addComponent(cBoxLinea, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxUso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPosibleCostoPrima)
                                    .addComponent(txtPosibleDeducible, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(51, 51, 51)
                .addComponent(txtDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDeducibleMenos)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeducibleMas)
                        .addGap(34, 34, 34)
                        .addComponent(btnSolicitarSeguro)
                        .addGap(48, 48, 48)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnCotizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cBoxUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cBoxLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnCotizar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(txtPosibleCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtPosibleDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeducibleMenos)
                            .addComponent(btnDeducibleMas)
                            .addComponent(btnSolicitarSeguro)
                            .addComponent(btnCancelar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeducibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeducibleActionPerformed
 
    private void txtCostoPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoPrimaActionPerformed

    private void txtPosibleDeducibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosibleDeducibleActionPerformed
      
    }//GEN-LAST:event_txtPosibleDeducibleActionPerformed

    private void btnDeducibleMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeducibleMenosActionPerformed
        contadorDeducibleMenos++;
        float valorVehiculo= Float.parseFloat(txtValorVehiculo.getText());
        float percentageMarca= bv.getPorcentajeMarca(cBoxMarca.getSelectedItem().toString());
        float percentageLinea=bv.getPorcentajeLinea(cBoxLinea.getSelectedItem().toString());
        float percentageUso= bv.getPorcentajeUso(cBoxUso.getSelectedItem().toString());
        CalculadoraCotizador cal = new CalculadoraCotizador(valorVehiculo, percentageMarca,percentageLinea,percentageUso,contadorDeducibleMenos,0);
        System.out.println("La prima calculada es:"+cal.prima());
        System.out.println("El deducible calculado es:"+ cal.deducible());
        txtPosibleCostoPrima.setText(null);
        txtPosibleCostoPrima.setText(String.valueOf(cal.menosDeduciblePrima()));
        txtPosibleDeducible.setText(null);
        txtPosibleDeducible.setText(String.valueOf(cal.menosDeducible()));
    }//GEN-LAST:event_btnDeducibleMenosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        float valorEstablecido= bv.getValorTipo(cBoxTipo.getSelectedItem().toString()) ;
        float porcentajeDepreciacion= bv.getValorModelo(cBoxModelo.getSelectedItem().toString()) ;
        CalculadoraCotizador val= new CalculadoraCotizador(valorEstablecido, porcentajeDepreciacion);
        System.out.println(cBoxModelo.getSelectedItem().toString());
        if (Integer.parseInt(txtValorVehiculo.getText()) < val.valorReal() ){
            float valorVehiculo= Float.parseFloat(txtValorVehiculo.getText());
            float percentageMarca= bv.getPorcentajeMarca(cBoxMarca.getSelectedItem().toString());
            float percentageLinea=bv.getPorcentajeLinea(cBoxLinea.getSelectedItem().toString());
            float percentageUso= bv.getPorcentajeUso(cBoxUso.getSelectedItem().toString());
            CalculadoraCotizador cal = new CalculadoraCotizador(valorVehiculo, percentageMarca,percentageLinea,percentageUso);
            System.out.println("La prima calculada es:"+cal.prima());
            System.out.println("El deducible calculado es:"+ cal.deducible());
            txtCostoPrima.setText(String.valueOf(cal.prima()));
            txtDeducible.setText(String.valueOf(cal.deducible()));
            txtPosibleCostoPrima.setText(String.valueOf(cal.prima()));
            txtPosibleDeducible.setText(String.valueOf(cal.deducible()));
            this.btnSolicitarSeguro.setEnabled(true);
            /* IF si no tiene valor el TextField de cotizar */
        }else {
            JOptionPane.showMessageDialog(null, "El valor del vehículo ingresado no puedes ser mayor a "+val.valorReal());
            txtValorVehiculo.setText("");
        }
        

        
        
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPIActionPerformed
    }//GEN-LAST:event_txtDPIActionPerformed

    private void btnSolicitarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarSeguroActionPerformed

      
        String Nombres         = txtNombre.getText();
        String Apellidos       = txtApellido.getText();
        String TipoVehiculo    = (this.cBoxTipo.getSelectedItem().toString());
        String UsoVehiculo     = (this.cBoxUso.getSelectedItem().toString());
        String Marca           = (this.cBoxMarca.getSelectedItem().toString());
        String Linea           = this.cBoxLinea.getSelectedItem().toString();
        int Telefono           = Integer.parseInt(txtTelefono.getText());
        int Modelo             = Integer.parseInt(this.cBoxModelo.getSelectedItem().toString());
        int Rol                = 0;
        int Estado             = 0;
        float DPI              = Float.parseFloat(txtDPI.getText());        
        float ValorVehiculo    = Float.parseFloat(txtValorVehiculo.getText());
        float Prima            = Float.parseFloat(txtCostoPrima.getText());
        float Deducible        = Float.parseFloat(txtDeducible.getText());
        float PosiblePrima     = Float.parseFloat(txtPosibleCostoPrima.getText());
        float PosibleDeducible = Float.parseFloat(txtPosibleDeducible.getText());
            
      /* Validar que todos que no esten nulos */
                
        cola.anadirCotizacion(Nombres, Apellidos, TipoVehiculo, UsoVehiculo, Marca, Linea, Telefono, Modelo, Rol, Estado, DPI, ValorVehiculo, Prima, Deducible, PosiblePrima, PosibleDeducible);                      
        
        
        JOptionPane.showMessageDialog(null, "La cotización ha sido enviada exitosamente!");
        btnCancelar.doClick();
        
       // ba.anadirUsuario("Miriam Pricsila", "Velasquez", 123, 123456);
    }//GEN-LAST:event_btnSolicitarSeguroActionPerformed

    private void cBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxMarcaActionPerformed
        System.out.println("Hola mundo");
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxMarcaActionPerformed

    private void cBoxTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBoxTipoKeyPressed
        
    }//GEN-LAST:event_cBoxTipoKeyPressed

    private void cBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxTipoActionPerformed

    private void cBoxLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxLineaActionPerformed

    private void cBoxUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxUsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxUsoActionPerformed

    private void cBoxUsoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBoxUsoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxUsoKeyPressed

    private void txtValorVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorVehiculoActionPerformed

    private void btnDeducibleMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeducibleMasActionPerformed
        contadorDeducibleMas++;
        float valorVehiculo= Float.parseFloat(txtValorVehiculo.getText());
        float percentageMarca= bv.getPorcentajeMarca(cBoxMarca.getSelectedItem().toString());
        float percentageLinea=bv.getPorcentajeLinea(cBoxLinea.getSelectedItem().toString());
        float percentageUso= bv.getPorcentajeUso(cBoxUso.getSelectedItem().toString());
        CalculadoraCotizador cal = new CalculadoraCotizador(valorVehiculo, percentageMarca,percentageLinea,percentageUso, 1, contadorDeducibleMas);
        System.out.println("La prima calculada es:"+cal.prima());
        System.out.println("El deducible calculado es:"+ cal.deducible());
        txtPosibleCostoPrima.setText(null);
        txtPosibleCostoPrima.setText(String.valueOf(cal.masDeduciblePrima()));
        txtPosibleDeducible.setText(null);
        txtPosibleDeducible.setText(String.valueOf(cal.masDeducible()));       
    }//GEN-LAST:event_btnDeducibleMasActionPerformed

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
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
               
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cotizador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnDeducibleMas;
    private javax.swing.JButton btnDeducibleMenos;
    private javax.swing.JButton btnSolicitarSeguro;
    private javax.swing.JComboBox<String> cBoxLinea;
    private javax.swing.JComboBox<String> cBoxMarca;
    private javax.swing.JComboBox<String> cBoxModelo;
    private javax.swing.JComboBox<String> cBoxTipo;
    private javax.swing.JComboBox<String> cBoxUso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCostoPrima;
    private javax.swing.JTextField txtDPI;
    private javax.swing.JTextField txtDeducible;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPosibleCostoPrima;
    private javax.swing.JTextField txtPosibleDeducible;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValorVehiculo;
    // End of variables declaration//GEN-END:variables
}
