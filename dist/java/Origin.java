package io.quicktype;

import java.io.IOException;

/**
 * Identifies 'Host app' as the origin
 */
public enum Origin {
    HOST;

    public String toValue() {
        switch (this) {
            case HOST: return "host";
        }
        return null;
    }

    public static Origin forValue(String value) throws IOException {
        if (value.equals("host")) return HOST;
        throw new IOException("Cannot deserialize Origin");
    }
}
