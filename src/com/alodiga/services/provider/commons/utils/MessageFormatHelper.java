package com.alodiga.services.provider.commons.utils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatHelper {

    public ResourceBundle bundle = null;
    public MessageFormat messageFormat = null;

    public MessageFormatHelper(String fileName) {
        setBundle(fileName);
    }

    public String format(String key, Object... arg) {
        String message = "" + bundle.getString(key);
        if (message == null) {
            return "There is no message asociate to key:" + key;
        }
        messageFormat = new MessageFormat(message);

        return messageFormat.format(arg);
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void setBundle(String fileName) {
        bundle = ResourceBundle.getBundle(fileName, Locale.US);
    }
}
