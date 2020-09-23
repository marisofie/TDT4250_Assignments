package tdt4250.assignment2.html;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import studyprograms.StudyprogramsPackage;
import studyprograms.University;
import studyprograms.impl.StudyprogramsFactoryImpl;
import tdt4250.assignment2.html.acceleo.University2TextGenerator;

public class University2TextGeneratorMain {

	public static void main(String[] args) throws IOException {
		University university = (args.length > 0 ? getUniversity(args[0]) : getSampleUniversity());
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
	
	public static University getUniversity(String uriString) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogramsPackage.eNS_URI, StudyprogramsPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("university", new StudyprogramsFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof University) {
				return (University) eObject;
			}
		}
		return null;
	}
	
	public static University getSampleUniversity() {
		try {
			return getUniversity(University2TextGeneratorMain.class.getResource("SampleUniversity.university").toString());
		} catch (IOException e) {
			System.err.println(e);
			return null;
		}
	}
}