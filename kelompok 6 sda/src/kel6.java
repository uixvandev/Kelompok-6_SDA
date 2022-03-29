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
    static class Node{
        String key;
        Node left, right;

        public Node (String string){
            key = string;
            left = right = null;
        } 
    }

        Node root;
        kel6(){
            root = null;
        }

        void printPreorder(Node node){
            if(node == null)
            return;

            System.out.println(node.key + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }

         void printPreorder(){
            printPreorder(root);
        }
    public static void main(String[] args) {
        //deklarasi stack beras
        Stack jumlah_karung = new Stack<String>();//var tambah stok
        

        //deklarasi qeueu antrian
        Queue <String> pelanggan = new LinkedList<>();
        ArrayList<Integer> jumlah_karung1 = new ArrayList<Integer>();
        

        // deklarasi riwayat
        ArrayList<String> riwayat_pelanggan1 = new ArrayList <String>();
        ArrayList <Integer> riwayat_beli =new ArrayList<Integer>();
        

        kel6 menu = new kel6();

        

        //deklarasi variabel lainnya
        String pilihan,nama;
        int jumlah;

        //array beras
        




        System.out.println("===================================");
        System.out.println("            Program Toko Beras            ");
        System.out.println("            Halo selamat datang!");
        System.out.println("===================================\n");

        Scanner inputan = new Scanner(System.in);
        boolean isLanjutkan = true;

        

        while (isLanjutkan) {
            System.out.println("Menu pilihan :");
            menu.root = new Node("1. Cek Stok Beras");
            menu.root.left = new Node ("2. Tambah Stok Beras");
            menu.root.left.left = new Node ("3. Tambah Pelanggan");
            menu.root.left.left.left = new Node ("4. Tampilkan Antrian Pelanggan");
            menu.root.right = new Node("5. Proses Pembelian");
            menu.root.right.right = new Node("6. Riwayat Pembelian");
            menu.root.right.right.right = new Node("7. Tutup");
        
            menu.printPreorder();

            System.out.printf("\n\nMasukkan Pilihan  : ");
            pilihan = inputan.next();
            System.out.println();

            switch (pilihan) {
                case "1" :
                            System.out.println("Cek Stok Beras");
                            System.out.println("Stok beras Solok: " + jumlah_karung.size());
                            
                    break;
                
                case "2" :
                            // stack
                            System.out.print("Masukkan Jumlah Stok : ");
                            int stokBeras = inputan.nextInt();
                            for (int x = 0; x < stokBeras; x++){
                                jumlah_karung.push("1");   
                            }


                            System.out.println("Banyak karung Beras Solok : " + jumlah_karung.size());
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
                                //Pencarian pelanggan
                                
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
