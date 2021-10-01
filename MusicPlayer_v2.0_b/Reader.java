import java.io.*;
public class Reader{

    public static void main(String[] args){
        BufferedReader br = null;
        String line;

        try {

            br = new BufferedReader(new FileReader("Album_mi_Liedern.txt"));

            while((line = br.readLine()) != null){

                if(line.startsWith("A")){
                    String tmp; tmp = line;
                    String split[] = tmp.split("; ");
                    Musikverwaltungsprogramm.neuesAlbumVerwalten(split[0].substring(6), split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                }

                if(line.startsWith("L")){
                    String tmp; tmp = line;
                    String split[] = tmp.split("; ");
                    Musikverwaltungsprogramm.neuesAlbumVerwalten(split[0].substring(5), split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                }

            }
        } 
        catch(IOException e) {
            e.printStackTrace();
        }
    }
} //by A