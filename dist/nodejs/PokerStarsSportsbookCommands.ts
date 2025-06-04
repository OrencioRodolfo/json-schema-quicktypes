/**
 * Triggered when user taps 'Login to place bet' CTA in Betslip
 */
export interface PokerStarsSportsbookCommands {
    payload: Payload;
    type:    Type;
}

export interface Payload {
    betId:             number;
    betPlacedTime:     string;
    betReceiptId:      string;
    totalPotentialWin: number;
    totalStake:        number;
    [property: string]: any;
}

export enum Type {
    SportsBetPlacement = "@@sports/bet_placement",
}
