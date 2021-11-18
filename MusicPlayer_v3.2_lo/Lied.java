
/**
 * Beschreiben Sie hier die Klasse Lied.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Lied
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private String interpret;
    private int dauer;
    private Album album;


    public Lied(String name, String interpret, Album album, int dauer)
    {
        this.name = name;
        this.interpret = interpret;
        this.album = album;
        this.dauer = dauer;
    }

    public String toString()
    {
        return name + " von " + interpret + " (" + dauer + " Sekunden)";
    }

    public String play()
    {
        return "Lied: " + name + " von " + interpret + " (" + dauer + " Sekunden)";
    }

    public int getDauer() {
        return dauer;
    }
    
}
