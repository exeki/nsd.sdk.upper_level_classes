package ru.naumen.metainfo.shared;

public interface IAttributeFqn extends Fqn, CoreAttributeFqn {
    IClassFqn getClassFqn();
}
