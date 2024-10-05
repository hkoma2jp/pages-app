package com.hkoma2jp.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hkoma2jp.api.entity.Item;
import com.hkoma2jp.api.repository.ItemRepository;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * ## 全件取得
     * @return List<Item>
     */
    public List<Item> find() {
        List<Item> itemList = itemRepository.findAll();
        return itemList;
    }

    /** 
     * ## ID検索
     * @param id
     * @return Optional<Item>
     */
    public Optional<Item> findById(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        return item;
    }

}
