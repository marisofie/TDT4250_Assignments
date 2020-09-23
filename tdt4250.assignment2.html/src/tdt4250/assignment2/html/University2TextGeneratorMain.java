package tdt4250.assignment2.html;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;

import studyprograms.University;
import tdt4250.assignment2.html.acceleo.University2TextGenerator;

public class University2TextGeneratorMain {

	public static void main(String[] args) throws IOException {
		University university = (args.length > 0 ? University2XhtmlGeneratorMain.getUniversity(args[0]) : University2XhtmlGeneratorMain.getSampleUniversity());
		//TODO: Find out what is happening with generatehtml -- cannot find in example repo from Hallvard	
		String html = new University2TextGenerator().generateHtml(university);
		if (args.length > 1) {
			URI target = URI.createURI(args[1]);
			try (PrintStream ps = new PrintStream(university.eResource().getResourceSet().getURIConverter().createOutputStream(target))) {
				ps.print(html);
			}
		} else {
			System.out.println(html);
		}
	}
}