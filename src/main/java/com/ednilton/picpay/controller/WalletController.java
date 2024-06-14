package com.ednilton.picpay.controller;

import com.ednilton.picpay.dto.CreateWalletDto;
import com.ednilton.picpay.entity.Wallet;
import com.ednilton.picpay.service.WalletService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody @Valid CreateWalletDto dto){
        var wallet = walletService.createWallet(dto);

        return ResponseEntity.ok(wallet);
    }

}
