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
        
        // Lingkaran

        Lingkaran_Audi lkr = new Lingkaran_Audi(7);
        System.out.println("=================================");
        System.out.println("          BANGUN LINGKARAN       ");
        System.out.println("=================================");
        System.out.println("jari_jari\t\t:" + lkr.getJari_jari());
        System.out.println("Diameter\t\t:" + lkr.getDiameter());
        System.out.println("Luas\t\t\t:" + lkr.getLuas());
        System.out.println("Keliling\t\t:" + lkr.getKeliling());
  
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
        
       //Belah ketupat
        belahketupat_aditya belahket = new belahketupat_aditya(10, 12, 8);
        belahket.tampilHasil();
        
        //jajargenjang
        zakijajargenjang jjr = new zakijajargenjang(10, 5, 8, 25, 41);
        jjr.tampilHasil();
    }
}
