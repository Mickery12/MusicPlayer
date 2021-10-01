
/**
 * Die Klasse Lied repraesentiert ein Lied mit 
 * den Attributen Titel, Album, Interpret und Dauer in Sekunden.
 * 
 * @author Acidic)
 * @version 2.2
 */
public class Lied
{

    private String name;
    private String album;
    private String interpret;
    private int dauer;
    /**
     * Konstruktor für Objekte der Klasse Lied
     */
    public Lied(String pName, String pAlbum, String pInterpret, int pDauer)
    {
        name = pName;
        Album = pAlbum;
        interpret = pInterpret;
        dauer = pDauer;
    }

    // get - Methode //
    
    public getLied(name, album, Interpret, dauer){
      return (name + "; " + album + "; " + Interpret + "; " + dauer + ";")
    }
    

    public String toString(){
        return (name + " - " + interpret + ", (" + dauer + " sec)");
    }
}

