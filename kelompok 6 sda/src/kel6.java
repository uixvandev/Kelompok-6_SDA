import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/* Tugas besar kelompok 6
1). Irfan Wahendra
2). 
*/

public class kel6 {
    public static void main(String[] args) {
        //deklarasi stack beras
        Stack <Integer> solok = new Stack<Integer>();
        Stack <Integer> cisokan = new Stack<Integer>();

        //deklarasi qeueu antrian
        Queue <String> pelanggan = new LinkedList<>();
        Queue <String> jumlah_karung = new LinkedList<>();

        // deklarasi array antrian -> untuk memasukan data no antrian yang sudah
        // diproses
        int no_antrian[] = new int[100];

        // deklarasi array jenis beras
        String jenis[] = new String[2];

        // deklarasi riwayat
        String riwayat_pelanggan[] = new String[10];
        //String riwayat_cisokan[] = new String[10];

        // bikin binary tree baru
        binaryTree pencarian = new binaryTree();

        //deklarasi variabel lainnya
        String pilihan,nama,jumlah;
        int harga1,harga2;

        //array beras
        




        System.out.println("===================================");
        System.out.println("            Program Toko Beras            ");
        System.out.println("            Halo selamat datang!");
        System.out.println("===================================\n");

        Scanner inputan = new Scanner(System.in);

        
        boolean isLanjutkan = true;

        

        while (isLanjutkan) {
            System.out.println("Menu pilihan :");
            System.out.println("1. Cek Stok Beras");
            System.out.println("2. Tambah Stok Beras");
            System.out.println("3. Tambah Pelanggan");
            System.out.println("4. Tampilkan Antrian Pelanggan");
            System.out.println("5. Proses Pembelian");
            System.out.println("6. Riwayat Pembelian");
            System.out.println("7. Cari Pelanggan");
            System.out.println("8. Tutup");

            System.out.printf("\n\nMasukkan Pilihan  : ");
            pilihan = inputan.next();
            System.out.println();

            switch (pilihan) {
                case "1" :
                            System.out.println("Cek Stok Beras");
                            System.out.println("Stok beras Solok: " + jumlah_karung);
                            // System.out.println("Stok beras Solok: " + cisokan);
                            // System.out.println("\n\n");

                    break;
                
                case "2" :
                            // stack
                            for (int i = 1; i <= 1;i++){
                            solok.push(i);}
                            System.out.println("Beras solok : ");
                            System.out.println(solok);
                            for (int j = 1; j <= 1;j++) {
                            cisokan.push(j);}
                            System.out.println("Beras cisokan : ");
                            System.out.println(cisokan);

                            System.out.println("Banyak karung Beras Solok : " + jumlah_karung.size());
                            // System.out.println("Banyak karung Beras Solok : " + cisokan.size());

                            break;
                            
                
                case "3" :
                            //Tambah antrian pelanggan
                            System.out.print("Masukkan nama : ");
                            nama = inputan.next();
                            pelanggan.add (nama);
                            //System.out.println("Nama pelanggan_jumlah karung : " + nama);
                            System.out.print("jumlah karung : ");
                            jumlah = inputan.next();
                            jumlah_karung.add (jumlah);

                            break;
                
                case "4" :
                            //Tampilkan antrean pelanggan
                            System.out.println("Antrian pelanggan : " + pelanggan);
                            break;
                case "5" :
                            //Proses pembelian (Queue)
                            System.out.println("Pembelian atas nama : " + pelanggan.poll());
                            jumlah_karung.poll();

                case "6" :
                            //Riwayat pelanggan
                            System.out.println(riwayat_pelanggan);
                case "7" :
                            //Pencarian pelanggan

                            

            
                default:
                    break;
                
            }
            System.out.print("\nApakah Anda Masih Ingin Lanjut[y/n]? ");
            pilihan = inputan.next();
            isLanjutkan = pilihan.equalsIgnoreCase ("y");
        }



    }
    
}
