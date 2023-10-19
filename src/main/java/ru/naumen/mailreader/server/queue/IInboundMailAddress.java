package ru.naumen.mailreader.server.queue;

public interface IInboundMailAddress {
    String getAddress();

    void setAddress(String var1);

    String getAddress(boolean var1);

    int getAddressType();

    void setAddressType(int var1);

    String getDomain();

    String getName();

    void setName(String var1);
}
