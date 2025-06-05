package io.quicktype;

/**
 * Triggered when a user places a bet successfuly
 */
public class BetPlacementEvent {
    private Kind kind;
    private Meta meta;
    private BetPlacementEventPayload payload;
    private BetPlacementEventType type;

    /**
     * Identifies this message as an Event
     */
    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public Meta getMeta() { return meta; }
    public void setMeta(Meta value) { this.meta = value; }

    public BetPlacementEventPayload getPayload() { return payload; }
    public void setPayload(BetPlacementEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public BetPlacementEventType getType() { return type; }
    public void setType(BetPlacementEventType value) { this.type = value; }
}
