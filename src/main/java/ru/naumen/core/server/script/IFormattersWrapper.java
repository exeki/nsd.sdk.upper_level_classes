//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.naumen.core.server.script;

import ru.naumen.common.shared.utils.IDateTimeInterval;
import ru.naumen.common.shared.utils.IHyperlink;
import ru.naumen.core.shared.IUUIDIdentifiable;

import java.util.Date;

public interface IFormattersWrapper {
    Long bytesToKb(Long var1, boolean var2);

    Long bytesToMb(Long var1, boolean var2);

    Double bytesToMbDouble(Long var1);

    String bytesToMbStringWithPrecision(Long var1, int var2);

    ISafeHtmlWrapper escapeHtmlSymbols(String var1);

    String format(IUUIDIdentifiable var1);

    String formatDate(Date var1);

    String formatDateTime(Date var1);

    String formatDateTime(Date var1, String var2);

    String formatDateTimeInterval(IDateTimeInterval var1);

    String formatHyperlink(IHyperlink var1);

    ISafeHtmlWrapper formatHyperlinkAsHtml(IHyperlink var1);

    ISafeHtmlWrapper formatLongToTime(Long var1, boolean var2);

    String formatTimePeriod(long var1);

    String oneZeroFormatter(Object var1);

    Date strToDate(String var1);

    Date strToDate(String var1, String var2);

    Date strToDateTime(String var1);

    String yesNoFormatter(Object var1);
}
