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
    private double jari_jari;
    private double phi = 3.14;

    public Lingkaran_Audi(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getDiameter() {
        return 2 * jari_jari;
    }

    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    public double getKeliling() {
        return 2 * phi * jari_jari;
    }

    public void tampilHasil() {
        System.out.println("=================================");
        System.out.println("         BANGUN LINGKARAN        ");
        System.out.println("=================================");
        System.out.println("Jari-jari : " + jari_jari);
        System.out.println("Phi       : " + phi);
        System.out.println("Diameter  : " + getDiameter());
        System.out.println("Luas      : " + getLuas());
        System.out.println("Keliling  : " + getKeliling());
        System.out.println("=================================");
    }
}