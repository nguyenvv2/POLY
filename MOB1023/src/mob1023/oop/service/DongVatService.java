/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.oop.service;

import java.util.ArrayList;
import java.util.Scanner;
import mob1023.oop.entity.DongVat;

/**
 *
 * @author nguyenvv
 */
public class DongVatService {

    public DongVat nhap() {
        Scanner sc = new Scanner(System.in);
        DongVat dv = new DongVat();
        System.out.println("Nhap maDV : ");
        String madv = sc.nextLine();
        System.out.println("Nhap ten DV : ");
        String tenDv = sc.nextLine();
        System.out.println("Nhap can nang: ");
        double canNang = sc.nextDouble();

        dv.setTenDV(tenDv);
        dv.setMaDv(madv);
        dv.setCanNanng(canNang);
        return dv;
    }

    public ArrayList<DongVat> searchTheoCanNang(ArrayList<DongVat> listDongVats,
            int min, int max) {
        ArrayList<DongVat> output = new ArrayList<>();
        for (DongVat dv : listDongVats) {
            if (dv.getCanNanng() >= min && dv.getCanNanng() <= max) {
                output.add(dv);
            }
        }
        return output;
    }

    public ArrayList<DongVat> searchTheoTen(ArrayList<DongVat> listDongVats,
            String ten) {
        ArrayList<DongVat> output = new ArrayList<>();
        for (DongVat dv : listDongVats) {
            if (dv.getTenDV().startsWith(ten)) {
                output.add(dv);
            }
        }
        return output;
    }

}
