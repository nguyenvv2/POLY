/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mob1023.swing;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguyenvv
 */
public class Jtable extends javax.swing.JFrame {

    private DefaultComboBoxModel cbModel;
    private ButtonGroup buttonGroup;
    private DefaultTableModel defaultTableModel;
    private List<String> listNamSinh;
    private GiangVienService giangVienService = new GiangVienService();

    /**
     * Creates new form Jtable
     */
    public Jtable() {

        initComponents();
        radioGioiTinh();
        cbcNamSinh();
        tbGiaoVienColumns();
        loadDataTable();
    }

    public List<String> getColumname() {
        List<String> lstcl = new ArrayList<>();
        lstcl.add("Số TT");
        lstcl.add("Mã");
        lstcl.add("Tên");
        lstcl.add("Năm sinh");
        lstcl.add("Giới tính");
        lstcl.add("Điện thoại");
        return lstcl;
    }

    void tbGiaoVienColumns() {
        defaultTableModel = (DefaultTableModel) tb_gv.getModel();
        for (String x : getColumname()) {//qlgv.getColumname() Lấy ra 1 danh sách các tên cột đã đặt
            defaultTableModel.addColumn(x);//Thêm tên cột vào bảng Giáo viên
        }
        defaultTableModel.setRowCount(0);
    }

    void loadDataTable() {
        defaultTableModel.setRowCount(0);
        defaultTableModel = (DefaultTableModel) tb_gv.getModel();
        for (GiaoVien x : giangVienService.getlstGiaoVien()) {
            defaultTableModel.addRow(new Object[]{x.getId(), x.getMagv(),
                x.getTengv(), x.getNamSinh(), gioiTinh(x.getGioiTinh()), x.getSdt()});
        }

    }

    private String gioiTinh(int gioiTinh) {
        if (gioiTinh == 1) {
            return "nam";
        } else {
            return "nữ";
        }
    }

    void cbcNamSinh() {
        listNamSinh = new ArrayList<>();
        listNamSinh.add("1998");
        listNamSinh.add("1999");
        listNamSinh.add("2000");
        listNamSinh.add("2001");
        listNamSinh.add("2002");
        listNamSinh.add("2003");

        cbc_namsinh.setModel(cbModel = new DefaultComboBoxModel());
        for (String string : listNamSinh) {
            cbModel.addElement(string);
        }
        cbc_namsinh.setSelectedIndex(0);
    }

