package ru.tn.courses.obohach.v2.task2;

public class SmsSender extends MessageSender{
    @Override
    protected void processMassage(UserMessage userMessage) {
        //Mock function. Impossible without usage of external libraries;
    }
    @Override
    public void sendMessage(UserMessage userMessage) {
        processMassage(userMessage);
    }
}
