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
        

        //deklarasi qeueu antrian
        Queue <String> pelanggan = new LinkedList<>();
        ArrayList<Integer> jumlah_karung1 = new ArrayList<Integer>();
        

        // deklarasi riwayat
        ArrayList<String> riwayat_pelanggan1 = new ArrayList <String>();
        ArrayList <Integer> riwayat_beli =new ArrayList<Integer>();
        

        // bikin binary tree baru
        binaryTree pencarian = new binaryTree();

        //deklarasi variabel lainnya
        String pilihan,nama;
        int jumlah;
        String nama1;

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
                            //Pencarian pelanggan
                            pencarian.addNode(new Node(nama));
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
                            
                            break;

                case "6" :
                            //Riwayat pelanggan
                            System.out.println(riwayat_pelanggan1);
                            System.out.println(riwayat_beli);
                            break;
                case "7" :
                            
                            System.out.println("Data yang akan anda cari : ");
                            nama1 = inputan.nextLine();
                            System.out.println("Hasil pencarian : " + binaryTree.searchValue(pencarian.root,nama1));
                            break;
                case "8" :
                            System.exit(0);
                default:
                    break;
                
            }
            System.out.print("\nApakah Anda Masih Ingin Lanjut[y/n]? ");
            pilihan = inputan.next();
            isLanjutkan = pilihan.equalsIgnoreCase ("y");
        }



    }
    
}
