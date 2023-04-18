package Chucking_Codes;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String args[]) throws IOException {
		File name = new File("abc.tet");
		//if(!name.exists()) {
		//	name.createNewFile();
	//	}
		name.mkdir();
		name.delete();
	}

}