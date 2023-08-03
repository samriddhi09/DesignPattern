package solid.live.dip;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements Reader {
	URL url;
	public NetworkReader(String uri) {
		try {
			this.url = new URL(uri);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public NetworkReader(String protocol, String host, String fileName) {
		try {
			this.url = new URL(protocol, host, fileName);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public byte[] getBytes() {
		InputStream in = null;
		try {
			assert this.url != null;
			in = this.url.openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStreamReader reader = new InputStreamReader(in);
		StringBuilder stringBuilder = new StringBuilder();
		try {
			int c;
			c = reader.read();
			while (c != -1) {
				stringBuilder.append((char) c);
				c = reader.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuilder.toString().getBytes();
	}
}
