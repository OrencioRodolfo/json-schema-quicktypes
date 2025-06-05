package io.quicktype;

import java.io.IOException;

public enum SBKCommandsDepositCommandType {
    SPORTSBOOK_DEPOSIT;

    public String toValue() {
        switch (this) {
            case SPORTSBOOK_DEPOSIT: return "@@sportsbook/deposit";
        }
        return null;
    }

    public static SBKCommandsDepositCommandType forValue(String value) throws IOException {
        if (value.equals("@@sportsbook/deposit")) return SPORTSBOOK_DEPOSIT;
        throw new IOException("Cannot deserialize SBKCommandsDepositCommandType");
    }
}
