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
        List<Student> studentsList = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Student emp = new Student();
                emp.setId(node.getAttributes().
                        getNamedItem("id").getNodeValue());

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "groupNumber" -> emp.setGroupNumber(content);
                            case "name" -> emp.setName(content);
                            case "surname" -> emp.setSurname(content);
                            case "faculty" -> emp.setFaculty(content);
                        }
                    }
                }
                studentsList.add(emp);
            }
        }
        for (Student students : studentsList) {
            System.out.println(students);
        }
    }
}

