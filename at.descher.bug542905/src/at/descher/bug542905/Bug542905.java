package at.descher.bug542905;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Bug542905 {

	public static String run() throws JAXBException, IOException {

		XmlElement element = new XmlElement();
		element.setLabel("myLabel");

		Marshaller marshaller = JAXBContext.newInstance(XmlElement.class).createMarshaller();
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			marshaller.marshal(element, baos);
			return baos.toString();
		}

	}
}
