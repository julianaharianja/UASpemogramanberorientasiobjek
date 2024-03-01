class Biodata{
    String nama;
    String nim;
    String jurusan;
    String Tugas;   
}
public class UASPemogramanBerorientasiObjek{
public static void main(String[] args) {
    Biodata Biodataku = new Biodata ();
    Biodataku.nama = "JulianaBrHarianja";
    Biodataku.nim = "21040210";
    Biodataku.jurusan = "TeknikInformatika";
    Biodataku.Tugas = "PemogramanBerorientasiObjek";
    
    System.out.println("Nama:"+Biodataku.nama);
    System.out.println("Nim:"+Biodataku.nim);
    System.out.println("Jurusan:"+Biodataku.jurusan);
    System.out.println("Tugas:"+Biodataku.Tugas);
   
    }
    
}