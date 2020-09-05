package com.chatter.chatter.models.appModels;

import com.chatter.chatter.models.enums.MessageType;

public class Message {
    private User sender;
    private User receiver;
    private MessageType messageType;
    private String messageText;

    public Message(User sender, User receiver, MessageType messageType, String messageText) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageType = messageType;
        this.messageText = messageText;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
