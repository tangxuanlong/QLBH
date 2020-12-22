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
import qlbh.model.HangHoa;

/**
 *
 * @author Steven
 */
public class HangHoaDAOImp implements HangHoaDAO{

    @Override
    public List<HangHoa> getList() {

        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_HangHoa";
            List<HangHoa> list = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HangHoa hh = new HangHoa();
                hh.setMaHH(rs.getInt("MaHH"));
                hh.setTenHang(rs.getString("TenHang"));
                hh.setNgaySX(rs.getDate("NgaySX"));
                hh.setHanSuDung(rs.getDate("HanSuDung"));
                hh.setLoaiHang(rs.getString("LoaiHang"));
                hh.setXuatSu(rs.getString("XuatSu"));
                hh.setGiaBan(rs.getDouble("GiaBan"));
                hh.setGiaNhap(rs.getDouble("GiaNhap"));
                hh.setDonVi(rs.getString("DonVi"));
                hh.setSoLuong(rs.getInt("SoLuong"));
                hh.setTrangThai(rs.getString("TrangThai"));
                list.add(hh);
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
    public int createOrUpdate(HangHoa hh) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_HangHoa(MaHH, TenHang, NgaySX, HanSuDung, LoaiHang, XuatSu, GiaBan, GiaNhap, DonVi, SoLuong, TrangThai) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)   ";
            PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, hh.getMaHH());
            ps.setString(2, hh.getTenHang());
            ps.setDate(3, new Date(hh.getNgaySX().getTime()));
            ps.setDate(4, new Date(hh.getHanSuDung().getTime()));
            ps.setString(5, hh.getLoaiHang());
            ps.setString(6, hh.getXuatSu());
            ps.setDouble(7, hh.getGiaBan());
            ps.setDouble(8, hh.getGiaNhap());
            ps.setString(9, hh.getDonVi());
            ps.setInt(10, hh.getSoLuong());
            ps.setString(11, hh.getTrangThai());
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
