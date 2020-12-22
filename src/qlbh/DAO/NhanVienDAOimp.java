package qlbh.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlbh.model.NhanVien;
import qlbh.controller.ConnectToSQL;

/**
 *
 * @author Steven
 */
public class NhanVienDAOimp implements NhanVienDAO {

    @Override
    public List<NhanVien> getList() {

        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "Select * from tb_NhanVien";
            List<NhanVien> list = new ArrayList<>();
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getInt("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("SDT"));
                nv.setTinhTrang(rs.getBoolean("TinhTrang"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                list.add(nv);
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
    public int createOrUpdate(NhanVien nv) {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "INSERT INTO tb_NhanVien(MaNV, TenNV, GioiTinh, NgaySinh, SDT, DiaChi, TinhTrang) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)   ";
            PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nv.getMaNV());
            ps.setString(2, nv.getTenNV());
            ps.setDate(4, new Date(nv.getNgaySinh().getTime()));
            ps.setBoolean(3, nv.getGioiTinh());
            ps.setString(6, nv.getSDT());
            ps.setString(5, nv.getDiaChi());
            ps.setBoolean(7, nv.getTinhTrang());
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

//    public int delete(NhanVien nv){
//         try {
//            Connection conn = ConnectToSQL.getConnection();
//            String sql = "DELETE FROM Table WHERE TenNV = ";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            
//            ps.close();
//            conn.close();
//           
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return 0;
//    }
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAOimp();
        System.out.println(nhanVienDAO.getList());
    }
}
