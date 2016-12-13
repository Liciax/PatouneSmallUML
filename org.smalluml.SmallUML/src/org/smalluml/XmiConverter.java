package org.smalluml;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import smalluml.impl.SmallumlPackageImpl;

public class XmiConverter {

	public static void main(String[] args) {
		SmallumlPackageImpl.init();
	    // change MyLanguage with your language name
	    Injector injector = new SmallUMLStandaloneSetup()
	            .createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);
	
	    // .ext ist the extension of the model file
	    String inputURI = "file:///home/thomas/runtime-EclipseApplication/smallUMLTest/src/thao.smalluml";
	    String outputURI = "file:///home/thomas/runtime-EclipseApplication/smallUMLTest/src/thao.xmi";
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);
	
	    EcoreUtil.resolveAll(xtextResource);
	
	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
