package com.eMarket.online.service;

import com.eMarket.online.repository.EmarketBillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmarketBillingService {

    @Autowired
    private EmarketBillingRepository emarketBillingRepository;
}
