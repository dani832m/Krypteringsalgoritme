import java.util.Scanner;

/**
 * Denne krypteringsalgoritme er meget simpel, men vi har til gengæld lavet den HELT selv xD
 *
 * @author Daniel & Mathias.
 */
public class KrypteringsmaskineVol2 {

    public static void main(String[] args) {

        //Byder velkommen og indlæser brugerinput vha. Scanner-klassen
        System.out.println("Velkommen til KrypteringsmaskineVol1 Vol 2.");
        System.out.println("Maskinen kan kun kryptere bogstavet a og c!");
        System.out.println("__________________________________________________________\n");
        System.out.print("Bogstav til kryptering: ");
        Scanner sc = new Scanner(System.in);
        char krypter = sc.next().charAt(0);

        //Kryptering
        if(krypter == 'a') {
            krypter = 'b';
            System.out.println("Din tekst krypteret: " + krypter + "\n");
        }

        else if(krypter == 'c') {
            krypter = 'd';
            System.out.println("Din tekst krypteret: " + krypter + "\n");
        }

        else if (krypter != 'a' || krypter != 'c') {
            System.out.println("Kan kun kryptere karaktererne a og c.\n");
        }

        System.out.print("Bogstav til dekryptering: ");
        char dekrypter = sc.next().charAt(0);

        //Dekryptering
        if(dekrypter == 'b') {
            dekrypter = 'a';
            System.out.println("Din tekst dekrypteret: " + dekrypter + "\n");
        }

        else if(dekrypter == 'd') {
            dekrypter = 'c';
            System.out.println("Din tekst dekrypteret: " + dekrypter + "\n");
        }

        else if (krypter != 'b' || krypter != 'd') {
            System.out.println("Kan kun dekryptere karaktererne b og d.");
        }
    }
}