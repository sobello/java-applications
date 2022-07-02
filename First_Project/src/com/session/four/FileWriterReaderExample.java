package com.session.four;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterReaderExample {
	public static void main(String[] args) {
		char[] in = new char[50];
		int size = 0;
		try {
			File file = new File("fileWrite2.txt"); // to store input // just an object
			FileWriter fw = new FileWriter(file); // create an actual file
			//fw.write("howdy\nfolks\n");
			fw.write("howdy\nnew folks\n");
			fw.flush();
			fw.close();
// & a FileWriter obj // write characters to // the file // flush before closing // close file when done 
			FileReader fr = new FileReader(file); // create a FileReader
			size = fr.read(in);
			System.out.print(size + " ");
			for (char c : in)
				System.out.print(""+c);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
