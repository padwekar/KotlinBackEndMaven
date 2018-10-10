package com.example.savihealer

import org.springframework.web.bind.annotation.*

data class Message(val text: String, val priority: String)

@RestController
class MessageController {
    @RequestMapping("/message")
    fun message(): Message {
        return Message("Hello from Google Cloud", "High")
    }

    @RequestMapping("/name")
    fun name(): String {
        return "Saurabh Padwekar"
    }

    //To Run :: mvn spring-boot:run
}