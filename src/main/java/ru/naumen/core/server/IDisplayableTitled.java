package ru.naumen.core.server;

import java.io.Serializable;
import java.util.Comparator;

public interface IDisplayableTitled {

    Comparator<IDisplayableTitled> BY_TITLE_COMPARATOR = new TitleComparator();
    Comparator<IDisplayableTitled> BY_TITLE_NO_CASESENSETIVE_COMPARATOR = new TitleIgnoreCaseComparator();

    String getDisplayableTitle();

    public static class TitleComparator implements Comparator<IDisplayableTitled>, Serializable {
        private static final long serialVersionUID = 1L;

        public TitleComparator() {
        }

        public int compare(IDisplayableTitled left, IDisplayableTitled right) {
            return 1;
        }
    }

    public static class TitleIgnoreCaseComparator implements Comparator<IDisplayableTitled>, Serializable {
        private static final long serialVersionUID = 1L;

        public TitleIgnoreCaseComparator() {
        }

        public int compare(IDisplayableTitled left, IDisplayableTitled right) {
            return 1;
        }
    }
}
