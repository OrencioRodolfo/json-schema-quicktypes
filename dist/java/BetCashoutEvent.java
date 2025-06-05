package io.quicktype;

/**
 * Triggered when a user cashes out a bet in My Bets
 */
public class BetCashoutEvent {
    private Kind kind;
    private Payload payload;
    private Type type;

    /**
     * Identifies this message as a Command
     */
    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public Payload getPayload() { return payload; }
    public void setPayload(Payload value) { this.payload = value; }

    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }
}
