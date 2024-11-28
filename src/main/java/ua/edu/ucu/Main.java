package ua.edu.ucu;

import ua.edu.ucu.task2.*;
import ua.edu.ucu.task3.MyImage;
import ua.edu.ucu.task3.ProxyImage;

public class Main {
    public static void main(String[] args) {
//        Student student = Student.builder().firstName("Marichka").lastName("Onyshchuk").age(18).gender("MALE").courses(List.of()).course("Probability").build();
        Client client = Client.builder().name("").age(100).email("hi@gmail.com").build();
//        System.out.println(student);
        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo =  new MailInfo(client, client1->"It's random mail");
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);

        MyImage image = new ProxyImage("/Users/mariaonyshchuk/Desktop/Screenshot 2024-11-27 at 19.21.16.png");
        System.out.println("Image not loaded yet.");
        image.display();
    }
}