/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.DAO;

import java.util.List;
import qlbh.model.KhachHang;

/**
 *
 * @author Admin
 */
public interface KhachHangDAO {
    public List<KhachHang> getList();

    public int createOrUpdate(KhachHang kh);

    
}
