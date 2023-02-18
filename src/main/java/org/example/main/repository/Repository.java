package org.example.main.repository;

import org.example.main.model.Item;

public class Repository {
    private String url;
    public Repository(String lostarkAPIUrl) {
        this.url = lostarkAPIUrl;
    }

    public String searching(String query) {
        return "불러왔다 치고!";
    }

    public String buying(Item v) {
        // 가짜로 구매했다 치고~
        return String.format(
                "[가짜로 구매했다 치고~] [%s]를 [%f 원]에 구매합니다.",
                v.getTitle(),
                v.getPrice());
    }

    public void notifying(String message) {
        System.out.printf("[%s]를 전송했다 치고\n", message);
    }
}
