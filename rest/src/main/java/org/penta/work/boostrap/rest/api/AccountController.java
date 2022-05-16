package org.penta.work.boostrap.rest.api;

import org.penta.work.boostrap.port.RequestAccounts;
import org.penta.work.boostrap.port.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    private RequestAccounts requestAccounts;

    public AccountController(RequestAccounts requestAccounts) {
        this.requestAccounts = requestAccounts;
    }

    @GetMapping(value = "/hello")
    ResponseEntity hello() {
        List<Account> accounts = requestAccounts.getAccounts();
        return new ResponseEntity<>(accounts,
                HttpStatus.OK);
    }
}
