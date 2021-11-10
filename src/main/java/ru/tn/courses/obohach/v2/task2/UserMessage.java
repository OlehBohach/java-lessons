package ru.tn.courses.obohach.v2.task2;

public class UserMessage {
    MessageType messageType;
    String messageSubject;
    String messageBody;
    String messageFooter;

    public UserMessage(MessageType messageType, String messageSubject, String messageBody, String messageFooter) {
        this.messageType = messageType;
        this.messageSubject = messageSubject;
        this.messageBody = messageBody;
        this.messageFooter = messageFooter;
    }
    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageFooter() {
        return messageFooter;
    }

    public void setMessageFooter(String messageFooter) {
        this.messageFooter = messageFooter;
    }
}
enum MessageType{
    TELEGRAM,
    EMAIL,
    SMS,
}
