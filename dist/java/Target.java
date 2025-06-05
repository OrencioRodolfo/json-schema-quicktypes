package io.quicktype;

import java.io.IOException;

public enum Target {
    EXTERNAL, INTERNAL;

    public String toValue() {
        switch (this) {
            case EXTERNAL: return "external";
            case INTERNAL: return "internal";
        }
        return null;
    }

    public static Target forValue(String value) throws IOException {
        if (value.equals("external")) return EXTERNAL;
        if (value.equals("internal")) return INTERNAL;
        throw new IOException("Cannot deserialize Target");
    }
}
