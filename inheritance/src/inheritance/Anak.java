/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author JaneshPutra
 */
public class Anak extends Ayah{
    // deklarasi variabel
    String nama;
    int age = 17;
    
    
    // deklarasi method setnama
    public void setnama(String nama){
        this.nama=nama;
    }
    // deklarasi method cetak
    public void Cetak(){ //super untuk mengakses data di ayah (super class)
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
    
}

    


