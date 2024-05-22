package com.assignment.Assignment.controller;

import com.assignment.Assignment.entity.Wish;
import com.assignment.Assignment.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/wish")
public class WishController {


    private final WishService wishService;

    @Autowired
    public WishController(WishService wishService) {
        this.wishService = wishService;
    }

    @GetMapping
    private ResponseEntity<List<Wish>> getAllWishes() {
        List<Wish> wishes = wishService.getAllWishes();
        if (wishes != null)
            return new ResponseEntity<>(wishes, HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
}
