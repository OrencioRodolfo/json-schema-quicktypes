/**
 * Triggered when a user cashes out a bet in My Bets
 */
export interface BetCashoutEvent {
    payload: BetCashoutEventPayload;
    type:    BetCashoutEventType;
}

export interface BetCashoutEventPayload {
    betDelay?:      number;
    betId:          string;
    cashedOutQuote: number;
    cashOutToken?:  string;
    quote?:         number;
    [property: string]: any;
}

export enum BetCashoutEventType {
    SportsBetCashout = "@@sports/bet_cashout",
}

/**
 * Triggered when a user places a bet successfuly
 */
export interface BetPlacementEvent {
    kind:    Kind;
    payload: BetPlacementEventPayload;
    /**
     * Defines the UID for this event
     */
    type: BetPlacementEventType;
}

/**
 * Defines whether the message is an event or a command
 */
export enum Kind {
    Command = "command",
    Event = "event",
}

export interface BetPlacementEventPayload {
    betId:             number;
    betPlacedTime:     string;
    betReceiptId:      string;
    totalPotentialWin: number;
    totalStake:        number;
    [property: string]: any;
}

export enum BetPlacementEventType {
    SportsBetPlaced = "@@sports/bet_placed",
}
