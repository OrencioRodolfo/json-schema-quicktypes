package io.quicktype;

/**
 * Triggered when user's personal details get changed in My Account
 */
public class HostEventsPerfornalDetailsUpdatedEvent {
    private Kind kind;
    private HostEventsPerfornalDetailsUpdatedEventMeta meta;
    private HostEventsPerfornalDetailsUpdatedEventPayload payload;
    private HostEventsPerfornalDetailsUpdatedEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public HostEventsPerfornalDetailsUpdatedEventMeta getMeta() { return meta; }
    public void setMeta(HostEventsPerfornalDetailsUpdatedEventMeta value) { this.meta = value; }

    public HostEventsPerfornalDetailsUpdatedEventPayload getPayload() { return payload; }
    public void setPayload(HostEventsPerfornalDetailsUpdatedEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public HostEventsPerfornalDetailsUpdatedEventType getType() { return type; }
    public void setType(HostEventsPerfornalDetailsUpdatedEventType value) { this.type = value; }
}
