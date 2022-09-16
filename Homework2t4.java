import java.util.Scanner;

public class Homework2t4 {
    
    public static void main(String[] args) {
        System.out.println(enterstring());
    }

    public static String enterstring(){
        System.out. println("Please provide some text");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        while (text.length() == 0) {
            System.out. println("Please provide some text");
            text = input.nextLine();
        }
        return text;
    }

}
