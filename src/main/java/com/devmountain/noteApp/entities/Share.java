package com.devmountain.noteApp.entities;

import com.devmountain.noteApp.dtos.ShareDto;
import io.hypersistence.utils.hibernate.type.money.MonetaryAmountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.TypeDef;

import javax.money.MonetaryAmount;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Share")
@TypeDef(typeClass = MonetaryAmountType.class, defaultForType = MonetaryAmount.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Share {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private String symbol;


    @Columns(columns = {
            @Column(name = "purchasePrice_amount"),
            @Column(name = "purchasePrice_currency")
    })
    private MonetaryAmount purchasePrice;

    @Column(columnDefinition = "DATE")
    private LocalDate purchaseDate;

    @Columns(columns = {
            @Column(name = "actualPrice_amount"),
            @Column(name = "actualPrice_currency")
    })
    private MonetaryAmount actualPrice;

    @Column(columnDefinition = "DATE")
    private LocalDate actualDate;

    public Share(ShareDto shareDto){
            this.id = shareDto.getId();
            this.name = shareDto.getName();
            this.symbol = shareDto.getSymbol();
            this.purchasePrice = shareDto.getPurchasePrice();
            this.purchaseDate = shareDto.getPurchaseDate();
            this.actualPrice = shareDto.getActualPrice();
            this.actualDate = shareDto.getActualDate();
        }


}
