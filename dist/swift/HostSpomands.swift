// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let hostSpomands = try HostSpomands(json)

import Foundation

/// Signal to instruct the subscriber (Sportsbook embed app) to perform a navigation to a
/// given URL
// MARK: - HostSpomands
struct HostSpomands {
    let kind: Kind
    let payload: Payload
    let type: TypeEnum
}

/// Identifies the message as being a Command
enum Kind: String {
    case command
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

enum TypeEnum: String {
    case hostNavigate
}
