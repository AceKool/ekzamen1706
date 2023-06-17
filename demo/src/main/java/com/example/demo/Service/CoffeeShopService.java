package com.example.demo.Service;

@Service
public class CoffeeShopService implements CoffeeShopService {
    @Autowired
    private CoffeeShopRepository coffeeShopRepository;

    @Override
    public List<CoffeeShop> getAll() {
        return coffeeShopRepository.findAll();
    }

    @Override
    public CoffeeShop getById(Long id) {
        return coffeeShopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CoffeeShop", "id", id));
    }

    @Override
    public CoffeeShop create(CoffeeShop coffeeShop) {
        return coffeeShopRepository.save(coffeeShop);
    }

    @Override
    public CoffeeShop update(Long id, CoffeeShop coffeeShop) {
        CoffeeShop existingCoffeeShop = coffeeShopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CoffeeShop", "id", id));

        existingCoffeeShop.setName(coffeeShop.getName());
        existingCoffeeShop.setAddress(coffeeShop.getAddress());

        return coffeeShopRepository.save(existingCoffeeShop);
    }

    @Override
    public void delete(Long id) {
        CoffeeShop coffeeShop = coffeeShopRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CoffeeShop", "id", id));

        coffeeShopRepository.delete(coffeeShop);
    }
}
}
