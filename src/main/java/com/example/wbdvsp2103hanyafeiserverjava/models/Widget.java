package com.example.wbdvsp2103hanyafeiserverjava.models;

public class Widget {
    private String topicId;
    // Widget's unique identifier
    private Long id;
    // Type of the widget, e.g., Heading, List, Paragraph, Image, YouTube, HTML, Link
    private String type;
    // Useful to represent size of widget, e.g., heading size
    private Integer size;
    // Plain text useful for heading text, paragraph text, link text, etc
    private String text;
    // Optional name of the widget
    private String name;
    // Order with respect to widgets in the same list
    private Integer widgetOrder;
    // Absolute or relative URL referring to online resource
    private String url;
    // Widget's horizontal size
    private Integer width;
    // Widget's vertical size
    private Integer height;
    // CSS class implementing some CSS rule and transformations configured in some CSS rule
    private String cssClass;
    // CSS transformations applied to the widget
    private String style;
    // Some arbitrary initial value interpreted by the widget
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWidgetOrder() {
        return widgetOrder;
    }

    public void setWidgetOrder(Integer widgetOrder) {
        this.widgetOrder = widgetOrder;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Widget() {
    }

    public Widget(Long id,
                  String topicId,
                  String type,
                  Integer size,
                  String text) {
        this.id = id;
        this.topicId = topicId;
        this.type = type;
        this.size = size;
        this.text = text;
    }
}
