package gf;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Xml2Java {
	public Object UnMarshall() throws JAXBException{
		 JAXBContext jaxbContext = JAXBContext.newInstance();
	     Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	     Object o = unmarshaller.unmarshal( new File( "jahb.xml" ) );
	     return o;
	}

}
