package kz.bitlab.kuber.api.service;

import kz.bitlab.kuber.api.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ItemService {

    private ArrayList<Item> items;

    private ItemService() {
        items = new ArrayList<>();
    }

    public Item addItem(Item item) {
        item.setId(UUID.randomUUID());
        items.add(item);
        return item;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
