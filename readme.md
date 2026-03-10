# Use Case 1: User Registration
## Goal
Allow a new user to register by entering email, name, and password with early validation.

## Responsibilities
Read user input (email, name, password)
Validate required fields (no blank email)
Validate correct email format (early abort if invalid)
Trigger registration flow via UserService.registerUser()
Handle validation failures using exceptions

## Demonstrated Concepts
Basic console input reading
Early validation (fail-fast)
Exception handling (invalid/blank email)
Separation of concerns (UI → Service → Repository)
Object creation through service layer
