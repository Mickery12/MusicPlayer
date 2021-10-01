import java.io.*;
public class Reader{
    
    public static void main(String[] args){
    BufferedReader br = null;
    String line;
    
    try {

        br = new BufferedReader(new FileReader("Album_mi_Liedern.txt"));

        while((line = br.readLine()) != null){
            
          

            if(line.startsWith("A")){
                String tmp(line);
                String split[] = tmp.split("; ");
                new static Album(split[0].substring(1), split[1], split[2], split[3]);
                
            }
            
            if(line.startsWtith("L")){
                Stringtmp(line);
                String split[] = tmp.split(; );
                new static Lied(split[0].substring(5), split[1], split[2] )
            }




















        }
    } catch(IOException e) {
            e.printStackTrace();
        }
    }
} //by A