// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let hostSportsbookEvents = try HostSportsbookEvents(json)

import Foundation

/// Triggered when a user places a transaction like bet placed or bet cashed out successfuly
// MARK: - HostSportsbookEvents
struct HostSportsbookEvents {
    let kind: Kind
    let meta: Meta
    /// Defines the UID for this event
    let type: TypeEnum
}

/// Identifies the message as being an Event
enum Kind: String {
    case event
}

// MARK: - Meta
struct Meta {
    let origin: Origin?
}

/// Identifies 'Sportsbook' as the origin
enum Origin: String {
    case sportsbook
}

enum TypeEnum: String {
    case sportsbookTransaction
}
