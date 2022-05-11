/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.oop;

import java.util.ArrayList;
import java.util.Scanner;
import mob1023.oop.entity.DongVat;
import mob1023.oop.service.DongVatService;

/**
 *
 * @author nguyenvv
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DongVatService dongVatService = new DongVatService();

        ArrayList<DongVat> listDongVat = new ArrayList();

        while (true) {
            DongVat dvInput = dongVatService.nhap();
            listDongVat.add(dvInput);
            System.out.println("Ban co nhap tiep hay khong ?");
            String nhapTiep = sc.nextLine();
            if ("no".equals(nhapTiep)) {
                break;
            }
        }
        for (DongVat dongVat : listDongVat) {
            dongVat.display();
        }
        System.out.println("==========");
        
        ArrayList<DongVat> result = dongVatService.searchTheoCanNang(listDongVat, 2, 5);
        
        for (DongVat dongVat : result) {
            dongVat.display();
        }
    }

}
