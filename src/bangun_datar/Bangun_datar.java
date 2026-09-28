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
        Lingkaran_Audi lingkaran = new Lingkaran_Audi(7);

        lingkaran.tampilHasil();

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
                
        
       //Belah ketupat
        belahketupat_aditya belahket = new belahketupat_aditya(10, 12, 8);
        belahket.tampilHasil();
        
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
