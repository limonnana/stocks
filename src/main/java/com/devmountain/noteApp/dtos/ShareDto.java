package com.devmountain.noteApp.dtos;

import com.devmountain.noteApp.entities.Share;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.money.MonetaryAmount;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShareDto implements Serializable {

    private Long id;
    private String name;
    private String symbol;
    private MonetaryAmount purchasePrice;
    private LocalDate purchaseDate;
    private MonetaryAmount actualPrice;
    private LocalDate actualDate;

    public ShareDto(Share share){
        this.id = share.getId();
        this.name = share.getName();
        this.symbol = share.getSymbol();
        this.purchasePrice = share.getPurchasePrice();
        this.purchaseDate = share.getPurchaseDate();
        this.actualPrice = share.getActualPrice();
        this.actualDate = share.getActualDate();
    }
}
