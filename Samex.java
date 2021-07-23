import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Samex{
 public static void main(String[] args) throws IOException, InterruptedException{ 
	Scanner input=new Scanner(System.in);
    File ff=new File("validityOfSamex.txt");
    if(ff.exists()==false) {
	System.out.println("Place the file where the main OS file is saved.");
    System.out.println("File in which  data will be saved:");
    String file=input.nextLine();
    File check=new File(file);
    if(check.exists()) {
    	String[] a=file.split(check.getName());
    	String sum="";
    	for(int x=0;x<=a.length-1;x++) {
    		sum+=a[x];
    	}
    	File count=new File(sum + "validityOfSamex.txt");
    	count.createNewFile();
    	FileWriter fw=new FileWriter(sum);
    	fw.write(file);
    	System.out.println("You can now use Samex!");
    }
    else {
    	System.out.println("Invalid location.");
    }
	}
    else {
    	SamexRun runFinal=new SamexRun();
    	String mainrun=null;
    	int checkcounter=0;
    	try (FileReader fileStream = new FileReader("validityOfSamex.txt");
                BufferedReader bufferedReader = new BufferedReader(fileStream)) {
               String line = null;
               while ((line = bufferedReader.readLine())!= null) {
            	   mainrun=line;
            	   File checkFinal=new File(mainrun);
            	   if(checkFinal.exists()) {
            		   checkcounter++;
            	   }
               }
           if(checkcounter==1) {
        	   runFinal.run(mainrun); 
           }
           else {
        	   System.out.println("Something went wrong.");
        }
    }	
 }
 } 
}
