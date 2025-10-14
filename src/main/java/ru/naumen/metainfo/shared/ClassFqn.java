package ru.naumen.metainfo.shared;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;
import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Comparator;

public class ClassFqn implements IClassFqn, IsSerializable {
    public static final Function<ClassFqn, String> TO_STRING_CONVERTER = (input) -> {
        Preconditions.checkNotNull(input);
        return input.toString();
    };
    public static final Function<String, ClassFqn> FROM_STRING_CONVERTER = (input) -> {
        Preconditions.checkNotNull(input);
        return parse(input);
    };
    public static final Function<ClassFqn, String> CASE_EXTRACTOR = (input) -> {
        Preconditions.checkNotNull(input);
        return input.getCase();
    };
    public static final Function<ClassFqn, String> ID_EXTRACTOR = (input) -> {
        Preconditions.checkNotNull(input);
        return input.getId();
    };
    public static final Function<ClassFqn, ClassFqn> CLASS_EXTRACTOR = (input) -> {
        Preconditions.checkNotNull(input);
        return parse(input.getId());
    };
    public static final Predicate<ClassFqn> CLASS_PREDICATE = (fqn) -> {
        Preconditions.checkNotNull(fqn);
        return fqn.isClass();
    };
    public static final Predicate<ClassFqn> CASE_PREDICATE = (fqn) -> {
        Preconditions.checkNotNull(fqn);
        return fqn.isCase();
    };
    public static final Comparator<ClassFqn> SIMPLE_COMPARATOR = (fqn1, fqn2) -> {
        return fqn1.getCase().compareToIgnoreCase(fqn2.getCase());
    };
    private static final long serialVersionUID = -3512553293987358633L;
    private int fqnHashCode;
    private String fqnToString;
    private String fqnToLowerCase;
    private String id;
    private String _case;

    public static ClassFqn parse(String str) {
        return null;
    }

    public static ClassFqn parse(String id, String _case) {
        return null;
    }

    public static ClassFqn parseNullSafe(String str) {
        return Strings.isNullOrEmpty(str) ? null : parse(str);
    }

    public ClassFqn(CoreClassFqn classFqn) {
    }

    ClassFqn(String fqnStr) {
    }

    /**
     * @deprecated
     */
    @Deprecated
    ClassFqn(String id, String _case) {
    }

    public String asString() {
        return null;
    }

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public ClassFqn fqnOfClass() {
        return null;
    }

    public String getCase() {
        return null;
    }

    public String getCode() {
        return null;
    }

    public String getId() {
        return null;
    }

    public int hashCode() {
        return 1;
    }

    public boolean isAllowed() {
        return false;
    }

    public boolean isCaseOf(CoreClassFqn other) {
        return false;
    }

    public boolean isClassOf(CoreClassFqn other) {
        return false;
    }

    public boolean isSameClass(CoreClassFqn other) {
        return false;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public boolean isSomeClass(IClassFqn other) {
        return false;
    }

    public String toLowerCase() {
        return null;
    }

    public String toString() {
        return null;
    }

    public ClassFqn extractClass() {
        return null;
    }
}
