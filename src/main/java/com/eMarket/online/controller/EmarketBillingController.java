package com.eMarket.online.controller;

import com.eMarket.online.service.EmarketBillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class EmarketBillingController {

    @Autowired
    private EmarketBillingService emarketBillingService;
}
