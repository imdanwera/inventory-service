package com.store.inventory.controller;

import com.store.inventory.model.InventoryDTO;
import com.store.inventory.model.entity.Inventory;
import com.store.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping()
    public ResponseEntity<List<InventoryDTO>> getInventoryByType(@RequestParam("prodtype") String type) {
        List<InventoryDTO> list = inventoryService.getInventoryByProductType(type);
        return new ResponseEntity<List<InventoryDTO>>(list, HttpStatus.OK);
    }

    @GetMapping("/accessory")
    public ResponseEntity<List<InventoryDTO>> getInventoryByAccessoryType(@RequestParam("accstype") String type) {
        List<InventoryDTO> list = inventoryService.getInventoryByProductAccessoryType(type);
        return new ResponseEntity<List<InventoryDTO>>(list, HttpStatus.OK);

    }

}
