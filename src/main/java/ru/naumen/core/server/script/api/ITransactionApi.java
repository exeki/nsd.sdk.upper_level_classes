package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;

public interface ITransactionApi extends ScriptApi {
    DataSource REGULAR = DataSource.REGULAR;
    DataSource READ_ONLY = DataSource.READ_ONLY;
    DataSource REPORTS = DataSource.REPORTS;

    Object call(Object var1);

    Object call(DataSource var1, Object var2);

    void setReadOnly();

    enum DataSource{
        REGULAR,
        READ_ONLY,
        REPORTS
    }
}
