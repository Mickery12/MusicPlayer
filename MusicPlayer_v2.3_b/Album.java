
/**
 * Eine Album ist eine Liste von Liedern.
 * 
 * @author 
 * @version 1
 */
public class Album extends List
{
    private Lied meinLied;
    public static List<Lied> lieder = new List<Lied>();
    private static int stelle;

    private String titel;
    private String interpret;
    private int dauer;
    private int anzahlLieder;



    /**
     * Konstruktor für Objekte der Klasse Album
     */
    public Album(String pTitel, String pInterpret, int pDauer, int pAnzahlLieder)
    {
        titel = pTitel;
        interpret = pInterpret;
        dauer = pDauer;
        anzahlLieder = pAnzahlLieder;
    }

    

    public static void neuesLiedVerwalten(String pTitel, String pInterpret, String pAlbum, int pDauer) {
        lieder.append(new Lied(pTitel, pInterpret, pAlbum, pDauer));
    }

    /**
     * Wenn das Album nicht leer ist, gibt die Methode liedAbspielen auf der 
     * Konsole das erste Lied in dem Album. Ansonsten wird ein Hinweis 
     * ausgegeben, dass das Album leer ist.
     *
     */
    public static void liedAbspielen(int pZahl){
        stelle = 0;
        lieder.toFirst();
        while(lieder.isEmpty() == false && stelle < pZahl) {
            lieder.next();
            stelle++;
        }
        System.out.println(lieder.getContent() + "wird abgespielt");
    }

    /**
     * Die Methode gibAnzahlLieder gibt die Anzahl der Lieder in dem Album. 
     * Inhalt und Reihenfolge dem Album dürfen dabei nicht veraendert werden.
     *
     * @return Der Rückgabewert
     */
    public static int gibAnzahlLieder(){
        int p = 0;
        lieder.toFirst();
        while(lieder.isEmpty() == false) {
            lieder.next();
            p++;
        }
        return p;
    }

    public String getTitel() {
        return(titel);
    }

    public String toString() {
        return(titel + " von " + interpret + " mit " + anzahlLieder + ". Dauer: " + dauer + " Sekunden");
    }
}