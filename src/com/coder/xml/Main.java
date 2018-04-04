package com.coder.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * 解析xml的两种方式
 * dom4j
 *
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("resources/test.xml"));
        Element element = document.getRootElement();
        List<Element> list =  element.elements("student");
        /**
         * 获取子标签
         */
        for (Element o : list) {
            System.out.println(o.element("name").getText());
            System.out.println(o.element("age").getText());
        }
        /**
         * 获取属性
         */
        System.out.println(element.attribute("color").getValue());

    }

}
