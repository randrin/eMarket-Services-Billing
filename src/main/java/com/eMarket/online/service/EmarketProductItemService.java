package com.eMarket.online.service;

import com.eMarket.online.repository.EmarketProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmarketProductItemService {

    @Autowired
    private EmarketProductItemRepository emarketProductItemRepository;
}
