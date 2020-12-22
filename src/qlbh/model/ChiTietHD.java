/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import java.sql.Date;

/**
 *
 * @author Steven
 */
public class ChiTietHD {
    String  MaHH;
    int MaHD,SoLuong;
    Double DonGia,GiamGiaKH,ThanhTien,TongTien;
    Date NgayLap;

    public ChiTietHD() {
    }

    public ChiTietHD(String MaHH, int MaHD, int SoLuong, Double DonGia, Double GiamGiaKH, Double ThanhTien, Double TongTien, Date NgayLap) {
        this.MaHH = MaHH;
        this.MaHD = MaHD;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.GiamGiaKH = GiamGiaKH;
        this.ThanhTien = ThanhTien;
        this.TongTien = TongTien;
        this.NgayLap = NgayLap;
    }

    public String getMaHH() {
        return MaHH;
    }

    public void setMaHang(String MaHang) {
        this.MaHH = MaHH;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Double getGiamGiaKH() {
        return GiamGiaKH;
    }

    public void setGiamGiaKH(Double GiamGiaKH) {
        this.GiamGiaKH = GiamGiaKH;
    }

    public Double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public Double getTongTien() {
        return TongTien;
    }

    public void setTongTien(Double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    @Override
    public String toString() {
        return "ChiTietHD{" + "MaHH=" + MaHH + ", MaHD=" + MaHD + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", GiamGiaKH=" + GiamGiaKH + ", ThanhTien=" + ThanhTien + ", TongTien=" + TongTien + ", NgayLap=" + NgayLap + '}';
    }

    
    
    
}
