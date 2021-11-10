package ru.tn.courses.obohach.v2.task2;

public class Subtask_1 {
    public static void main(String[] args) {
    UserMessage userMessage = new UserMessage(MessageType.TELEGRAM,"Subject 1", "Body 1", "Footer 1");
    MessageManager messageManager = new MessageManager();
    messageManager.manageMessage(userMessage);
    }
}
