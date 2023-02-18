package org.example.main.service;

import org.example.main.repository.Repository;

public class Service {
    private Repository repository;
    public Service(Repository r) {
        this.repository = r;
    }
}
