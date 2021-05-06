package Reader;

import java.io.*;
import java.util.*;

public class In {
	String directory;
	File file;
	static Scanner sc;
	
	public In(String directory) throws FileNotFoundException{
		this.directory = directory;
		file = new File(directory);
		sc = new Scanner(file);
	}
	
	
	public static int readInt() {
		return sc.nextInt();
	}
	
	public static String readString() {
		return sc.nextLine();
	}
}
