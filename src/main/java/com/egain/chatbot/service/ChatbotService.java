package com.egain.chatbot.service;

import com.egain.chatbot.utils.InputUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ChatbotService {

    @Autowired
    InputUtils inputUtils;

    private final Scanner scanner = new Scanner(System.in);

    public void talk(){
        System.out.println("🤖 Hi, I’m TrackBot! I can help you track your package.");

        while (true) {
            System.out.print("📦 Please enter your Order ID (e.g., ABC1234): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (!InputUtils.isValidOrderId(input)) {
                System.out.println("❌ That doesn't look right. Order IDs look like 3 letters followed by 4 digits (e.g., ABC1234).");
                continue;
            }

            if (input.equals("ABC1234")) {
                System.out.println("✅ Found! Your package is in Mumbai facility. Estimated delivery: June 10.");
                break;
            } else {
                System.out.println("⚠️ We couldn't find that Order ID in our system.");
                System.out.println("Would you like to:\n1. Request a refund\n2. Talk to a human agent");

                String choice = scanner.nextLine().trim();
                if (choice.equals("1")) {
                    System.out.println("✅ Refund initiated! You’ll receive a confirmation email shortly.");
                } else if (choice.equals("2")) {
                    System.out.println("📞 Connecting you to a human agent...");
                } else {
                    System.out.println("🤖 I didn’t quite get that, but I’ve noted your request.");
                }
                break;
            }
        }

        System.out.println("🙏 Thanks for using TrackBot. Have a great day!");
    }

}
