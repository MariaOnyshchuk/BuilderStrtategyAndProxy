package ua.edu.ucu.task2;

public class BirthdayMailCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy %d -th birthday", client.getName(), client.getAge());
    }
}
