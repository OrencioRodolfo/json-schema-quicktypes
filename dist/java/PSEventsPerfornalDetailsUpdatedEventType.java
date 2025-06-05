package io.quicktype;

import java.io.IOException;

public enum PSEventsPerfornalDetailsUpdatedEventType {
    POKERSTARS_PERSONAL_DETAILS_UPDATED;

    public String toValue() {
        switch (this) {
            case POKERSTARS_PERSONAL_DETAILS_UPDATED: return "@@pokerstars/personal_details_updated";
        }
        return null;
    }

    public static PSEventsPerfornalDetailsUpdatedEventType forValue(String value) throws IOException {
        if (value.equals("@@pokerstars/personal_details_updated")) return POKERSTARS_PERSONAL_DETAILS_UPDATED;
        throw new IOException("Cannot deserialize PSEventsPerfornalDetailsUpdatedEventType");
    }
}
