package com.example.wbdvsp2103hanyafeiserverjava.models;

import javax.persistence.*;

@Entity
@Table(name="widgets")
public class Widget {

    // Widget's unique identifier
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Topic id
    private String tid;
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
    private String src;
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

    private Boolean ordered;

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

    public String getSrc() { return src; }

    public void setSrc(String src) {
        this.src = src;
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

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean getOrdered() { return ordered; }

    public void setOrdered(Boolean ordered) { this.ordered = ordered; }


    public Widget() {
    }

    public Widget(Integer id,
                  String tid,
                  String type,
                  Integer size,
                  String text) {
        this.id = id;
        this.tid = tid;
        this.type = type;
        this.size = size;
        this.text = text;
    }
}
