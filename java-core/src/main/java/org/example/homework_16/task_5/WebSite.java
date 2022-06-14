package org.example.homework_16.task_5;

public class WebSite { // generic точно не нужен, WebSite -> Website
    private String url;
    private WebsiteType type;

    public WebSite(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public WebSite(String url) {
        this(url, WebsiteType.NEWS);
    }

    public String getUrl() {
        return url;
    }

    public WebsiteType getType() {
        return type;
    }

}
