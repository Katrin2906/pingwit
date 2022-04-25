package org.example.homework_15.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class DOMParser {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document =
                builder.parse(
                        ClassLoader.getSystemResourceAsStream("homework_15/students.xml"));
        List<Students> empList = new ArrayList<>(); // empList - так вроде бы я называл поле, но там были Employee и название было более менее оправданно, в твоем случае там студенты
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Students emp = new Students();
                emp.id = node.getAttributes().
                        getNamedItem("id").getNodeValue();

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) { // поскольку мы используем Java 17, то лучше использовать синтаксис оператора switch из Java 17
                            case "groupNumber":
                                emp.groupNumber = content;
                                break;
                            case "name":
                                emp.name = content;
                                break;
                            case "surname":
                                emp.surname = content;
                                break;
                            case "faculty":
                                emp.faculty = content;
                                break;
                        }
                    }
                }
                empList.add(emp);
            }

        }

        for (Students students : empList) {
            System.out.println(students);
        }

    }
}

