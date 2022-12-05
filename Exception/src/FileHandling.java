package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("sample.txt");
		f.createNewFile();
	}
}
