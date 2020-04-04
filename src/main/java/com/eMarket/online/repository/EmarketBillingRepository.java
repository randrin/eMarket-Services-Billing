package com.eMarket.online.repository;

import com.eMarket.online.model.EmarketBilling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmarketBillingRepository extends JpaRepository<EmarketBilling, Long> {
}
