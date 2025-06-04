// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let pokerStarsSportsbookCommands = try PokerStarsSportsbookCommands(json)

import Foundation

/// Triggered when user taps 'Login to place bet' CTA in Betslip
// MARK: - PokerStarsSportsbookCommands
struct PokerStarsSportsbookCommands {
    let payload: Payload
    let type: TypeEnum
}

// MARK: - Payload
struct Payload {
    let betID: Double
    let betPlacedTime, betReceiptID: String
    let totalPotentialWin, totalStake: Double
}

enum TypeEnum: String {
    case sportsBetPlacement
}
