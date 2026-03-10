# UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
## Drawback of UC4
Stack/LIFO handling missing.
## Goal
Maintain insertion order while enforcing uniqueness.
## Actor
User
## Flow

User adds bogies
LinkedHashSet stores them
Order preserved

## Key Concepts Used

LinkedHashSet
Insertion order preservation
Automatic deduplication

## Key Requirements

Create LinkedHashSet<String>
Add Engine, Sleeper, Cargo, Guard
Add duplicate Sleeper
Display final formation

## Key Benefits

Safe & predictable formation
Combines order + uniqueness
