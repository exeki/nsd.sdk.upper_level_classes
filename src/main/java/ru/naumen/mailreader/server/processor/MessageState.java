package ru.naumen.mailreader.server.processor;

public enum MessageState {
    ERROR,
    REJECT,
    NEW_BO,
    ATTACH,
    OUTGOING;

    private MessageState() {
    }
}
