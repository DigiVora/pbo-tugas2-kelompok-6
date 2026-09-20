/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author ThinkPad
 */
public class belahketupat_aditya {
//membuat atribut
    private double sisi;
    private double diagonal1;
    private double diagonal2;

     public belahketupat_aditya(double sisi, double diagonal1, double diagonal2) {
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
     // membuat setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    
  
//membuat getter
    public double getSisi() {
        return sisi;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

     public double hitungLuas() {
        return (diagonal1 * diagonal2) ;
    }
     
     public double hitungKeliling(){
         return 4*sisi;
     }
    public void tampilHasil(){
    //membuat objek belah ketupat
   
    
    //mengisi nilai menggunakan setter

    //menampilkan data
    
    System.out.println("=== BELAH KETUPAT ===");
    System.out.println("sisi       : " + getSisi());
    System.out.println("Diagonal 1 : " + getDiagonal1());
    System.out.println("Diagonal 2 : " + getDiagonal2());
    
    //menampilkan hasil perhitungan
     System.out.println("Luas       : " + hitungLuas());
     System.out.println("Keliing   : " + hitungKeliling());
    }
}

