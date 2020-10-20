package main;

import java.util.Scanner;

import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.Mailer;
import org.simplejavamail.mailer.MailerBuilder;
import org.simplejavamail.mailer.config.TransportStrategy;

public class TUI {
	private static Scanner in = new Scanner(System.in);
	public static int printMenu() {

		System.out.println(
				"######### OPTIONS #########\n"
			+	" 1. Show subscriptors\n"
			+	" 2. Add subscriptors\n"
			+	" 3. Edit subscriptor\n"
			+	" 4. Delete subscriptor\n"
			+	" 5. Send email\n"
			+	" 0. Exit\n"
			+   "###########################\n"
			+	" Choose OPTION: "
				);
		
		return in.nextInt();
	}
	
	public static void Thx() {
		System.out.println("Thank your for using aou soft.");
	}
	
	public static Human readHumanData() {
		Human human = null;
		System.out.println("Subscriber Full Name: ");
		String fullName = in.next();
		System.out.println("Subscriber email address: ");
		String email = in.next();
		
		human = new Human(fullName, email);
		return human;
		
	}
	
	public static void sendMail(Human human) {
		Email email = EmailBuilder.startingBlank()
			    .from("lollypop", "lolly.pop@pretzelfun.com")
			    .to("C. Cane", "candycane@candyshop.org")
			    .cc("C. Bo <chocobo@candyshop.org>")
			    .withSubject("hey")
			    .withPlainText("We should meet up! ;)")
			    .buildEmail();
		
		Mailer mailer = MailerBuilder
				.withSMTPServer("smtp.host.com", 587, "user@host.com", "password")
				.withTransportStrategy(TransportStrategy.SMTP_TLS)
				.buildMailer();
		mailer.sendMail(email);
	}
}
