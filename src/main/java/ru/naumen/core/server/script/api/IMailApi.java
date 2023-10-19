package ru.naumen.core.server.script.api;

import ru.naumen.core.server.mail.IMimeMailWrapper;
import ru.naumen.core.server.mail.ISendMailService;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.core.shared.dto.ISDtObject;
import ru.naumen.mailreader.server.processor.IMailProcessHelper;
import ru.naumen.mailreader.server.processor.IMailProcessingResult;
import ru.naumen.mailreader.server.processor.MessageState;
import ru.naumen.mailreader.server.processor.RejectReason;
import ru.naumen.mailreader.server.queue.IInboundMailMessage;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IMailApi extends ScriptApi {
    RejectReason OTHER_REJECT_REASON = RejectReason.OTHER;
    RejectReason BAD_ATTACHMENTS_REJECT_REASON = RejectReason.BAD_ATTACHMENTS;
    RejectReason INVALID_EMAIL_REJECT_REASON = RejectReason.INVALID_EMAIL;
    RejectReason BIG_ATTACHMENT_REJECT_REASON = RejectReason.BIG_ATTACHMENT;
    RejectReason BIG_ATTACHMENT_GROUP_REJECT_REASON = RejectReason.BIG_ATTACHMENTS;
    RejectReason MALICIOUS_ATTACHMENT_REJECT_REASON = RejectReason.MALICIOUS_ATTACHMENT;
    RejectReason BAD_FORMAT_REJECT_REASON = RejectReason.BAD_FORMAT;
    RejectReason CLIENT_NOT_FOUND_REJECT_REASON = RejectReason.CLIENT_NOT_FOUND;
    RejectReason CONTACT_NOT_FOUND_REJECT_REASON = RejectReason.CONTACT_NOT_FOUND;
    RejectReason BLACKLIST_REJECT_REASON = RejectReason.BLACKLIST;
    MessageState ERROR_MSG_STATE = MessageState.ERROR;
    MessageState REJECT_MSG_STATE = MessageState.REJECT;
    MessageState NEW_BO_MSG_STATE = MessageState.NEW_BO;
    MessageState ATTACH_MSG_STATE = MessageState.ATTACH;
    MessageState OUTGOING_MSG_STATE = MessageState.OUTGOING;

    Set<? extends ISDtObject> attachAllMessageAttachments(IUUIDIdentifiable var1, IInboundMailMessage var2);

    ISDtObject attachMessage(IUUIDIdentifiable var1, IInboundMailMessage var2);

    Set<? extends ISDtObject> attachMessageAttachments(IUUIDIdentifiable var1, IInboundMailMessage var2);

    Set<? extends ISDtObject> attachMessageAttachments(IUUIDIdentifiable var1, IInboundMailMessage var2, String var3);

    IMimeMailWrapper createMessageResponse(IInboundMailMessage var1, String var2);

    String formRespondBody(IMailProcessingResult var1);

    IMailProcessHelper getHelper();

    String getCallNumber(IInboundMailMessage var1);

    String getNumberWithPrefix(String var1, String var2);

    String getNumberWithPrefix(String var1, String var2, boolean var3);

    ISendMailService getSender();

    ISendMailService getSimpleSender();

    boolean hasBadAttachment(IInboundMailMessage var1, Collection<String> var2, Collection<String> var3);

    boolean isSilentMode();

    boolean isSystemEmailAddress(String var1);

    boolean isValidEmail(String var1);

    void notifyMailReceived(IUUIDIdentifiable var1) throws Exception;

    void notifyMailReceived(@Nullable IUUIDIdentifiable var1, @Nullable IInboundMailMessage var2) throws Exception;

    void processBrokenMessages(String var1);

    void replaceReferencesToAttachments(IInboundMailMessage var1);

    String respondBody(IInboundMailMessage var1) throws IOException;

    void restartMailDispatcherThread();

    void restartMailReceiversSessions();

    Object searchByCallNumber(IInboundMailMessage var1);

    Object searchByCallNumberWithPrefix(IInboundMailMessage var1, String var2);

    ISDtObject searchEmployeeByEmail(String var1);

    ISDtObject searchEmployeeByLastName(String var1);

    List<? extends ISDtObject> searchEmployeesByEmail(String var1);

    void enableDebug();

    void disableDebug();
}
