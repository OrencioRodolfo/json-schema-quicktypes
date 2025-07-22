package io.quicktype;

/**
 * Triggered when wallets get updated in host app
 */
public class HostEventsWalletUpdatedEvent {
    private Kind kind;
    private HostEventsWalletUpdatedEventMeta meta;
    private HostEventsWalletUpdatedEventPayload payload;
    private HostEventsWalletUpdatedEventType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public HostEventsWalletUpdatedEventMeta getMeta() { return meta; }
    public void setMeta(HostEventsWalletUpdatedEventMeta value) { this.meta = value; }

    public HostEventsWalletUpdatedEventPayload getPayload() { return payload; }
    public void setPayload(HostEventsWalletUpdatedEventPayload value) { this.payload = value; }

    /**
     * Defines the UID for this event
     */
    public HostEventsWalletUpdatedEventType getType() { return type; }
    public void setType(HostEventsWalletUpdatedEventType value) { this.type = value; }
}
