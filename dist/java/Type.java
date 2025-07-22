package io.quicktype;

import java.io.IOException;

public enum Type {
    HOST_NAVIGATE;

    public String toValue() {
        switch (this) {
            case HOST_NAVIGATE: return "@@host/navigate";
        }
        return null;
    }

    public static Type forValue(String value) throws IOException {
        if (value.equals("@@host/navigate")) return HOST_NAVIGATE;
        throw new IOException("Cannot deserialize Type");
    }
}
