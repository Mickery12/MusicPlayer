import java.io.*;
public class MVP{

    private Reader reader = new Reader();
    private List<Album> alben = new List<Album>();
    private Queue<Lied> wiedergabeliste = new Queue<Lied>();
    private Lied previous;

    private boolean playing = false;
    
    
    public MVP() {
        reader.main(this);
    }

    public void debug() {        
        alben.toFirst();
        while(alben.hasAccess()){
            System.out.println(alben.getContent());
            while(alben.getContent().lieder.hasAccess()){
                System.out.println(alben.getContent().lieder.getContent());
                alben.getContent().lieder.next();
            }
            alben.next();
        }
        
    }

    public void newAlbum(String name, String interpret, int dauer, int anzahl) {
        Album tmp = new Album(name, interpret, dauer, anzahl);
        alben.append(tmp);
    }

    public void newLied(String name, String interpret, int dauer) {
        alben.toLast();
        Album tmpAlbum = alben.getContent();
        Lied tmpLied = new Lied(name, interpret, tmpAlbum, dauer);
        tmpAlbum.lieder.append(tmpLied);
    }

    public String[] getAlben() {
        alben.toFirst();
        int counter = 0;
        String[] tmpAlbenArray = new String[albenSize()];
        alben.toFirst();
        while (alben.hasAccess() == true) {
            tmpAlbenArray[counter] = alben.getContent().getName();
            counter++;
            alben.next();
        }
        return tmpAlbenArray;
    }

    public String[] getAllSongs() {
        String[] tmpSongsArray = new String[allSongsSize()];
        int counter = 0;
        alben.toFirst();
        while (alben.hasAccess() == true) {
            alben.getContent().lieder.toFirst();
            while (alben.getContent().lieder.hasAccess() == true) {
                tmpSongsArray[counter] = alben.getContent().lieder.getContent().getName();
                counter++;
                alben.getContent().lieder.next();
            }
            alben.next();
        }
        return tmpSongsArray;
    }

    public String[] getQueue() {
        String[] tmpQueueArray = new String[wiedergabelisteSize()];
        Queue<Lied> tmpQueue = new Queue<Lied>();
        int counter= 0;
        while(wiedergabeliste.isEmpty() == false){
            tmpQueueArray[counter] = wiedergabeliste.front().getName();
            tmpQueue.enqueue(wiedergabeliste.front());
            wiedergabeliste.dequeue();
            counter++;
        }
        while(tmpQueue.isEmpty() == false){
            wiedergabeliste.enqueue(tmpQueue.front());
            tmpQueue.dequeue();
        }
        return tmpQueueArray;
    }

    private int albenSize() {
        int i = 0;
        while (alben.hasAccess()) {
            alben.next();
            i++;
        }
        return i;
    }

    private int allSongsSize() {
        alben.toFirst();
        int i = 0;
        while (alben.hasAccess()) {
            i = i + alben.getContent().getSize();
            alben.next();
        }
        return i;
    }

    public void play() {
        playing = true;
        while(wiedergabeliste.isEmpty() == false && playing == true) {

            if(playing == false) {
                break;
            }
            System.out.println(wiedergabeliste.front().play());
            if(playing == false) {
                break;
            }
            previous = wiedergabeliste.front();
            wiedergabeliste.dequeue();
        }
    }

    public void stop() {
        playing = false;
    }

    public void previous() {
        if(previous != null) {
            Queue<Lied> tmp = new Queue<Lied>();
            while(wiedergabeliste.isEmpty() == false) {
                tmp.enqueue(wiedergabeliste.front());
                wiedergabeliste.dequeue();
            }
            wiedergabeliste.enqueue(previous);
            while(tmp.isEmpty() == false) {
                wiedergabeliste.enqueue(tmp.front());
                tmp.dequeue();
            }
        }        
    }

    public int wiedergabelisteSize() {
        Queue<Lied> tmpQueue = new Queue<Lied>();
        int counter = 0;
        while(wiedergabeliste.isEmpty() == false) {
            tmpQueue.enqueue(wiedergabeliste.front());
            wiedergabeliste.dequeue();
            counter++;
        }
        while(tmpQueue.isEmpty() == false) {
            wiedergabeliste.enqueue(tmpQueue.front());
            tmpQueue.dequeue();
        }
        return counter;
    }

    private void addToQueue(Lied lied) {
        wiedergabeliste.enqueue(lied);
    }

    public void addFirst10ToQueue() {
        alben.toFirst();
        alben.getContent().lieder.toFirst();
        for(int i = 0; i < 10; i++) {
            wiedergabeliste.enqueue(alben.getContent().lieder.getContent());
            alben.getContent().lieder.next();
        }
    }

    public void next() {
        if(wiedergabeliste.isEmpty() == false) {
            wiedergabeliste.dequeue();
        }
    }

    public void delete() { 
        wiedergabeliste.dequeue();
    }

    public Album getCurrentAlbum() {
        return alben.getContent();
    }
}