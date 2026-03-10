# UC3: Track Unique Bogie IDs (Set – HashSet)
## Drawback of UC2
List allows duplicates.
## Goal
Ensure no duplicate bogie IDs are added.
## Actor
User
## Flow
User enters IDs
System inserts into HashSet
Duplicates ignored
Unique IDs displayed

## Key Concepts Used
HashSet
Set Interface
Automatic deduplication
Unordered storage

## Key Requirements
Create HashSet<String>
Add duplicates intentionally
Print final set

## Key Benefits
Enforces uniqueness
Prevents data corruption
Teaches Set usage
