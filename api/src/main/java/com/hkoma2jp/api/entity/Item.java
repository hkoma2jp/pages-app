package com.hkoma2jp.api.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "items")
public class Item {
    
    /** 
     * ID of the item
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    @Column(name = "sku_id")
    private String sku_id;

    @Column(name = "item_slug")
    private String items_slug;

    @Column(name = "item_name")
    private String items_name;

    @Column(name = "price")
    private Long price;

    @Column(name = "display_price")
    private Long display_price;

    @Column(name = "sku_img")
    private String sku_img;

    @Column(name = "item_img")
    private String item_img;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category_id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "deleted_at")
    private Date deleted_at;

}
