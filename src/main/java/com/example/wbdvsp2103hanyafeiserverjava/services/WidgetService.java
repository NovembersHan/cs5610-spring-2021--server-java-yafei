package com.example.wbdvsp2103hanyafeiserverjava.services;

import com.example.wbdvsp2103hanyafeiserverjava.models.Widget;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WidgetService {
    private List<Widget> widgets = new ArrayList<Widget>();

    // implement crud operations
    public Widget createWidgetForTopic(Widget widget) {
        int id = (int) (new Date()).getTime();
        widget.setId(id);
        widgets.add(widget);
        return widget;
    }
    public List<Widget> findAllWidgets() {
        return widgets;
    }
    public List<Widget> findWidgetsForTopic(String topicId) {
        List<Widget> ws = new ArrayList<Widget>();
        for(Widget w: widgets) {
            if(w.getTopicId().equals(topicId)) {
                ws.add(w);
            }
        }
        return ws;
    }
    public Widget findWidgetById(Long id) {
        for(Widget w: widgets) {
            if(w.getId().equals(id)) {
                return w;
            }
        }
        return null;
    }
    public Integer updateWidget(Long id) {
        return -1;
    }
    public Integer deleteWidget(Long id) {
        return -1;
    }
}