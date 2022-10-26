package przykłady;

import java.util.Stack;

public class ZadanieStos
{public static void main(String[] args) {
    int number=10;
    System.out.println("Binarna "+Integer.toBinaryString(number));
    System.out.println("Ósemkowa "+Integer.toOctalString(number));
    System.out.println("Szesnastkowa "+Integer.toHexString(number));
    System.out.println("----------------------");
    int myNumber = 10;
    System.out.println(findBinaryString(myNumber));

}
    public static String findBinaryString(int number) {
        Stack<Integer> stos = new Stack<> ();
        StringBuilder sb = new StringBuilder("");
        while (number != 0) {
            stos.push(number % 2);
            number = number / 2;
        }
        while (!stos.empty()) {
            sb.append(stos.pop());
        }
        return sb.toString();
    }
}

