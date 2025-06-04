package io.quicktype;

/**
 * Triggered when user taps 'Login to place bet' CTA in Betslip
 */
public class PokerStarsSportsbookCommands {
    private Payload payload;
    private Type type;

    public Payload getPayload() { return payload; }
    public void setPayload(Payload value) { this.payload = value; }

    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }
}
