package com.hkoma2jp.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public List<Item> getItems() {
        return itemService.find();
    }

}
