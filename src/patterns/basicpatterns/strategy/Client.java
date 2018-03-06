package patterns.basicpatterns.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		CompressionContext ctx = new CompressionContext();

		// we could assume context is already set by preferences

		ctx.setCompressionStrategy(new ZipCompressionStrategy());

		// get a list of files...
		List<File> fileList = new ArrayList<>();
		ctx.createArchive(fileList);

	}

}
