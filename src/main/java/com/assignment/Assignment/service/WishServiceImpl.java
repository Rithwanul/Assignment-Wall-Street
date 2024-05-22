package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.Wish;
import com.assignment.Assignment.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishServiceImpl implements WishService {

    @Autowired
    private WishRepository wishRepository;

    @Override
    public List<Wish> getAllWishes() {
        return wishRepository.findAll();
    }
}
