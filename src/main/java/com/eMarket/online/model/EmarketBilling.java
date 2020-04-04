package com.eMarket.online.model;

import com.eMarket.online.common.EmarketUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmarketBilling implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long emarketUserID;
    private Date dateOfBilling;
    @Transient
    private EmarketUser emarketUser;
    @OneToMany(mappedBy = "emarketBilling")
    private Collection<EmarketProductItem> emarketProductItems;
}
