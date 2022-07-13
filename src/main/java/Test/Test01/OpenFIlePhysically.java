package Test.Test01;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class OpenFIlePhysically {

	public static void main(String[] args) throws Exception {
		File f = new File("D:/Auto.txt");
		Desktop d = Desktop.getDesktop();
		d.open(f);
		d.browse(new URI("https://www.google.com"));
		d.edit(f);
		d.mail();


	}

}
