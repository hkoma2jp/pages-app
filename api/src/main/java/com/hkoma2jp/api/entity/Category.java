package com.hkoma2jp.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class Category {
    
    @Id
    @Column
    private Long category_id;

    @Column
    private String category_slug;

    @Column
    private String category_name;

    @Column
    private String category_img;

    @Column
    private String hierarchy;

    @Column
    private String created_at;

    @Column
    private String updated_at;

    @Column
    private String deleted_at;

}
