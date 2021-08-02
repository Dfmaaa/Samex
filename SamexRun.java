import java.util.Scanner;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class SamexRun {
	static String ats(String[] a){
		int length=a.length-1;
		String sum="";
		for(int x=0;x<=length;x++){
			sum+=a[x];
		}
		return sum;
	}
	static String conv(String[] a){
		 String result="";
		 for(int x=0;x<=a.length-1;x++) {
			 result=result+a[x]+"\r\n";
		 }
		 return result;
	 }
	static boolean check(String[] a, String element){
		int length=a.length-1;
		int counter=0;
		for(int x=0;x<=length;x++) {
			if(a[x].equals(element)){
				counter++;
			}
		}
		if(counter>0) {
			return true;
		}
		else{
			return false;
		}
	}
    void run(String main_location) throws IOException, InterruptedException {
    	String location=main_location;
	   File main_loc=new File(main_location);
		Scanner input=new Scanner(System.in);
		System.out.println("\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
				+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
				+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
				+ "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
				+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
				+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀▄▀▄▀░░█████\r\n"
				+ "█░░░░░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
				+ "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
				+ "█░░░░░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
				+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
				+ "█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████████████");
		Thread.sleep(40000);
        System.out.println("Samex 1.0 2021. Type help for a list of commands.");
        while(true) {
        	String inp=input.nextLine();
        	boolean inp_cd=check(inp.split(" "),"cd");
        	String with=ats(inp.split(" "));
        	String no_cd=ats(with.split("cd"));
        	String with_2=ats(with.split("dir"));
        	boolean inp_dir=check(inp.split(" "),"dir");
        	if(inp.equals("shutdown")) {
        	 System.exit(0);
          }
        	if(inp.equals("help")) {
        		System.out.println("Type \"shutdown\" to shutdown.");
        		System.out.println("Type \"content\" to see the contents of a file. ");
        		System.out.println("Type \"write\" to write into a file. ");
        		System.out.println("Type \"files\" to see all the files you have edited, or done anything with in samex.");
        		System.out.println("Type \"remove\" to delete files.");
        		System.out.println("Type \"create\" to create new files.");
        		System.out.println("Type \"exists\" to check if a file exists.");
        		System.out.println("Type \"cd [path] \" to open files");
        		System.out.println("Type \"dir [path]\" to view all the files in a directory or a folder.");
        		System.out.println("Type \"restart\" to restart.");
        		System.out.println("Type \"rename\" to rename a file.");
        	}
        	if(inp.equals("rename")){
        		System.out.println("Location:");
        		String loc=input.nextLine();
        		System.out.println("New name(with location):");
        		String new_loc=input.nextLine();
        		File old=new File(loc);
        		File new_old=new File(new_loc);
        		if(old.exists()==true&new_old.exists()==true) {
        		boolean flag=old.renameTo(new_old);
        		if(flag) {
        			System.out.println("File successfully renamed.");
        			if(flag==false) {
        				System.out.println("Failed.");
        			}
        		}
        		}
        		else {
        			System.out.println("One of the files does not exist.");
        		}
        	}
        	if(inp.equals("create")){
        		System.out.print("Enter location of the file:");
        		String loc=input.nextLine();
        		File f=new File(loc);
        		if(f.exists()==true){
        			System.out.println("The file already exists.");
        		}
        		else {
        			f.createNewFile();
        			System.out.println("File has been successfully created.");
        		}
        		f=null;
        	}
        	if(inp_cd==true) {
        		File f=new File(no_cd);
        		if(f.exists()==true) {
        			Desktop desktop=Desktop.getDesktop();
        			if(!Desktop.isDesktopSupported()) {
        				System.out.println("Not supported.");
        			}
        			else {
        				desktop.open(f);
        			}
        		}
        		f=null;
        	}
        	if(inp_dir==true){
        		File f=new File(with_2);
        		if(f.exists()==true) {
        			try {
        				System.out.println(conv(f.list()));
        			}
        			catch(java.lang.NullPointerException exp) {
        				System.out.println("Invalid directory.");
        			}
        		}
        		else {
        			System.out.println("Invalid location.");
        		}
        		f=null;
        	}
        	
        	if(inp.equals("content")) {
        		System.out.print("Location:");
        		String locat=input.nextLine();
        		 File fileToRead = new File(locat);
        		 FileWriter wr=new FileWriter(main_loc);
                 try (FileReader fileStream = new FileReader(fileToRead);
                      BufferedReader bufferedReader = new BufferedReader(fileStream)) {
                     String line = null;
                     while ((line = bufferedReader.readLine())!= null) {
                    	 System.out.println(line);
        	   }   
              }
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                 LocalDateTime now = LocalDateTime.now(); 
                wr.write(fileToRead.getName() + "  " + fileToRead.getAbsolutePath() + "  " + fileToRead.length() + "  " + "saw the contents of the file"+"  " + dtf.format(now) + "\r\n");
                fileToRead=null;
        	 }
        	if(inp.equals("write")) {
        		System.out.print("Location:");
        		String name=input.nextLine();
        		 File file = new File(name);
                 FileWriter write = new FileWriter(file);
                 System.out.println("Enter the text you would like to write into " + file.getName());
                 String text=input.nextLine();
                 write.write(text);
                 write.close();
                 FileWriter wr=new FileWriter(main_loc);
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                 LocalDateTime now = LocalDateTime.now();   
                 wr.write(file.getName() + "  " + file.getAbsolutePath() + "  " + file.length() + "  " + "typed in the file"+"  " + dtf.format(now) + "\r\n"); 
                 file=null;
        	}
        	if(inp.equals("files")) {
        		System.out.println("Name  Path  Size  Task  Time");
        		File show=new File(location);
        		 try (FileReader fileStream = new FileReader(show);
                         BufferedReader bufferedReader = new BufferedReader(fileStream)) {
                        String line = null;
                        int line_count=0;
                        while ((line = bufferedReader.readLine())!= null) {
                       	System.out.println(line);
                       	line_count++;
           	   }
                        if(line_count==0) {
                        	System.out.println("You haven't done anything with files in Samex.");
                        }
                        show=null;
        	}
        		 catch(Exception e) {
        			 System.out.println("Something went wrong.");
        		 }
        }
        if(inp.equals("remove")) {
        	System.out.print("location:");
        	String location_=input.nextLine();
        	File file_=new File(location);
            if(file_.delete()==true) {
            	System.out.println(file_.getName() + " has been successfully deleted.");
            }
            else {
            	System.out.println(file_.getName() + "can't be deleted for some reason.");
            }
            file_=null;
        }
        if(inp.equals("exists")){
        	System.out.print("Location:");
        	String loc=input.nextLine();
        	File f=new File(loc);
        	if(f.exists()==true) {
        		System.out.println("The file does exist.");
        	}
        	else {
        		System.out.println("The file does not exist.");
        	}
        	f=null;
        }
        if(inp.equals("restart")) {
        	System.out.println("Shutting down.");
        	Thread.sleep(50000);
        	System.out.println("\r\n"
        			+ "████████████████████████████████████████████████████████████████████████████████████████\r\n"
        			+ "█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
        			+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
        			+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
        			+ "█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
        			+ "█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
        			+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀▄▀▄▀░░█████\r\n"
        			+ "█░░░░░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░░░░░███░░░░▄▀▄▀▄▀░░░░███\r\n"
        			+ "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░███████████░░▄▀▄▀░░▄▀▄▀░░███\r\n"
        			+ "█░░░░░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀░░░░░░░░░░█░░░░▄▀░░██░░▄▀░░░░█\r\n"
        			+ "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██████████░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀░░██░░▄▀▄▀░░█\r\n"
        			+ "█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░██░░░░░░░░█\r\n"
        			+ "████████████████████████████████████████████████████████████████████████████████████████");
        	Thread.sleep(40000);
        	System.out.println("Samex 1.0 2021. Type help for a list of commands.");
        }
	}
  }    
 }
