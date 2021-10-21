import java.util.Scanner;
public class Uts1{
    public float waktuAwal(int jam, int mnt, int dtk){
        return (jam * 3600 + (mnt * 60) + dtk)/5;
    }
    public float waktuAkhir(int jam2, int mnt2, int dtk2){
        return   (jam2 * 3600 + (mnt2 * 60) + dtk2)/5;     
    }
    public float Selisih(float waktuAwal, float waktuAkhir){
        return waktuAwal - waktuAkhir; 
    }
    public float Harga(float Selisih){
        return Selisih * 30;
    }

    public static void main(String[] args) {
        int jam, mnt, dtk;
        int jam2, mnt2, dtk2;
        Scanner inputan = new Scanner(System.in);
    
        System.out.println("masukkan waktu awal telfon anda");
        System.out.println("jam = ");
        jam = inputan.nextInt();
        System.out.println("mnt = ");
        mnt = inputan.nextInt();
        System.out.println("dtk = ");
        dtk = inputan.nextInt();
        
        System.out.println("masukkan waktu akhir telfon anda");
        System.out.println("jam2 = ");
        jam2 = inputan.nextInt();
        System.out.println("mnt2 = ");
        mnt2 = inputan.nextInt();
        System.out.println("dtk2 = ");
        dtk2 = inputan.nextInt();

        System.out.println("Harga yang anda butuhkan adalah = " + Harga());

    }
}