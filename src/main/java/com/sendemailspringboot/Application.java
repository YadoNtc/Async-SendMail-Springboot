package com.sendemailspringboot;

import com.sendemailspringboot.sendEmail.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Application {

    @Autowired
    private EmailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail() throws MessagingException {
//       /* senderService.sendSimpleEmail("congthanhnguyenfr@gmail.com",
//                "This is email's body text",
//                "This is email's Subject text"); */
//
//        senderService.setMailWithAttachment("congthanhnguyenfr@gmail.com",
//                "This is email's body",
//                "This is email with attachment",
//                "C:\\Users\\Admin\\kiss.gif");
//    }

}
