package ru.naumen.core.bo;

public interface CoreEmployee extends CoreBusinessObject {
    CoreBusinessObject getParent();

    String getLastName();

    String getFirstName();

    String getMiddleName();

    String getEmail();

    String getLogin();
}
