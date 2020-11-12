package pboif2.pkg10119052.latihan45.cetaknama;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program CetakNama berbasis objek
 * 
 */
public class Printer {
    private int jmlcetak;
    private String nama;

    public int getJmlcetak() {
        return jmlcetak;
    }

    public void setJmlcetak(int jmlcetak) {
        this.jmlcetak = jmlcetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
       this.nama = nama;
    }
     
   public  void cetak(String nama) {
         System.out.println("Nama anda : "+nama); 

}

     

    void cetak1(int Jmlcetak, String nama) {
       System.out.println("Hasil cetak : ");
        for(int i=1; i<=Jmlcetak; i++){
            System.out.println(i+"."+nama);  
    }
    }
}
