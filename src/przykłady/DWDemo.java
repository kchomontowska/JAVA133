package przykłady;
// Demonstruję pętle do-while
public class DWDemo {
    public static void main(String args[])
        throws java.io.IOException {

        char ch;

        do {
            System.out.println("Naciśnij dowolny klawisz, a po nim ENTER: ");
            ch = (char) System.in.read();
        } while(ch != 'q');
        }
    }

