package ru.naumen.core.shared;

import java.util.function.Function;

public interface HasNumber {
    Function<HasNumber, Long> NUMBER_EXTRACTOR = new NumberExtractor();

    Long getNumber();

    void setNumber(Long number);

    public static class NumberExtractor<T extends HasNumber> implements Function<T, Long> {
        public NumberExtractor() {
        }

        public Long apply(T input) {
            return null;
        }
    }
}
