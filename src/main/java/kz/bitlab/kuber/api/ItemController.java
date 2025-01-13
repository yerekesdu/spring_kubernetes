package kz.bitlab.kuber.api;

import kz.bitlab.kuber.api.model.Item;
import kz.bitlab.kuber.api.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping()
    public Item addIte(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping()
    public List<Item> getAllItems() {
        return itemService.getItems();
    }
}