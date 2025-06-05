package io.quicktype;

import java.io.IOException;

public enum Type {
    POKERSTARS_NAVIGATE;

    public String toValue() {
        switch (this) {
            case POKERSTARS_NAVIGATE: return "@@pokerstars/navigate";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("@@pokerstars/navigate")) return POKERSTARS_NAVIGATE;
        throw new IOException("Cannot deserialize Type");
    }
}
