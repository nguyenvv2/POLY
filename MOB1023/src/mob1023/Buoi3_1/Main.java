/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mob1023.Buoi3_1;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author nguyenvv
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main_19
     */
    ButtonGroup buttonGroup;

    public Main() {
        initComponents();
        rdGioiTinh();
    }

    void rdGioiTinh() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rd_nam);
        buttonGroup.add(rd_nu);
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
        txt_hoten = new javax.swing.JTextField();
        chk_bongda = new javax.swing.JCheckBox();
        chk_choigame = new javax.swing.JCheckBox();
        lbl_sothich = new javax.swing.JLabel();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();
        lbl_gioitinh = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        cb_namsinh = new javax.swing.JComboBox<>();
        lbl_namsinh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_sinhvien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ho Va Ten");

        txt_hoten.setText("Nhap vao ho ten");

        chk_bongda.setText("bong da");

        chk_choigame.setText("choi game");

        lbl_sothich.setText("So Thich");

        rd_nam.setText("nam");

        rd_nu.setText("nu");

        lbl_gioitinh.setText("Gioi Tinh");

        btn_them.setBackground(new java.awt.Color(204, 255, 153));
        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        cb_namsinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1999", "2000", "2001", "2002", "2003" }));
        cb_namsinh.setSelectedIndex(2);

        lbl_namsinh.setText("Nam Sinh");

        tb_sinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Nguyen Van A", "1999", "Ha Noi"},
                {"2", "Nguyen Thi B", "2000", "Thai Binh"},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Ten", "Nam Sinh", "Dia Chi"
            }
        ));
        tb_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sinhvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_sinhvien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_sothich)
                            .addComponent(lbl_gioitinh)
                            .addComponent(lbl_namsinh))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_nam)
                                .addGap(18, 18, 18)
                                .addComponent(rd_nu))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chk_bongda)
                                        .addGap(44, 44, 44)
                                        .addComponent(chk_choigame))
                                    .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_them)
                                    .addComponent(btn_clear)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_them)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk_bongda)
                        .addComponent(chk_choigame)
                        .addComponent(btn_clear))
                    .addComponent(lbl_sothich))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_nam)
                    .addComponent(rd_nu)
                    .addComponent(lbl_gioitinh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_namsinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sinhvienMouseClicked
        // TODO add your handling code here:
        // lay gia tri tu table len txt
        int row = tb_sinhvien.getSelectedRow();
        txt_hoten.setText((String) tb_sinhvien.getValueAt(row, 1));

    }//GEN-LAST:event_tb_sinhvienMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String str = txt_hoten.getText();
        if ("".equals(str)) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong ten");
        } else {
            JOptionPane.showMessageDialog(this, "Them thanh cong");

        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_hoten.setText("");
        buttonGroup.clearSelection();
        chk_bongda.setSelected(false);
        chk_choigame.setSelected(false);
        cb_namsinh.setSelectedIndex(2);
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_them;
    private javax.swing.JComboBox<String> cb_namsinh;
    private javax.swing.JCheckBox chk_bongda;
    private javax.swing.JCheckBox chk_choigame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_gioitinh;
    private javax.swing.JLabel lbl_namsinh;
    private javax.swing.JLabel lbl_sothich;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private javax.swing.JTable tb_sinhvien;
    private javax.swing.JTextField txt_hoten;
    // End of variables declaration//GEN-END:variables
}