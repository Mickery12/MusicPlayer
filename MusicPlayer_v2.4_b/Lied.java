/**
 * Die Klasse Lied repraesentiert ein Lied mit 
 * den Attributen Titel, Album, Interpret und Dauer in Sekunden.
 * 
 * @author Acidic)
 * @version 2.2
 */
public class Lied
{

    private String titel;
    private String album;
    private String interpret;
    private int dauer;
    /**
     * Konstruktor für Objekte der Klasse Lied
     */
    public Lied(String pTitel, String pAlbum, String pInterpret, int pDauer)
    {
        titel = pTitel;
        album = pAlbum;
        interpret = pInterpret;
        dauer = pDauer;
    }

    // get - Methode //
    
    public String getLied(String pTitel, String pAlbum, String pInterpret, int pDauer){
      return (pTitel + ";" + pAlbum + ";" + pInterpret + ";" + pDauer + ";");
    }
    
    public String getTitel(){
        return titel;
    }

    public String toString(){
        return (titel + " - " + interpret + ", (" + dauer + " sec)");
    }
}

