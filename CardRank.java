/*
In diesem enum werden die verfügbaren Blattwerte der Karten definiert.
 */
public enum CardRank {
    AS ("As"),
    ZWEI ("2"),
    DREI ("3"),
    VIER ("4"),
    FÜNF ("5"),
    SECHS ("6"),
    SIEBEN ("7"),
    ACHT ("8"),
    NEUN ("9"),
    ZEHN ("10"),
    BUBE ("Bube"),
    DAME ("Dame"),
    KÖNIG ("König");

    String displayName;
    CardRank(String dN){
        displayName = dN;
    }

    String getDisplayName(){
        return displayName;
    }


}
