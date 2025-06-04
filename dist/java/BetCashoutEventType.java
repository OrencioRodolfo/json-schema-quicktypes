package io.quicktype;

import java.io.IOException;

public enum BetCashoutEventType {
    SPORTS_BET_CASHOUT;

    public String toValue() {
        switch (this) {
            case SPORTS_BET_CASHOUT: return "@@sports/bet_cashout";
        }
        return null;
    }

    public static BetCashoutEventType forValue(String value) throws IOException {
        if (value.equals("@@sports/bet_cashout")) return SPORTS_BET_CASHOUT;
        throw new IOException("Cannot deserialize BetCashoutEventType");
    }
}
