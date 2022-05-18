/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.sudunginterface;

import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class ServiceImpl implements IService {

    @Override
    public GiaoVien nhapGiaoVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten : ");
        String hoten = sc.nextLine();
        System.out.println("Nhap nam sinh ");
        int namSinh = sc.nextInt();
        GiaoVien gv = new GiaoVien(id, hoten, namSinh);
        return gv;
    }

}
