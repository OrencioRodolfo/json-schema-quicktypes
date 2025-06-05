/**
 * Signal to instruct the subscriber (Sportsbook embed app) to perform a navigation to a
 * given URL
 */
export interface PokerStarsCommands {
    kind:    Kind;
    payload: Payload;
    type:    Type;
}

/**
 * Identifies the message as being a Command
 */
export enum Kind {
    Command = "command",
}

export interface Payload {
    target: Target;
    url:    string;
    [property: string]: any;
}

export enum Target {
    External = "external",
    Internal = "internal",
}

export enum Type {
    PokerstarsNavigate = "@@pokerstars/navigate",
}
