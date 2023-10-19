package ru.naumen.core.server.script.api.criteria;

import ru.naumen.core.shared.filters.IFilter;

import javax.annotation.Nullable;

public interface IApiCriteria {
    IApiCriteria add(IApiCriterion var1);

    IApiCriteria add(IFilter var1);

    IApiCriteria addColumn(IApiCriteriaColumn var1);

    IApiCriteria addColumn(IApiCriteriaColumn var1, String var2);

    IApiCriteria addColumn(ISubquery var1);

    IApiCriteria addColumn(ISubquery var1, String var2);

    /**
     * @deprecated
     */
    @Deprecated
    IApiCriteria addColumn(String var1);

    /**
     * @deprecated
     */
    @Deprecated
    IApiCriteria addColumn(String var1, String var2);

    IApiCriteria addCTESource(IApiCriteria var1);

    IApiCriteria addGroupColumn(IApiCriteriaColumn var1);

    IApiCriteria addGroupColumn(String var1);

    IApiCriteria addInnerJoin(String var1);

    IApiCriteria addInnerJoinTyped(String var1, String var2);

    IApiCriteria addLeftJoin(String var1);

    IApiCriteria addLeftJoinTyped(String var1, String var2);

    IApiCriteria addOrder(IApiCriteriaOrder var1);

    IApiCriteria addRightJoin(String var1);

    IApiCriteria addRightJoinTyped(String var1, String var2);

    IApiCriteria addSource(String var1);

    ISubquery subquery();

    String getAlias();

    IApiCriteria setFirstResult(int var1);

    IApiCriteria setMaxResults(@Nullable Integer var1);
}
