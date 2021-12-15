package com.sendemailspringboot.sendmessage;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;

@Service
public class SendMessageService {

    @Async
    public void sendMessage(String mobile) {
        sleep(2);

        System.out.println("Send text Message successfully... in Thread >>> " + Thread.currentThread().getName());

    }

    private void sleep(int i)  {
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
