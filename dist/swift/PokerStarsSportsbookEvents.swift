// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let betPlacementEvent = try BetPlacementEvent(json)
//   let betCashoutEvent = try BetCashoutEvent(json)

import Foundation

/// Triggered when a user places a bet
// MARK: - BetPlacementEvent
struct BetPlacementEvent {
    let payload: BetPlacementEventPayload
    let type: BetPlacementEventType
}

// MARK: - BetPlacementEventPayload
struct BetPlacementEventPayload {
    let betID: Double
    let betPlacedTime, betReceiptID: String
    let totalPotentialWin, totalStake: Double
}

enum BetPlacementEventType: String {
    case sportsBetPlacement
}

/// Triggered when a user cashes out a bet in My Bets
// MARK: - BetCashoutEvent
struct BetCashoutEvent {
    let payload: BetCashoutEventPayload
    let type: BetCashoutEventType
}

// MARK: - BetCashoutEventPayload
struct BetCashoutEventPayload {
    let betDelay: Double?
    let betID: String
    let cashedOutQuote: Double
    let cashOutToken: String?
    let quote: Double?
}

enum BetCashoutEventType: String {
    case sportsBetCashout
}
