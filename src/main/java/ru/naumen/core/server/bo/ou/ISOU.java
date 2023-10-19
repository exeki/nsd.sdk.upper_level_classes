package ru.naumen.core.server.bo.ou;

import ru.naumen.core.server.bo.employee.ISEmployee;
import ru.naumen.core.shared.IUUIDIdentifiable;

public interface ISOU extends IUUIDIdentifiable {
    ISEmployee getHead();
}
