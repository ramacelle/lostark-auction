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
        System.out.println("Controller.search");
        System.exit(1);
        return null;
    }

    public ArrayList<Item> checkItem(ArrayList<Item> list) {
        System.out.println("Controller.checkItem");
        System.exit(1);
        return null;
    }

    public ArrayList<String> buying(ArrayList<Item> list) {
        System.out.println("Controller.buying");
        System.exit(1);
        return null;
    }

    public String notice(ArrayList<String> messages) {
        System.out.println("Controller.notice");
        System.exit(1);
        return null;
    }
}
