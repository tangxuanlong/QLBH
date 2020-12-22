/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.services;

import java.util.List;
import qlbh.DAO.HangHoaDAO;
import qlbh.DAO.HangHoaDAOImp;
import qlbh.model.HangHoa;

/**
 *
 * @author Admin
 */
public class HangHoaServicesImp implements HangHoaServices{
    private HangHoaDAO hangHoaDAO = null;
    
    public HangHoaServicesImp(){
        this.hangHoaDAO = new HangHoaDAOImp();
    }
    @Override
    public List<HangHoa> getList() {
        return hangHoaDAO.getList();
    }

    @Override
    public int createOrUpdate(HangHoa hh) {
         return hangHoaDAO.createOrUpdate(hh);
    }

   
    
}