    void radioGioiTinh() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rd_nam);
        buttonGroup.add(rd_nu);
    }

    public Jtable(JButton btn_them, JComboBox<String> cbc_namsinh, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JScrollPane jScrollPane1, JRadioButton rd_nam, JRadioButton rd_nu, JTable tbl_gv, JTextField txt_sdt, JTextField txt_tengv) throws HeadlessException {
        this.btn_them = btn_them;
        this.cbc_namsinh = cbc_namsinh;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.rd_nam = rd_nam;
        this.rd_nu = rd_nu;
        this.txt_sdt = txt_sdt;
        this.txt_tengv = txt_tengv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_sdt = new javax.swing.JTextField();
        txt_tengv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbc_namsinh = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_gv = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_magv = new javax.swing.JTextField();
        btn_xoa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_timkiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_sdt.setText("Nhập số điện thoại");
        txt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtActionPerformed(evt);
            }
        });

        txt_tengv.setText("Nhập tên giảng viên");

        jLabel1.setText("Nhập họ tên giảng viên");

        jLabel2.setText("Nhập số điện thoại");

        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        rd_nam.setText("nam");
        rd_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_namActionPerformed(evt);
            }
        });

        rd_nu.setText("nữ");

        jLabel3.setText("Giới tính");

        cbc_namsinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902" }));

        jLabel4.setText("Năm sinh");

        tb_gv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb_gv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_gvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_gv);

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã giảng viên");

        txt_magv.setText("Nhập mã giảng viên");

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_timkiem.setText("Tìm Kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_tengv, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(260, 260, 260)
                                .addComponent(btn_them))
                            .addComponent(cbc_namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rd_nam)
                                        .addGap(36, 36, 36)
                                        .addComponent(rd_nu))
                                    .addComponent(txt_magv, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(263, 263, 263)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_timkiem)
                                    .addComponent(btn_clear)
                                    .addComponent(btn_xoa)
                                    .addComponent(jButton2)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tengv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_them))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rd_nam)
                            .addComponent(rd_nu))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_magv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbc_namsinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btn_clear))
                        .addGap(10, 10, 10)
                        .addComponent(btn_xoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_timkiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdtActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:

        if ("".equals(txt_tengv.getText())) {
            JOptionPane.showMessageDialog(this, "Ten giao vien khong duoc trong");
        } else if ("".equals(txt_sdt.getText())) {
            JOptionPane.showMessageDialog(this, "So dien thoai khong duoc bo trong");
        } else {
            GiaoVien gv = new GiaoVien();
            gv.setTengv(txt_tengv.getText());
            if (rd_nu.isSelected()) {
                gv.setGioiTinh(0);
            } else {
                gv.setGioiTinh(1);
            }
            gv.setNamSinh(Integer.parseInt(cbc_namsinh.getSelectedItem().toString()));
            gv.setId(giangVienService.getlstGiaoVien().size() + 1);
            gv.setSdt(txt_sdt.getText());
            gv.setMagv(txt_magv.getText());
            Boolean isAdded = giangVienService.addGiaoVien(gv);
            if (isAdded) {
                loadDataTable();
                JOptionPane.showMessageDialog(this, "Them thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "Them that bai");
            }

        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void rd_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_namActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rd_namActionPerformed

    private void tb_gvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_gvMouseClicked
        // TODO add your handling code here:
        int rowSelected = tb_gv.getSelectedRow();
        txt_tengv.setText(tb_gv.getValueAt(rowSelected, 2).toString());
        txt_sdt.setText(tb_gv.getValueAt(rowSelected, 5).toString());

        if (tb_gv.getValueAt(rowSelected, 4).toString().equals("nam")) {
            rd_nam.setSelected(true);
        } else {
            rd_nu.setSelected(true);
        }
        txt_magv.setText(tb_gv.getValueAt(rowSelected, 1).toString());
        cbc_namsinh.setSelectedItem(tb_gv.getValueAt(rowSelected, 3).toString());

    }//GEN-LAST:event_tb_gvMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_sdt.setText("");
        txt_tengv.setText("");
        txt_magv.setText("");
        cbc_namsinh.setSelectedIndex(0);
        buttonGroup.clearSelection();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int row = tb_gv.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn giảng viên cần xóa");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa giảng viên", "Xóa giảng viên", JOptionPane.YES_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                giangVienService.getlstGiaoVien().remove(row);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                loadDataTable();
            }
        }

    }//GEN-LAST:event_btn_xoaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int rowSelected = tb_gv.getSelectedRow();
        GiaoVien giaoVien = giangVienService.getlstGiaoVien().get(rowSelected);
        if ("".equals(txt_tengv.getText())) {
            JOptionPane.showMessageDialog(this, "Ten giao vien khong duoc trong");
        } else if ("".equals(txt_sdt.getText())) {
            JOptionPane.showMessageDialog(this, "So dien thoai khong duoc bo trong");
        } else {
            giaoVien.setTengv(txt_tengv.getText());
            if (rd_nu.isSelected()) {
                giaoVien.setGioiTinh(0);
            } else {
                giaoVien.setGioiTinh(1);
            }
            giaoVien.setNamSinh(Integer.parseInt(cbc_namsinh.getSelectedItem().toString()));
            giaoVien.setId(giangVienService.getlstGiaoVien().size() + 1);
            giaoVien.setSdt(txt_sdt.getText());
            giaoVien.setMagv(txt_magv.getText());
            loadDataTable();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        String search = JOptionPane.showInputDialog(this, "Nhập mã giảng viên", "Tìm kiếm", JOptionPane.YES_OPTION);
        
        ArrayList<GiaoVien> listGv = new ArrayList<>();
        for (GiaoVien giaoVien : giangVienService.getlstGiaoVien()) {
            if (giaoVien.getMagv().equalsIgnoreCase(search)) {
                listGv.add(giaoVien);
            }
        }
        System.out.println(search);
        if (listGv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có giảng viên nào");
        } else {
            defaultTableModel = (DefaultTableModel) tb_gv.getModel();
            defaultTableModel.setRowCount(0);
            for (GiaoVien x : listGv) {
                defaultTableModel.addRow(new Object[]{x.getId(), x.getMagv(),
                    x.getTengv(), x.getNamSinh(), gioiTinh(x.getGioiTinh()), x.getSdt()});
            }
        }
    }//GEN-LAST:event_btn_timkiemActionPerformed

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
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbc_namsinh;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private javax.swing.JTable tb_gv;
    private javax.swing.JTextField txt_magv;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tengv;
    // End of variables declaration//GEN-END:variables
}
