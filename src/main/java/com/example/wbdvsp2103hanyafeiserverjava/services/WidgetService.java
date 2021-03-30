package com.example.wbdvsp2103hanyafeiserverjava.services;

import com.example.wbdvsp2103hanyafeiserverjava.models.Widget;
import com.example.wbdvsp2103hanyafeiserverjava.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WidgetService {

    @Autowired
    WidgetRepository repository;

//    private List<Widget> widgets = new ArrayList<Widget>();

    // implement crud operations
    public Widget createWidget(String tid, Widget widget) {
        widget.setTid(tid);

        return repository.save(widget);
//        Integer id = (int) (new Date()).getTime();
//        widget.setId(id);
//        widget.setTid(tid);
//        widgets.add(widget);
//        return widget;
    }
    public List<Widget> findAllWidgets() {
        return repository.findAllWidgets();
//        return (List<Widget>) repository.findAll();
//        return widgets;
    }
    public List<Widget> findWidgetsForTopic(String tid) {
        return repository.findWidgetsForTopic(tid);

//        List<Widget> ws = new ArrayList<Widget>();
//        for(Widget w: widgets) {
//            if(w.getTid().equals(tid)) {
//                ws.add(w);
//            }
//        }
//        return ws;
    }
    public Widget findWidgetById(Long id) {
        return repository.findWidgetById(id);
//        for(Widget w: widgets) {
//            if(w.getId().equals(id)) {
//                return w;
//            }
//        }
//        return null;
    }
    public int updateWidget(String wid, Widget newWidget) {
        Long id = Long.parseLong(wid);
        Widget originalWidget = findWidgetById(id);

        originalWidget.setText(newWidget.getText());
        originalWidget.setSrc(newWidget.getSrc());
        originalWidget.setName(newWidget.getName());
        originalWidget.setWidgetOrder(newWidget.getWidgetOrder());
        originalWidget.setWidth(newWidget.getWidth());
        originalWidget.setHeight(newWidget.getHeight());
        originalWidget.setCssClass(newWidget.getCssClass());
        originalWidget.setStyle(newWidget.getStyle());
        originalWidget.setValue(newWidget.getValue());
        originalWidget.setTid(newWidget.getTid());
        originalWidget.setId(newWidget.getId());
        originalWidget.setType(newWidget.getType());
        originalWidget.setSize(newWidget.getSize());
        originalWidget.setOrdered(newWidget.getOrdered());

        repository.save(originalWidget);
        return 1;
//        Integer id = Integer.parseInt(wid);
//        for(int i=0; i<widgets.size(); i++) {
//            Widget w = widgets.get(i);
//            if(w.getId().equals(id)) {
//                widgets.set(i, newWidget);
//                return 1;
//            }
//        }
//        return 0;
    }
    public int deleteWidget(String wid) {
        Long id = Long.parseLong(wid);
        repository.deleteById(id);
        return 1;
//        int index = -1;
//        for(int i=0; i<widgets.size(); i++) {
//            Widget w = widgets.get(i);
//            if(w.getId().equals(id)) {
//                index = i;
//            }
//        }
//        if(index >= 0) {
//            widgets.remove(index);
//            return 1;
//        }
//        return 0;
    }
}