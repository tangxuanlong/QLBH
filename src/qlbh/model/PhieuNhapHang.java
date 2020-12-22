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
public class PhieuNhapHang {
    int MaNhap,SoLuong;
    Double GiaNhap,TongTien;
    Date NgayNhap;

    public PhieuNhapHang() {
    }

    public PhieuNhapHang(int MaNhap, int SoLuong, Double GiaNhap, Double TongTien, Date NgayNhap) {
        this.MaNhap = MaNhap;
        this.SoLuong = SoLuong;
        this.GiaNhap = GiaNhap;
        this.TongTien = TongTien;
        this.NgayNhap = NgayNhap;
    }

    public int getMaNhap() {
        return MaNhap;
    }

    public void setMaNhap(int MaNhap) {
        this.MaNhap = MaNhap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    @Override
    public String toString() {
        return "PhieuNhapHang{" + "MaNhap=" + MaNhap + ", SoLuong=" + SoLuong + ", GiaNhap=" + GiaNhap + ", TongTien=" + TongTien + ", NgayNhap=" + NgayNhap + '}';
    }
    

    
}
