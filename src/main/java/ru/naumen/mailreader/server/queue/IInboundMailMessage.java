package ru.naumen.mailreader.server.queue;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IInboundMailMessage {
    List<? extends IInboundMailAttachment> getAttachments();

    void setAttachments(List<? extends IInboundMailAttachment> var1);

    Long getAttachmentsTotalSize();

    Set<String> getBcc();

    String getBccAsString();

    String getBody();

    void setBody(String var1);

    String getBodyRTF();

    Set<String> getCc();

    String getCcAsString();

    String getContentType();

    Date getDate();

    void setDate(Date var1);

    String getDigitalSignature();

    IInboundMailAddress getFrom();

    void setFrom(IInboundMailAddress var1);

    String getHeader();

    void setHeader(String var1);

    Map<String, String> getHeaders();

    String getHtmlBody();

    void setHtmlBody(String var1);

    String getHtmlBody(boolean var1);

    String getId();

    Set<IInboundMailAttachment> getInlineAttachments();

    String getInReplyTo();

    Set<IInboundMailAttachment> getNotInlineAttachments();

    byte[] getOriginalMessage();

    void setOriginalMessage(byte[] var1);

    String getPriority();

    IInboundMailAddress[] getRecipients();

    void setRecipients(IInboundMailAddress[] var1);

    String getRecipientsAsString();

    Set<String> getReplyTo();

    Long getSize();

    String getSubject();

    void setSubject(String var1);

    String getToAsString();
}
