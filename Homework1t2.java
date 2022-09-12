import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Homework1t2 {
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(diffarray (firstarray(),secondarray())));

    }

    public static int[] firstarray(){
        System.out.println("Please specify the size of the first array");
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (!scan.hasNextInt()){
        scan.nextLine();
        }    
        num = scan.nextInt();
        scan.close();

        int [] firstarray = new int[num];

        Random rand = new Random();
        int upperbound = 25;
        for ( int i = 0; i < num; i++) {
            firstarray [i] = rand.nextInt(upperbound);
        }
        return firstarray;
    }


    public static int[] secondarray(){
        // System.out.println("Please specify the size of the second array");
        // Scanner scan = new Scanner(System.in);
        // int num2 = 0;
        // while (!scan.hasNextInt()){
        // scan.nextLine();
        // }    
        // num2 = scan.nextInt();
        // scan.close();

        int [] secondarray = new int[5];

        Random rand = new Random();
        int upperbound = 25;
        for ( int i = 0; i < 5; i++) {
            secondarray [i] = rand.nextInt(upperbound);
        }
        return secondarray;
    }

    public static int[] diffarray (int[] array1, int[] array2){
        int [] targetarray = new int [array1.length];
        if ( array1.length != array2.length){
            System.out.println("The arrays are of different size");
        }
        else {
            for (int i =0; i < array1.length; i++){
                targetarray [i] = array1[i] - array2[i];
            }
        }
        return targetarray;
    }

}
