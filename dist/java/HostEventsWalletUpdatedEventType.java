package io.quicktype;

import java.io.IOException;

public enum HostEventsWalletUpdatedEventType {
    HOST_WALLET_UPDATED;

    public String toValue() {
        switch (this) {
            case HOST_WALLET_UPDATED: return "@@host/wallet_updated";
        }
        return null;
    }

    public static HostEventsWalletUpdatedEventType forValue(String value) throws IOException {
        if (value.equals("@@host/wallet_updated")) return HOST_WALLET_UPDATED;
        throw new IOException("Cannot deserialize HostEventsWalletUpdatedEventType");
    }
}
