package com.store.inventory.controller;

import com.store.inventory.model.InventoryDTO;
import com.store.inventory.model.entity.Inventory;
import com.store.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/{prodType}")
    public @ResponseBody ResponseEntity<List<InventoryDTO>> getInventoryByType(@PathVariable("prodType") String type) {
        List<InventoryDTO> list = inventoryService.getInventoryByProductType(type);
        return new ResponseEntity<List<InventoryDTO>>(list, HttpStatus.OK);
    }

    @GetMapping("/{prodType}/accessories")
    public @ResponseBody ResponseEntity<List<InventoryDTO>> getInventoryByAccessoryType(@PathVariable("prodType") String type) {
        List<InventoryDTO> list = inventoryService.getInventoryByProductAccessoryType(type);
        return new ResponseEntity<List<InventoryDTO>>(list, HttpStatus.OK);

    }

}
