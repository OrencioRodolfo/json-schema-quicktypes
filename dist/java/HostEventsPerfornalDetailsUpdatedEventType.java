package io.quicktype;

import java.io.IOException;

public enum HostEventsPerfornalDetailsUpdatedEventType {
    HOST_PERSONAL_DETAILS_UPDATED;

    public String toValue() {
        switch (this) {
            case HOST_PERSONAL_DETAILS_UPDATED: return "@@host/personal_details_updated";
        }
        return null;
    }

    public static HostEventsPerfornalDetailsUpdatedEventType forValue(String value) throws IOException {
        if (value.equals("@@host/personal_details_updated")) return HOST_PERSONAL_DETAILS_UPDATED;
        throw new IOException("Cannot deserialize HostEventsPerfornalDetailsUpdatedEventType");
    }
}
