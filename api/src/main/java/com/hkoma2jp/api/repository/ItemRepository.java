package com.hkoma2jp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hkoma2jp.api.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
    
}
