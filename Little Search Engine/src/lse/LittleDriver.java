package lse;

import java.io.FileNotFoundException;
import java.util.*;

public class LittleDriver {
	static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Enter the word you want to search: ");
		String word = stdin.nextLine();
		System.out.println("Enter another word: ");
		String word2 = stdin.nextLine();
		LittleSearchEngine lse = new LittleSearchEngine();
		System.out.println("Scanning Documents...");
		String docFile = "docs.txt";
		System.out.println();
		System.out.println("Scanning Noisewords...");
		String noiseFile = "noisewords.txt";
		lse.makeIndex(docFile, noiseFile);
		System.out.println();
		System.out.println("Here are the top 5 words across all documents for your given keywords");
		
		System.out.println(lse.top5search(word,word2));
		/*
		System.out.println("Enter a specific document file");
		String docFile2 = stdin.nextLine();
		System.out.println("Load key words? (y / n)");
		String input = stdin.nextLine().toLowerCase();
		if (input.toLowerCase().equals("n")) {
			return;
		}
			HashMap<String,Occurrence> test = lse.loadKeywordsFromDocument(docFile2);
			System.out.println();
			System.out.println(test.get(word));
			System.out.println();
			*/
	}
}
