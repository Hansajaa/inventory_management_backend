package org.example.Controller;

import org.example.Dto.ItemDto;
import org.example.Service.InventryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InventryController {

    @Autowired
    InventryService service;


    @PostMapping("/item/create")
    public void createItem(@RequestBody ItemDto dto){
        service.createItem(dto);
    }

    @GetMapping("/item/getItem")
    public List<ItemDto> getItems(){
        List<ItemDto> items = service.getItems();
        return items;
    }
}
