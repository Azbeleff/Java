import java.util.Scanner;

public class Homework2t1 {

    public static float numberrquest() {
        System.out. println("Please provide a floating point number");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextFloat()){
            System.out. println("Please provide a floating point number");
            scan.nextLine();
            } 
        float flnum = scan.nextFloat();
        return flnum;
        
    }

    public static void main(String[] args) {

        System.out.println(numberrquest());
    }
}
