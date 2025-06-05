package io.quicktype;

import java.io.IOException;

public enum SBKCommandsNavigateCommandType {
    SPORTSBOOK_NAVIGATE;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_NAVIGATE: return "@@sportsbook/navigate";
        }
        return null;
    }

    public static SBKCommandsNavigateCommandType forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/navigate")) return SPORTSBOOK_NAVIGATE;
        throw new IOException("Cannot deserialize SBKCommandsNavigateCommandType");
    }
}
