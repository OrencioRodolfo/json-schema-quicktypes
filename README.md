# Sportsbook Web ↔ Native app Messaging API

This repository defines the API specification for the messages exchanged between the **Sportsbook web app** and the **PokerStars native apps** (iOS/Android and Desktop). It uses [JSON Schema](https://json-schema.org/) to describe both **commands** and **events** in a platform-agnostic, machine-readable format.

## Overview

This schema defines:

- ✅ **Events**: notifications about things that happened (e.g., bet placed, wallet updated, etc)
- ✅ **Commands**: instructions to trigger an action (e.g., take user to login screen, navigate to Help Centre page, etc)

Both the **web** and **native** sides can act as producer or consumer of events and commands.

---

# API Spec

Schemas are organized by **Kind** (Event or Command) and **Producer** (PokerStars or Sportsbook apps), and all messages follow a standardized Envelope that helps keeping consistency in data structures.

Full spec documentation can be found at [docs/index.md](docs/index.md).

# Scripts

## API Documentation
Static documentation is generated with json-schema-static-docs, making the API easier to explore.

To generate docs:
```bash
npm install
npm run gen:docs
```

## Code Generation

[Quicktype](https://quicktype.io/) picks on JSON Schemas and generates strongly typed message models in:

- 🟦 TypeScript
- 🟨 Java
- 🟧 Kotlin
- 🍎 Swift

This allows all platforms to deserialize and validate messages with confidence.

To generate types:
```bash
npm install
npm run gen:types
```

