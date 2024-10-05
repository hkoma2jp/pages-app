package com.hkoma2jp.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkoma2jp.api.entity.Item;
import com.hkoma2jp.api.service.ItemService;

@RestController
@RequestMapping("/v1/items")
public class itemController {
    
    private final ItemService itemService;

    public itemController(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * ## 全件取得
     * @return List<Item>
     */
    @GetMapping
    public List<Item> getItems() {
        List<Item> itemList =  itemService.find();
        return itemList;
    }

    /**
     * ## 商品詳細ページ
     * @param id
     * @return Item
     */
    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        Item item = itemService.findById(id).get();
        return item;
    }
}
