
/**
 * Die Klasse Musikverwaltungsprogramm soll eine Software zum Verwalten und 
 * Abspielen von Musikdateien simulieren.
 * In dieser Version soll es möglich sein aus einem Array
 * von Objects der Klasse Lied eine Playlist zusammenzustellen.
 * Eine Methode play() soll das Abspielen simulieren.
 * 
 * @author Acidic
 * @version 2.2
 */
public class Musikverwaltungsprogramm extends List
{
    public static List<Album> Alben = new List<Album>();
    Reader listreader = new Reader();
    /**
     * Konstruktor für Objekte der Klasse Musikverwaltungsprogramm
     */
    public Musikverwaltungsprogramm()
    {

    }

    /**
     * Mit der Methode neuesLiedVerwalten wird ein neues Lied-Object angelegt und 
     * in ein Lied[] hinzugefuegt.
     *
     * @param pTitel Ein Parameter
     * @param pInterpret Ein Parameter
     * @param pDauer Ein Parameter
     */
    public static void neuesAlbumVerwalten(String pTitel, String pInterpret, int pDauer, int pAnzahlLieder){
        Alben.toLast();
        Alben.insert(new Album(pTitel, pInterpret, pDauer, pAnzahlLieder));
    }

    /**
     * Die Methode play spielt alle Lieder der Playlist in Reihenfolge ab. 
     * Das Abspielen wird durch eine Ausgabe auf der Konsole simuliert.
     */
    public void play(){

    }

    /**
     * Methode stop stoppt das aktuelle Lied
     *
     */
    public void stop(){
    }
}
