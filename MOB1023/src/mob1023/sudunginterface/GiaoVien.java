/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.sudunginterface;

/**
 *
 * @author nguyenvv
 */
public class GiaoVien {
    private int id;
    private String tengv;
    private int namSinh;

    public GiaoVien(int id, String tengv, int namSinh) {
        this.id = id;
        this.tengv = tengv;
        this.namSinh = namSinh;
    }

    public GiaoVien() {
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
    
}
