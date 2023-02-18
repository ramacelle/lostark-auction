package org.example.main.controller;

import org.example.main.model.Item;
import org.example.main.service.Service;

import java.util.ArrayList;

public class Controller {
    private Service service;
    public Controller(Service s) {
        this.service = s;
    }

    // 1. lostark에서 aution에 검색을 합니다.
    public ArrayList<Item> search(String query) {
        if (query == null || query.equals("")) {
            return null;
        }
        String html = this.service.searching(query);
        ArrayList<Item> list = this.service.parsing(html);
        return list;
    }

    public ArrayList<Item> checkItem(ArrayList<Item> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList<Item> checkedList = this.service.checkItems(list);
        return checkedList;
    }

    public ArrayList<String> buying(ArrayList<Item> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList<String> messages = this.service.buying(list);
        return messages;
    }

    public String notice(ArrayList<String> messages) {
        if (messages == null || messages.size() == 0) {
            return "FAILED";
        }
        for (int i = 0; i < messages.size(); i += 1) {
            String message = messages.get(i);
            if (message != null && message != "") {
                this.service.notifying(message);
            }
        }
        return "SUCCESS";
    }
}
