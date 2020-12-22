/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.DAO.NhanVienDAO;
import qlbh.DAO.NhanVienDAOimp;
import qlbh.model.NhanVien;

/**
 *
 * @author Steven
 */
public class NhanVienServicesImp implements NhanVienServices{
    
    private NhanVienDAO nhanVienDAO = null;
    
    public NhanVienServicesImp(){
        this.nhanVienDAO = new NhanVienDAOimp();
    }
    @Override
    public List<NhanVien> getList() {
        return nhanVienDAO.getList();
    }

    @Override
    public int createOrUpdate(NhanVien nv) {
         return nhanVienDAO.createOrUpdate(nv);
    }
    
}
