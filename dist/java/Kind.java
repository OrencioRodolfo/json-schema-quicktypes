package io.quicktype;

import java.io.IOException;

/**
 * Identifies the message as being a Command
 */
public enum Kind {
    COMMAND;

    public String toValue() {
        switch (this) {
            case COMMAND: return "command";
        }
        return null;
    }

    public static Kind forValue(String value) throws IOException {
        if (value.equals("command")) return COMMAND;
        throw new IOException("Cannot deserialize Kind");
    }
}
