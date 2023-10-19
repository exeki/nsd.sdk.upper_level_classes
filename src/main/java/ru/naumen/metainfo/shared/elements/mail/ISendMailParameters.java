package ru.naumen.metainfo.shared.elements.mail;

public interface ISendMailParameters {
    String getCharacterEncoding();

    void setCharacterEncoding(String var1);

    String getFeedbackAddress();

    void setFeedbackAddress(String var1);

    String getFrom();

    void setFrom(String var1);

    int getIterationDelay();

    void setIterationDelay(int var1);

    int getMessagesPerIteration();

    void setMessagesPerIteration(int var1);

    String getName();

    void setName(String var1);

    String getOutgoingServer();

    void setOutgoingServer(String var1);

    int getResendDelay();

    void setResendDelay(int var1);

    int getSendAttempts();

    void setSendAttempts(int var1);

    boolean isSendPartial();

    void setSendPartial(boolean var1);

    boolean isTransliterateSubject();

    void setTransliterateSubject(boolean var1);
}
