package org.example.Service;

import org.example.Dto.ItemDto;

import java.util.List;

public interface InventryService {
    List<ItemDto> getItems();

    void createItem(ItemDto dto);
}
