package przykłady;
// Deklaruje zmienną sterującą wewnątrz pentli for
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;
        //Wczytuję silnie liczby 5;
        for(int i=1; i<=5; i++){
            sum += i;
            fact *= i;
        }
        System.out.println ("Suma wynosi " + sum);
        System.out.println("Silnia wynosi " + fact);

        }
    }
