/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.swing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenvv
 */
public class GiangVienService {

    private List<GiaoVien> listGiaoViens = new ArrayList<>();

    public GiangVienService() {
        GiaoVien gv = new GiaoVien("Dungna", 1, "Dũng", 1999, 1, "0865880779");
        GiaoVien gv1 = new GiaoVien("Minhdq", 2, "Minh", 2000, 1, "0865880779");
        GiaoVien gv2 = new GiaoVien("Thientt", 3, "Thiện", 2001, 1, "0865880779");
        GiaoVien gv3 = new GiaoVien("Loantt", 4, "Loan", 2002, 0, "0865880779");
        GiaoVien gv4 = new GiaoVien("Quangck", 5, "Quang", 1999, 1, "0865880779");
        GiaoVien gv5 = new GiaoVien("Datlt", 6, "Đạt", 2000, 1, "0865880779");
        listGiaoViens.add(gv);
        listGiaoViens.add(gv1);
        listGiaoViens.add(gv2);
        listGiaoViens.add(gv3);
        listGiaoViens.add(gv4);
        listGiaoViens.add(gv5);
    }

    public List<GiaoVien> getlstGiaoVien() {
        return listGiaoViens;
    }
    
    public boolean addGiaoVien(GiaoVien giaoVien) {
        if (giaoVien != null) {
            listGiaoViens.add(giaoVien);
            return true;
        }
        return false;
    }

}
