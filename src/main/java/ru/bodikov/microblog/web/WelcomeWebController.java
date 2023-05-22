package ru.bodikov.microblog.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/")
public class WelcomeWebController {


    @GetMapping()
    ResponseEntity<String> welcome(){
        return new ResponseEntity<>("Hello",HttpStatus.OK);
    }
}
