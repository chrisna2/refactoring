package code.refactoring.junit;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {
	FileReader _input = null;
	
	@Before
	public void setUp() throws Exception {
		try {
			_input = new FileReader("C:/Temp/data.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException ("Cannot open the TXT File");
		}
	}
 
	@After
	public void tearDown() throws Exception {
		try {
			_input.close();
		} catch (IOException e) {
			throw new RuntimeException ("Error in closing TXT File");
		}
	}

	@Test
	public void testRead() throws IOException {
		char ch = '&';
		for (int i=0; i<4; i++) 
			ch = (char)_input.read();
		assert('d'==ch);
		assertEquals('d',ch);
		
	}
}
