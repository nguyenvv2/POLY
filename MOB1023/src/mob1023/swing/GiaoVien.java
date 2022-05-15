/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.swing;

/**
 *
 * @author nguyenvv
 */
public class GiaoVien {

    private String magv;
    private int id;
    private String tengv;
    private int namSinh;
    private int gioiTinh;
    private String sdt;

    public GiaoVien(String magv, int id, String tengv, int namSinh, int gioiTinh, String sdt) {
        this.magv = magv;
        this.id = id;
        this.tengv = tengv;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public GiaoVien() {
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    
}
