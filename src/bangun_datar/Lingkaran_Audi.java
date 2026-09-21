/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author user
 */
public class Lingkaran_Audi {
private double id_Lingkaran;
private double jari_jari;
private double diameter;
private double luas;
private double keliling;

    public Lingkaran_Audi(double id_Lingkaran, double jari_jari, double diameter, double luas, double keliling) {
        this.id_Lingkaran = id_Lingkaran;
        this.jari_jari = jari_jari;
        this.diameter = diameter;
        this.luas = luas;
        this.keliling = keliling;
        
    }

    public double getId_Lingkaran() {
        return id_Lingkaran;
    }

    public void setId_Lingkaran(double id_Lingkaran) {
        this.id_Lingkaran = id_Lingkaran;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
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

}
