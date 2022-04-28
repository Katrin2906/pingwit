package org.example.homework_16.task_5;

public class CodeRefactorNew {
    public static <Website, WebsiteType> void main(String[] args) {
        Website website = new Website("http://www.onliner.by");

        String url = Website.getUrl();
        WebsiteType type = website.getType();

        System.out.println(url);
        System.out.println(type);
    }
}
