
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
    public static List<Album> alben = new List<Album>();
    Reader listreader = new Reader();
    /**
     * Konstruktor für Objekte der Klasse Musikverwaltungsprogramm
     */
    public Musikverwaltungsprogramm()
    {
        listreader.main();
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
        alben.append(new Album(pTitel, pInterpret, pDauer, pAnzahlLieder));
    }

    public static void neuesLiedVerwalten(String pTitel, String pInterpret, String pAlbum, int pDauer) {
        alben.toFirst();
        while(alben.isEmpty() == false) {
            Album tmp; 
            tmp = alben.getContent();
            if(tmp.getTitel() == pAlbum) {
                break;
            }
            tmp.neuesLiedVerwalten(pTitel, pInterpret, pAlbum, pDauer);
        }

        alben.getContent().neuesLiedVerwalten(pTitel, pInterpret, pAlbum, pDauer);
    }

    public void zeigealben() {
        while(alben.isEmpty() == false) {
            System.out.println();
        }
    }

    public String getAllAlben() {
        alben.toFirst();
        int i = 0;
        String tmpArray[] = new String[zähleAlben()];
        while(alben.hasAccess()) {
            tmpArray[i] = alben.getContent().getTitel();
            alben.next();
            i++;
        }
        return tmpArray[];
    }

    public int zähleAlben() {
        alben.toFirst();
        int i = 0;
        while(alben.hasAccess()){
            i++;
        }
        return i;
    }




    /**
     * Die Methode play spielt alle Lieder der Playlist in Reihenfolge ab. 
     * Das Abspielen wird durch eine Ausgabe auf der Konsole simuliert.
     */
    public void play(){
        /**int tmp;
        tmp = Album.gibAnzahlLieder();
        for(int i = 0; i < tmp; i++) {
            Album.liedAbspielen(i);
        }*/
    }

    /**
     * Methode stop stoppt das aktuelle Lied
     *
     */
    public void stop(){
    }

    /**
     * Methode delete löscht das ausgewählte Lied aus der Playlist
     *
     */
    public void delete(){
    }

    /**
     * Methode previous spielt das vorherige Lied ab
     *
     */
    public void previous(){
    }

    /**
     * Methode next spielt das nächste Lied ab
     *
     */
    public void next(){
    }

    /**
     * Methode queue fügt ein neues Lied der Playlist hinzu
     *
     */
    public void queue(){
    }
}
