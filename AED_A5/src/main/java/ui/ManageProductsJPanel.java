/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.Supplier.Supplier;

/**
 *
 * @author rishikabhat
 */
public class ManageProductsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Supplier selectedsupplier;
    Product selectedproduct;
    
    /**
     * Creates new form ManageProductsJPanel
     */
    public ManageProductsJPanel(Business business, JPanel userProcessContainer) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        initializeTable();
        refreshTable();
    }
    
    public void initializeTable() {

        //clear supplier table
        SuppliersComboBox.removeAllItems();

        int rc = SupplierCatalogTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) SupplierCatalogTable.getModel()).removeRow(i);
        }
        //load suppliers to the combobox

        ArrayList<Supplier> supplierlist = business.getSupplierDirectory().getSuplierList();

        if (supplierlist.isEmpty()) {
            return;
        }
        for (Supplier s : supplierlist) {
            SuppliersComboBox.addItem(s.toString());
            SuppliersComboBox.setSelectedIndex(0);

            String suppliername = (String) SuppliersComboBox.getSelectedItem();

            selectedsupplier = business.getSupplierDirectory().findSupplier(suppliername);

            ProductCatalog pc = selectedsupplier.getProductCatalog();

            for (Product pt : pc.getProductList()) {

                Object[] row = new Object[5];
                row[0] = pt;
                row[1] = pt.getFloorPrice();
                row[2] = pt.getCeilingPrice();
                row[3] = pt.getTargetPrice();
                row[4] = pt.getOrderPricePerformance();
                // row[2] = la.getName();
                ((DefaultTableModel) SupplierCatalogTable.getModel()).addRow(row);
            }

        }
    }

    public void refreshTable() {

//clear supplier table
        int rc = SupplierCatalogTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) SupplierCatalogTable.getModel()).removeRow(i);
        }

        String suppliername = (String) SuppliersComboBox.getSelectedItem();

        selectedsupplier = business.getSupplierDirectory().findSupplier(suppliername);
        if (selectedsupplier == null) {
            return;
        }
        ProductCatalog pc = selectedsupplier.getProductCatalog();

        for (Product pt : pc.getProductList()) {

            Object[] row = new Object[5];
            row[0] = pt;
            row[1] = pt.getFloorPrice();
            row[2] = pt.getCeilingPrice();
            row[3] = pt.getTargetPrice();
            row[4] = pt.getOrderPricePerformance();
            ((DefaultTableModel) SupplierCatalogTable.getModel()).addRow(row);
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

        SuppliersComboBox = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierCatalogTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3 = new javax.swing.JLabel();
        productNameTextField = new javax.swing.JTextField();
        productFrequencyAboveTargetTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productRevenueTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productFrequencyBelowTargetTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productPricePerformanceTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDecTarget = new javax.swing.JButton();
        btnIncTarget = new javax.swing.JButton();
        lblUpdateTarget = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtUpdateTarget = new javax.swing.JTextField();
        txtTarget = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setBackground(new java.awt.Color(255, 255, 255));

        SuppliersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppliersComboBoxActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Next.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Next.setText("Update Target");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Suppliers");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Products List");

        SupplierCatalogTable.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        SupplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Floor", "Ceiling", "Target", "Price Performance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SupplierCatalogTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierCatalogTable);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PRODUCT CATALOG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SuppliersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnDecTarget)
                                            .addGap(50, 50, 50)
                                            .addComponent(btnIncTarget))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(productPricePerformanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblUpdateTarget)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUpdateTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSave))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(productFrequencyAboveTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(productFrequencyBelowTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SuppliersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(388, 388, 388)))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SuppliersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Next)
                .addGap(31, 31, 31))
                .addContainerGap(55, Short.MAX_VALUE))

                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next)
                    .addComponent(lblUpdateTarget)
                    .addComponent(btnSave)
                    .addComponent(txtUpdateTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productFrequencyBelowTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productFrequencyAboveTargetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productRevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPricePerformanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecTarget)
                    .addComponent(btnIncTarget))
                .addContainerGap(74, Short.MAX_VALUE))

        );
    }// </editor-fold>//GEN-END:initComponents

    private void SuppliersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppliersComboBoxActionPerformed
        // TODO add your handling code here:

        refreshTable();
        //String sname = (String) SuppliersComboBox.getSelectedItem();
        //selectedsupplier = business.getSupplierDirectory().findSupplier(sname);

    }//GEN-LAST:event_SuppliersComboBoxActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:

        int selectedRow = SupplierCatalogTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedRow, 0);
        if (selectedproduct == null) {
            return;
        }

        ChangeTargetJPanel mpjp = new ChangeTargetJPanel(business, userProcessContainer, selectedproduct);
        userProcessContainer.add("ChangeTargetJPanel", mpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


        JOptionPane.showMessageDialog(this, selectedproduct.toString());
//        ChangeTargetJPanel mpjp = new ChangeTargetJPanel(business, userProcessContainer, selectedproduct);
//        userProcessContainer.add("ChangeTargetJPanel", mpjp);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);

    }//GEN-LAST:event_NextActionPerformed

    private void SupplierCatalogTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierCatalogTableMouseEntered

    private void SupplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierCatalogTableMousePressed
        // TODO add your handling code here:
        int suppliertablesize = SupplierCatalogTable.getRowCount();
        int selectedrow = SupplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > suppliertablesize - 1) {
            return;
        }
        selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedrow, 0);
        if (selectedproduct == null) {
            return;
        }

        ProductSummary productsummary = new ProductSummary(selectedproduct);

