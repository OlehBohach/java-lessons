package ru.tn.courses.obohach.v2.task2;

public class MessageManager{
    TelegramSender telegramSender;
    EmailSender emailSender;
    SmsSender smsSender;
    public MessageManager(){
        telegramSender = new TelegramSender();
        emailSender = new EmailSender();
        smsSender = new SmsSender();
    }
    public void manageMessage(UserMessage userMessage) {
        switch (userMessage.messageType) {
            case EMAIL -> emailSender.sendMessage(userMessage);
            case SMS -> smsSender.sendMessage(userMessage);
            case TELEGRAM -> telegramSender.sendMessage(userMessage);
        }
    }
}
