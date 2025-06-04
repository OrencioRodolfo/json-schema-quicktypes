/**
 * Triggered when a user places a bet
 */
export interface BetPlacementEvent {
    payload: BetPlacementEventPayload;
    type:    BetPlacementEventType;
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
    SportsBetPlacement = "@@sports/bet_placement",
}

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
