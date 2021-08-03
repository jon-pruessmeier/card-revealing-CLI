import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    /*
    diese Methode erstellt einen Testablauf, in welchem so lange Karten auf der Konsole gezogen werden, bis eine Karte vom Typ Bube, Dame oder König gezogen wird.
    dazu nimmt sie einmal ein Card[]-Array entgegen, welches dann als Liste konvertiert wird und anschließend gemischt wird
    des Weiteren nimmt sie einen int testAnzahl entgegen, welcher für die Benutzerausgabe benutzt wird.
    */
    public static void testAblauf(int testAnzahl,Card[] pack){
        System.out.println("####################################################");
        System.out.println("Das ist Testablauf #" + testAnzahl + ":");
        List<Card> packList = Arrays.asList(pack);
        Collections.shuffle(packList);
        for (int i = 0; i < packList.size(); i++){
            packList.get(i).printCard();
            if (packList.get(i).rankIsPicture()){
                System.out.println("Der Rang der zuletzt gewählten Karte ist ein Bild. Aufgrund dessen wird dieser Testablauf nun beendet.");
                System.out.println("Es wurden insgesamt " + (i + 1) + " Karten aufgedeckt.");
                break;
            }
        }

    }

    //diese Methode erklärt den Benutzer*innen das Programm
    public static int einleitungAblauf(Card[] pack) {
        System.out.println("Es gibt in diesem Spiel " + pack.length + " Karten. Das sind die folgenden:");
        Card.printAll(pack);
        System.out.println("####################################################");
        System.out.println("Im folgenden werden nun Testabläufe durchgeführt.");
        System.out.println("Hierfür werden die Karten gemischt und der Reihe nach aufgedeckt.");
        System.out.println("Falls der Wert einer Karte ein Bild ist (Bube, Dame, König) wird der Testablauf beendet.");
        System.out.println("Wie viele Testabläufe möchten sie durchführen?");
        Scanner scan = new Scanner(System.in);
        int eingabe = scan.nextInt();
        return eingabe;
    }
    public static void main(String[] args){
        Card[] pack = Card.makePack();
        int anzahlAblaeufe = einleitungAblauf(pack);
        //erstellt Testabläufe:
        for (int i = 1; i <= anzahlAblaeufe; i++){
            testAblauf(i, pack);
        }

    }
}
