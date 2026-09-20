/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar;

/**
 *
 * @author acer
 */
public class persegiPanjang_Khabib {
    //membuat atribut
    private double panjang;
    private double lebar;
    
    //membuat konstruktor kosong
    public persegiPanjang_Khabib(){
        this.panjang = 0;
        this.lebar = 0;  
    }

    //konstruktor parameter
     public persegiPanjang_Khabib(double panjang , double lebar){
        this.panjang = panjang;
        this.lebar = lebar;  
    }
     
     //membuat getter dan setter
    public double getPanjang() {
        return panjang;
    }
 
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
  
    public double getLebar() {
        return lebar;
    }
    
     public void setLebar(double lebar){
        this.lebar = lebar;
    }
     //method untuk menghitung luas dan keliling
     public double hitungLuas(){
         return panjang*lebar;
     }
     public double hitungKeliling(){
         return 2*(panjang + lebar);
     }
     
     //methiod untuk menampilkan hasil
     public void tampilkanHasil(){
         System.out.println("-----HASIL PERHITUNGAN LUAS PERSEGI PANJANG-----");
         System.out.println("Panjang : "+ panjang);
         System.out.println("Lebar : "+lebar);
         System.out.println("Luas : "+hitungLuas());
         System.out.println("Keliling : "+hitungKeliling());
         
     }
}
