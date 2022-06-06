/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1023.thread;

import java.util.Calendar;

/**
 *
 * @author hangnt
 */
public class Bai1 implements Runnable {

    @Override
    public void run() {

        //Show dong ho co gio phut giay
        try {
            while (true) {
                // lay ra moi thong tin h phut giay cua he thong
                Calendar cal = Calendar.getInstance();
                int h = cal.get(Calendar.HOUR);
                int m = cal.get(Calendar.MINUTE);
                int s = cal.get(Calendar.SECOND);
                System.out.println(h + ":" + m + ":" + s);
                Thread.sleep(1000);
                // Ngoai le ngat

            }
        } catch (InterruptedException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void main(String[] args) {
        new Bai1().run();
    }

}
