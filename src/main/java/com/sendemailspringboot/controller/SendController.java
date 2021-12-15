package com.sendemailspringboot.controller;

import com.sendemailspringboot.sendEmail.EmailSenderService;
import com.sendemailspringboot.sendmessage.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class SendController {

    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    private SendMessageService sendMessageService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String mobile) throws MessagingException {

        sendMessageService.sendMessage(mobile);

        emailSenderService.setMailWithAttachment("congthanhnguyenfr@gmail.com",
                "This is email text",
                "This is email subject",
                "C:\\Users\\Admin\\kiss.gif");


        return "Send return in Controller class.... in Thread >>>> " + Thread.currentThread().getName();
    }

}
