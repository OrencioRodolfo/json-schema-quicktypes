// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let pSEventsPerfornalDetailsUpdatedEvent = try PSEventsPerfornalDetailsUpdatedEvent(json)
//   let pSEventsWalletUpdatedEvent = try PSEventsWalletUpdatedEvent(json)

import Foundation

/// Triggered when user's personal details get changed in My Account
// MARK: - PSEventsPerfornalDetailsUpdatedEvent
struct PSEventsPerfornalDetailsUpdatedEvent {
    let kind: Kind
    let meta: PSEventsPerfornalDetailsUpdatedEventMeta
    let payload: PSEventsPerfornalDetailsUpdatedEventPayload
    /// Defines the UID for this event
    let type: PSEventsPerfornalDetailsUpdatedEventType
}

/// Identifies the message as being an Event
enum Kind: String {
    case event
}

// MARK: - PSEventsPerfornalDetailsUpdatedEventMeta
struct PSEventsPerfornalDetailsUpdatedEventMeta {
    let origin: Origin?
}

/// Identifies 'PokerStars' as the origin
enum Origin: String {
    case pokerstars
}

// MARK: - PSEventsPerfornalDetailsUpdatedEventPayload
struct PSEventsPerfornalDetailsUpdatedEventPayload {
    let language: Language?
    let timezone: Timezone?
}

// MARK: - Language
struct Language {
    let new, old: String?
}

// MARK: - Timezone
struct Timezone {
    let new, old: String?
}

enum PSEventsPerfornalDetailsUpdatedEventType: String {
    case pokerstarsPersonalDetailsUpdated
}

/// Triggered when wallets get updated in PokerStars app
// MARK: - PSEventsWalletUpdatedEvent
struct PSEventsWalletUpdatedEvent {
    let kind: Kind
    let meta: PSEventsWalletUpdatedEventMeta
    let payload: PSEventsWalletUpdatedEventPayload
    /// Defines the UID for this event
    let type: PSEventsWalletUpdatedEventType
}

// MARK: - PSEventsWalletUpdatedEventMeta
struct PSEventsWalletUpdatedEventMeta {
    let origin: Origin?
}

// MARK: - PSEventsWalletUpdatedEventPayload
struct PSEventsWalletUpdatedEventPayload {
    let details: Details
    let name: Name
}

// MARK: - Details
struct Details {
    let amount: Double
    let availabletobet, bonus, bonuses, deposits: Double?
    let real, winnings: Double?
}

enum Name: String {
    case arcadeBonus
    case bingo
    case bingoBonus
    case boostTokens
    case casino
    case casinoBonus
    case casinoBonusCash
    case casinoFunBonus
    case exchangeBonusCash
    case fantasyBonus
    case frozen
    case gamesBonus
    case gamingBonus
    case gamingBonusTotal
    case ita
    case main
    case mainExposure
    case moneyBackTokens
    case poker
    case rtBonus
    case sportsbookBonus
    case sportsbookBonusCash
    case sportsbookBonusWagering
    case total
    case unknownValue
    case vegasBonus
    case virtualsports
    case virtualsportsBonusCash
    case virtualsportsBonusWagering
    case xg
}

enum PSEventsWalletUpdatedEventType: String {
    case pokerstarsWalletUpdated
}
