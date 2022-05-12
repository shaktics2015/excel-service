package org.penta.work.excelservice.rest.api;

import org.penta.work.excelservice.port.incoming.Deposit;
import org.penta.work.excelservice.port.incoming.Withdraw;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    private final Deposit depositService;

    private final Withdraw withdrawService;

    public AccountController(Deposit depositUseCase, Withdraw withdrawUseCase) {
        this.depositService = depositUseCase;
        this.withdrawService = withdrawUseCase;
    }

    @GetMapping(value = "/hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>(
                "Hello Shakti",
                HttpStatus.OK);
    }

    @PostMapping(value = "/{accountNo}/deposit/{depositAmount}")
    void deposit(@PathVariable final Long accountNo, @PathVariable final BigDecimal depositAmount) {
        depositService.deposit(accountNo, depositAmount);
    }

    @PostMapping(value = "/{accountNo}/withdraw/{withdrawalAmount}")
    void withdraw(@PathVariable final Long accountNo, @PathVariable final BigDecimal withdrawalAmount) {
        withdrawService.withdraw(accountNo, withdrawalAmount);
    }

    @GetMapping(value = "/display/{accountNo}")
    ResponseEntity displayAccountDetails(@PathVariable final Long accountNo) {
        return new ResponseEntity<>(
                withdrawService.getAccountInfo(accountNo),
                HttpStatus.OK);
    }
}
