package com.eMarket.online.repository;

import com.eMarket.online.model.EmarketProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmarketProductItemRepository extends JpaRepository<EmarketProductItem, Long> {
}
