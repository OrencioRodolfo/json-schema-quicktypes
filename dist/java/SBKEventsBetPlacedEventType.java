package io.quicktype;

import java.io.IOException;

public enum SBKEventsBetPlacedEventType {
    SPORTSBOOK_BET_PLACED;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_BET_PLACED: return "@@sportsbook/bet_placed";
        }
        return null;
    }

    public static SBKEventsBetPlacedEventType forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/bet_placed")) return SPORTSBOOK_BET_PLACED;
        throw new IOException("Cannot deserialize SBKEventsBetPlacedEventType");
    }
}
