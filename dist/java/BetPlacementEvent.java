package io.quicktype;

/**
 * Triggered when a user places a bet
 */
public class BetPlacementEvent {
    private BetPlacementEventPayload payload;
    private BetPlacementEventType type;

    public BetPlacementEventPayload getPayload() { return payload; }
    public void setPayload(BetPlacementEventPayload value) { this.payload = value; }

    public BetPlacementEventType getType() { return type; }
    public void setType(BetPlacementEventType value) { this.type = value; }
}
