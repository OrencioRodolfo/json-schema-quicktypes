package io.quicktype;

/**
 * Triggered when a user places a transaction like bet placed or bet cashed out successfuly
 */
public class SBKEventsTransactionEvent {
    private Kind kind;
    private SBKEventsTransactionEventMeta meta;
    private SBKEventsTransactionEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public SBKEventsTransactionEventMeta getMeta() { return meta; }
    public void setMeta(SBKEventsTransactionEventMeta value) { this.meta = value; }

    /**
     * Defines the UID for this event
     */
    public SBKEventsTransactionEventType getType() { return type; }
    public void setType(SBKEventsTransactionEventType value) { this.type = value; }
}
