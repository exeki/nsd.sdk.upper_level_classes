package ru.naumen.mailreader.server.processor;

public enum RejectReason {
    OTHER,
    BAD_ATTACHMENTS,
    INVALID_EMAIL,
    BIG_ATTACHMENT,
    BIG_ATTACHMENTS,
    MALICIOUS_ATTACHMENT,
    BAD_FORMAT,
    CLIENT_NOT_FOUND,
    CONTACT_NOT_FOUND,
    BLACKLIST;

    private RejectReason() {
    }
}
