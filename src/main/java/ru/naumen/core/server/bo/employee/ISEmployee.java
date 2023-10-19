package ru.naumen.core.server.bo.employee;

import java.util.Date;

public interface ISEmployee {
    String getCityPhoneNumber();

    Date getDateOfBirth();

    String getInternalPhoneNumber();

    String getLogin();

    String getPost();

    String getPrivateCode();
}
