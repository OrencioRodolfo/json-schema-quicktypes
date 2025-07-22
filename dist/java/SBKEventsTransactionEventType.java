package io.quicktype;

import java.io.IOException;

public enum SBKEventsTransactionEventType {
    SPORTSBOOK_TRANSACTION;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_TRANSACTION: return "@@sportsbook/transaction";
        }
        return null;
    }

    public static SBKEventsTransactionEventType forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/transaction")) return SPORTSBOOK_TRANSACTION;
        throw new IOException("Cannot deserialize SBKEventsTransactionEventType");
    }
}
