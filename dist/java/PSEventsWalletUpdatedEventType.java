package io.quicktype;

import java.io.IOException;

public enum PSEventsWalletUpdatedEventType {
    POKERSTARS_WALLET_UPDATED;

    public String toValue() {
        switch (this) {
            case POKERSTARS_WALLET_UPDATED: return "@@pokerstars/wallet_updated";
        }
        return null;
    }

    public static PSEventsWalletUpdatedEventType forValue(String value) throws IOException {
        if (value.equals("@@pokerstars/wallet_updated")) return POKERSTARS_WALLET_UPDATED;
        throw new IOException("Cannot deserialize PSEventsWalletUpdatedEventType");
    }
}
