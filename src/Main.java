import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String myPath=scan.nextLine();
		Path goodPath = Paths.get(myPath);
		File myfile = new File(goodPath.toString());
		if(!myfile.exists()){
			try {
				myfile.mkdir();
			} catch(Exception e){
				return;
			}
		}
		
	}

}
