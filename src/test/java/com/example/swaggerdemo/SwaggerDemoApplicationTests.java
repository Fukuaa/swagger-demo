package com.example.swaggerdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class SwaggerDemoApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;
    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("zqf");
        message.setText("void contextLoads() {\n" +
                "        SimpleMailMessage message = new SimpleMailMessage();\n" +
                "        message.setSubject(\"zqf\");\n" +
                "        message.setText(\"\");\n" +
                "        message.setTo(\"1952407958@qq.com\");\n" +
                "        message.setFrom(\"1936534366@qq.com\");\n" +
                "        mailSender.send(message);\n" +
                "    }");
        message.setTo("1952407958@qq.com");
        message.setFrom("1936534366@qq.com");
        mailSender.send(message);
    }

}
