/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.DAO.HoaDonDAO;
import qlbh.DAO.HoaDonDAOImp;
import qlbh.model.HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonServicesImp implements HoaDonServices{
    private HoaDonDAO hoaDonDAO = null;
    
    public HoaDonServicesImp(){
        this.hoaDonDAO = new HoaDonDAOImp();
    }
    @Override
    public List<HoaDon> getList() {
        return hoaDonDAO.getList();
    }

    @Override
    public int createOrUpdate(HoaDon hd) {
         return hoaDonDAO.createOrUpdate(hd);
    }
}
