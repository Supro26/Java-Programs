// package FileHandeling;
import java.io.*;
import java.util.*;
public class printfile {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr=new FileReader("/home/bokuto/Documents/test.txt");
            int ch;
            while((ch = fr.read()) != -1)
            {
                if((char)ch == '\n')
                    System.out.println((char)ch);
                else
                    System.out.print((char)ch);
            }
            fr.close();
        } 
        catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
