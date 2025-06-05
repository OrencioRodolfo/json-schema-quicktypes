package io.quicktype;

/**
 * Triggered when user's personal details get changed in My Account
 */
public class PSEventsPerfornalDetailsUpdatedEvent {
    private Kind kind;
    private PSEventsPerfornalDetailsUpdatedEventMeta meta;
    private PSEventsPerfornalDetailsUpdatedEventPayload payload;
    private PSEventsPerfornalDetailsUpdatedEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public PSEventsPerfornalDetailsUpdatedEventMeta getMeta() { return meta; }
    public void setMeta(PSEventsPerfornalDetailsUpdatedEventMeta value) { this.meta = value; }

    public PSEventsPerfornalDetailsUpdatedEventPayload getPayload() { return payload; }
    public void setPayload(PSEventsPerfornalDetailsUpdatedEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public PSEventsPerfornalDetailsUpdatedEventType getType() { return type; }
    public void setType(PSEventsPerfornalDetailsUpdatedEventType value) { this.type = value; }
}
