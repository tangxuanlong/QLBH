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
public class ThongKe {
    private int MaTK;
    private Double TongTienNhap;
    private Double TongTienBan;
    private Date NgayTK;    

    public ThongKe() {
    }

    public ThongKe(int MaTK, Double TongTienNhap, Double TongTienBan, Date NgayTK) {
        this.MaTK = MaTK;
        this.TongTienNhap = TongTienNhap;
        this.TongTienBan = TongTienBan;
        this.NgayTK = NgayTK;
    }

    public int getMaTK() {
        return MaTK;
    }

    public void setMaTK(int MaTK) {
        this.MaTK = MaTK;
    }

    public Double getTongTienNhap() {
        return TongTienNhap;
    }

    public void setTongTienNhap(Double TongTienNhap) {
        this.TongTienNhap = TongTienNhap;
    }

    public Double getTongTienBan() {
        return TongTienBan;
    }

    public void setTongTienBan(Double TongTienBan) {
        this.TongTienBan = TongTienBan;
    }

    public Date getNgayTK() {
        return NgayTK;
    }

    public void setNgayTK(Date NgayTK) {
        this.NgayTK = NgayTK;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "MaTK=" + MaTK + ", TongTienNhap=" + TongTienNhap + ", TongTienBan=" + TongTienBan + ", NgayTK=" + NgayTK + '}';
    }
    
    
}
