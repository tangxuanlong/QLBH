/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private int MaKH;
    private String HoTenKH;
    private Date NgaySinh;
    private String DiaChi;
    private String SDT;
    private int DiemTT;

    public KhachHang() {
    }

    public KhachHang(int MaKH, String HoTenKH, Date NgaySinh, String DiaChi, String SDT, int DiemTT) {
        this.MaKH = MaKH;
        this.HoTenKH = HoTenKH;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.DiemTT = DiemTT;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String HoTenKH) {
        this.HoTenKH = HoTenKH;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getDiemTT() {
        return DiemTT;
    }

    public void setDiemTT(int DiemTT) {
        this.DiemTT = DiemTT;
    }

}
