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
public class HoaDon {
    private int MaHD;
    private String TenHang;
    private int SoLuong;
    private Double DonGia;
    private Double GiamGiaKH;
    private Double ThanhTien;
    private Double TongTien;
    private Date NgayLap;
    private String HoTenKH;

    public HoaDon() {
    }

    public HoaDon(int MaHD, String TenHang, int SoLuong, Double DonGia, Double GiamGiaKH, Double ThanhTien, Double TongTien, Date NgayLap, String HoTenKH) {
        this.MaHD = MaHD;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.GiamGiaKH = GiamGiaKH;
        this.ThanhTien = ThanhTien;
        this.TongTien = TongTien;
        this.NgayLap = NgayLap;
        this.HoTenKH = HoTenKH;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
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

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
        this.HoTenKH = HoTenKH;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHD=" + MaHD + ", TenHang=" + TenHang + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", GiamGiaKH=" + GiamGiaKH + ", ThanhTien=" + ThanhTien + ", TongTien=" + TongTien + ", NgayLap=" + NgayLap + ", HoTenKH=" + HoTenKH + '}';
    }
    
      
   
}
