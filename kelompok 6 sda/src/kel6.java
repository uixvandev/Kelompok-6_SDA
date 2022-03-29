import java.lang.reflect.Array;
import java.util.ArrayList;
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
        Stack jumlah_karung = new Stack<String>();//var tambah stok
        // Stack <Integer> solok = new Stack<Integer>();
        // Stack <Integer> cisokan = new Stack<Integer>();

        //deklarasi qeueu antrian
        Queue <String> pelanggan = new LinkedList<>();
        ArrayList<Integer> jumlah_karung1 = new ArrayList<Integer>();
        // deklarasi array antrian -> untuk memasukan data no antrian yang sudah
        // diproses
        int no_antrian[] = new int[100];

        // deklarasi array jenis beras
        String jenis[] = new String[2];

        // deklarasi riwayat
        ArrayList<String> riwayat_pelanggan1 = new ArrayList <String>();
        ArrayList <Integer> riwayat_beli =new ArrayList<Integer>();
        //String riwayat_cisokan[] = new String[10];

        // bikin binary tree baru
        binaryTree pencarian = new binaryTree();

        //deklarasi variabel lainnya
        String pilihan,nama;
        int harga1,harga2,jumlah;

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
                            System.out.println("Stok beras Solok: " + jumlah_karung.size());
                            // System.out.println("Stok beras Solok: " + cisokan);
                            // System.out.println("\n\n");

                    break;
                
                case "2" :
                            // stack
                            System.out.print("Masukkan Jumlah Stok : ");
                            int stokBeras = inputan.nextInt();
                            for (int x = 0; x < stokBeras; x++){
                                jumlah_karung.push("1");   
                            }
                            // System.out.println("Beras solok : ");
                            // System.out.println(jumlah_karung);
                            // for (int j = 1; j <= 1;j++) {
                            // cisokan.push(j);}
                            // System.out.println("Beras cisokan : ");
                            // System.out.println(cisokan);

                            System.out.println("Banyak karung Beras Solok : " + jumlah_karung.size());
                            // System.out.println("Banyak karung Beras Solok : " + cisokan.size());

                            break;
                            
                
                case "3" :
                            //Tambah antrian pelanggan
                            System.out.print("Masukkan nama : ");
                            nama = inputan.next();
                            pelanggan.add (nama);
                            riwayat_pelanggan1.add(nama);
                            //System.out.println("Nama pelanggan_jumlah karung : " + nama);
                            System.out.print("jumlah karung : ");
                            jumlah = inputan.nextInt();
                            jumlah_karung1.add (jumlah);
                            riwayat_beli.add(jumlah);
                            for (int y=0;y < jumlah;y++){
                                jumlah_karung.pop();
                                }
                            break;
                
                case "4" :
                            //Tampilkan antrean pelanggan
                            System.out.println("Antrian pelanggan : " + pelanggan);
                            break;
                case "5" :
                            //Proses pembelian (Queue)
                            System.out.println("Pembelian atas nama : " + pelanggan.poll());
                            

                case "6" :
                            //Riwayat pelanggan
                            System.out.println(riwayat_pelanggan1);
                            System.out.println(riwayat_beli);
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
