import java.util.Scanner;
 
public class MemilihMenuMakanan{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.print("Pilihan:\n 1. Nasi Goreng(Rp.15.000.00)\n 2. Mie Ayam(Rp.10.000.00)\n 3. Bakso(Rp.13.000.00)\n");
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Mie Ayam");
                System.out.println("Harga : 10.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*10000);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Bakso");
                System.out.println("Harga : 13.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*13000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}
