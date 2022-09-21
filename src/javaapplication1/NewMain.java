/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


class Base {
    int i;
    void nhap(int i){
        this.i=i;
    }
}
class Derived extends Base{
    int i;
    void inThongTin(){
        System.out.println("i cua Base: "+super.i);
        System.out.println("i cua Derived: "+this.i);
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
        Derived d=new Derived();
        d.i=10;d.nhap(20);
        d.inThongTin();
    }
    
}
