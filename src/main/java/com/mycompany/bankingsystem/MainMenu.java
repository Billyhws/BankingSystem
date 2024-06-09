
package com.mycompany.bankingsystem;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;


public class MainMenu extends javax.swing.JFrame {

   
    public MainMenu() {
        initComponents();
        jdc_date.setDate(new Date());
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_createaccount = new javax.swing.JLabel();
        lbl_deposit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_createaccount1 = new javax.swing.JLabel();
        lbl_withdraw = new javax.swing.JLabel();
        lbl_createaccount2 = new javax.swing.JLabel();
        lbl_createaccount3 = new javax.swing.JLabel();
        lbl_transaction = new javax.swing.JLabel();
        lbl_changepin = new javax.swing.JLabel();
        jdc_date = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbl_accountnumber = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_amount = new javax.swing.JLabel();
        cmb_account = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("M3 Banking");

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 153, 0))); // NOI18N

        lbl_createaccount.setBackground(new java.awt.Color(204, 204, 204));
        lbl_createaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deposit.png"))); // NOI18N
        lbl_createaccount.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        lbl_createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseExited(evt);
            }
        });

        lbl_deposit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_deposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_deposit.setText("DEPOSIT");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("₱");

        lbl_createaccount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createaccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/withdraw.png"))); // NOI18N
        lbl_createaccount1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 255)));
        lbl_createaccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createaccount1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_createaccount1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_createaccount1MouseExited(evt);
            }
        });

        lbl_withdraw.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_withdraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_withdraw.setText("WITHDRAW");

        lbl_createaccount2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createaccount2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction.png"))); // NOI18N
        lbl_createaccount2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));
        lbl_createaccount2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createaccount2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_createaccount2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_createaccount2MouseExited(evt);
            }
        });

        lbl_createaccount3.setBackground(new java.awt.Color(153, 153, 255));
        lbl_createaccount3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createaccount3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pin.png"))); // NOI18N
        lbl_createaccount3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        lbl_createaccount3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createaccount3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_createaccount3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_createaccount3MouseExited(evt);
            }
        });

        lbl_transaction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_transaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_transaction.setText("TRANSACTION");

        lbl_changepin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_changepin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_changepin.setText("CHANGE PIN");

        jdc_date.setDateFormatString("yyyy-MM-dd");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Account Name:");

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Account Number:");

        lbl_accountnumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_accountnumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Account Balance:");

        lbl_amount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cmb_account.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Checking Account" }));
        cmb_account.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_accountPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_createaccount, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(lbl_deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_createaccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_createaccount2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_createaccount3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_changepin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cmb_account, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(lbl_accountnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_accountnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(cmb_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_createaccount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_createaccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_createaccount2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_createaccount3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_deposit)
                    .addComponent(lbl_withdraw)
                    .addComponent(lbl_transaction)
                    .addComponent(lbl_changepin))
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngwing.com (1) - Copy.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("EXIT");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseClicked
        new Deposit().show();
        String name = lbl_name.getText();
        String acctnumber = lbl_accountnumber.getText();
        Deposit.lbl_name1.setText(name);
        Deposit.lbl_accountnumber1.setText(acctnumber);
        
    }//GEN-LAST:event_lbl_createaccountMouseClicked

    private void lbl_createaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseEntered
        lbl_createaccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbl_deposit.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccountMouseEntered

    private void lbl_createaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseExited
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, -1);
        lbl_deposit.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccountMouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new Bank().show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lbl_createaccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount1MouseClicked
        new Withdraw().show();
        String name = lbl_name.getText();
        String acctnumber = lbl_accountnumber.getText();
        Withdraw.lbl_name1.setText(name);
        Withdraw.lbl_accountnumber1.setText(acctnumber);
    }//GEN-LAST:event_lbl_createaccount1MouseClicked

    private void lbl_createaccount1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount1MouseEntered
        lbl_createaccount1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbl_withdraw.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccount1MouseEntered

    private void lbl_createaccount1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount1MouseExited
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, -1);
        lbl_withdraw.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccount1MouseExited

    private void lbl_createaccount2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount2MouseClicked
        new Transaction().show();
        String name = lbl_name.getText();
        String acctnumber = lbl_accountnumber.getText();
        Transaction.lbl_name2.setText(name);
        Transaction.lbl_accountnumber2.setText(acctnumber);
    }//GEN-LAST:event_lbl_createaccount2MouseClicked

    private void lbl_createaccount2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount2MouseEntered
         lbl_createaccount2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbl_transaction.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccount2MouseEntered

    private void lbl_createaccount2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount2MouseExited
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, -1);
        lbl_transaction.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccount2MouseExited

    private void lbl_createaccount3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount3MouseClicked
    }//GEN-LAST:event_lbl_createaccount3MouseClicked

    private void lbl_createaccount3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount3MouseEntered
         lbl_createaccount3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbl_changepin.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccount3MouseEntered

    private void lbl_createaccount3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccount3MouseExited
        Font font = new Font("Segoe UI",Font.BOLD,18);
        Map attr = font.getAttributes();
        attr.put(TextAttribute.UNDERLINE, -1);
        lbl_changepin.setFont(font.deriveFont(attr));
    }//GEN-LAST:event_lbl_createaccount3MouseExited

    private void cmb_accountPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_accountPopupMenuWillBecomeInvisible
        String account = cmb_account.getSelectedItem().toString();
        int account_number = Integer.parseInt(lbl_accountnumber.getText());
        String sql = "SELECT * FROM open_account WHERE account_number='" + account_number + "'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String sqlusername = "bank";
            String sqlpassword = "1234";
            
            Connection conn = DriverManager.getConnection(url, sqlusername, sqlpassword);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
           
                if(cmb_account.getSelectedItem()=="Savings Account"){
                    double amount = rs.getDouble("sa_balance");
                    String a = String.format("%.2f", amount);
                    DecimalFormat decimal = new DecimalFormat("#.00");
                    decimal.setGroupingUsed(true);
                    decimal.setGroupingSize(3);
                     double aa = Double.parseDouble(a);
                    lbl_amount.setText(decimal.format(aa));
                }else{
                     double amount = rs.getDouble("ca_balance");
                    String a = String.format("%.2f", amount);
                    DecimalFormat decimal = new DecimalFormat("#.00");
                    decimal.setGroupingUsed(true);
                    decimal.setGroupingSize(3);
                     double aa = Double.parseDouble(a);
                    lbl_amount.setText(decimal.format(aa));
                }
         
            }
                  
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmb_accountPopupMenuWillBecomeInvisible

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_account;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser jdc_date;
    public static javax.swing.JLabel lbl_accountnumber;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_changepin;
    private javax.swing.JLabel lbl_createaccount;
    private javax.swing.JLabel lbl_createaccount1;
    private javax.swing.JLabel lbl_createaccount2;
    private javax.swing.JLabel lbl_createaccount3;
    private javax.swing.JLabel lbl_deposit;
    public static javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_transaction;
    private javax.swing.JLabel lbl_withdraw;
    // End of variables declaration//GEN-END:variables
}