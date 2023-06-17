package com.example.demo.Repo;

public interface CoffeeShopService {
    List<CoffeeShop> getAll();

    CoffeeShop getById(Long id);

    CoffeeShop create(CoffeeShop coffeeShop);

    CoffeeShop update(Long id, CoffeeShop coffeeShop);

    void delete(Long id);
}