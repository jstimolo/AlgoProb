package Password;

import java.io.*;
import java.util.*;

import Reader.In;



public class Password {

	public static void main(String[] args) throws FileNotFoundException {
		In input = new In("C:\\Users\\jstimolo\\Documents\\GitHub\\AlgoProb\\Algorithmen\\src\\Password\\input.txt");
		ArrayList<String> papers = new ArrayList<String>();
		 
		int testCases = input.readInt();
		System.out.println("testCases: "+testCases);
		
		
		for(int i=0; i<testCases; i++) {
			int nrPapers = input.readInt();
			System.out.println(nrPapers);
		}
	}
}
			
			/*
			for(int j=0; j<nrPapers; j++) {
				String s = input.readString();
				papers.add(s);
			}
		}
		
		for(int i=0; i<papers.size(); i++) {
			System.out.println(papers.get(i));
		}
	}

}
*/