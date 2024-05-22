package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.Wish;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WishServiceTest {

    @Autowired
    private WishService wishService;

    @Test
    public void getAllWishesTest() {
        List<Wish> wishes = wishService.getAllWishes();
        System.out.println(wishes);
    }
}
