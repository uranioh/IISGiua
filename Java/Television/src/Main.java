import java.util.Scanner;

public class Main {
    public static void tvOn() {
        System.out.println("""
                Telecomando - TV ON
                
                [P] ⏻
                """);
    }

    public static void tvOff() {
        System.out.println("""
                Telecomando - TV OFF
                
                [P] ⏻
                """);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Television tv = new Television("LG QLED", 55);

        boolean loopStatus = true;

        while (loopStatus) {
            if (tv.isOn()) {
                tvOn();
            }
            else {
                tvOff();
            }
        }
    }
}