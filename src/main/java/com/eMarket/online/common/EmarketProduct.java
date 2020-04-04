package com.eMarket.online.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmarketProduct {
    private String code;
    private String name;
    private String description;
    private double unitPriceNew;
    private double unitPriceSold;
    private String color;
    private String size;
    private boolean sale;
    private int reductionPercent;
    private String imagePath;
    private int supplierId;
    private boolean activation;
    private int totalStock;
    private int totalPucharsed;
    private int numberOfViews;
}
