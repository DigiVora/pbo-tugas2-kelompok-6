/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author ACER
 */
public class Segitiga_shofi {
private  double alas;
private  double tinggi;
private  double sisiA;
private  double sisiB;
private  double sisiC;
private  double luas;
private  double keliling;

    public Segitiga_shofi(double alas, double tinggi, double sisiA, double sisiB, double sisiC, double luas, double keliling) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.luas = luas;
        this.keliling = keliling;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiA() {
        return sisiA;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public double getSisiB() {
        return sisiB;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public double getSisiC() {
        return sisiC;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
        public void tampilHasil(){
        System.out.println("Alas : " + getAlas()); 
        System.out.println("Tinggi : " + getTinggi());
        System.out.println("Sisi A : " + getSisiA()); 
        System.out.println("Sisi B : " + getSisiB());
        System.out.println("Sisi C : " + getSisiC()); 
        System.out.println("Luas : " + getLuas()); 
        System.out.println("Keliling : " + getKeliling());
        }
}
