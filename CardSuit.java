/*
In diesem enum werden die verfügbaren Farben der Karten definiert.
 */
public enum CardSuit {
    KARO ("Karo"),
    HERZ ("Herz"),
    PIK ("Pik"),
    KREUZ ("Kreuz");

    String displayName;
    CardSuit(String dN){
         displayName = dN;
    }

    String getDisplayName(){
        return displayName;
    }

}
