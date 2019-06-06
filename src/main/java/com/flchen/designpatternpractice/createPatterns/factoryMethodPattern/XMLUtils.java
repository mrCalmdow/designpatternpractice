package com.flchen.designpatternpractice.createPatterns.factoryMethodPattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 11:27
 **/

@Slf4j
public class XMLUtils {

    private static String getBeanName() throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        File file = ResourceUtils.getFile("classpath:beanConfig.xml");
        Document document = builder.parse(file);

        NodeList nodeList = document.getElementsByTagName("beanName");
        Node node = nodeList.item(0).getFirstChild();
        return node.getTextContent();
    }

    public static ImageReaderFactory getBean() {

        String beanName = "";
        try {
            beanName = getBeanName();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

        try {
            Class clazz = Class.forName(beanName);
            return (ImageReaderFactory) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            log.error(e.getMessage());
            return null;
        }
    }
}
