/**
 * Triggered when a user cashes out a bet in My Bets
 */
export interface SBKEventsBetCashedOutEvent {
    kind:    Kind;
    meta:    SBKEventsBetCashedOutEventMeta;
    payload: SBKEventsBetCashedOutEventPayload;
    /**
     * Defines the UID for this event
     */
    type: SBKEventsBetCashedOutEventType;
}

/**
 * Identifies the message as being an Event
 */
export enum Kind {
    Event = "event",
}

export interface SBKEventsBetCashedOutEventMeta {
    origin?: Origin;
    [property: string]: any;
}

/**
 * Identifies 'Sportsbook' as the origin
 */
export enum Origin {
    Sportsbook = "sportsbook",
}

export interface SBKEventsBetCashedOutEventPayload {
    betDelay?:      number;
    betId:          string;
    cashedOutQuote: number;
    cashOutToken?:  string;
    quote?:         number;
    [property: string]: any;
}

export enum SBKEventsBetCashedOutEventType {
    SportsbookBetCashedOut = "@@sportsbook/bet_cashed_out",
}

/**
 * Triggered when a user places a bet successfuly
 */
export interface SBKEventsBetPlacedEvent {
    kind:    Kind;
    meta:    SBKEventsBetPlacedEventMeta;
    payload: SBKEventsBetPlacedEventPayload;
    /**
     * Defines the UID for this event
     */
    type: SBKEventsBetPlacedEventType;
}

export interface SBKEventsBetPlacedEventMeta {
    origin?: Origin;
    [property: string]: any;
}

export interface SBKEventsBetPlacedEventPayload {
    betId:              number;
    betPlacedTime?:     string;
    betReceiptId:       string;
    totalPotentialWin?: number;
    totalStake?:        number;
    [property: string]: any;
}

export enum SBKEventsBetPlacedEventType {
    SportsbookBetPlaced = "@@sportsbook/bet_placed",
}
