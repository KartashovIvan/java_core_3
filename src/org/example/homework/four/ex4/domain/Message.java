package org.example.homework.four.ex4.domain;

public class Message {
    private final String text;
    private boolean incoming;
    private boolean outgoing;
    private final User form;
    private final User to;

    public Message(String text, User form, User to) {
        this.text = text;
        this.form = form;
        this.to = to;
    }

    public Message(Message message) {
        this.text = message.text;
        this.to = message.to;
        this.form = message.form;
    }

    public String getText() {
        return text;
    }

    public boolean isIncoming() {
        return incoming;
    }

    public User getForm() {
        return form;
    }

    public User getTo() {
        return to;
    }

    public void setIncoming(boolean incoming) {
        this.incoming = incoming;
    }

    public void setOutgoing(boolean outgoing) {
        this.outgoing = outgoing;
    }
}
