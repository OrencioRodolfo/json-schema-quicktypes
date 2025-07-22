// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let hostEventsPerfornalDetailsUpdatedEvent = try HostEventsPerfornalDetailsUpdatedEvent(json)
//   let hostEventsWalletUpdatedEvent = try HostEventsWalletUpdatedEvent(json)

import Foundation

/// Triggered when user's personal details get changed in My Account
// MARK: - HostEventsPerfornalDetailsUpdatedEvent
struct HostEventsPerfornalDetailsUpdatedEvent {
    let kind: Kind
    let meta: HostEventsPerfornalDetailsUpdatedEventMeta
    let payload: HostEventsPerfornalDetailsUpdatedEventPayload
    /// Defines the UID for this event
    let type: HostEventsPerfornalDetailsUpdatedEventType
}

/// Identifies the message as being an Event
enum Kind: String {
    case event
}

// MARK: - HostEventsPerfornalDetailsUpdatedEventMeta
struct HostEventsPerfornalDetailsUpdatedEventMeta {
    let origin: Origin?
}

/// Identifies 'Host app' as the origin
enum Origin: String {
    case host
}

// MARK: - HostEventsPerfornalDetailsUpdatedEventPayload
struct HostEventsPerfornalDetailsUpdatedEventPayload {
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

enum HostEventsPerfornalDetailsUpdatedEventType: String {
    case hostPersonalDetailsUpdated
}

/// Triggered when wallets get updated in host app
// MARK: - HostEventsWalletUpdatedEvent
struct HostEventsWalletUpdatedEvent {
    let kind: Kind
    let meta: HostEventsWalletUpdatedEventMeta
    let payload: HostEventsWalletUpdatedEventPayload
    /// Defines the UID for this event
    let type: HostEventsWalletUpdatedEventType
}

// MARK: - HostEventsWalletUpdatedEventMeta
struct HostEventsWalletUpdatedEventMeta {
    let origin: Origin?
}

// MARK: - HostEventsWalletUpdatedEventPayload
struct HostEventsWalletUpdatedEventPayload {
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

enum HostEventsWalletUpdatedEventType: String {
    case hostWalletUpdated
}
