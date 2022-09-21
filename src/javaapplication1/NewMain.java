/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


interface GiaoDienCha1{
    default public void phuongThuc1(int key){
        System.out.println("p1 g1");
    }
}
interface GiaoDienCha2{
    default public void phuongThuc1(int key){
        System.out.println("p1 g2");
    }
}
class Lop implements GiaoDienCha1, GiaoDienCha2{
    public void phuongthuc1(int key){
        GiaoDienCha1.super.phuongThuc1(key);
        System.out.println("phuong thuc 1 trong class Lop");
    }
}
/**
 *
 * @author Administrator
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Lop lop=new Lop();
        
    }
    
}
