package gf;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Jaxb2Xml {

	public static void main(String[] args) throws JAXBException{
		Product prod = new Product();
		File file = new File(prod.getName() + ".xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(prod, file);
		Xml2Java gfgf = new Xml2Java();
		gfgf.UnMarshall();
		
	}
}
