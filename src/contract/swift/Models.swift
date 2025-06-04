// This file was generated from JSON Schema using quicktype, do not modify it directly.
// To parse the JSON, add this file to your project and do:
//
//   let models = try Models(json)

import Foundation

// MARK: - Models
struct Models {
    let message: Message
}

// MARK: - Message
struct Message {
    let a: A
    let greeting: String
    let instructions: [String]
}

// MARK: - A
struct A {
    let b, c: Int
    let d: String?
}
