package Interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FileReader fi=new FileReader();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\Muthukumar\\Desktop\\SampleFiles\\SampleString.txt"));

			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}

			FileWriter writer = new FileWriter("C:\\Users\\Muthukumar\\Desktop\\SampleFiles\\SampleString.txt", true);

			BufferedWriter bw = new BufferedWriter(writer, 1);

			String st1 = "sooper";
			bw.write("\n");
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
