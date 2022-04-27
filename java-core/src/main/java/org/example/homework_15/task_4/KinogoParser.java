package org.example.homework_15.task_4;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import javax.lang.model.util.Elements;
import java.io.File;
import java.io.IOException;

public class KinogoParser {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/homework_15/kinogo.html");
        Document document = (Document) Jsoup.parse(file, "UTF-8", "hh.ru");
     //   Elements h2 = document.select("h2");
     //   System.out.println(h2);

    }
}
