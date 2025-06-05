package io.quicktype;

import java.io.IOException;

public enum SBKEventsBetCashedOutEventType {
    SPORTSBOOK_BET_CASHED_OUT;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_BET_CASHED_OUT: return "@@sportsbook/bet_cashed_out";
        }
        return null;
    }

    public static SBKEventsBetCashedOutEventType forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/bet_cashed_out")) return SPORTSBOOK_BET_CASHED_OUT;
        throw new IOException("Cannot deserialize SBKEventsBetCashedOutEventType");
    }
}
