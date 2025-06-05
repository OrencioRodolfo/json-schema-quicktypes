package io.quicktype;

/**
 * Triggered when a user places a bet successfuly
 */
public class SBKEventsBetPlacedEvent {
    private Kind kind;
    private SBKEventsBetPlacedEventMeta meta;
    private SBKEventsBetPlacedEventPayload payload;
    private SBKEventsBetPlacedEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public SBKEventsBetPlacedEventMeta getMeta() { return meta; }
    public void setMeta(SBKEventsBetPlacedEventMeta value) { this.meta = value; }

    public SBKEventsBetPlacedEventPayload getPayload() { return payload; }
    public void setPayload(SBKEventsBetPlacedEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public SBKEventsBetPlacedEventType getType() { return type; }
    public void setType(SBKEventsBetPlacedEventType value) { this.type = value; }
}
