/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Administrator
 */
class Diem {

    public int x = 0;
    public int y = 0;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class HinhChuNhat implements Comparable {

    public int chieuDai = 0;
    public int chieuRong = 0;
    public Diem diemTraiTren;

    public HinhChuNhat() {
        diemTraiTren = new Diem(0, 0);
    }

    public HinhChuNhat(Diem d) {
        diemTraiTren = d;
    }

    public HinhChuNhat(int dai, int rong) {
        diemTraiTren = new Diem(0, 0);
        chieuDai = dai;
        chieuRong = rong;
    }

    public HinhChuNhat(Diem d, int dai, int rong) {
        diemTraiTren = d;
        chieuDai = dai;
        chieuRong = rong;
    }

    public void diChuyen(int x1, int y1) {
        diemTraiTren.x = x1;
        diemTraiTren.y = y1;
    }

    public int chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public int dienTich() {
        return (chieuDai * chieuRong);
    }

    public int compareTo(Object other) {
        HinhChuNhat chuNhat = (HinhChuNhat) other;
        if (this.dienTich() < chuNhat.dienTich()) {
            return -1;
        } else if (this.dienTich() > chuNhat.dienTich()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhChuNhat h1=new HinhChuNhat(10,20);
        HinhChuNhat h2=new HinhChuNhat(20,30);
        System.out.println("Ket qua so sanh hai hinh chu nhat: "+h1.compareTo(h2));
    }

}
