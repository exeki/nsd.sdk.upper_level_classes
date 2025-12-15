package ru.naumen.core.server.script.api;

import java.util.Collection;
import java.util.Map;

public interface IDocumentedStringApi extends IDocumentedApi {
    String concat(String separator, CharSequence[] strs);

    String concat(String separator, Iterable<CharSequence> strs);

    boolean contains(String str, CharSequence s);

    boolean containsAnyFromCollection(final String str, Collection<String> substrCollection);

    boolean containsAnyFromCollectionIc(final String str, Collection<String> substrCollection);

    String find(String str, String prefix, String format);

    String findByRegExp(String str, String regexp);

    String findByRegExp(String str, String regexp, String flags);

    String getDomain(String email);

    String getFileExtension(String filename);

    String getFileName(String filename);

    String getMailbox(String email);

    String getTextBeforeDelimiterAsHtml(String htmlBody, String delimiter);

    String htmlToText(String html);

    String escapeHtml(String text);

    boolean isEmpty(CharSequence str);

    boolean isEmpty(String str);

    boolean isEmptyTrim(CharSequence str);

    <T extends CharSequence> Iterable<T> notEmpty(Iterable<T> strs);

    String replace(String str, String from, String to);

    Map<String, String> toMap(String str, String pairDelimiter, String keyValueDelimiter);

    Iterable<String> trim(Iterable<String> strs);

    String trim(String str);
}
