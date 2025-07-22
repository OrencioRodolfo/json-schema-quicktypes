gen_types: gen_typescript gen_swift gen_kotlin gen_java

gen_typescript:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --just-types -o dist/typescript/HostSportsbookEvents.ts
	npx quicktype -s schema api-spec/host-events/*.json --just-types -o dist/typescript/HostEvents.ts
	npx quicktype -s schema api-spec/host-commands/*.json --just-types -o dist/typescript/HostCommands.ts

gen_swift:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --lang swift --just-types -o dist/swift/HostSportsbookEvents.swift
	npx quicktype -s schema api-spec/host-events/*.json --lang swift --just-types -o dist/swift/HostSponts.swift
	npx quicktype -s schema api-spec/host-commands/*.json --lang swift --just-types -o dist/swift/HostSpomands.swift

gen_kotlin:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --lang kotlin -o dist/kotlin/HostSportsbookEvents.kt
	npx quicktype -s schema api-spec/host-events/*.json --lang kotlin -o dist/kotlin/HostEvents.kt
	npx quicktype -s schema api-spec/host-commands/*.json --lang kotlin -o dist/kotlin/HostCommands.kt
  
gen_java:
	npx quicktype -s schema api-spec/sportsbook-events/*.json --lang java --just-types -o dist/java/HostSportsbookEvents.java
	npx quicktype -s schema api-spec/host-events/*.json --lang java --just-types -o dist/java/HostSpents.java
	npx quicktype -s schema api-spec/host-commands/*.json --lang java --just-types -o dist/java/HostSpmmands.java
  
  gen_dist_folder:
	mkdir dist
	mkdir dist/kotlin
	mkdir dist/java
	mkdir dist/typescript
	mkdir dist/swift