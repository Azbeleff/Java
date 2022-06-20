public class Task_4 {
    public static void main(String[] args) {
        String with = "1";
        String on = "3";
        String some = "2";
        int count = 3;
        Tower(with, on, some, count);
    }
    public static void Tower(String with, String on, String some, int count) {
      if (count > 1) Tower(with, on, some, count - 1);
      System.out.printf("[%s] >> [%s] \n", with, on);
      if (count > 1) Tower(some, on, with, count-1);
    }
}
