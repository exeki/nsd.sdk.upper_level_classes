package ru.naumen.core.shared.script.places;

public enum ScriptHolders {
    ADVIMPORT,
    ATTRIBUTE,
    EVENT_ACTION,
    MAIL_PROCESSOR_RULE,
    APPLICATION,
    REPORT_TEMPLATE,
    ROLE,
    SCHEDULER_TASK,
    TIMER,
    WORKFLOW,
    ESCALATION,
    CONSOLE,
    CTI,
    MONITORING,
    PERMISSIONS,
    SC_PARAMETERS_SLM,
    SC_PARAMETERS_AGREEMENT,
    SC_PARAMETERS_CASES,
    FILTER_RESTRICTION,
    VOICE_PROCESSING,
    GATHERING_DATA,
    SAVE_DATA,
    DATA_PREPARATION,
    LEARNING_AND_VALIDATION,
    PREPROCESS,
    POSTPROCESS;

    public boolean isClass() {
        return (ATTRIBUTE == this || WORKFLOW == this || TIMER == this || ESCALATION == this || EVENT_ACTION == this || ROLE == this);
    }
}
