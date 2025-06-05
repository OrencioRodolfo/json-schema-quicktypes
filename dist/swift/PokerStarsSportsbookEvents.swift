// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let sBKEventsBetCashedOutEvent = try SBKEventsBetCashedOutEvent(json)
//   let sBKEventsBetPlacedEvent = try SBKEventsBetPlacedEvent(json)

import Foundation

/// Triggered when a user cashes out a bet in My Bets
// MARK: - SBKEventsBetCashedOutEvent
struct SBKEventsBetCashedOutEvent {
    let kind: Kind
    let meta: SBKEventsBetCashedOutEventMeta
    let payload: SBKEventsBetCashedOutEventPayload
    /// Defines the UID for this event
    let type: SBKEventsBetCashedOutEventType
}

/// Identifies the message as being an Event
enum Kind: String {
    case event
}

// MARK: - SBKEventsBetCashedOutEventMeta
struct SBKEventsBetCashedOutEventMeta {
    let origin: Origin?
}

/// Identifies 'Sportsbook' as the origin
enum Origin: String {
    case sportsbook
}

// MARK: - SBKEventsBetCashedOutEventPayload
struct SBKEventsBetCashedOutEventPayload {
    let betDelay: Double?
    let betID: String
    let cashedOutQuote: Double
    let cashOutToken: String?
    let quote: Double?
}

enum SBKEventsBetCashedOutEventType: String {
    case sportsbookBetCashedOut
}

/// Triggered when a user places a bet successfuly
// MARK: - SBKEventsBetPlacedEvent
struct SBKEventsBetPlacedEvent {
    let kind: Kind
    let meta: SBKEventsBetPlacedEventMeta
    let payload: SBKEventsBetPlacedEventPayload
    /// Defines the UID for this event
    let type: SBKEventsBetPlacedEventType
}

// MARK: - SBKEventsBetPlacedEventMeta
struct SBKEventsBetPlacedEventMeta {
    let origin: Origin?
}

// MARK: - SBKEventsBetPlacedEventPayload
struct SBKEventsBetPlacedEventPayload {
    let betID: Double
    let betPlacedTime: String?
    let betReceiptID: String
    let totalPotentialWin, totalStake: Double?
}

enum SBKEventsBetPlacedEventType: String {
    case sportsbookBetPlaced
}
