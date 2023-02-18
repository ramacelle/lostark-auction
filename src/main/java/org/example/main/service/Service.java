package org.example.main.service;

import org.example.main.model.Item;
import org.example.main.repository.Repository;

import java.util.ArrayList;

public class Service {
    private Repository repository;
    public Service(Repository r) {
        this.repository = r;
    }

    public String searching(String query) {
        return repository.searching(query);
    }

    public ArrayList<Item> parsing(String html) {
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(new Item("죽음의 모자1", 1));
        list.add(new Item("죽음의 모자2", 2));
        list.add(new Item("죽음의 모자3", 3));
        list.add(new Item("죽음의 모자4", 234.12312));
        list.add(new Item("죽음의 모자5", 22));
        list.add(new Item("죽음의 모자6", 234.12312));
        list.add(new Item("죽음의 모자7", 2342312));
        list.add(new Item("죽음의 모자8", 2312312));
        list.add(new Item("죽음의 모자9", 2312.12));
        list.add(new Item("죽음의 모자10", 23412.312));
        list.add(new Item("죽음의 모자11", 2341.22));
        list.add(new Item("죽음의 모자12", 2.3412312));
        return list;
    }

    public ArrayList<Item> checkItems(ArrayList<Item> list) {
        ArrayList<Item> result = new ArrayList<Item>();
        for (int i = 0; i < list.size(); i += 1) {
            Item v = list.get(i);
            if (v != null) {
                if (v.getTitle().contains("죽음의 모자") && v.getPrice() < 200) {
                    result.add(v);
                }
            }
        }
        return result;
    }

    public ArrayList<String> buying(ArrayList<Item> list) {
        ArrayList<String> messages = new ArrayList<String>();
        for (int i = 0; i < list.size(); i += 1) {
            Item v = list.get(i);
            if (v != null) {
                String message = this.repository.buying(v);
                if (message != null) {
                    messages.add(message);
                }
            }
        }
        return messages;
    }

    public void notifying(String message) {
        this.repository.notifying(message);
    }
}
