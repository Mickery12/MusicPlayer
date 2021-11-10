import java.io.*;
public class MVP extends List{

    List<Album> alben = new List<Album>();
    List<Lied> lieder = new List<Lied>();
    public MVP() {
        read();
    }

    public void debug() {
        alben.toFirst();
        lieder.toFirst();
        while (alben.hasAccess()) {
            System.out.println(alben.getContent());
            alben.next();
        }
        while(lieder.hasAccess()){
            System.out.println(lieder.getContent());
            lieder.next();
        }
    }

    public void newAlbum(String name, String interpret, int dauer, int anzahl) {
        Album tmp = new Album(name, interpret, dauer, anzahl);
        alben.append(tmp);
    }

    public void newLied(String name, String interpret, int dauer) {
        alben.toLast();
        Album tmpAlbum = alben.getContent();
        Lied tmp = new Lied(name, interpret, tmpAlbum, dauer);
        lieder.append(tmp);
    }

    public String[] getAlben() {
        alben.toFirst();
        int i = 0;
        String[] tmp = new String[albenSize()];
        while (alben.hasAccess()) {
            tmp[i] = alben.getContent().toString();
            alben.next();
            i++;
        }
        return tmp;
    }

    public boolean isEmpty() {
        return alben.isEmpty();
    }

    public int albenSize() {
        int i = 0;
        while (alben.hasAccess()) {
            alben.next();
            i++;
        }
        return i;
    }

    public void read() {
    BufferedReader br = null;
        String line;

        try {

            br = new BufferedReader(new FileReader("Album_mit_Liedern.txt"));

            while((line = br.readLine()) != null){

                if(line.startsWith("A")){
                    String tmp; tmp = line;
                    String split[] = tmp.split(";");
                        //System.out.println(split[0].substring(7) + " " + split[1] + " " + Integer.parseInt(split[2]) + " " + Integer.parseInt(split[3]));
                    newAlbum(split[0].substring(7), split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                }

                if(line.startsWith("L")){
                    String tmp; tmp = line;
                    String split[] = tmp.split(";");
                        //System.out.println(split[0].substring(6) + " " + split[1] + " " + split[2] + " " + Integer.parseInt(split[3]));
                    newLied(split[0].substring(6), split[1], Integer.parseInt(split[2]));
                }

            }
        } 
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void play() {

    }

    public void stop() {

    }

    public void previous() {

    }

    public void queue() {

    }

    public void delete() {

    }
}