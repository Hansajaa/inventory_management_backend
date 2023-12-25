package org.example.Repository;

import org.example.Entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface InventryRepository extends CrudRepository<Item,Long> {
}
