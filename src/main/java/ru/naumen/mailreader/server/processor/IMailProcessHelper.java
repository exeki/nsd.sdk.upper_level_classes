package ru.naumen.mailreader.server.processor;

import ru.naumen.core.server.mail.IMimeMailWrapper;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.core.shared.dto.ISDtObject;
import ru.naumen.mailreader.server.queue.IInboundMailMessage;
import ru.naumen.metainfo.shared.elements.mail.ISendMailParameters;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IMailProcessHelper {
    String ATTACHMENT = "attachment";

    Set<? extends ISDtObject> attachAllMessageAttachments(IUUIDIdentifiable var1, IInboundMailMessage var2);

    ISDtObject attachMessage(IUUIDIdentifiable var1, IInboundMailMessage var2);

    Set<? extends ISDtObject> attachMessageAttachments(IUUIDIdentifiable var1, IInboundMailMessage var2);

    Set<? extends ISDtObject> attachMessageAttachments(IUUIDIdentifiable var1, IInboundMailMessage var2, String var3);

    String correctFileName(String var1);

    Collection<? extends ISDtObject> findEmployeesByEmail(String var1, String var2);

    String formRespondBody(IMailProcessingResult var1);

    String getAllExceptionMessages(Exception var1);

    ISDtObject getCallByNumber(long var1);

    Set<String> getFailedEmailsFromException(Exception var1);

    String getFeedbackAddress();

    Set<String> getInboundMailAddresses();

    String getMessageStateTitle(MessageState var1);

    String getNumberWithPrefix(String var1, String var2);

    String getRejectReasonTitle(RejectReason var1);

    ISendMailParameters getSendMailParameters();

    String hasBadAttachment(IInboundMailMessage var1, Collection<String> var2, Collection<String> var3);

    String isInvalidEmail(String var1);

    boolean isSystemEmailAddress(String var1);

    boolean isValidEmail(String var1);

    void notifyMailReceived(IUUIDIdentifiable var1) throws Exception;

    void notifyMailReceived(IUUIDIdentifiable var1, IInboundMailMessage var2) throws Exception;

    void reattachFiles(IInboundMailMessage var1, IMimeMailWrapper var2);

    String rejectMessage(IMailProcessingResult var1);

    void replaceReferencesToAttachments(IInboundMailMessage var1);

    void reprocessMessage(String var1, String var2);

    String respondBody(IInboundMailMessage var1) throws IOException;

    Object searchByCallNumber(IInboundMailMessage var1);

    Object searchByCallNumberWithPrefix(IInboundMailMessage var1, String var2);

    ISDtObject searchByCallTitle(String var1);

    ISDtObject searchEmployeeByEmail(String var1);

    ISDtObject searchEmployeeByLastName(String var1);

    List<? extends ISDtObject> searchEmployeesByEmail(String var1);

    Object searchSCByNumber(String var1);

    void setMailState(String var1, String var2);
}
