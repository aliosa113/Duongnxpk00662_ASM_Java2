/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnxpk00662;

import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongAli
 */
public class frmQuanLyTaiKhoan extends javax.swing.JFrame {

    String string = "src\\images\\6.jpg";

    /**
     * Creates new form frmQuanLyTaiKhoan
     */
    public frmQuanLyTaiKhoan() {
        initComponents();
        getRootPane().setDefaultButton(btnSearch);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnQuanLyTaiKhoan1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLyTaiKhoan = new javax.swing.JTable();
        jpnQuanLyTaiKhoan2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(string);
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                g.drawImage(icon.getImage(),0,0,d.width,d.height,null);
                setOpaque(false);
                super.paintComponent(g); }
        };
        lblSTT = new javax.swing.JLabel();
        lblAuthority = new javax.swing.JLabel();
        lblMaTaiKhoan = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblTenTaiKhoan = new javax.swing.JLabel();
        txtSTT = new javax.swing.JTextField();
        txtMaTaiKhoan = new javax.swing.JTextField();
        txtTenTaiKhoan = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cbbAuthority = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblTool = new javax.swing.JLabel();
        lblQuanLyTaiKhoan = new javax.swing.JLabel();
        jMenuQuanLyTaiKhoan = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuSystem = new javax.swing.JMenu();
        jMenuSetting = new javax.swing.JMenu();
        jMenuHelf = new javax.swing.JMenu();
        jMenuInfo = new javax.swing.JMenu();
        jMenuLogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpnQuanLyTaiKhoan1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblQuanLyTaiKhoan.setBackground(new java.awt.Color(0, 0, 0));
        tblQuanLyTaiKhoan.setForeground(new java.awt.Color(0, 255, 255));
        tblQuanLyTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Tài Khoản", "Tên Tài Khoản", "Mật Khẩu", "Quyền"
            }
        ));
        tblQuanLyTaiKhoan.setSelectionBackground(new java.awt.Color(222, 222, 222));
        tblQuanLyTaiKhoan.setSelectionForeground(new java.awt.Color(22, 22, 22));
        tblQuanLyTaiKhoan.setShowVerticalLines(false);
        tblQuanLyTaiKhoan.setUpdateSelectionOnSort(false);
        tblQuanLyTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyTaiKhoanMouseClicked(evt);
            }
        });
        tblQuanLyTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblQuanLyTaiKhoanKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLyTaiKhoan);

        jpnQuanLyTaiKhoan2.setBackground(new java.awt.Color(0, 0, 0));

        lblSTT.setForeground(new java.awt.Color(255, 255, 255));
        lblSTT.setText("STT");

        lblAuthority.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthority.setText("Quyền");

        lblMaTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblMaTaiKhoan.setText("Mã Tài Khoản");

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Mật Khẩu");

        lblTenTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTenTaiKhoan.setText("Tên Tài Khoản");

        txtSTT.setEditable(false);
        txtSTT.setBackground(new java.awt.Color(51, 51, 51));
        txtSTT.setForeground(new java.awt.Color(0, 255, 255));

        txtMaTaiKhoan.setEditable(false);
        txtMaTaiKhoan.setBackground(new java.awt.Color(51, 51, 51));
        txtMaTaiKhoan.setForeground(new java.awt.Color(0, 255, 255));

        txtTenTaiKhoan.setBackground(new java.awt.Color(0, 0, 0));
        txtTenTaiKhoan.setForeground(new java.awt.Color(0, 255, 255));
        txtTenTaiKhoan.setCaretColor(new java.awt.Color(51, 255, 255));

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setForeground(new java.awt.Color(0, 255, 255));
        txtPassword.setCaretColor(new java.awt.Color(51, 255, 255));

        cbbAuthority.setBackground(new java.awt.Color(0, 0, 0));
        cbbAuthority.setForeground(new java.awt.Color(0, 255, 255));
        cbbAuthority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInsert.setBackground(new java.awt.Color(0, 0, 0));
        btnInsert.setForeground(new java.awt.Color(204, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/them.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(204, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/xoa.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sua.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setForeground(new java.awt.Color(204, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/taomoi.png"))); // NOI18N
        btnReset.setText("Tạo Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtSearch.setBackground(new java.awt.Color(0, 0, 0));
        txtSearch.setForeground(new java.awt.Color(0, 255, 255));
        txtSearch.setCaretColor(new java.awt.Color(51, 255, 255));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setForeground(new java.awt.Color(204, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tim.png"))); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTool.setForeground(new java.awt.Color(153, 255, 255));
        lblTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TOOL.png"))); // NOI18N
        lblTool.setText("TOOL");

        lblQuanLyTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuanLyTaiKhoan.setForeground(new java.awt.Color(0, 255, 255));
        lblQuanLyTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RAINMETER.png"))); // NOI18N
        lblQuanLyTaiKhoan.setText("Quản Lý Tài Khoản");

        javax.swing.GroupLayout jpnQuanLyTaiKhoan2Layout = new javax.swing.GroupLayout(jpnQuanLyTaiKhoan2);
        jpnQuanLyTaiKhoan2.setLayout(jpnQuanLyTaiKhoan2Layout);
        jpnQuanLyTaiKhoan2Layout.setHorizontalGroup(
            jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(lblQuanLyTaiKhoan))
                    .addGroup(jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTool)
                            .addGroup(jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAuthority)
                            .addComponent(lblSTT)
                            .addComponent(lblMaTaiKhoan)
                            .addComponent(lblTenTaiKhoan)
                            .addComponent(lblPassword))
                        .addGap(26, 26, 26)
                        .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbAuthority, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jpnQuanLyTaiKhoan2Layout.setVerticalGroup(
            jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTaiKhoan2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblQuanLyTaiKhoan)
                .addGap(30, 30, 30)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSTT))
                .addGap(12, 12, 12)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaTaiKhoan))
                .addGap(12, 12, 12)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenTaiKhoan))
                .addGap(12, 12, 12)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(12, 12, 12)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbAuthority, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAuthority))
                .addGap(30, 30, 30)
                .addComponent(lblTool)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnQuanLyTaiKhoan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(jpnQuanLyTaiKhoan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jpnQuanLyTaiKhoan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jpnQuanLyTaiKhoan1Layout = new javax.swing.GroupLayout(jpnQuanLyTaiKhoan1);
        jpnQuanLyTaiKhoan1.setLayout(jpnQuanLyTaiKhoan1Layout);
        jpnQuanLyTaiKhoan1Layout.setHorizontalGroup(
            jpnQuanLyTaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTaiKhoan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyTaiKhoan1Layout.setVerticalGroup(
            jpnQuanLyTaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTaiKhoan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuQuanLyTaiKhoan.setBackground(new java.awt.Color(0, 0, 0));
        jMenuQuanLyTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));

        jMenuHome.setForeground(new java.awt.Color(0, 255, 255));
        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HOME20.png"))); // NOI18N
        jMenuHome.setText("Home");
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuQuanLyTaiKhoan.add(jMenuHome);

        jMenuSystem.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SETTINGS20.png"))); // NOI18N
        jMenuSystem.setText("Hệ thống");
        jMenuQuanLyTaiKhoan.add(jMenuSystem);

        jMenuSetting.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TOOL20.png"))); // NOI18N
        jMenuSetting.setText("Cài đặt");
        jMenuQuanLyTaiKhoan.add(jMenuSetting);

        jMenuHelf.setForeground(new java.awt.Color(255, 255, 255));
        jMenuHelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HELF20.png"))); // NOI18N
        jMenuHelf.setText("Trợ giúp");
        jMenuQuanLyTaiKhoan.add(jMenuHelf);

        jMenuInfo.setForeground(new java.awt.Color(0, 255, 0));
        jMenuInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/INFO20.png"))); // NOI18N
        jMenuInfo.setText("Giới thiệu");
        jMenuInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInfoMouseClicked(evt);
            }
        });
        jMenuQuanLyTaiKhoan.add(jMenuInfo);

        jMenuLogOut.setForeground(new java.awt.Color(255, 0, 0));
        jMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/POWER - SHUT DOWN20.png"))); // NOI18N
        jMenuLogOut.setText("Đăng xuất");
        jMenuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOutMouseClicked(evt);
            }
        });
        jMenuQuanLyTaiKhoan.add(jMenuLogOut);

        setJMenuBar(jMenuQuanLyTaiKhoan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLyTaiKhoan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLyTaiKhoan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogOutMouseClicked
        frmDangNhap frm = new frmDangNhap();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_jMenuLogOutMouseClicked

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
        frmQuanLy frm = new frmQuanLy();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LayDuLieu();
        Combobox();
    }//GEN-LAST:event_formWindowOpened

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String TenTaiKhoan = txtTenTaiKhoan.getText();
        String MatKhau = txtPassword.getText();

        Object[] obj = cbbAuthority.getSelectedObjects();
        displaycbbmodel item = (displaycbbmodel) obj[0];
        String Quyen = item.DisplayValue.toString();

        String CauTruyVan = "insert into TaiKhoan values (N'" + TenTaiKhoan + "',N'" + MatKhau + "','" + Quyen + "')";
        if (TenTaiKhoan.equals("") || MatKhau.equals("")) {
            ThongBao("Bạn hãy nhập đầy đủ dữ liệu!");
        } else if (TenTaiKhoan.length() < 6) {
            ThongBao("Tên tài khoản phải lớn hơn 5 ký tự!");
        } else if (Duongnxpk00662.KiemTra.KiemTraWhitespace(TenTaiKhoan)) {
            ThongBao("Tên tài khoản không được nhập dấu cách!");
        } else if (Duongnxpk00662.KiemTra.KiemTraUser(TenTaiKhoan)) {
            ThongBao("Tên tài khoản đã được sử dụng!");
        } else if (MatKhau.length() < 6) {
            ThongBao("Mật khẩu nhập phải lớn hơn 5 ký tự!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaChuKhong(MatKhau)) {
            ThongBao("Mật khẩu thiếu chữ\nBạn phải nhập chữ và số!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(MatKhau)) {
            ThongBao("Mật khẩu thiếu số\nBạn phải nhập chữ và số!");
        } else {
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblQuanLyTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyTaiKhoanMouseClicked
        int ViTriDong = tblQuanLyTaiKhoan.getSelectedRow();
        txtSTT.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 0).toString());
        txtMaTaiKhoan.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 1).toString());
        txtTenTaiKhoan.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 2).toString());
        txtPassword.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 3).toString());
        String Quyen = tblQuanLyTaiKhoan.getValueAt(ViTriDong, 4).toString();
        setSelectedCombobox(Quyen);
    }//GEN-LAST:event_tblQuanLyTaiKhoanMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int[] MangViTri = tblQuanLyTaiKhoan.getSelectedRows();
        for (int i = 0; i < MangViTri.length; i++) {
            String MaTaiKhoan = tblQuanLyTaiKhoan.getValueAt(MangViTri[i], 1).toString();
            String CauTruyVan = "Delete from TaiKhoan where MaTaiKhoan = " + MaTaiKhoan;
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String TenTaiKhoan = txtTenTaiKhoan.getText();
        String MatKhau = txtPassword.getText();
        String MaTaiKhoan = txtMaTaiKhoan.getText();

        Object[] obj = cbbAuthority.getSelectedObjects();
        displaycbbmodel item = (displaycbbmodel) obj[0];
        String MaQuyen = item.DisplayValue.toString();

        String CauTruyVan = "Update TaiKhoan Set TenTaiKhoan = N'" + TenTaiKhoan + "', MatKhau = N'" + MatKhau + "', MaQuyen = " + MaQuyen
                + "Where MaTaiKhoan = " + MaTaiKhoan;
        if (TenTaiKhoan.equals("") || MatKhau.equals("")) {
            ThongBao("Bạn hãy chọn tài khoản cần sửa!");
        } else if (TenTaiKhoan.length() < 6) {
            ThongBao("Tên tài khoản phải lớn hơn 5 ký tự!");
        } else if (Duongnxpk00662.KiemTra.KiemTraWhitespace(TenTaiKhoan)) {
            ThongBao("Tên tài khoản không được nhập dấu cách!");
        } else if (MatKhau.length() < 6) {
            ThongBao("Mật khẩu nhập phải lớn hơn 5 ký tự!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaChuKhong(MatKhau)) {
            ThongBao("Mật Khẩu thiếu chữ\nBạn phải nhập chữ và số!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(MatKhau)) {
            ThongBao("Mật Khẩu thiếu số\nBạn phải nhập chữ và số!");
        } else {
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSTT.setText("");
        txtMaTaiKhoan.setText("");
        txtTenTaiKhoan.setText("");
        txtPassword.setText("");
        txtSearch.setText("");
        cbbAuthority.setSelectedIndex(2);
        LayDuLieu();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String Search = txtSearch.getText();
        String CauTruyVan = "select * from TaiKhoan where TenTaiKhoan like N'%" + Search + "%'";
        if (!Search.equals("")) {
            ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(CauTruyVan);
            Object[] obj = new Object[]{"STT", "Mã Tài Khoản", "Tên Tài Khoản", "Mật Khẩu", "Quyền"};
            DefaultTableModel TableModel = new DefaultTableModel(obj, 0);
            tblQuanLyTaiKhoan.setModel(TableModel);
            try {
                while (rs.next()) {
                    Object[] item = new Object[5];
                    item[0] = tblQuanLyTaiKhoan.getRowCount() + 1;
                    item[1] = rs.getInt("MaTaiKhoan");
                    item[2] = rs.getString("TenTaiKhoan");
                    item[3] = rs.getString("MatKhau");
                    item[4] = rs.getInt("MaQuyen");
                    TableModel.addRow(item);
                }
            } catch (SQLException ex) {
                ThongBao("Error!" + ex);
            }
        } else {
            ThongBao("Bạn Muốn Tìm Gì?\nHãy Nhập Vào Ô Tìm Kiếm ^^!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblQuanLyTaiKhoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQuanLyTaiKhoanKeyReleased
        int ViTriDong = tblQuanLyTaiKhoan.getSelectedRow();
        txtSTT.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 0).toString());
        txtMaTaiKhoan.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 1).toString());
        txtTenTaiKhoan.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 2).toString());
        txtPassword.setText(tblQuanLyTaiKhoan.getValueAt(ViTriDong, 3).toString());
        String Quyen = tblQuanLyTaiKhoan.getValueAt(ViTriDong, 4).toString();
        setSelectedCombobox(Quyen);
    }//GEN-LAST:event_tblQuanLyTaiKhoanKeyReleased

    private void jMenuInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInfoMouseClicked
        frmInfo frm = new frmInfo();
        frm.show();
    }//GEN-LAST:event_jMenuInfoMouseClicked

    private void LayDuLieu() {
        String CauTruyVan = "Select * from TaiKhoan";
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(CauTruyVan);

        Object[] obj = new Object[]{"STT", "Mã Tài Khoản", "Tên Tài Khoản", "Mật Khẩu", "Quyền"};
        DefaultTableModel TableMode = new DefaultTableModel(obj, 0);
        tblQuanLyTaiKhoan.setModel(TableMode);

        try {
            while (rs.next()) {
                Object[] item = new Object[5];
                item[0] = tblQuanLyTaiKhoan.getRowCount() + 1;
                item[1] = rs.getInt("MaTaiKhoan");
                item[2] = rs.getString("TenTaiKhoan");
                item[3] = rs.getString("MatKhau");
                item[4] = LayTenQuyenDuaVaoMaQuyen(rs.getString("MaQuyen"));
                TableMode.addRow(item);
            }
        } catch (SQLException ex) {
            ThongBao("Lỗi Lấy Dữ Liệu!\n" + ex);
        }
    }

    //Display ComboBoxModel
    private void setSelectedCombobox(String Quyen) {
        for (int i = 0; i < cbbAuthority.getItemCount(); i++) {
            Object obj = cbbAuthority.getItemAt(i);

            if (obj != null) {
                displaycbbmodel m = (displaycbbmodel) obj;
                if (Quyen.equals(m.DisplayMember)) {
                    cbbAuthority.setSelectedItem(m);
                }
            }
        }
    }

    private void Combobox() {
        String ctv = "Select * from Quyen";
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(ctv);
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                displaycbbmodel item = new displaycbbmodel(rs.getString("TenQuyen"), rs.getInt("MaQuyen"));
                cbbModel.addElement(item);
            }
            cbbAuthority.setModel(cbbModel);
        } catch (Exception e) {
            ThongBao("Lỗi ComboBox!" + e);
        }
    }

    private String LayTenQuyenDuaVaoMaQuyen(String MaQuyen) {
        String TenQuyen = "";

        String ctv = "select TenQuyen from Quyen where MaQuyen = " + MaQuyen;
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(ctv);
        try {
            while (rs.next()) {
                TenQuyen = rs.getString("TenQuyen");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return TenQuyen;
    }

    //Thông báo DiaLog
    private void ThongBao(String NoiDungThongBao) {
        JOptionPane.showMessageDialog(this, NoiDungThongBao);
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
            java.util.logging.Logger.getLogger(frmQuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLyTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbAuthority;
    private javax.swing.JMenu jMenuHelf;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenu jMenuInfo;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JMenuBar jMenuQuanLyTaiKhoan;
    private javax.swing.JMenu jMenuSetting;
    private javax.swing.JMenu jMenuSystem;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnQuanLyTaiKhoan1;
    private javax.swing.JPanel jpnQuanLyTaiKhoan2;
    private javax.swing.JLabel lblAuthority;
    private javax.swing.JLabel lblMaTaiKhoan;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuanLyTaiKhoan;
    private javax.swing.JLabel lblSTT;
    private javax.swing.JLabel lblTenTaiKhoan;
    private javax.swing.JLabel lblTool;
    private javax.swing.JTable tblQuanLyTaiKhoan;
    private javax.swing.JTextField txtMaTaiKhoan;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSTT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
