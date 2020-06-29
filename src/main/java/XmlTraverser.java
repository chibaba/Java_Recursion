import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlTraverser {
    public Document loadXml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            File xmlFile = new File("src/main/resources/cities.xml");
            document = builder.parse(xmlFile);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return document;
    }

    public void printText(String text) {
        if (StringUtils.isNotBlank(text)) {
            System.out.print(text);
        }
    }

    public void indent(int indentation) {
        System.out.print(StringUtils.leftPad("", indentation));
    }
    public void transverseNode(Node node, int indentation) {
        indent(indentation);
        System.out.print(node.getNodeName() + " ");
            if(node.hasChildNodes()) {
                indentation += 2;
                NodeList children = node.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    Node child = children.item(i);
                    if (child.getNodeType() == Node.TEXT_NODE) {
                        printText( child.getTextContent() );
                    } else {
                        System.out.println();
                        transverseNode(child, indentation);
                    }
                }
            }

        }
        public void traverseDocument(Document document) {
        transverseNode(document.getFirstChild(), 0);
        }


}
