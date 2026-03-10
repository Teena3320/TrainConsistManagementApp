# UC14: Handle Invalid Bogie Capacity (Custom Exception)
## Drawback of UC13
Assumes valid capacity values.
## Goal
Throw custom exception on invalid capacity.
## Actor
User
## Flow

User creates bogie
Validate capacity
Throw if <= 0
Prevent invalid creation

## Key Concepts Used

Custom checked exception
throw / throws
Fail-fast validation

## Key Requirements

InvalidCapacityException class

## Key Benefits

Prevents corrupted bogies
Teaches defensive programming
