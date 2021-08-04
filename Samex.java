import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Samex{
 public static void main(String[] args) throws IOException, InterruptedException{ 
	int default_file_counter=0;
	String file=null;
	Scanner input=new Scanner(System.in);
    File ff=new File("validityOfSamex.txt");
    if(ff.exists()==false) {
    	File default_file=new File("Main_File.txt");
    	default_file.createNewFile();
    	ff.createNewFile();
    	System.out.println("You can now use Samex!");
    }
    else if(ff.exists()==true){
    	SamexRun runFinal=new SamexRun();
        	   runFinal.run("Main_File.txt");
    }
	}     
 } 

