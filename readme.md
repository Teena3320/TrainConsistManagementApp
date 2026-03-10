# UC20: Exception Handling During Search Operations
## Goal
Prevent search on empty train using fail‑fast behavior.
## Actor
User
## Flow

User starts search
System checks if list empty
Throw IllegalStateException
Stop execution
Display meaningful message

## Key Concepts Used

Fail‑fast validation
IllegalStateException
Defensive programming

## Key Benefits

Prevents invalid operations
Maintains system reliability
