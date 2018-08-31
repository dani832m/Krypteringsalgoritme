import java.util.Scanner;

/**
 * Denne krypteringsalgoritme er baseret på et udlæg fra "code2learn".
 */
public class KrypteringsmaskineVol1 {

    public static void main(String[] args) throws Exception {

        System.out.println("Velkommen til KrypteringsmaskineVol1 Vol. 1.\n");
        System.out.print("Indtast det ord, der skal krypteres: ");
        Scanner sc = new Scanner(System.in);
        String tekst = sc.next();

        String tekstKrypteret = AESencrp.encrypt(tekst);
        String tekstDekrypteret = AESencrp.decrypt(tekstKrypteret);

        System.out.println("____________________________________________________________\n");
        System.out.println("Oprindelig tekst: " + tekst);
        System.out.println("Krypteret tekst: " + tekstKrypteret);
        System.out.println("Dekrypteret tekst: " + tekstDekrypteret);

    }
}