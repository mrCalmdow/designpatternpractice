package com.flchen.designpatternpractice.simpleFactoryPatternExtends;

import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * author fl.chen
 * Date 2019-06-02
 * Time 21:39
 **/
public class XMLUtils {

    public static String getShapeType() {

        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();

            Document document = builder.parse(ResourceUtils.getFile("classpath:config.xml"));

            NodeList nodeList = document.getElementsByTagName("shapeType");
            Node node = nodeList.item(0).getFirstChild();
            return node.getTextContent();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return null;
        } catch (SAXException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
