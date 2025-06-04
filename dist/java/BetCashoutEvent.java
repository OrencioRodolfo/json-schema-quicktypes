package io.quicktype;

/**
 * Triggered when a user cashes out a bet in My Bets
 */
public class BetCashoutEvent {
    private BetCashoutEventPayload payload;
    private BetCashoutEventType type;

    public BetCashoutEventPayload getPayload() { return payload; }
    public void setPayload(BetCashoutEventPayload value) { this.payload = value; }

    public BetCashoutEventType getType() { return type; }
    public void setType(BetCashoutEventType value) { this.type = value; }
}
