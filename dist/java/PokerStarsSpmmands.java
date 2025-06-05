package io.quicktype;

/**
 * Signal to instruct the subscriber (Sportsbook embed app) to perform a navigation to a
 * given URL
 */
public class PokerStarsSpmmands {
    private Kind kind;
    private Payload payload;
    private Type type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public Payload getPayload() { return payload; }
    public void setPayload(Payload value) { this.payload = value; }

    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }
}
