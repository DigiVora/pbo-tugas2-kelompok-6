/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun_datar;

import models.zakijajargenjang;
import models.Lingkaran_Audi;
import models.Persegi_Yakin;
import models.persegiPanjang_Khabib;
import models.Segitiga_shofi;
import models.belahketupat_aditya;

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
        Persegi_Yakin persegi = new Persegi_Yakin();
        persegi.setSisi(nilaiSisi);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        System.out.println("=================================");
        System.out.println("         BANGUN PERSEGI          ");
        System.out.println("=================================");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
        System.out.println("=================================");
        
        // Persegi Panjang
        persegiPanjang_Khabib bangun = new persegiPanjang_Khabib();

        bangun.setPanjang(20);
        bangun.setLebar(15);

        bangun.hitungLuas();
        bangun.hitungKeliling();

        System.out.println("=================================");
        System.out.println("      BANGUN PERSEGI PANJANG     ");
        System.out.println("=================================");
        System.out.println("Panjang  : " + bangun.getPanjang());
        System.out.println("Lebar    : " + bangun.getLebar());
        System.out.println("Luas     : " + bangun.getLuas());
        System.out.println("Keliling : " + bangun.getKeliling());
        System.out.println("=================================");
        
        // Segitiga 
        Segitiga_shofi sgt = new Segitiga_shofi(10, 10, 20, 10, 10);
        System.out.println("=================================");
        System.out.println("      BANGUN SEGITIGA            ");
        System.out.println("=================================");
        System.out.println("Alas\t\t\t:" + sgt.getAlas());
        System.out.println("Tinggi\t\t\t:" + sgt.getTinggi());
        System.out.println("Sisi A\t\t\t:" + sgt.getSisiA());
        System.out.println("Sisi B\t\t\t:" + sgt.getSisiB());
        System.out.println("Sisi C\t\t\t:" + sgt.getSisiC());
        System.out.println("Luas\t\t\t:" + sgt.getLuas());
        System.out.println("Keliling\t\t:" + sgt.getKeliling());

        System.out.println("");
                
        
       // Belah Ketupat
        double sisiBelahKetupat = 10.0;
        double d1 = 12.0;
        double d2 = 16.0;

        belahketupat_aditya belahKetupat = new belahketupat_aditya();
        belahKetupat.setSisi(sisiBelahKetupat);
        belahKetupat.setDiagonal1(d1);
        belahKetupat.setDiagonal2(d2);
        belahKetupat.hitungLuas();
        belahKetupat.hitungKeliling();

        System.out.println("=================================");
        System.out.println("      BANGUN BELAH KETUPAT       ");
        System.out.println("=================================");
        System.out.println("Sisi       : " + belahKetupat.getSisi());
        System.out.println("Diagonal 1 : " + belahKetupat.getDiagonal1());
        System.out.println("Diagonal 2 : " + belahKetupat.getDiagonal2());
        System.out.println("Luas       : " + belahKetupat.getLuas());
        System.out.println("Keliling   : " + belahKetupat.getKeliling());
        System.out.println("=================================");
        
        //jajargenjang
    zakijajargenjang jjr = new zakijajargenjang(3, 2, 3);

    System.out.println("=================================");
    System.out.println("      BANGUN JAJAR GENJANG       ");
    System.out.println("=================================");
    System.out.println("Alas :" +jjr.getAlas());
    System.out.println("Tinggi :" +jjr.getTinggi());
    System.out.println("Sisi Miring : "+jjr.getSisimiring());
    System.out.println("Luas : "+jjr.getLuas());
    System.out.println("Keliling : "+jjr.getKeliling());
    System.out.println("=================================");

    }
}
