
/**
 * Die Klasse Lied repraesentiert ein Lied mit 
 * den Attributen Titel, Interpret und Dauer in Sekunden.
 * 
 * @author THor)
 * @version 1
 */
public class Lied
{

    private String name;
    private String interpret;
    private int dauer;
    /**
     * Konstruktor für Objekte der Klasse Lied
     */
    public Lied(String pName, String pInterpret, int pDauer)
    {
        name = pName;
        interpret = pInterpret;
        dauer = pDauer;
    }

    // get - Methode //

    public String toString(){
        return (name + " - " + interpret + ", (" + dauer + " sec)");
    }
}

