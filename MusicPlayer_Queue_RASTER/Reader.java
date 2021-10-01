import java.io.*;
public class Reader{
    
    public static void main(String[] args){
    BufferedReader br = null;
    String line;
    
    try {

        br = new BufferedReader(new FileReader("Album_mi_Liedern.txt"));

        while((line = br.readLine()) != null){

            if(line.startsWith("Album: ")){
                new String tmp(line);
                tmp
            }




















        }
    } catch(IOException e) {
            e.printStackTrace();
        }
    }
}