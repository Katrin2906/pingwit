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
        parser.parse(ClassLoader.getSystemResourceAsStream("homework_15/students.xml"), // лучше либо в 1 строку, либо каждый аргумент с новой строки, ниже пример
                handler);
        
        /*
        parser.parse(ClassLoader.getSystemResourceAsStream(
                "homework_15/students.xml"),
                handler
        );
        */

        for (Students students : handler.empList) {
            System.out.println(students);
        }
    }
}

class SAXHandler extends DefaultHandler {

    List<Students> empList = new ArrayList<>(); // empList - так вроде бы я называл поле, но там были Employee и название было более менее оправданно, в твоем случае там студенты
    Students students = null; // null можно не указывать, т.к. students при создании объекта будет null
    String content = null; // null можно не указывать, т.к. content при создании объекта будет null

    @Override

    public void startElement(String uri, String localName,
                             String qName, Attributes attributes)
            throws SAXException {

        switch (qName) {
                // если полностью копируешь код, то проверяй его, у тебя нету класса Employee
            //Create a new Employee object when the start tag is found
            case "student":
                students = new Students();
                students.id = attributes.getValue("id");
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        switch (qName) { // поскольку мы используем Java 17, то лучше использовать синтаксис оператора switch из Java 17
// лишняя строка
            case "student":
                empList.add(students);
                break;

            case "groupNumber":
                students.groupNumber = content;
                break;
            case "name":
                students.name = content;
                break;
            case "surname":
                students.surname = content;
                break;
            case "faculty":
                students.faculty = content;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException { // это должно быть на одной строке с описанием метода
        content = String.copyValueOf(ch, start, length).trim();
    }

}

