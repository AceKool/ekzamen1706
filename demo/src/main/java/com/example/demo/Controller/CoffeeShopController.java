package com.example.demo.Controller;

@RestController
@RequestMapping("/api/coffee-shops")
public class CoffeeShopController {
    @Autowired
    private CoffeeShopService coffeeShopService;

    @GetMapping
    public List<CoffeeShop> getAll() {
        return coffeeShopService.getAll();
    }

    @GetMapping("/{id}")
    public CoffeeShop getById(@PathVariable Long id) {
        return coffeeShopService.getById(id);
    }

    @PostMapping
    public CoffeeShop create(@RequestBody CoffeeShop coffeeShop) {
        return coffeeShopService.create(coffeeShop);
    }

    @PutMapping("/{id}")
    public CoffeeShop update(@PathVariable Long id, @RequestBody CoffeeShop coffeeShop) {
        return coffeeShopService.update(id, coffeeShop);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        coffeeShopService.delete(id);
    }
}

