package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.Collection;
import java.util.List;
import ru.naumen.common.shared.Snapshotable;

public interface HasDateTimeRestriction extends Snapshotable {
    List<String> getAttrsForDateTimeRestrictionScript();

    Collection<CommonRestriction> getDateTimeCommonRestrictions();

    String getDateTimeRestrictionAttribute();

    DateTimeRestrictionCondition getDateTimeRestrictionCondition();

    String getDateTimeRestrictionScript();

    RestrictionType getDateTimeRestrictionType();

    public static enum RestrictionType implements IsSerializable {
        NO_RESTRICTION,
        RESTRICTION_BY_SCRIPT,
        ATTRIBUTE_RESTRICTION;

        private RestrictionType() {
        }
    }
}
