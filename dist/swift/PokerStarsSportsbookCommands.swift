// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let sBKCommandsDepositCommand = try SBKCommandsDepositCommand(json)
//   let sBKCommandsLoginCommand = try SBKCommandsLoginCommand(json)
//   let sBKCommandsNavigateCommand = try SBKCommandsNavigateCommand(json)

import Foundation

/// Triggered when a user cashes out a bet in My Bets
// MARK: - SBKCommandsDepositCommand
struct SBKCommandsDepositCommand {
    let kind: Kind
    let meta: SBKCommandsDepositCommandMeta
    /// Defines the UID for this event
    let type: SBKCommandsDepositCommandType
}

/// Identifies the message as being a Command
enum Kind: String {
    case command
}

// MARK: - SBKCommandsDepositCommandMeta
struct SBKCommandsDepositCommandMeta {
    let origin: Origin?
}

/// Identifies 'Sportsbook' as the origin
enum Origin: String {
    case sportsbook
}

enum SBKCommandsDepositCommandType: String {
    case sportsbookDeposit
}

/// Triggered when a user cashes out a bet in My Bets
// MARK: - SBKCommandsLoginCommand
struct SBKCommandsLoginCommand {
    let kind: Kind
    let meta: SBKCommandsLoginCommandMeta
    /// Defines the UID for this event
    let type: SBKCommandsLoginCommandType
}

// MARK: - SBKCommandsLoginCommandMeta
struct SBKCommandsLoginCommandMeta {
    let origin: Origin?
}

enum SBKCommandsLoginCommandType: String {
    case sportsbookLogin
}

/// Signal to instruct the subscriber (PokerStart host app) to perform a navigation to a
/// given URL
// MARK: - SBKCommandsNavigateCommand
struct SBKCommandsNavigateCommand {
    let kind: Kind
    let payload: Payload
    let type: SBKCommandsNavigateCommandType
}

// MARK: - Payload
struct Payload {
    let target: Target
    let url: String
}

enum Target: String {
    case external
    case targetInternal
}

enum SBKCommandsNavigateCommandType: String {
    case sportsbookNavigate
}
