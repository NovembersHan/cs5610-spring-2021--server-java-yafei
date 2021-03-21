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
    public Widget createWidget(String tid, Widget widget) {
        Integer id = (int) (new Date()).getTime();
        widget.setId(id);
        widget.setTid(tid);
        widgets.add(widget);
        return widget;
    }
    public List<Widget> findAllWidgets() {
        return widgets;
    }
    public List<Widget> findWidgetsForTopic(String tid) {
        List<Widget> ws = new ArrayList<Widget>();
        for(Widget w: widgets) {
            if(w.getTid().equals(tid)) {
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
    public int updateWidget(String wid, Widget newWidget) {
        Integer id = Integer.parseInt(wid);
        for(int i=0; i<widgets.size(); i++) {
            Widget w = widgets.get(i);
            if(w.getId().equals(id)) {
                widgets.set(i, newWidget);
                return 1;
            }
        }
        return 0;
    }
    public int deleteWidget(String wid) {
        Integer id = Integer.parseInt(wid);
        int index = -1;
        for(int i=0; i<widgets.size(); i++) {
            Widget w = widgets.get(i);
            if(w.getId().equals(id)) {
                index = i;
            }
        }
        if(index >= 0) {
            widgets.remove(index);
            return 1;
        }
        return 0;
    }
}