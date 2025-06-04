gen_types: gen_typescript gen_swift gen_kotlin gen_java

gen_typescript:
	npx quicktype -s schema api-spec/pssbk-events/*.json --just-types -o dist/nodejs/PokerStarsSportsbookEvents.ts
	npx quicktype -s schema api-spec/pssbk-commands/*.json --just-types -o dist/nodejs/PokerStarsSportsbookCommands.ts

gen_swift:
	npx quicktype -s schema api-spec/pssbk-events/*.json --lang swift --just-types -o dist/swift/PokerStarsSportsbookEvents.swift
	npx quicktype -s schema api-spec/pssbk-commands/*.json --lang swift --just-types -o dist/swift/PokerStarsSportsbookCommands.swift

gen_kotlin:
	npx quicktype -s schema api-spec/pssbk-events/*.json --lang kotlin -o dist/kotlin/PokerStarsSportsbookEvents.kt
	npx quicktype -s schema api-spec/pssbk-commands/*.json --lang kotlin -o dist/kotlin/PokerStarsSportsbookCommands.kt
  
gen_java:
	npx quicktype -s schema api-spec/pssbk-events/*.json --lang java --just-types -o dist/java/PokerStarsSportsbookEvents.java
	npx quicktype -s schema api-spec/pssbk-commands/*.json --lang java --just-types -o dist/java/PokerStarsSportsbookCommands.java
  