package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter implements Writer {
	String fileName;
	public DataWriter(String fileName) {
		this.fileName = fileName;
	}
	public void write(String data) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName));
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}