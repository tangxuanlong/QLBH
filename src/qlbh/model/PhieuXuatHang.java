/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import java.util.Date;

/**
 *
 * @author Steven
 */
public class PhieuXuatHang {
    int MaXuat,MaHH,SoLuong;
    String TenHH;

    public PhieuXuatHang() {
    }

    public PhieuXuatHang(int MaXuat, int MaHH, int SoLuong, String TenHH) {
        this.MaXuat = MaXuat;
        this.MaHH = MaHH;
        this.SoLuong = SoLuong;
        this.TenHH = TenHH;
    }

    public int getMaXuat() {
        return MaXuat;
    }

    public void setMaXuat(int MaXuat) {
        this.MaXuat = MaXuat;
    }

    public int getMaHH() {
        return MaHH;
    }

    public void setMaHH(int MaHH) {
        this.MaHH = MaHH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTenHH() {
        return TenHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    @Override
    public String toString() {
        return "PhieuXuatHang{" + "MaXuat=" + MaXuat + ", MaHH=" + MaHH + ", SoLuong=" + SoLuong + ", TenHH=" + TenHH + '}';
    }
    

   
    
}
