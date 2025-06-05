gen_types: gen_typescript gen_swift gen_kotlin gen_java

gen_typescript:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --just-types -o dist/nodejs/PokerStarsSportsbookEvents.ts
	npx quicktype -s schema api-spec/sportsbook-commands/*.json --just-types -o dist/nodejs/PokerStarsSportsbookCommands.ts
	npx quicktype -s schema api-spec/pokerstars-events/*.json --just-types -o dist/nodejs/PokerStarsEvents.ts
	npx quicktype -s schema api-spec/pokerstars-commands/*.json --just-types -o dist/nodejs/PokerStarsCommands.ts

gen_swift:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --lang swift --just-types -o dist/swift/PokerStarsSportsbookEvents.swift
	npx quicktype -s schema api-spec/sportsbook-commands/*.json --lang swift --just-types -o dist/swift/PokerStarsSportsbookCommands.swift
	npx quicktype -s schema api-spec/pokerstars-events/*.json --lang swift --just-types -o dist/swift/PokerStarsSponts.swift
	npx quicktype -s schema api-spec/pokerstars-commands/*.json --lang swift --just-types -o dist/swift/PokerStarsSpomands.swift

gen_kotlin:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --lang kotlin -o dist/kotlin/PokerStarsSportsbookEvents.kt
	npx quicktype -s schema api-spec/sportsbook-commands/*.json --lang kotlin -o dist/kotlin/PokerStarsSportsbookCommands.kt
	npx quicktype -s schema api-spec/pokerstars-events/*.json --lang kotlin -o dist/kotlin/PokerStarsEvents.kt
	npx quicktype -s schema api-spec/pokerstars-commands/*.json --lang kotlin -o dist/kotlin/PokerStarsCommands.kt
  
gen_java:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --lang java --just-types -o dist/java/PokerStarsSportsbookEvents.java
	npx quicktype -s schema api-spec/sportsbook-commands/*.json --lang java --just-types -o dist/java/PokerStarsSportsbookCommands.java
	npx quicktype -s schema api-spec/pokerstars-events/*.json --lang java --just-types -o dist/java/PokerStarsSpents.java
	npx quicktype -s schema api-spec/pokerstars-commands/*.json --lang java --just-types -o dist/java/PokerStarsSpmmands.java
  