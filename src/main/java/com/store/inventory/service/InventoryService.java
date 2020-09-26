package com.store.inventory.service;

import com.store.inventory.model.InventoryDTO;
import com.store.inventory.model.entity.Inventory;

import java.util.List;


public interface InventoryService {

    List<InventoryDTO> getInventoryByProductType(String type);

    List<InventoryDTO> getInventoryByProductAccessoryType(String type);

}
