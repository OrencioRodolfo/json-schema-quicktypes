package io.quicktype;

/**
 * Triggered when wallets get updated in PokerStars app
 */
public class PSEventsWalletUpdatedEvent {
    private Kind kind;
    private PSEventsWalletUpdatedEventMeta meta;
    private PSEventsWalletUpdatedEventPayload payload;
    private PSEventsWalletUpdatedEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public PSEventsWalletUpdatedEventMeta getMeta() { return meta; }
    public void setMeta(PSEventsWalletUpdatedEventMeta value) { this.meta = value; }

    public PSEventsWalletUpdatedEventPayload getPayload() { return payload; }
    public void setPayload(PSEventsWalletUpdatedEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public PSEventsWalletUpdatedEventType getType() { return type; }
    public void setType(PSEventsWalletUpdatedEventType value) { this.type = value; }
}
