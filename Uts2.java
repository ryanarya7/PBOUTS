public class Uts2{
    public float berat_badan{
        return berat_badan;
    }
    public float tinggi_badan{
        return tinggi_badan;
    }
    public float BMI(float berat_badan, float tinggi_badan){
        float BMI;
        BMI = berat_badan / (tinggi_badan*tinggi_badan);
        return BMI;
    }
    public static void main(String[] args) {

        if ((this.BMI >= 18.5) && (this.BMI <= 22.9))
        {
            System.out.println("Badan Ideal");
        } else if (this.BMI >= 22,9) {
            System.out.println("Badan OverWeight");
        } else {
            System.out.println("Badan UnderWeight");
        }
        
    }
}