package ru.naumen.core.shared;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.view.client.ProvidesKey;
import java.util.Collection;
import java.util.Comparator;
import ru.naumen.metainfo.shared.CoreHasCode;

public interface HasCode extends IsSerializable, CoreHasCode {
    Comparator<HasCode> COMPARATOR = (o1, o2) -> {
        return 0;
    };
    Function<HasCode, String> CODE_EXTRACTOR = new HasCodeExtractor();
    ProvidesKey<HasCode> PROVIDES_KEY = new HasCodeProvidesKey();

    String getCode();
    public static class HasCodeExtractor<T extends HasCode> implements Function<T, String> {
        public HasCodeExtractor() {
        }

        public String apply(T input) {
            return null;
        }
    }
    public static class HasCodeProvidesKey<T extends HasCode> implements ProvidesKey<T> {
        public HasCodeProvidesKey() {
        }

        public Object getKey(T item) {
            return 1;
        }
    }
    public static class HasCodeFilter<T extends HasCode> implements Predicate<T> {
        private  Collection<String> codes;

        public HasCodeFilter(Collection<String> codes) {
        }

        public HasCodeFilter( String code) {
        }

        protected HasCodeFilter() {
        }

        public boolean apply(T input) {
            return false;
        }
    }
}
