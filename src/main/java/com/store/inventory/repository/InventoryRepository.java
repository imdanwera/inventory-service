package com.store.inventory.repository;

import com.store.inventory.model.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    List<Inventory> findInventoriesByProductType(String type);

    List<Inventory> findInventoriesByProductAccessoryType(String type);

}
