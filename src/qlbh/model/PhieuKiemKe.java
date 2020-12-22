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
public class PhieuKiemKe {
    int MaKiemKe, MaNV;
    Date NgayKiemKe;
    int SoLuong;
    String TinhTrang;

    public PhieuKiemKe() {
    }

    public PhieuKiemKe(int MaKiemKe, int MaNV, Date NgayKiemKe, int SoLuong, String TinhTrang) {
        this.MaKiemKe = MaKiemKe;
        this.MaNV = MaNV;
        this.NgayKiemKe = NgayKiemKe;
        this.SoLuong = SoLuong;
        this.TinhTrang = TinhTrang;
    }

    public int getMaKiemKe() {
        return MaKiemKe;
    }

    public void setMaKiemKe(int MaKiemKe) {
        this.MaKiemKe = MaKiemKe;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayKiemKe() {
        return NgayKiemKe;
    }

    public void setNgayKiemKe(Date NgayKiemKe) {
        this.NgayKiemKe = NgayKiemKe;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public String toString() {
        return "PhieuKiemKe{" + "MaKiemKe=" + MaKiemKe + ", MaNV=" + MaNV + ", NgayKiemKe=" + NgayKiemKe + ", SoLuong=" + SoLuong + ", TinhTrang=" + TinhTrang + '}';
    }
    

    
}