//        productNameTextField.setText(selectedproduct.toString());
//        String revenues = String.valueOf(productsummary.getSalesRevenues());
//        productRevenueTextField.setText(revenues);
//        productFrequencyAboveTargetTextField.setText( String.valueOf(productsummary.getNumberAboveTarget()));
//        productFrequencyBelowTargetTextField.setText( String.valueOf(productsummary.getNumberBelowTarget()));
//        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));
//        txtTarget.setText(String.valueOf(selectedproduct.getTargetPrice()));

    }//GEN-LAST:event_SupplierCatalogTableMousePressed



    }//GEN-LAST:event_SupplierCatalogTableMousePressed

//private void adjustTargetPricesLower() {
//    ProductCatalog pc = selectedsupplier.getProductCatalog();
//    for (Product product : pc.getProductList()) {
//        if (product.getOrderPricePerformance() < 0) { // Assuming negative performance indicates actual sales below target
//            int newTargetPrice = product.getTargetPrice() - (int)(product.getTargetPrice() * 0.05); // Lower by 5%
//            product.setTargetPrice(newTargetPrice);
//        }
//    }
//    refreshTable(); // Refresh the table to display updated prices
//}
//
//private void adjustTargetPricesHigher() {
//    ProductCatalog pc = selectedsupplier.getProductCatalog();
//    for (Product product : pc.getProductList()) {
//        if (product.getOrderPricePerformance() > 0) { // Assuming positive performance indicates actual sales above target
//            int newTargetPrice = product.getTargetPrice() + (int)(product.getTargetPrice() * 0.05); // Increase by 5%
//            product.setTargetPrice(newTargetPrice);
//        }
//    }
//    refreshTable(); // Refresh the table to display updated prices
//}
        productNameTextField.setText(selectedproduct.toString());
        String revenues = String.valueOf(productsummary.getSalesRevenues());
        productRevenueTextField.setText(revenues);
        productFrequencyAboveTargetTextField.setText( String.valueOf(productsummary.getNumberAboveTarget()));
        productFrequencyBelowTargetTextField.setText( String.valueOf(productsummary.getNumberBelowTarget()));
        productPricePerformanceTextField.setText(String.valueOf(productsummary.getProductPricePerformance()));
        txtTarget.setText(String.valueOf(selectedproduct.getTargetPrice()));
    }//GEN-LAST:event_SupplierCatalogTableMousePressed

    private void productNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextFieldActionPerformed

    private void productRevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productRevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productRevenueTextFieldActionPerformed

    private void productPricePerformanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPricePerformanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPricePerformanceTextFieldActionPerformed

    private void btnDecTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecTargetActionPerformed
        // TODO add your handling code here:     
        adjustTargetPricesLower();

    }//GEN-LAST:event_btnDecTargetActionPerformed

    private void btnIncTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncTargetActionPerformed
        // TODO add your handling code here:
        adjustTargetPricesHigher();
    }//GEN-LAST:event_btnIncTargetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRow = SupplierCatalogTable.getSelectedRow();
        selectedproduct = (Product) SupplierCatalogTable.getValueAt(selectedRow, 0);
        if(selectedproduct == null) return;
        
        selectedproduct.setTargetPrice(Integer.parseInt(txtUpdateTarget.getText()));
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTargetActionPerformed

