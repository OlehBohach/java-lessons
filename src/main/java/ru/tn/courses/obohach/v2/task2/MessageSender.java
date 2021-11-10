package ru.tn.courses.obohach.v2.task2;

public abstract class MessageSender implements Messenger{
    protected void processMassage(UserMessage userMessage){

    }
    @Override
    public void sendMessage(UserMessage userMessage) {
        processMassage(userMessage);
    }
}
