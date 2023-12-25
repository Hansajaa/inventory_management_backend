package org.example.Service.Impl;

import org.example.Dto.ItemDto;
import org.example.Entity.Item;
import org.example.Repository.InventryRepository;
import org.example.Service.InventryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventryServiceImpl implements InventryService {

    @Autowired
    InventryRepository repository;


    @Override
    public List<ItemDto> getItems() {
        Iterable<Item> items = repository.findAll();

        List<ItemDto> dtos = new ArrayList<>();

        for (Item item:items) {
            dtos.add(
                    new ItemDto(
                            item.getDescription(),
                            item.getQuantity(),
                            item.getUnitPrice()
                    )
            );
        }
        return dtos;
    }

    @Override
    public void createItem(ItemDto dto) {
        Item item=new Item();
        item.setDescription(dto.getDescription());
        item.setQuantity(dto.getQuantity());
        item.setUnitPrice(dto.getUnitPrice());
        repository.save(item);
    }
}
