package przykłady;

public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch,ignore, answer = 'K';

            do {
                System.out.println("Pomyślałem literę z przedziału od A do Z.");
                System.out.print("Spróbój ją odgadnąć:");

                ch = (char)System.in.read ();

                do {
                    ignore = (char) System.in.read ();
                } while(ignore != '\n');

                if(ch == answer) System.out.println("** Dobrze!  **");
                else {
                    System.out.print("...Niestety trafiłeś ");
                    if (ch < answer) System.out.println("Zbyt nisko");
                    else System.out.println("za wysoko");
                    System.out.println("Spróbój jeszce raz\n");
                }


                }while(answer !=ch);
            }
        }


