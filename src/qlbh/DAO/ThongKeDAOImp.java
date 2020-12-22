/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlbh.beans.HangHoaBean;
import qlbh.controller.ConnectToSQL;

/**
 *
 * @author Steven
 */
public class ThongKeDAOImp implements ThongKeDAO {

    @Override
    public List<HangHoaBean> getListByHangHoa() {
        try {
            Connection conn = ConnectToSQL.getConnection();
            String sql = "";  //Lay query sql
            List<HangHoaBean> list = new ArrayList<>();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HangHoaBean hangHoaBean = new HangHoaBean();    
                hangHoaBean.setNgayNhap(rs.getString("NgayNhap"));
                hangHoaBean.setTenHang(rs.getString("TenHang"));
                hangHoaBean.setSoLuongHang(rs.getInt("SoLuong"));
                list.add(hangHoaBean);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
