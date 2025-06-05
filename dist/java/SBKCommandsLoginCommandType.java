package io.quicktype;

import java.io.IOException;

public enum SBKCommandsLoginCommandType {
    SPORTSBOOK_LOGIN;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_LOGIN: return "@@sportsbook/login";
        }
        return null;
    }

    public static SBKCommandsLoginCommandType forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/login")) return SPORTSBOOK_LOGIN;
        throw new IOException("Cannot deserialize SBKCommandsLoginCommandType");
    }
}
