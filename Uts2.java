import java.util.Scanner;
class Uts2{
    public static float berat_badan, tinggi_badan;
    public static float BMI(float berat_badan, float tinggi_badan) {
        float BMI;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Berat : ");
        berat_badan = inputan.nextFloat();
        System.out.print("Masukan Tinggi : ");
        tinggi_badan = inputan.nextFloat();
        System.out.println("BMI = " + BMI);

        BMI = berat_badan / (tinggi_badan*tinggi_badan);
        return BMI;
    }
    public float perhitungan(float berat_badan, float tinggi_badan, float BMI){
    
        if ((BMI >= 18.5) && (BMI <= 22.9)) {
            System.out.println("Badan Ideal");            
        } else if (BMI >= 22.9) {
            System.out.println ("Badan Overweight");        
        } else if (BMI <= 18.5) {
            System.out.println ("Badan Underweight");
        } else {
            System.out.println ("inputan salah");
        }
        return BMI;
    }
    public static void main(String[] args) {
        Uts2 isi = new Uts2();
        System.out.println("Hasil = " + isi.BMI());
    }
}
