/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.beans;

/**
 *
 * @author Steven
 */
public class HangHoaBean {
    private String ngayNhap;
    private int soLuongHang;
    private String TenHang;

    public HangHoaBean() {
    }
    
    

    public HangHoaBean(String ngayNhap, int soLuongHang, String TenHang) {
        this.ngayNhap = ngayNhap;
        this.soLuongHang = soLuongHang;
        this.TenHang = TenHang;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuongHang() {
        return soLuongHang;
    }

    public void setSoLuongHang(int soLuongHang) {
        this.soLuongHang = soLuongHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }
    
    
}
