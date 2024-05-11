/* Create User 'devuser' */
CREATE USER 'devuser'@'%' IDENTIFIED BY 'dev';

GRANT ALL PRIVILEGES ON pagesdb.* TO 'devuser'@'%';

/* Create DB 'pagesdb' */
CREATE DATABASE IF NOT EXISTS pagesdb;

/* Select DB 'pagesdb' */
USE pagesdb;

/* Define Tables */
CREATE TABLE IF NOT EXISTS categories (
    category_id INT PRIMARY KEY,
    category_slug VARCHAR(255),
    category_name VARCHAR(255),
    category_img VARCHAR(255),
    hierarchy JSON,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_at DATETIME DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS items (
    id INT NOT NULL PRIMARY KEY,
    sku_id VARCHAR(32) NOT NULL,
    item_slug VARCHAR(32) NOT NULL,
    item_name VARCHAR(255) NOT NULL,
    price int(7) NOT NULL,
    display_price int(7) NOT NULL,
    sku_img VARCHAR(255) NOT NULL,
    item_img VARCHAR(255) NOT NULL,
    category_id INT,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_at DATETIME DEFAULT NULL
    FOREIGN KEY (category_id) REFERENCES categories(category_id)
);


INSERT INTO categories (category_id,category_slug,category_name) VALUES
(100001,"road-bike","ロードバイク"),
(100002,"mountain-bike","マウンテンバイク"),
(100003,"city-cycle","シティサイクル");

INSERT INTO items (id,sku_id,item_slug,item_name,price,display_price,sku_img,item_img,category_id) VALUES
(1,"PRD001","road-bike-a","ロードバイクA",20000,25000,"/assets/sku_img/prd001.png","/assets/item_img/road-bike-a.png",null),
(2,"PRD002","mountain-bike-a","マウンテンバイクA",50000,55000,"/assets/sku_img/prd002.png","/assets/item_img/mountain-bike-a.png",null),
(3,"PRD003","city-cycle-a","シティサイクルA",30000,35000,"/assets/sku_img/prd003.png","/assets/item_img/city-cycle-a.png",100003),
(4,"PRD004","road-bike-b","ロードバイクB",25000,30000,"/assets/sku_img/prd004.png","/assets/item_img/road-bike-b.png",100001),
(5,"PRD005","mountain-bike-b","マウンテンバイクB",60000,65000,"/assets/sku_img/prd005.png","/assets/item_img/mountain-bike-b.png",100002),
(6,"PRD006","city-cycle-b","シティサイクルB",35000,40000,"/assets/sku_img/prd006.png","/assets/item_img/city-cycle-b.png",100003),
(7,"PRD007","road-bike-c","ロードバイクC",30000,35000,"/assets/sku_img/prd007.png","/assets/item_img/road-bike-c.png",100001),
(8,"PRD008","mountain-bike-c","マウンテンバイクC",70000,75000,"/assets/sku_img/prd008.png","/assets/item_img/mountain-bike-c.png",100002),
(9,"PRD009","city-cycle-c","シティサイクルC",40000,45000,"/assets/sku_img/prd009.png","/assets/item_img/city-cycle-c.png",100003);