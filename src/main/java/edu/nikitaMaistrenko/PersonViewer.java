package edu.nikitaMaistrenko;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PersonViewer {
    public static void show(String documentName) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(documentName);

            Node root = document.getDocumentElement();

            System.out.println("List of persons:");
            NodeList person = root.getChildNodes();
            for (int i = 0; i < person.getLength(); i++) {
                Node name = person.item(i);
                if (name.getNodeType() != Node.TEXT_NODE) {
                    System.out.println(root.getNodeName() + ":" + root.getChildNodes().item(i).getTextContent());
                }
            }

        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

