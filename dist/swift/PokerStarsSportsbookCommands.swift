// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let betCashoutEvent = try BetCashoutEvent(json)

import Foundation

/// Triggered when a user cashes out a bet in My Bets
// MARK: - BetCashoutEvent
struct BetCashoutEvent {
    /// Identifies this message as a Command
    let kind: Kind?
    let payload: Payload
    let type: TypeEnum
}

enum Kind: String {
    case command
}

// MARK: - Payload
struct Payload {
    let betDelay: Double?
    let betID: String
    let cashedOutQuote: Double
    let cashOutToken: String?
    let quote: Double?
}

enum TypeEnum: String {
    case sportsbookBetCashout
}
