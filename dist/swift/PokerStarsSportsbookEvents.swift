// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let betCashoutEvent = try BetCashoutEvent(json)
//   let betPlacementEvent = try BetPlacementEvent(json)

import Foundation

/// Triggered when a user cashes out a bet in My Bets
// MARK: - BetCashoutEvent
struct BetCashoutEvent {
    /// Identifies this message as an Event
    let kind: Kind?
    let payload: BetCashoutEventPayload
    let type: BetCashoutEventType
}

enum Kind: String {
    case event
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
    case sportsbookBetCashout
}

/// Triggered when a user places a bet successfuly
// MARK: - BetPlacementEvent
struct BetPlacementEvent {
    /// Identifies this message as an Event
    let kind: Kind
    let meta: Meta?
    let payload: BetPlacementEventPayload
    /// Defines the UID for this event
    let type: BetPlacementEventType
}

// MARK: - Meta
struct Meta {
    let origin: Origin?
}

enum Origin: String {
    case sportsbook
}

// MARK: - BetPlacementEventPayload
struct BetPlacementEventPayload {
    let betID: Double
    let betPlacedTime: String?
    let betReceiptID: String
    let totalPotentialWin, totalStake: Double?
}

enum BetPlacementEventType: String {
    case sportsbookBetPlaced
}
