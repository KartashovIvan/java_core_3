package org.example.homework.four.ex4.domain;

public class User {
    private final String name;
    private final String password;
    private int numberMessages;
    private final Message[] messages;

    public User(String name, String password, int numberMessages) {
        this.name = name;
        this.password = password;
        this.numberMessages = numberMessages;
        messages = new Message[numberMessages];
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Message[] getMessages() {
        return messages;
    }

    public void addMessageOutgoing(Message message) {
        message.setOutgoing(true);
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = message;
                break;
            }
        }
    }

    public void addMessageIncoming(Message message) {
        Message newMessage = new Message(message);
        newMessage.setIncoming(true);
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = newMessage;
                break;
            }
        }
    }

}
