package com.devmountain.noteApp.controllers;

import com.devmountain.noteApp.dtos.NoteDto;
import com.devmountain.noteApp.dtos.ShareDto;
import com.devmountain.noteApp.entities.Share;
import com.devmountain.noteApp.services.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.MonetaryAmountFactory;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/test")
public class TestController {
    @Autowired
    private ShareService shareService;

    @GetMapping("/addShare")
    public Share addShare(){

        Share share = new Share();
        share.setName("Alphabet Inc Class C");
        share.setSymbol("GOOG");
        MonetaryAmountFactory<?> amountFactory = Monetary.getDefaultAmountFactory();
        MonetaryAmount monetaryAmountPurchasePrice = amountFactory.setCurrency(Monetary.getCurrency("USD")).setNumber(128.11).create();
        share.setPurchasePrice(monetaryAmountPurchasePrice);
        share.setActualPrice(monetaryAmountPurchasePrice);
        LocalDate currentLocalDate = LocalDate.now();
        share.setPurchaseDate(currentLocalDate);
        ShareDto shareDto = new ShareDto(share);
        share = shareService.addShare(shareDto);
        return share;
    }


}
