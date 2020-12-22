/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import qlbh.DAO.KhachHangDAOImp;
import java.util.List;
import qlbh.DAO.KhachHangDAO;
import qlbh.model.KhachHang;
import qlbh.DAO.KhachHangDAOImp;
/**
 *
 * @author Admin
 */
public class KhachHangServicesImp implements KhachHangServices {

    private KhachHangDAO khachHangDAO = null;

    public KhachHangServicesImp() {
        this.khachHangDAO = new KhachHangDAOImp();
    }

    @Override
    public List<KhachHang> getList() {
        return khachHangDAO.getList();
    }

    @Override
    public int createOrUpdate(KhachHang kh) {
        return khachHangDAO.createOrUpdate(kh);

    }

}
