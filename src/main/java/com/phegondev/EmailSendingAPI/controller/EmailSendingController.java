package com.phegondev.EmailSendingAPI.controller;

import com.phegondev.EmailSendingAPI.dto.EmailRequest;
import com.phegondev.EmailSendingAPI.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailSendingController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@Valid @RequestBody EmailRequest emailRequest){
        return  ResponseEntity.ok(emailService.sendEmail(emailRequest));
    }
}
