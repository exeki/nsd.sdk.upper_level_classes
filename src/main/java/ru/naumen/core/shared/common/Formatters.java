package ru.naumen.core.shared.common;

import com.google.gwt.safehtml.shared.SafeHtml;

import java.util.Collection;
import java.util.Date;
import java.util.function.Function;

import ru.naumen.common.shared.utils.IDateTimeInterval;
import ru.naumen.common.shared.utils.IHyperlink;
import ru.naumen.common.shared.utils.ILocalizedText;
import ru.naumen.core.shared.ITitled;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.core.shared.dto.DtObject;
import ru.naumen.core.shared.timer.Status;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.elements.MetaClassLite;

public interface Formatters {
    String downloadUrl(String fileUUID);

    String escalationObjects(Object scheme);

    SafeHtml escapeHtmlSymbols(String text);

    String format(IUUIDIdentifiable obj);

    String formatCaseList(Collection<Object> value);

    String formatDate(Date time);

    String formatDateTime(Date time);

    String formatDateTimeWithTimeZone(Date time);

    String formatDateTime(Date time, String timeZone, String pattern);

    String formatDateTimeInterval(IDateTimeInterval dateTimeInterval);

    String formatDateTimeInterval(IDateTimeInterval dateTimeInterval, Object context);

    String formatDateTimeWithMillis(Date time);

    String formatDateTimeWithSeconds(Date time);

    <T> String formatDigitsGroups(T value, Object context, boolean hasDigitGroupSeparators, boolean hasDecimalCountRestriction);

    String formatFileSize(long size, boolean intValue);

    String formatHyperlink(IHyperlink hyperlink);

    SafeHtml formatHyperlinkAsHtml(IHyperlink hyperlink);

    SafeHtml formatHyperlinkAsHtml(IHyperlink hyperlink, boolean newTab, boolean noWhitespaceCollapse);

    SafeHtml formatHyperlinkAsHtml(IHyperlink hyperlink, String debugId, String cssClass, boolean newTab);

    String formatLocalizedText(ILocalizedText localizedText);

    String formatLocalizedWithEllipsis(Iterable<? extends Object> value, int max, Function<Object, String> i18nTitleExtractor);

    SafeHtml formatLongToTime(Long value, boolean roundUp);

    String formatRichText(String html);

    String formatText(String text);

    SafeHtml formatTimerStatus(Status status);

    String formatUnknown(Object obj);

    String formatWithEllipsis(Iterable<? extends ITitled> value, int max);

    String getUrlByUuid(String uuid);

    <T extends IUUIDIdentifiable & ITitled> SafeHtml linksToEntities(Collection<T> objList);

    <T extends IUUIDIdentifiable & ITitled> SafeHtml linksToEntities(Collection<T> objList, boolean newTab);

    <T extends IUUIDIdentifiable> SafeHtml linksToNotTitledEntities(Collection<T> objList, boolean newTab);

    <T extends IUUIDIdentifiable & ITitled> SafeHtml linkToEntity(T obj);

    <T extends IUUIDIdentifiable & ITitled> SafeHtml linkToEntity(T obj, boolean newTab);

    <T extends IUUIDIdentifiable & ITitled> SafeHtml linkToEntity(T obj, String id);

    <T extends IUUIDIdentifiable & ITitled> SafeHtml linkToEntity(T obj, String id, boolean newTab);

    SafeHtml linkToEscalationObjects(Object scheme);

    SafeHtml linkToMetaClass(ClassFqn fqn, String title);

    SafeHtml linkToMetaClass(MetaClassLite metaClass);

    SafeHtml linkToMetaClasses(Collection<MetaClassLite> metaClassList);

    <T extends IUUIDIdentifiable> SafeHtml linkToNotTitledEntity(T obj, boolean newTab);

    SafeHtml normalize(SafeHtml text);

    String normalize(String text);

    String oneZeroFormatter(Object obj);

    String passwordFormatter(String str);

    Date strToDate(String time);

    Date strToDateTime(String time);

    Date strToDateTimeSeconds(String time);

    <T extends ITitled> String title(Collection<T> objs);

    <T extends ITitled> String title(Collection<T> objects, String delimiter);

    <T extends ITitled> String title(Collection<T> objects, String delimiter, boolean sort);

    String title(ITitled obj);

    String title(ITitled obj, boolean nbsp);

    String valueMapObjects(DtObject valueMapCatalogItem);

    String yesNoFormatter(Object obj);

    String yesNoFormatter(Object obj, String lang);
}
