import java.util.Scanner;
public class Uts4{
    public static void main(String[] args) {
        
    Scanner inputan = new Scanner(System.in);
    double jari;
    System.out.println("Masukan jari :");
    jari = inputan.nextInt();  

    LuasLing Luass = new LuasLing();
        
                    
    System.out.println("Luas Lingkaran adalah : "+Luass.luasLing(jari));
    System.out.println("Luas Lingkaran adalah : "+Luass.kelilingLing(jari));
    }
}