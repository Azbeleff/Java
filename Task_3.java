// 3.	+Написать программу вычисления n-ого треугольного числа. url

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
            main ();  
    }
      
    static int userinput (){
        System.out.println("Please provide a number: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            return number;
        }
    }

    static int triangularnumber (){
        int basernumber = userinput();
        int triangularnumber = basernumber * (basernumber + 1) / 2;
        return triangularnumber;
    }

    static void main(){
        System.out.println(triangularnumber());
        //return triangularnumber();
    }
}

