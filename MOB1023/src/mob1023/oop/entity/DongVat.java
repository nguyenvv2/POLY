/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.oop.entity;

/**
 *
 * @author nguyenvv
 */
public class DongVat {

    private String maDv;

    private String tenDV;

    private double canNanng;

    public DongVat(String maDv, String tenDV, double canNanng) {
        this.maDv = maDv;
        this.tenDV = tenDV;
        this.canNanng = canNanng;
    }

    public DongVat() {
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getCanNanng() {
        return canNanng;
    }

    public void setCanNanng(double canNanng) {
        this.canNanng = canNanng;
    }

    public void display() {
        System.out.println("maDV : " + maDv);
        System.out.println("Ten DV : " + tenDV);
        System.out.println("Can nang : " + canNanng);
    }
}
