/**
 * Triggered when a user places a transaction like bet placed or bet cashed out successfuly
 */
export interface HostSportsbookEvents {
    kind: Kind;
    meta: Meta;
    /**
     * Defines the UID for this event
     */
    type: Type;
}

/**
 * Identifies the message as being an Event
 */
export enum Kind {
    Event = "event",
}

export interface Meta {
    origin?: Origin;
    [property: string]: any;
}

/**
 * Identifies 'Sportsbook' as the origin
 */
export enum Origin {
    Sportsbook = "sportsbook",
}

export enum Type {
    SportsbookTransaction = "@@sportsbook/transaction",
}
