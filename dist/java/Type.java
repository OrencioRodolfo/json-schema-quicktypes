package io.quicktype;

import java.io.IOException;

public enum Type {
    SPORTS_BET_PLACEMENT;

    public String toValue() {
        switch (this) {
            case SPORTS_BET_PLACEMENT: return "@@sports/bet_placement";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("@@sports/bet_placement")) return SPORTS_BET_PLACEMENT;
        throw new IOException("Cannot deserialize Type");
    }
}
