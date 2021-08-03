public class Card {
    CardRank rank;
    CardSuit suit;

    Card(CardRank r, CardSuit s){
        rank = r;
        suit = s;
    }

    void printCard(){
        String printMessage = "Diese Karte hat die Farbe " + this.suit.getDisplayName() + " und den Rang " + this.rank.getDisplayName();
        System.out.println(printMessage);
    }

    //diese Methode kreiert ein Array mit allen möglichen Karten des Spiels
    static Card[] makePack(){
        //erstellen zweier Arrays mit allen Werten der jeweiligen enums
        CardRank[] cr = CardRank.values();
        CardSuit[] cs = CardSuit.values();

        //erstellen des Arrays, welches die Karten enthält und später zurückgegeben wird
        Card[] cards = new Card[cr.length * cs.length];

        //zählt in der verschachtelten for-Schleife den Index des cards-Array
        int indexCards = 0;

        for (int i = 0; i < cr.length; i++){
            for (int j = 0; j < cs.length; j++){
                Card c = new Card(cr[i], cs[j]);
                cards[indexCards] = c;
                indexCards++;
            }
        }

        return cards;
    }

    static void printAll(Card[] c){
        for (int i = 0; i < c.length; i++){
            c[i].printCard();
        }
    }


    //testet, ob der Wert der Karte ein Bild ist
    public boolean rankIsPicture(){
        //Array mit den Werten der Spielkarten mit Bildern:
        CardRank[] werteMitBild = {CardRank.BUBE, CardRank.DAME, CardRank.KÖNIG};
        boolean hasPicture = false;
        for (int i = 0; i < werteMitBild.length; i++) {
            if (this.rank == werteMitBild[i]) {
                hasPicture = true;
            }
        }
        return hasPicture;
    }

}
