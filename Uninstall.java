import java.io.File;
import java.util.Scanner;
public class Uninstall {
 public static void main(String[] args){
	File samex=new File("Samex.java");
	String path=samex.getAbsolutePath();
	if(samex.delete()==true) {
	System.out.println(path + " has been deleted.");
	}
	else if(samex.delete()==false) {
		System.out.println("Deletion of " + path + " was unsuccessful.");
	}
	File samexRun=new File("samexRun.java");
	String path_2=samexRun.getAbsolutePath();
	if(samexRun.delete()==true) {
		System.out.println(path_2 + " has been deleted.");
	}
	else if(samexRun.delete()==false) {
		System.out.println("Deletion of" + path_2 + " was unsuccessful.");
	}
	File validity=new File("validiyOfSamex.txt");
	String path_3=validity.getAbsolutePath();
	if(validity.delete()==true) {
		System.out.println(path_3 + " has been deleted.");
	}
	else if(validity.delete()==false) {
		System.out.println("Deletion of " + path_3 + " was unsuccessful.");
	}
	File def=new File("Main_File.txt");
	if(def.exists()==true){
		String path_4=def.getAbsolutePath();
		if(def.delete()==true) {
			System.out.println(path_4 + " has been deleted.");
		}
		else if(def.delete()==false) {
			System.out.println("Deletion of " + path_4 + " was unsuccessful.");
		}
	}
	else if(def.exists()==false) {
		Scanner inp=new Scanner(System.in);
		System.out.println("The file you entered as the main file:");
		String file=inp.nextLine();
		File user=new File(file);
		if(user.exists()==true) {
			String path_5=user.getAbsolutePath();
			if(user.delete()==true) {
				System.out.println(path_5 + " has been deleted.");
				System.out.println("Samex Successfully deleted.");
			}
			else if(user.delete()==false) {
				System.out.println("Deletion of" + path_5 + " was unsuccessful.");
			}
		}
		else if(user.exists()==false) {
			System.out.println("The file does not exist. Maybe, you entered it in the wrong format. don't use 1 backslash. replace them with 2 backslashes.");
		}
	}
 }
}
