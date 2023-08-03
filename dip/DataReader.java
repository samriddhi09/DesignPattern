package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader implements Reader {
	String fileName;
	public DataReader(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getBytes() {
		StringBuilder data = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
			while (reader.readLine() != null) {
				data.append(reader.readLine());
			}
			reader.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return data.toString().getBytes();
	}
}
