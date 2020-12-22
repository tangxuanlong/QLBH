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
import qlbh.controller.ConnectToSQL;
import qlbh.model.HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonDAOImp implements HoaDonDAO{
    @Override
    public List<HoaDon> getList() {

        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_HoaDon";
            List<HoaDon> list = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setHoTenKH(rs.getString("HoTenKH"));
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setTenHang(rs.getString("TenHang"));
                hd.setSoLuong(rs.getInt("SoLuong"));
                hd.setDonGia(rs.getDouble("DonGia"));
                hd.setGiamGiaKH(rs.getDouble("GiamGiaKH"));
                hd.setThanhTien(rs.getDouble("ThanhTien"));
                hd.setTongTien(rs.getDouble("TongTien"));
                hd.setNgayLap(rs.getDate("NgayLap"));                
                list.add(hd);
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
    public int createOrUpdate(HoaDon hd) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_HoaDon(HoTenKH, MaHD, TenHang, SoLuong, DonGia, GiamGiaKH, ThanhTien, TongTien, NgayLap) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)   ";
            PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, hd.getHoTenKH());
            ps.setInt(2, hd.getMaHD());
            ps.setString(3, hd.getTenHang());
            ps.setInt(4, hd.getSoLuong());
            ps.setDouble(5, hd.getDonGia());
            ps.setDouble(6, hd.getGiamGiaKH());
            ps.setDouble(7, hd.getThanhTien());
            ps.setDouble(8, hd.getTongTien());
            ps.setDate(9,  new Date(hd.getNgayLap().getTime()));
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
