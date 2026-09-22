/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author achmad_khusnul_yakin
 */
public class Bangun_datar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Lingkaran
        Lingkaran_Audi lingkaran = new Lingkaran_Audi(
            7,      // jari_jari
            14,     // diameter
            154,    // luas
            43.96   // keliling.
        );
        lingkaran.tampilHasil();
    
        // Persegi
        double nilaiSisi = 8.0;
        Persegi_Yakin persegi = new Persegi_Yakin(nilaiSisi);
        persegi.tampilkanData();
        
        // Persegi Panjang
        persegiPanjang_Khabib bangun = new persegiPanjang_Khabib(20,15);
        bangun.tampilkanHasil();
        
        // Segitiga
        Segitiga_shofi sgt1 = new Segitiga_shofi(10, 8, 10, 10, 12, 40, 32);
        sgt1.tampilHasil();
    }
}
