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
private double diameter;
private double luas;
private double keliling;

        public Lingkaran_Audi(double jari_jari, double diameter, double luas, double keliling) {
            this.jari_jari = jari_jari;
            this.diameter = diameter;
            this.luas = luas;
            this.keliling = keliling;
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

        public void tampilHasil(){
        System.out.println("=================================");
        System.out.println("          BANGUN LINGKARAN         ");
        System.out.println("=================================");
        System.out.println("jari_jari : " + jari_jari);
        System.out.println("Diameter  : " + diameter);
        System.out.println("Luas      : " + luas);
        System.out.println("Keliling  : " + keliling);
        System.out.println("=================================");
}
        
}
