package org.example.homework_16.task_5;

public class WebSide<WebsiteType> { // generic точно не нужен, WebSide -> Website
    private String url;
    private WebsiteType type;

    public WebSide(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public void Website(String url) {
        super(url, WebsiteType.NEWS);
    }

    public String getUrl() {
        return url;
    }

    public String getType() {
        return getClass().getTypeName();
    }

}
