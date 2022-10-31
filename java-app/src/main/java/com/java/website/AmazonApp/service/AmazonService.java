package com.java.website.AmazonApp.service;

import com.java.website.AmazonApp.basket.Item;
import com.java.website.AmazonApp.repository.AmazonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AmazonService {

    @Autowired
    private AmazonRepository amazonRepository;

    public List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        amazonRepository.findAll().forEach(item -> {
            items.add(item);
        });
        return items;
    }

    public Item getItem(long id) {
        return amazonRepository.findById(id).orElse(null);
    }

    public void deleteItem(long id) {
        amazonRepository.deleteById(id);
    }

    public void addItem(Item item) {
        amazonRepository.save(item);
    }

    public void updateItem(Item item, long id) {
        amazonRepository.save(item);
    }
}