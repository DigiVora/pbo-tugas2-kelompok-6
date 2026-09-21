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
        persegiPanjang_Khabib bangun = new persegiPanjang_Khabib(20,15);
        bangun.tampilkanHasil();
        
        //Segitiga
        Segitiga_shofi sgt1 = new Segitiga_shofi(10, 8, 10, 10, 12, 40, 32);
        sgt1.tampilHasil();
    }
}
