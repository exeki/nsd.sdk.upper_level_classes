package ru.naumen.core.server;

import ru.naumen.core.server.objectloader.IPrefixObjectLoaderUUIDIdentifiable;
import ru.naumen.core.shared.HasId;
import ru.naumen.core.shared.IUUIDIdentifiable;

public abstract class UUIDIdentifiableBase implements HasId, IUUIDIdentifiable, Comparable, IPrefixObjectLoaderUUIDIdentifiable {

    private long id;
    private transient String uuid;

    public UUIDIdentifiableBase() {
    }

    public int compareTo(Object o) {
        return 1;
    }

    public boolean equals(Object obj) {
       return false;
    }

    public long getId() {
        return this.id;
    }

    public String getUUID() {
      return null;
    }

    public int hashCode() {
        return 1;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        return "";
    }
}
