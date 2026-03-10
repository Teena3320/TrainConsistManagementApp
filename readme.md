# UC11: Validate Train ID & Cargo Codes (Regex)
## Drawback of UC10
Assumes valid input.
## Goal
Validate Train ID & Cargo Code formats using regex.
## Actor
User
## Flow

User enters ID
Regex pattern compiled
Matcher applied
Display valid/invalid

## Key Concepts Used

Pattern
Matcher
matches()

## Key Requirements

Train ID: TRN-\d{4}
Cargo Code: PET-[A-Z]{2}

## Key Benefits

Ensures data integrity
Prevents malformed input