private void adjustTargetPricesLower() {
    ProductCatalog pc = selectedsupplier.getProductCatalog();
    for (Product product : pc.getProductList()) {
        if (product.getOrderPricePerformance() < 0) { // Assuming negative performance indicates actual sales below target
            int newTargetPrice = product.getTargetPrice() - (int)(product.getTargetPrice() * 0.05); // Lower by 5%
            product.setTargetPrice(newTargetPrice);
        }
    }
    refreshTable(); // Refresh the table to display updated prices
}

private void adjustTargetPricesHigher() {
    ProductCatalog pc = selectedsupplier.getProductCatalog();
    for (Product product : pc.getProductList()) {
        if (product.getOrderPricePerformance() > 0) { // Assuming positive performance indicates actual sales above target
            int newTargetPrice = product.getTargetPrice() + (int)(product.getTargetPrice() * 0.05); // Increase by 5%
            product.setTargetPrice(newTargetPrice);
        }
    }
    refreshTable(); // Refresh the table to display updated prices
}
    }//GEN-LAST:event_SupplierCatalogTableMousePressed


//private void adjustTargetPricesLower() {
//    ProductCatalog pc = selectedsupplier.getProductCatalog();
//    for (Product product : pc.getProductList()) {
//        if (product.getOrderPricePerformance() < 0) { // Assuming negative performance indicates actual sales below target
//            int newTargetPrice = product.getTargetPrice() - (int)(product.getTargetPrice() * 0.05); // Lower by 5%
//            product.setTargetPrice(newTargetPrice);
//        }
//    }
//    refreshTable(); // Refresh the table to display updated prices
//}
//
//private void adjustTargetPricesHigher() {
//    ProductCatalog pc = selectedsupplier.getProductCatalog();
//    for (Product product : pc.getProductList()) {
//        if (product.getOrderPricePerformance() > 0) { // Assuming positive performance indicates actual sales above target
//            int newTargetPrice = product.getTargetPrice() + (int)(product.getTargetPrice() * 0.05); // Increase by 5%
//            product.setTargetPrice(newTargetPrice);
//        }
//    }
//    refreshTable(); // Refresh the table to display updated prices
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Next;
    private javax.swing.JTable SupplierCatalogTable;
    private javax.swing.JComboBox<String> SuppliersComboBox;
    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;


    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUpdateTarget;
    private javax.swing.JTextField productFrequencyAboveTargetTextField;
    private javax.swing.JTextField productFrequencyBelowTargetTextField;
    private javax.swing.JTextField productNameTextField;
    private javax.swing.JTextField productPricePerformanceTextField;
    private javax.swing.JTextField productRevenueTextField;
    private javax.swing.JTextField txtTarget;
    private javax.swing.JTextField txtUpdateTarget;

    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;

    // End of variables declaration//GEN-END:variables
}
