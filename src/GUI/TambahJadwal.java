/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class TambahJadwal extends javax.swing.JFrame {
    
    /**
     * Creates new form TambahJadwal
     */
    public TambahJadwal() {
        initComponents();
        muatDataDariDatabase();
        muatKotaDariDatabase();
        muatPesawatDariDatabase("");
        setFormatJam(tfJam1);
        setFormatJam(tfJam2);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdJadwal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJadwal = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbKota1 = new javax.swing.JComboBox<>();
        cmbKota2 = new javax.swing.JComboBox<>();
        cmbIdPesawat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        tfJam1 = new javax.swing.JFormattedTextField();
        tfJam2 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tambah Data Jadwal");

        jPanel4.setBackground(new java.awt.Color(66, 135, 245));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/plane.png"))); // NOI18N
        jLabel4.setText("TAMBAH JADWAL KEBERANGKATAN");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Jadwal");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pesawat");

        tblJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Jadwal", "ID Pesawat", "Kota Awal", "Kota Tujuan", "Jam Berangkat", "Jam Sampai", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJadwal);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/edit.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kota Awal");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kota Tujuan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jam Berangkat");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jam Sampai");

        cmbKota1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbKota2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbIdPesawat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Harga");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/file.png"))); // NOI18N
        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel3)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel5)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cmbIdPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(cmbKota2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(tfJam2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnTambah)
                        .addGap(6, 6, 6)
                        .addComponent(btnUbah)
                        .addGap(6, 6, 6)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCetak)
                        .addGap(105, 105, 105)
                        .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(tfIdJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)
                            .addComponent(cmbKota1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(tfJam1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfIdJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfJam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbIdPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfJam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTambah)
                            .addComponent(btnUbah)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnHapus)
                                .addComponent(btnCetak))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void muatDataDariDatabase() {
        String sql = "SELECT id_jadwal, id_pesawat, kota_awal, kota_tujuan, jam_berangkat, jam_sampai, harga FROM jadwal";
        try {
            Connection koneksi = config.configDB();
            PreparedStatement statemen = koneksi.prepareStatement(sql);
            ResultSet hasil = statemen.executeQuery();

            DefaultTableModel modelTabel = (DefaultTableModel) tblJadwal.getModel();

            // Hapus baris yang sudah ada
            modelTabel.setRowCount(0);

            while (hasil.next()) {
                Object[] data = {
                    hasil.getString("id_jadwal"),
                    hasil.getString("id_pesawat"),
                    hasil.getString("kota_awal"),
                    hasil.getString("kota_tujuan"),
                    hasil.getString("jam_berangkat"),
                    hasil.getString("jam_sampai"),
                    hasil.getString("harga")
                };
                modelTabel.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat memuat data dari database: " + e.getMessage());
        }
    }
    
    private void muatKotaDariDatabase() {
        String sql = "SELECT nama_kota FROM kota";
        try {
            Connection koneksi = config.configDB();
            PreparedStatement statemen = koneksi.prepareStatement(sql);
            ResultSet hasil = statemen.executeQuery();

            // Mengosongkan JComboBox
            cmbKota1.removeAllItems();
            cmbKota2.removeAllItems();

            while (hasil.next()) {
                String namaKota = hasil.getString("nama_kota");
                cmbKota1.addItem(namaKota);
                cmbKota2.addItem(namaKota);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat memuat data kota dari database: " + e.getMessage());
        }
    }
    
    private void muatPesawatDariDatabase(String idPesawatTerpilih) {
        String sql = "SELECT id_pesawat, nama_pesawat FROM pesawat";
        try {
            Connection koneksi = config.configDB();
            PreparedStatement statemen = koneksi.prepareStatement(sql);
            ResultSet hasil = statemen.executeQuery();

            // Mengosongkan JComboBox
            cmbIdPesawat.removeAllItems();

            while (hasil.next()) {
                String idPesawat = hasil.getString("id_pesawat");
                String namaPesawat = hasil.getString("nama_pesawat");
                String itemCombo = idPesawat + " - " + namaPesawat;
                cmbIdPesawat.addItem(itemCombo);

                // Menetapkan item terpilih sesuai dengan data dari tabel
                if (idPesawat.equals(idPesawatTerpilih)) {
                    cmbIdPesawat.setSelectedItem(itemCombo);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat memuat data pesawat dari database: " + e.getMessage());
        }
    }
    
    private void setFormatJam(JFormattedTextField textField) {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##:##:##");
            maskFormatter.install(textField);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
  
    private void tblJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJadwalMouseClicked
        // Mendapatkan baris yang dipilih pada tabel
        int selectedRow = tblJadwal.getSelectedRow();

        // Pastikan ada baris yang dipilih
        if (selectedRow != -1) {
            // Mendapatkan nilai id_jadwal dari baris yang dipilih
            String idJadwalTerpilih = tblJadwal.getValueAt(selectedRow, 0).toString();

            // Menampilkan data terpilih di dalam JTextField dan JComboBox
            tfIdJadwal.setText(idJadwalTerpilih);

            // Menampilkan id_pesawat pada JComboBox
            String idPesawatTerpilih = tblJadwal.getValueAt(selectedRow, 1).toString();
            cmbIdPesawat.removeAllItems();
            muatPesawatDariDatabase(idPesawatTerpilih);

            // Menampilkan kota_awal pada JComboBox
            cmbKota1.setSelectedItem(tblJadwal.getValueAt(selectedRow, 2).toString());
            // Menampilkan kota_tujuan pada JComboBox
            cmbKota2.setSelectedItem(tblJadwal.getValueAt(selectedRow, 3).toString());
            tfJam1.setText(tblJadwal.getValueAt(selectedRow, 4).toString());
            tfJam2.setText(tblJadwal.getValueAt(selectedRow, 5).toString());
            tfHarga.setText(tblJadwal.getValueAt(selectedRow, 6).toString());
        }
    }//GEN-LAST:event_tblJadwalMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // Ambil nilai dari input fields
        String idJadwal = tfIdJadwal.getText();
        String idPesawat = cmbIdPesawat.getSelectedItem().toString().split(" - ")[0]; // Ambil hanya ID pesawat
        String kota1 = cmbKota1.getSelectedItem().toString();
        String kota2 = cmbKota2.getSelectedItem().toString();
        String jamBerangkat = tfJam1.getText();
        String jamSampai = tfJam2.getText();
        String harga = tfHarga.getText();

        // Validasi input kosong
        if (idJadwal.isEmpty() || idPesawat.isEmpty() || kota1.isEmpty() || kota2.isEmpty()
                || jamBerangkat.isEmpty() || jamSampai.isEmpty() || harga.isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Harap lengkapi semua field", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validasi kota_awal dan kota_tujuan tidak boleh sama
        if (kota1.equals(kota2)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Kota awal dan tujuan tidak boleh sama", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Menyimpan data ke dalam database
        String sql = "INSERT INTO jadwal (id_jadwal, id_pesawat, kota_awal, kota_tujuan, jam_berangkat, jam_sampai, harga) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = config.configDB();
            PreparedStatement stat = connection.prepareStatement(sql);

            stat.setString(1, idJadwal);
            stat.setString(2, idPesawat);
            stat.setString(3, kota1);
            stat.setString(4, kota2);
            stat.setString(5, jamBerangkat);
            stat.setString(6, jamSampai);
            stat.setString(7, harga);

            stat.executeUpdate();
            
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            

            // Kosongkan JTextField setelah penyimpanan berhasil
            tfIdJadwal.setText("");
            cmbIdPesawat.setSelectedIndex(0); // Set kembali ke indeks pertama atau sesuai kebutuhan
            cmbKota1.setSelectedIndex(0);
            cmbKota2.setSelectedIndex(0);
            tfJam1.setText("");
            tfJam2.setText("");
            tfHarga.setText("");

            // Panggil metode untuk memuat ulang data dari database ke dalam tabel
            muatDataDariDatabase();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // Ambil nilai dari input fields
        String idJadwal = tfIdJadwal.getText();
        String idPesawat = cmbIdPesawat.getSelectedItem().toString().split(" - ")[0];
        String kota1 = cmbKota1.getSelectedItem().toString();
        String kota2 = cmbKota2.getSelectedItem().toString();
        String jamBerangkat = tfJam1.getText();
        String jamSampai = tfJam2.getText();
        String harga = tfHarga.getText();

        // Validasi input kosong
        if (idJadwal.isEmpty() || idPesawat.isEmpty() || kota1.isEmpty() || kota2.isEmpty()
                || jamBerangkat.isEmpty() || jamSampai.isEmpty() || harga.isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Harap lengkapi semua field", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Validasi kota_awal dan kota_tujuan tidak boleh sama
        if (kota1.equals(kota2)) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Kota awal dan tujuan tidak boleh sama", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Update data di dalam database
        String sql = "UPDATE jadwal SET id_pesawat=?, kota_awal=?, kota_tujuan=?, jam_berangkat=?, jam_sampai=?, harga=? WHERE id_jadwal=?";
        try {
            Connection connection = config.configDB();
            PreparedStatement stat = connection.prepareStatement(sql);

            stat.setString(1, idPesawat);
            stat.setString(2, kota1);
            stat.setString(3, kota2);
            stat.setString(4, jamBerangkat);
            stat.setString(5, jamSampai);
            stat.setString(6, harga);
            stat.setString(7, idJadwal);

            stat.executeUpdate();
            
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");

            // Kosongkan JTextField setelah penyimpanan berhasil
            tfIdJadwal.setText("");
            cmbIdPesawat.setSelectedIndex(0); // Set kembali ke indeks pertama atau sesuai kebutuhan
            cmbKota1.setSelectedIndex(0);
            cmbKota2.setSelectedIndex(0);
            tfJam1.setText("");
            tfJam2.setText("");
            tfHarga.setText("");

            // Panggil metode untuk memuat ulang data dari database ke dalam tabel
            muatDataDariDatabase();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" + e);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Mendapatkan baris yang dipilih pada tabel
        int selectedRow = tblJadwal.getSelectedRow();

        // Pastikan ada baris yang dipilih
        if (selectedRow != -1) {
            // Mendapatkan nilai id_jadwal dari baris yang dipilih
            String idJadwal = tblJadwal.getValueAt(selectedRow, 0).toString();

            // Konfirmasi pengguna untuk menghapus data
            int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                // Hapus data dari database
                String sql = "DELETE FROM jadwal WHERE id_jadwal=?";
                try {
                    Connection connection = config.configDB();
                    PreparedStatement stat = connection.prepareStatement(sql);
                    stat.setString(1, idJadwal);
                    stat.executeUpdate();

                    JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS");
                    
                    // Kosongkan JTextField setelah penyimpanan berhasil
                    tfIdJadwal.setText("");
                    cmbIdPesawat.setSelectedIndex(0); // Set kembali ke indeks pertama atau sesuai kebutuhan
                    cmbKota1.setSelectedIndex(0);
                    cmbKota2.setSelectedIndex(0);
                    tfJam1.setText("");
                    tfJam2.setText("");
                    tfHarga.setText("");
                    
                    // Panggil metode untuk memuat ulang data dari database ke dalam tabel
                    muatDataDariDatabase();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "DATA GAGAL DIHAPUS" + e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try {
            String reportPath = "src/Report/LaporanJadwal.jasper";
            Connection koneksi = config.configDB();

            HashMap<String, Object> parameters = new HashMap<>();
            JasperPrint print = JasperFileManager.fillReport(reportPath, parameters, koneksi);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Displaying Report: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

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
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbIdPesawat;
    private javax.swing.JComboBox<String> cmbKota1;
    private javax.swing.JComboBox<String> cmbKota2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJadwal;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfIdJadwal;
    private javax.swing.JFormattedTextField tfJam1;
    private javax.swing.JFormattedTextField tfJam2;
    // End of variables declaration//GEN-END:variables
}
