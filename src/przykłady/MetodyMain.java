package przykłady;

public class MetodyMain {
    public static int dodaj(int a, int b) {
        System.out.println("Metoda 1");
        return a + b;
    }

    public static double dodaj(double a, double b) {
        System.out.println("Metoda 2");
        return (int) (a + b);
    }

    public static double dodaj(int a, double b) {
        System.out.println("Metoda 3");
        return (int) (a + b);
    }

    public static void main(String[] args) {
        dodaj(2,3.2);
    }
}

