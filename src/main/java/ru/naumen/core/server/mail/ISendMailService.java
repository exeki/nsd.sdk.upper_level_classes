package ru.naumen.core.server.mail;

import ru.naumen.metainfo.shared.elements.mail.ISendMailParameters;

import javax.activation.DataSource;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public interface ISendMailService {
    IMimeMailWrapper createMail();

    IMimeMailWrapper createEmptyMail();

    int getMaxRecipients();

    void setMaxRecipients(Integer var1);

    void send(ISendMailParameters var1, Map<String, String> var2, Map<String, String> var3, String var4, String var5, String var6, List<DataSource> var7, List<DataSource> var8, Map<String, String> var9);

    void send(ISendMailParameters var1, Map<String, String> var2, String var3, String var4, String var5);

    void send(ISendMailParameters var1, Map<String, String> var2, String var3, String var4, String var5, List<DataSource> var6, List<DataSource> var7);

    void send(Map<String, String> var1, String var2, String var3, String var4);

    void send(String var1, String var2, String var3, String var4);

    void send(String var1, String var2, String var3, String var4, String var5);

    @Nullable
    Long[] sendMail(IMimeMailWrapper var1);

    @Nullable
    Long[] sendMail(IMimeMailWrapper var1, String var2);

    @Nullable
    Long sendSingleMail(IMimeMailWrapper var1);

    @Nullable
    Long sendSingleMail(IMimeMailWrapper var1, String var2);
}
