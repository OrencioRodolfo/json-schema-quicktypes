package io.quicktype;

/**
 * Triggered when a user cashes out a bet in My Bets
 */
public class SBKEventsBetCashedOutEvent {
    private Kind kind;
    private SBKEventsBetCashedOutEventMeta meta;
    private SBKEventsBetCashedOutEventPayload payload;
    private SBKEventsBetCashedOutEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public SBKEventsBetCashedOutEventMeta getMeta() { return meta; }
    public void setMeta(SBKEventsBetCashedOutEventMeta value) { this.meta = value; }

    public SBKEventsBetCashedOutEventPayload getPayload() { return payload; }
    public void setPayload(SBKEventsBetCashedOutEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public SBKEventsBetCashedOutEventType getType() { return type; }
    public void setType(SBKEventsBetCashedOutEventType value) { this.type = value; }
}
