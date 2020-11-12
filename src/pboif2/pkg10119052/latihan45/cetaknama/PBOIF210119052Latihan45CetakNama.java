package pboif2.pkg10119052.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program CetakNama berbasis objek
 * 
 */
public class PBOIF210119052Latihan45CetakNama {

    public static void main(String[] args) {
        System.out.println("======Aplikasi Pencetakan Nama====== ");
        Scanner input = new Scanner(System.in);
        Printer hasil = new Printer();
        System.out.print("Masukkan nama anda : ");
        hasil.setNama(input.nextLine()) ;
        System.out.print("Mau cetak nama berapa kali? : ");
        hasil.setJmlcetak( input.nextInt()) ;
         
     hasil.cetak(hasil.getNama());
        hasil.cetak1(hasil.getJmlcetak(),hasil.getNama());
    }
    
}
