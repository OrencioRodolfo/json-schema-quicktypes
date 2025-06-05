package io.quicktype;

/**
 * Triggered when a user cashes out a bet in My Bets
 */
public class SBKCommandsLoginCommand {
    private Kind kind;
    private SBKCommandsLoginCommandMeta meta;
    private SBKCommandsLoginCommandType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public SBKCommandsLoginCommandMeta getMeta() { return meta; }
    public void setMeta(SBKCommandsLoginCommandMeta value) { this.meta = value; }

    /**
     * Defines the UID for this event
     */
    public SBKCommandsLoginCommandType getType() { return type; }
    public void setType(SBKCommandsLoginCommandType value) { this.type = value; }
}
