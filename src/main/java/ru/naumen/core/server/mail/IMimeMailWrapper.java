package ru.naumen.core.server.mail;

import ru.naumen.core.server.script.spi.IScriptDtObject;

import javax.activation.DataSource;
import java.io.File;

public interface IMimeMailWrapper {
    void addBcc(String var1, String var2);

    void addCc(String var1, String var2);

    void addReplyTo(String var1, String var2);

    void addText(String var1);

    void addTo(String var1, String var2);

    void attachFile(DataSource var1);

    void attachCalendarEvent(DataSource var1);

    void attachFile(DataSource var1, String var2);

    void attachFile(File var1);

    void attachFile(IScriptDtObject var1);

    void attachFile(String var1);

    void disableApacheCommonsEmail();

    void enableApacheCommonsEmail();

    String getContentType();

    void setContentType(String var1);

    String getCharSet();

    void setCharSet(String var1);

    boolean isApacheCommonsEmail();

    boolean isTransliterateSubject();

    void setTransliterateSubject(boolean var1);

    void setFrom(String var1, String var2);

    void setInline(DataSource var1);

    void setInline(DataSource var1, String var2);

    void setInline(File var1);

    void setInline(String var1);

    void setSubject(String var1);

    void setText(String var1);

    void setText(String var1, String var2);

    void fillMainParams(String var1, boolean var2, String var3, String var4);
}
