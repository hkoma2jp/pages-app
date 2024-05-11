package com.hkoma2jp.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hkoma2jp.api.entity.Item;
import com.hkoma2jp.api.repository.ItemRepository;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> find() {
        List<Item> itemList = itemRepository.findAll();
        return itemList;
    }
}
