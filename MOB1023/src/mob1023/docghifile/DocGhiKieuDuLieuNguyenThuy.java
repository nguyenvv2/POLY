/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.docghifile;

import mob1023.ontap.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenvv
 */
public class DocGhiKieuDuLieuNguyenThuy {

    public static void main(String[] args) throws IOException {
        /*
        ❑2 luồng này giúp chúng ta đọc/ghi dữ liệu
        nguyên thủy
        ❑Sử dụng read<Type>() để đọc dữ liệu nguyên
        thủy từ DataInputStream
        ❖readInt()
        ❖readDouble()…
        ❑Sử dụng write<Type>(Type) để ghi dữ liệu
        nguyên thủy lên DataOutputStream
        ❖writeBoolen(boolean)
        ❖writeInt(int)
         */
        ghiFileDataOutputStream();
        docFileDataInputStream();
    }

    static void ghiFileDataOutputStream() {

        try {
            File file = new File("dataName.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            int nam = 2020;
            String name = "JAVA 2 TUYỆT VỜI";
            int nam1 = 2022;
            String name1 = "Bạn sớm ra trường thôi";
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(nam);
            dos.writeInt(nam1);
            dos.writeUTF(name);
            dos.writeUTF(name1);

            dos.flush();
            dos.close();
        } catch (IOException ex) {
            Logger.getLogger(DocGhiKieuDuLieuNguyenThuy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void docFileDataInputStream() throws IOException {
//        File file = new File("dataName.txt");
//        if (!file.exists()) {
//            file.createNewFile();
//        }

        FileInputStream fis = new FileInputStream("dataName.txt");
        DataInputStream dis = new DataInputStream(fis);
        int id = dis.readInt();
        int id1 = dis.readInt();
        String name1 = dis.readUTF();
        String name = dis.readUTF();

        System.out.println("Năm: " + id + ", Môn: " + name);
        System.out.println("Năm: " + id1 + ", Môn: " + name1);

        dis.close();
    }

}
