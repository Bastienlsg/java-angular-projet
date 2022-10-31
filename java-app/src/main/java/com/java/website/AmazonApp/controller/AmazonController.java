package com.java.website.AmazonApp.controller;

import com.java.website.AmazonApp.basket.Item;
import com.java.website.AmazonApp.service.AmazonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class AmazonController {

    @Autowired
    private AmazonService amazonService;

    @RequestMapping("/items")
    public List<Item> getItems() {
        return amazonService.getItems();
    }

    @RequestMapping("/item/{id}")
    public Item getItem(@PathVariable long id) {
        return amazonService.getItem(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/item/{id}")
    public void deleteItem(@PathVariable long id) {
        amazonService.deleteItem(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public void addItem(@RequestBody Item item) {
        amazonService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/item/{id}")
    public void updateItem(@RequestBody Item item,@PathVariable long id) {
        amazonService.updateItem(item, id);
    }
}
