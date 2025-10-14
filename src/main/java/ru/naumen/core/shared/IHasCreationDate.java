package ru.naumen.core.shared;

import java.util.Date;
import ru.naumen.core.bo.CoreHasCreationDate;

public interface IHasCreationDate extends CoreHasCreationDate {
    Date getCreationDate();
}
