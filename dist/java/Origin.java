package io.quicktype;

import java.io.IOException;

/**
 * Identifies 'PokerStars' as the origin
 */
public enum Origin {
    POKERSTARS;

    public String toValue() {
        switch (this) {
            case POKERSTARS: return "pokerstars";
        }
        return null;
    }

    public static Origin forValue(String value) throws IOException {
        if (value.equals("pokerstars")) return POKERSTARS;
        throw new IOException("Cannot deserialize Origin");
    }
}
