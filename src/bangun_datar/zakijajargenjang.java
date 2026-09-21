/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author zaki reza
 */
public class zakijajargenjang {
    
    private double alas;
 private double tinggi;
 private double sisimiring;
 private double luas;
 private double keliling;

    public zakijajargenjang(double alas, double tinggi, double sisimiring, double luas, double keliling) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisimiring = sisimiring;
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

    public double getSisimiring() {
        return sisimiring;
    }

    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
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
    public void tampilHasil() {
    System.out.println(getAlas());
    System.out.println(getTinggi());
    System.out.println(getSisimiring());
    System.out.println(getLuas());
    System.out.println(getKeliling());
    
    }

}
