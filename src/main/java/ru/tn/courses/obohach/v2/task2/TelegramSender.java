package ru.tn.courses.obohach.v2.task2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//Telegram has easy way to send message,

public class TelegramSender extends MessageSender{
    String urlString;
    String apiToken;
    String chatId;
    String text;
    private void setConnection(){
        urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        apiToken = "239287362:tyhERhehjr-dfg345gDFGWERWg245gwdfge";
        chatId = "-210987654";
    }
    @Override
    protected void processMassage(UserMessage userMessage) {
        text = userMessage.messageSubject + userMessage.messageBody + userMessage.messageFooter;
        setConnection();
        urlString = String.format(urlString, apiToken, chatId, text);
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void sendMessage(UserMessage userMessage) {
        processMassage(userMessage);
    }
}
