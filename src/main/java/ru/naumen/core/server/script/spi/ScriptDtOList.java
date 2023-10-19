package ru.naumen.core.server.script.spi;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public abstract class ScriptDtOList<T> extends ScriptDtOCollection implements List<T> {
    abstract public void add(int index, T element);

    abstract public boolean addAll(int index, Collection<? extends T> c);

    abstract public T get(int index);

    abstract public int indexOf(Object o);

    abstract public int lastIndexOf(Object o);

    abstract public ListIterator<T> listIterator();

    abstract public ListIterator<T> listIterator(int index);

    abstract public T remove(int index);

    abstract public T set(int index, T element);

    abstract public List<T> subList(int fromIndex, int toIndex);
}
