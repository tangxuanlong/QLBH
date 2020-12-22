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
public class HangHoa {

    private int MaHH;
    private String TenHang;
    private Date NgaySX;
    private Date HanSuDung;
    private String LoaiHang;
    private String XuatSu;
    private Double GiaBan;
    private Double GiaNhap;
    private String DonVi;
    private int SoLuong;
    private String TrangThai;
    

    public HangHoa() {
    }

    public HangHoa(int MaHH, String TenHang, Date NgaySX, Date HanSuDung, String LoaiHang, String XuatSu, Double GiaBan, Double GiaNhap, String DonVi, int SoLuong, String TrangThai) {
        this.MaHH = MaHH;
        this.TenHang = TenHang;
        this.NgaySX = NgaySX;
        this.HanSuDung = HanSuDung;
        this.LoaiHang = LoaiHang;
        this.XuatSu = XuatSu;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.DonVi = DonVi;
        this.SoLuong = SoLuong;
        this.TrangThai = TrangThai;
    }

    public int getMaHH() {
        return MaHH;
    }

    public void setMaHH(int MaHH) {
        this.MaHH = MaHH;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public Date getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Date NgaySX) {
        this.NgaySX = NgaySX;
    }

    public Date getHanSuDung() {
        return HanSuDung;
    }

    public void setHanSuDung(Date HanSuDung) {
        this.HanSuDung = HanSuDung;
    }

    public String getLoaiHang() {
        return LoaiHang;
    }

    public void setLoaiHang(String LoaiHang) {
        this.LoaiHang = LoaiHang;
    }

    public String getXuatSu() {
        return XuatSu;
    }

    public void setXuatSu(String XuatSu) {
        this.XuatSu = XuatSu;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public Double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "MaHH=" + MaHH + ", TenHang=" + TenHang + ", NgaySX=" + NgaySX + ", HanSuDung=" + HanSuDung + ", LoaiHang=" + LoaiHang + ", XuatSu=" + XuatSu + ", GiaBan=" + GiaBan + ", GiaNhap=" + GiaNhap + ", DonVi=" + DonVi + ", SoLuong=" + SoLuong + ", TrangThai=" + TrangThai + '}';
    }

    
}
