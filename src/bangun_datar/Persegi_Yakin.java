/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author achmad_khusnul_yakin
 */

/**
 * Class Persegi_Yakin
 * Nama : Achmad Khusnul Yakin
 * Nim : 202557201001
 * Prodi : Sistem Informasi
 * Semester : 3
 * Tugas Kelompok 6 PBO - Bangun Datar
 */
public class Persegi_Yakin {
    
    // 1. Atribut
    private double sisi;
    private double luas;
    private double keliling;

    // 2. Konstruktor
    public Persegi_Yakin() {
        this.sisi = 0;
        this.luas = 0;
        this.keliling = 0;
    }

    // 3. Konstruktor Berparameter (Otomatis menghitung luas dan keliling)
    public Persegi_Yakin(double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
    }

    // 4. Getter & Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
        hitungLuas();
        hitungKeliling();
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

    // 5. Metode Perhitungan (Void)
    public void hitungLuas() {
        this.luas = this.sisi * this.sisi;
    }

    public void hitungKeliling() {
        this.keliling = 4 * this.sisi;
    }

    // 6. Output to Console
    public void tampilkanData() {
        System.out.println("=================================");
        System.out.println("          BANGUN PERSEGI         ");
        System.out.println("=================================");
        System.out.println("Panjang Sisi : " + this.sisi);
        System.out.println("Luas         : " + this.luas);
        System.out.println("Keliling     : " + this.keliling);
        System.out.println("=================================");
    }
    
}
