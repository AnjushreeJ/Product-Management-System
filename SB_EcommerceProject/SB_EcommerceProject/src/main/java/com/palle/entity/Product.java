package com.palle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // used to map java class to database table
@Table(name = "product_data")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    
    private String productName;
    
    private int productQuntity;
    private int productPrice;
  

    
    public Product() {
    }

   
    public Product(int productId, String productName, int productQuntity, int productPrice, int getproductId) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productQuntity = productQuntity;
        this.productPrice = productPrice;
        
    }

    // getters & setters
    public int getProductId() {
        return productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuntity() {
        return productQuntity;
    }

    public void setProductQuntity(int productQuntity) {
        this.productQuntity = productQuntity;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    }

    
    
