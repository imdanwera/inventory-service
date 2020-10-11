package com.store.inventory.service.impl;

import com.store.inventory.model.InventoryDTO;
import com.store.inventory.model.entity.Inventory;
import com.store.inventory.repository.InventoryRepository;
import com.store.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public List<InventoryDTO> getInventoryByProductType(String type) {
        List<Inventory> inventoryList = inventoryRepository.findInventoriesByProductType(type);

        List<InventoryDTO> inventoryDTOList = new ArrayList<>();
        inventoryList.stream()
                .map(inventory -> inventoryDTOList.add(new InventoryDTO(inventory)))
                .collect(Collectors.toList());

        System.out.println("Inventory by ProductType - " + inventoryDTOList);
        return inventoryDTOList;
    }

    @Override
    public List<InventoryDTO> getInventoryByProductAccessoryType(String type) {

        List<Inventory> inventoryList = inventoryRepository.findInventoriesByProductAccessoryType(type);

        List<InventoryDTO> inventoryDTOList = new ArrayList<>();
        inventoryList.stream()
                .map(inventory -> inventoryDTOList.add(new InventoryDTO(inventory)))
                .collect(Collectors.toList());

        System.out.println("Inventory by AccessoryType - " + inventoryDTOList);
        return inventoryDTOList;
    }
}
