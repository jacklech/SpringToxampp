package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "drink")
public class Drink {
    @Id
    private Long id;
    private String name;
    private int capacity;
    private int price;
    private String colour;
    private String type;
    private String company;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @OneToMany
    private List<Ingredient> ingredients;

    public Drink() {
    }

    public Drink(Long id, String name, int capacity, String colour, String type, String company, List <Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.colour = colour;
        this.type = type;
        this.company = company;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getprice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId() {
        return id;
    }



}