import java.io.*;
public class Reader{

    public static void main(List<String> list){
        BufferedReader br = null;
        String line;

        try {

            br = new BufferedReader(new FileReader("src/Netzbegriffe.txt"));

            while((line = br.readLine()) != null){

                list.append(line);

            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}