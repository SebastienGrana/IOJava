import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Saisisez le chemin (ex: c:/toto)");
		String myPath=scan.nextLine(); // get the path
		Path goodPath = Paths.get(myPath);//transform the string to path 
		File myFile = new File(goodPath.toString());//create a file at the url
		
		if(!myFile.exists()){ //if the file dont aleady exist
			myFile.mkdir(); //create the file
			
			String sub1 = goodPath.toString()+"/sub1";
			String sub2 = goodPath.toString()+"/sub1/sub2";
			File mySubFile1 = new File(sub1);
			File mySubFile2 = new File(sub2);
			mySubFile1.mkdir();
			mySubFile2.mkdir();
			
		}else {
			System.out.println("File already exist");
		}
		
	}

}
