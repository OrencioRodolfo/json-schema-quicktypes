package io.quicktype;

/**
 * Triggered when a user cashes out a bet in My Bets
 */
public class SBKCommandsDepositCommand {
    private Kind kind;
    private SBKCommandsDepositCommandMeta meta;
    private SBKCommandsDepositCommandType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public SBKCommandsDepositCommandMeta getMeta() { return meta; }
    public void setMeta(SBKCommandsDepositCommandMeta value) { this.meta = value; }

    /**
     * Defines the UID for this event
     */
    public SBKCommandsDepositCommandType getType() { return type; }
    public void setType(SBKCommandsDepositCommandType value) { this.type = value; }
}
