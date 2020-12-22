/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlbh.DAO.KhachHangDAO;
import qlbh.controller.ConnectToSQL;
import qlbh.model.KhachHang;

/**
 *
 * @author Admin
 */
public class KhachHangDAOImp implements KhachHangDAO {

    public KhachHangDAOImp() {
    }

    @Override
    public List<KhachHang> getList() {

        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_KhachHang";
            List<KhachHang> list = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setHoTenKH(rs.getString("HoTenKH"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiemTT(rs.getInt("DiemTT"));
                list.add(kh);
            }
            ps.close();
            conn.close();
            rs.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public int createOrUpdate(KhachHang kh) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_KhachHang(MaKH, HoTenKH, NgaySinh, DiaChi, SDT, DiemTT) "
                    + "VALUES(?, ?, ?, ?, ?, ?)   ";
            PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, kh.getMaKH());
            ps.setString(2, kh.getHoTenKH());
            ps.setDate(3, new Date(kh.getNgaySinh().getTime()));
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getSDT());
            ps.setInt(6, kh.getDiemTT());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            conn.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

}
