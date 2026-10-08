package ru.naumen.commons.shared;

import java.util.HashMap;
import java.util.Map;

 public class FxException extends RuntimeException implements IReadableException, ILocalizedException {

    public FxException() {
        super("text");
    }

    public FxException(String msg) {
        super("text");
    }

    public FxException(String msg, boolean readable) {
        super("text");
    }

    public FxException(String msg, boolean readable, String uiMessage) {
        super("text");
    }

    public FxException(String msg, boolean readable, String uiMessage, Throwable cause) {
        super("text");
    }

    public FxException(String msg, boolean readable, Throwable cause) {
        super("text");
    }

    public FxException(String msg, String details) {
        super("text");
    }

    public FxException(String msg, String details, String uiMessage) {
        super("text");
    }

    public FxException(String msg, Throwable cause) {
        super("text");
    }

    public FxException(Throwable cause) {
        super("text");
    }

    public FxException(Map<String, String> localizedMessages) {
        super("text");
    }

    public FxException(Map<String, String> localizedMessages, boolean readable) {
        super("text");
    }

    public FxException(Map<String, String> localizedMessages, Throwable cause) {
        super("text");
    }

     public String getDetails() {
        return "";
     }

     public String getUiMessage(){
         return "";
     }

     public boolean isAlreadyLogged(){
         return false;
     }

     public boolean isReadable(){
         return false;
     }

     public void setAlreadyLogged(){
     }

     public Map<String, String> getLocalizedMessages(){
         return new HashMap<>();
     }

     public void setLocalizedMessages(Map<String, String> localizedMessages){
     }

     public String getLocalizedMessage(String locale) {
         return "";
     }

     public void setLocalizedMessage(String locale, String message){
     }

     public boolean isLocalized(){
         return false;
     }
}
