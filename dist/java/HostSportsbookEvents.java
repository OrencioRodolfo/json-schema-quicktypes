package io.quicktype;

/**
 * Triggered when a user places a transaction like bet placed or bet cashed out successfuly
 */
public class HostSportsbookEvents {
    private Kind kind;
    private Meta meta;
    private Type type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public Meta getMeta() { return meta; }
    public void setMeta(Meta value) { this.meta = value; }

    /**
     * Defines the UID for this event
     */
    public Type getType() { return type; }
    public void setType(Type value) { this.type = value; }
}
