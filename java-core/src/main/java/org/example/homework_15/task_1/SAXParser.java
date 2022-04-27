package org.example.homework_15.task_1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

public class SAXParser {
    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        javax.xml.parsers.SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(ClassLoader.getSystemResourceAsStream(
                        "homework_15/students.xml"),
                handler);
        for (Student students : handler.studentsList) {
            System.out.println(students);
        }
    }
}

class SAXHandler extends DefaultHandler {

    List<Student> studentsList = new ArrayList<>();
    Student students;
    String content;

    @Override

    public void startElement(String uri, String localName,
                             String qName, Attributes attributes)
            throws SAXException {

        switch (qName) {
            case "student":
                students = new Student();
                students.setId(attributes.getValue("id"));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        switch (qName) {
            case "student" -> studentsList.add(students);
            case "groupNumber" -> students.setGroupNumber(content);
            case "name" -> students.setName(content);
            case "surname" -> students.setSurname(content);
            case "faculty" -> students.setFaculty(content);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }
}

