/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankaccount;
import static java.awt.Color.gray;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author belek
 */
public class CustomerDeposit extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDeposit
     */
    public CustomerDeposit() {
        initComponents();
    }
 Connection conn=null;
 
 public void FieldClear(){
          accountNo.setText("");
        customerName.setText("");
        transactionDate.setText("");
        amountDeposit.setText("");
        accountBalance.setText("");
        depositId.setText("");
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        accountBalanceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accountNo = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        accountBalance = new javax.swing.JTextField();
        amountDeposit = new javax.swing.JTextField();
        transactionDate = new javax.swing.JTextField();
        Deposit = new javax.swing.JButton();
        updateDeposit = new javax.swing.JButton();
        deleteDeposit = new javax.swing.JButton();
        Check = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        depositId = new javax.swing.JTextField();
        checkDepositId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Deposit Money");

        jLabel2.setText("Account No.");

        jLabel3.setText("Names");

        accountBalanceLabel.setText("Balance");

        jLabel5.setText("Amount Deposit");

        jLabel6.setText("Transaction Date");

        transactionDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionDateActionPerformed(evt);
            }
        });

        Deposit.setText("Add");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        updateDeposit.setText("Update");
        updateDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDepositActionPerformed(evt);
            }
        });

        deleteDeposit.setText("Delete");
        deleteDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDepositActionPerformed(evt);
            }
        });

        Check.setText("Check");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        jLabel7.setText("TransactionId");

        checkDepositId.setText("Check");
        checkDepositId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDepositIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(updateDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(deleteDeposit)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountDeposit)
                            .addComponent(accountBalance)
                            .addComponent(transactionDate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accountNo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(depositId))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkDepositId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDepositId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountDeposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionDate, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        // TODO add your handling code here:
          try
        {
            String accountNum = accountNo.getText();
        
//          class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", ""); 
         PreparedStatement st = conn.prepareStatement("select accountNo,customerName,accountBalance from customer where accountNo=?"); 
         st.setString(1, accountNum);  
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
            if (rs.next()) {  
                String customer = rs.getString(2);  
               
                 String Balance = rs.getString(3);
               
          
                //Sets Records in TextFields.  
                 customerName.setText(customer);  
                accountBalance.setText(Balance);  
                customerName.setEditable(false);
                accountBalance.setEditable(false);
                 
                
       
        }else {
                   JOptionPane.showMessageDialog(rootPane, "Data not found");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }//GEN-LAST:event_CheckActionPerformed

    private void transactionDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionDateActionPerformed
        // TODO add your handling code here:
        
        Date date = new Date(); //declare this above;
transactionDate.setText(date.toString()); //set this inside you class.
    }//GEN-LAST:event_transactionDateActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
         try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
       Statement smt=conn.createStatement();
       smt.executeUpdate("insert into deposittranaction (accountNo,customerName,amountDeposit,transactionDate) values('"+accountNo.getText()+"','"+customerName.getText()+"','"+amountDeposit.getText()+"','"+transactionDate.getText()+"')");
       
       
       smt.executeUpdate("update customer set accountBalance=accountBalance+'"+amountDeposit.getText()+"' where accountNo='"+accountNo.getText()+"'");
       FieldClear();
       JOptionPane.showMessageDialog(rootPane,"Transaction successful");
       }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane,e.getMessage());
           
       }
    }//GEN-LAST:event_DepositActionPerformed

    private void updateDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDepositActionPerformed
        // TODO add your handling code here:
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
       Statement smt=conn.createStatement();
       smt.executeUpdate("update customer c, deposittranaction d set c.accountBalance=c.accountBalance-d.amountDeposit where c.accountNo=d.accountNo and c.accountNo='"+accountNo.getText()+"'");
       smt.executeUpdate("update deposittranaction set  amountDeposit='"+amountDeposit.getText()+"',transactionDate='"+transactionDate.getText()+"'where depositId='"+depositId.getText()+"'");
       
       
       smt.executeUpdate("update customer set accountBalance=accountBalance+'"+amountDeposit.getText()+"' where accountNo='"+accountNo.getText()+"'");
       FieldClear();
       JOptionPane.showMessageDialog(rootPane,"Transaction successful");
       }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane,e.getMessage());
           
       }
        
    }//GEN-LAST:event_updateDepositActionPerformed

    private void checkDepositIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDepositIdActionPerformed
        // TODO add your handling code here:
        
         // TODO add your handling code here:
          try
        {
            String depositNum = depositId.getText();
        
//          class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", ""); 
         PreparedStatement st = conn.prepareStatement("select d.depositId, d.accountNo,d.customerName,d.amountDeposit,d.transactionDate,c.accountBalance from customer c inner join deposittranaction d on c.accountNo=d.accountNo where depositId=?"); 
         st.setString(1, depositNum);  
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
            if (rs.next()) {  
                 
                 String custAccountNo=rs.getString(2);
                 String customerfullName = rs.getString(3);
                 String custDepositAmount = rs.getString(4);
                 String customerDepositDate=rs.getString(5);
                 String account=rs.getString(6);
               
          
                //Sets Records in TextFields.  
                 customerName.setText(customerfullName);
                 accountNo.setText(custAccountNo);
                 amountDeposit.setText(custDepositAmount);
                 transactionDate.setText(customerDepositDate);
                 accountBalance.setText(account);
                 
                //amountDeposit.setText(custDepositAmount);  
                customerName.setEditable(false);
                accountBalance.setEditable(false);
                accountNo.setEditable(false);
                accountBalance.setEditable(false);
                
                
                
                 
                
       
        }else {
                   JOptionPane.showMessageDialog(rootPane, "Data not found");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_checkDepositIdActionPerformed

    private void deleteDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDepositActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
         try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
       Statement smt=conn.createStatement();
       smt.executeUpdate("update customer c, deposittranaction d set c.accountBalance=c.accountBalance-d.amountDeposit where c.accountNo=d.accountNo and c.accountNo='"+accountNo.getText()+"'");
       smt.executeUpdate("Delete from deposittranaction where depositId='"+depositId.getText()+"'");
        FieldClear();
       }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane,e.getMessage());
           
       } 
    }//GEN-LAST:event_deleteDepositActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDeposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check;
    private javax.swing.JButton Deposit;
    private javax.swing.JTextField accountBalance;
    private javax.swing.JLabel accountBalanceLabel;
    private javax.swing.JTextField accountNo;
    private javax.swing.JTextField amountDeposit;
    private javax.swing.JButton checkDepositId;
    private javax.swing.JTextField customerName;
    private javax.swing.JButton deleteDeposit;
    private javax.swing.JTextField depositId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField transactionDate;
    private javax.swing.JButton updateDeposit;
    // End of variables declaration//GEN-END:variables
}
