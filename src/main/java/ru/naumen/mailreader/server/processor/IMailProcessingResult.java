package ru.naumen.mailreader.server.processor;

import java.util.Collection;
import java.util.List;

public interface IMailProcessingResult {
    void error(String var1);

    Collection<String> getAddedCommentUuids();

    void setAddedCommentUuids(Collection<String> var1);

    Collection<String> getEditedCommentUuids();

    void setEditedCommentUuids(Collection<String> var1);

    Collection<String> getCreatedObjectUuids();

    void setCreatedObjectUuids(Collection<String> var1);

    Collection<String> getEditedObjectUuids();

    void setEditedObjectUuids(Collection<String> var1);

    String getErrorMessage();

    MessageState getMessageState();

    IMailProcessingResult setMessageState(MessageState var1);

    /**
     * @deprecated
     */
    @Deprecated
    String getRejectMessage();

    List<String> getRejectMessages();

    /**
     * @deprecated
     */
    @Deprecated
    RejectReason getRejectReason();

    List<RejectReason> getRejectReasons();

    boolean isError();

    boolean isRejected();

    boolean isRejectedByBlackList();

    boolean isSuccessfull();

    IMailProcessingResult reject(RejectReason var1);

    IMailProcessingResult reject(RejectReason var1, String var2);

    String allRejectMessages();
}
