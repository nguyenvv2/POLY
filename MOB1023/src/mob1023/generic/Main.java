/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.generic;

import java.util.List;

/**
 *
 * @author nguyenvv
 */
public class Main {

    public static void main(String[] args) {
        IService<NhanVien> nhanVienIService = new Service<>();
        IService<LopHoc> lopIService = new Service<>();
        NhanVien nv = new NhanVien("Nguyen Van A");
        NhanVien nv1 = new NhanVien("Nguyen Van C");
        NhanVien nv2 = new NhanVien("Nguyen Van D");
        nhanVienIService.add(nv);
        nhanVienIService.add(nv1);
        nhanVienIService.add(nv2);
        LopHoc lopHoc = new LopHoc("Ten Lop");
        lopIService.add(lopHoc);
        List<LopHoc> listLopHoc = lopIService.getList();
        List<NhanVien> list = nhanVienIService.getList();
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien.toString());
        }
        for (LopHoc lop : listLopHoc) {
            System.out.println(lop.toString());
        }
    }
}
