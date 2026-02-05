package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long counter = 1L;

    public Item addItem(Item item) {
        item.setId(counter++);
        items.add(item);
        return item;
    }

    public Item getItemById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}
