package com.assignment.Assignment.service;

import com.assignment.Assignment.entity.Wish;
import com.assignment.Assignment.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishServiceImpl implements WishService {

    private final WishRepository wishRepository;

    @Autowired
    public WishServiceImpl(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    @Override
    public List<Wish> getAllWishes() {
        return wishRepository.findAll();
    }
}
