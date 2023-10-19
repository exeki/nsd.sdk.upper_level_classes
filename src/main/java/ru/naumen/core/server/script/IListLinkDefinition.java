//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.naumen.core.server.script;

import ru.naumen.core.server.content.IContentLinkDefinition;
import ru.naumen.core.shared.IUUIDIdentifiable;

import javax.annotation.Nullable;
import java.util.List;

public interface IListLinkDefinition extends IContentLinkDefinition<IListLinkDefinition> {
    IFilter filter();

    IAttrChain attrChain();

    void relatedWithNestedParams(List<String> var1, String var2, List<String> var3);

    boolean isOnCard();

    default String getContentType() {
        return this.getListType();
    }

    String getUuid();

    IListLinkDefinition setUuid(String var1);

    String getListCode();

    IListLinkDefinition setListCode(String var1);

    String getClassCode();

    IListLinkDefinition setClassCode(String var1);

    List<String> getCases();

    IListLinkDefinition setCases(List<String> var1);

    String getAttrGroup();

    IListLinkDefinition setAttrGroup(String var1);

    List<String> getAttrCodes();

    IListLinkDefinition setAttrCodes(List<String> var1);

    String getListPresentationType();

    String getPaging();

    IListLinkDefinition setPaging(String var1);

    List<ISort> getSort();

    List<IFilter.IFilterOr> getFastFilter();

    List<IFilter.IFilterOr> getFastSubstringFilter();

    List<IFilter.IFilterOr> getRestrictionFilter();

    Boolean getNested();

    IListLinkDefinition setNested(boolean var1);

    /**
     * @deprecated
     */
    @Deprecated
    String getTypeList();

    String getListType();

    IListLinkDefinition setListType(String var1);

    IListLinkDefinition setObject(IUUIDIdentifiable var1);

    IListLinkDefinition setSimple();

    IListLinkDefinition sortAsc(String var1);

    IListLinkDefinition sortDesc(String var1);

    @Nullable
    String getAddLinkDialogTitle();

    @Nullable
    IListLinkDefinition setAddLinkDialogTitle(String var1);

    /**
     * имя для скачивания ru.naumen.core.server.script.IListLinkDefinition$ISort
     * класс в скачанном файле IListLinkDefinition$ISort
     */
    public interface ISort {
        boolean isAsc();

        String getAttrCode();
    }

    /**
     * имя для скачивания ru.naumen.core.server.script.IListLinkDefinition$IAttrChain
     * класс в скачанном файле IListLinkDefinition$IAttrChain
     */
    public interface IAttrChain {
        IAttrChain attributesChain(String... var1);

        IAttrChain attrLinkCode(String var1);

        IAttrChain nestedHierarchyAttrFqn(String var1);

        IAttrChain nestedAttrLinkFqn(String var1);

        IListLinkDefinition apply();
    }

    /**
     * имя для скачивания ru.naumen.core.server.script.IListLinkDefinition$IFilter
     * класс в скачанном файле IListLinkDefinition$IFilter
     */
    interface IFilter {
        String NOT_CONTAINS_INCLUDE_EMPTY = "notContainsIncludeEmpty";
        String NEXT_N = "nextN";
        String LAST_N = "lastN";
        String NEXT_N_HOURS = "nextNHours";
        String LAST_N_HOURS = "lastNHours";
        String STARTING_FROM = "startingFrom";
        String FINISHING_UP_TO = "finishingUpTo";
        String CONTAINS_IN_SET = "containsInSet";
        String NOT_CONTAINS_IN_SET = "notContainsInSet";
        String BEFORE_USER_ATTRIBUTE = "beforeUserAttribute";
        String BEFORE_SUBJECT_ATTRIBUTE = "beforeSubjectAttribute";
        String AFTER_USER_ATTRIBUTE = "afterUserAttribute";
        String AFTER_SUBJECT_ATTRIBUTE = "afterSubjectAttribute";
        String CONTAINS_WITH_NESTED = "containsWithNested";
        String INCORRECT = "incorrect";
        String CONTAINS = "contains";
        String NOT_CONTAINS = "notContains";
        String NULL = "null";
        String NOT_NULL = "notNull";
        String GREATER_THAN = "greater";
        String LESS_THAN = "less";
        String FROM_TO = "fromTo";
        String TODAY = "today";
        String TIMER_STATUS_CONTAINS = "timerStatusContains";
        String TIMER_STATUS_NOT_CONTAINS = "timerStatusNotContains";
        String BACKTIMER_DEADLINE_FROM_TO = "backTimerDeadLineFromTo";
        String BACKTIMER_DEADLINE_CONTAINS = "backTimerDeadLineContains";
        String TITLE_CONTAINS = "titleContains";
        String TITLE_NOT_CONTAINS = "titleNotContains";
        String CONTAINS_WITH_REMOVED = "containsWithRemoved";
        String NOT_CONTAINS_WITH_REMOVED = "notContainsWithRemoved";
        String CONTAINS_USER = "containsUser";
        String CONTAINS_SUBJECT = "containsSubject";
        String CONTAINS_USER_ATTRIBUTE = "containsUserAttribute";
        String CONTAINS_SUBJECT_ATTRIBUTE = "containsSubjectAttribute";
        String FROM_TO_DATE_POINT = "fromToDatePoint";
        String EQUALS = "equals";
        String FTS_CONTAINS = "fullTextSearch_contains";
        String FTS_NOT_CONTAINS = "fullTextSearch_notContains";
        String FTS_NULL = "fullTextSearch_null";
        String FTS_EQUAL = "fullTextSearch_equal";

        IFilterOr OR(String var1, String var2, @Nullable Object var3);

        IFilter AND(IFilterOr... var1);

        List<IFilterAnd> listAndElements();

        void setListAndElements(List<IFilterAnd> var1);

        IListLinkDefinition apply();

        List<IFilterOr> getFastFilterElements();

        IFilter fastFilter(IFilterOr... var1);

        IFilter fastSubstringFilter(IFilterOr... var1);

        IFilter restrictionFilter(IFilterOr... var1);

        /**
         * имя для скачивания ru.naumen.core.server.script.IListLinkDefinition$IFilter$IFilterOr
         * класс в скачанном файле IListLinkDefinition$IFilter$IFilterOr
         */
        public interface IFilterOr {
            String getAttrCode();

            String getConditionCode();

            @Nullable
            Object getValue();
        }

        /**
         * имя для скачивания ru.naumen.core.server.script.IListLinkDefinition$IFilter$IFilterAnd
         * класс в скачанном файле IListLinkDefinition$IFilter$IFilterAnd
         */
        public interface IFilterAnd {
            List<IFilterOr> listOrElements();
        }
    }
}
