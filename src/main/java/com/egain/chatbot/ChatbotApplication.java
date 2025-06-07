package com.egain.chatbot;

import com.egain.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotApplication implements CommandLineRunner {

	@Autowired
	private ChatbotService chatbotService;

	public static void main(String[] args) {
		SpringApplication.run(ChatbotApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		chatbotService.talk();
	}
}
