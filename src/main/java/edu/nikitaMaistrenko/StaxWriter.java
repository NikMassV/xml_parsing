package edu.nikitaMaistrenko;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StaxWriter {

    public static void creatAndWrite() {
        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter("result.xml"));
            writer.writeStartDocument("UTF-8","1.0");
            writer.writeStartElement("person");
            writer.writeStartElement("name");
            writer.writeAttribute("full_name", "Vasiliy");
            writer.writeCharacters("Vasya");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();
        } catch (XMLStreamException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
