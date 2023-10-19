package ru.naumen.mailreader.server.queue;

import ru.naumen.mailreader.server.processor.RejectReason;

import java.util.List;

public interface IInboundMailAttachment {
    String getContentId();

    void setContentId(String var1);

    String getContentType();

    void setContentType(String var1);

    byte[] getData();

    void setData(byte[] var1);

    String getDisposition();

    void setDisposition(String var1);

    String getFilename();

    void setFilename(String var1);

    String getFileUUID();

    void setFileUUID(String var1);

    Long getSize();

    boolean isInline();

    List<RejectReason> getRejectReasons();

    void setRejectReasons(List<RejectReason> var1);

    void addRejectReason(RejectReason var1);
}
