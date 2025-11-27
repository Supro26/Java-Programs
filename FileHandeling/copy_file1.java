// package FileHandeling;
import java.io.*;
public class copy_file1 {
    public static void main(String[] args)throws Exception {
        File fp = new File("sample.txt");
        if (fp.createNewFile()) {
            System.out.println("File " + fp.getName() + " created");
        } else {
            System.out.println("File " + fp.getName() + " already exists");
        }
        try{
            FileReader fr=new FileReader("/home/bokuto/Documents/test.txt");
            FileWriter fw=new FileWriter(fp);
            int c;
            while((c=fr.read()) != -1)
            {
                fw.write(c);
            }
            fr.close();
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }  
}
