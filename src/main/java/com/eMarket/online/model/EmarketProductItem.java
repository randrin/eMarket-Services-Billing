package com.eMarket.online.model;

import com.eMarket.online.common.EmarketProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmarketProductItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private EmarketProduct emarketProduct;
    private Long EmarketProductID;
    private int productQty;
    private double productPrice;
    @ManyToOne
    private EmarketBilling emarketBilling;
}
