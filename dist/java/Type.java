package io.quicktype;

import java.io.IOException;

public enum Type {
    SPORTSBOOK_BET_CASHOUT;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_BET_CASHOUT: return "@@sportsbook/bet_cashout";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/bet_cashout")) return SPORTSBOOK_BET_CASHOUT;
        throw new IOException("Cannot deserialize Type");
    }
}
