package io.quicktype;

/**
 * Signal to instruct the subscriber (PokerStart host app) to perform a navigation to a
 * given URL
 */
public class SBKCommandsNavigateCommand {
    private Kind kind;
    private Payload payload;
    private SBKCommandsNavigateCommandType type;

    public Kind getKind() { return kind; }
    public void setKind(Kind value) { this.kind = value; }

    public Payload getPayload() { return payload; }
    public void setPayload(Payload value) { this.payload = value; }

    public SBKCommandsNavigateCommandType getType() { return type; }
    public void setType(SBKCommandsNavigateCommandType value) { this.type = value; }
}
