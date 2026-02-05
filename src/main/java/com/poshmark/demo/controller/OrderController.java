package com.poshmark.demo.controller;

// Correct this import to match your folder structure
import com.poshmark.demo.scale_store.service.OrderService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/buy/{id}")
    public ResponseEntity<String> buyProduct(@PathVariable Long id) {
        String result = orderService.processOrder(id);
        return ResponseEntity.ok(result);
    }
}