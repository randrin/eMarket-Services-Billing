package com.eMarket.online;

import com.eMarket.online.model.EmarketBilling;
import com.eMarket.online.model.EmarketProductItem;
import com.eMarket.online.repository.EmarketBillingRepository;
import com.eMarket.online.repository.EmarketProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
public class EMarketServicesBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMarketServicesBillingApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EmarketBillingRepository emarketBillingRepository,
							EmarketProductItemRepository emarketProductItemRepository) {
		return args->{
			EmarketBilling emarketBilling = emarketBillingRepository.save(new EmarketBilling(null, 1L, new Date(), null, null));
			emarketProductItemRepository.save((new EmarketProductItem(null, null, 1L, 1, 300, emarketBilling)));
			emarketProductItemRepository.save((new EmarketProductItem(null, null, 1L, 2, 500, emarketBilling)));
			emarketProductItemRepository.save((new EmarketProductItem(null, null, 1L, 23, 800, emarketBilling)));
		};
	}
}
