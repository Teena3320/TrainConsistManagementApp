# UC10: Count Total Seats in Train (reduce)
## Drawback of UC9
Groups give structure, not totals.
## Goal
Compute total seating capacity using reduce().
## Actor
User
## Flow

Convert list to stream
Map to capacity
Reduce sum
Display total

## Key Concepts Used

map()
reduce()
Method references

## Key Requirements

Use reduce(0, Integer::sum)

## Key Benefits

Functional aggregation
Useful operational metric
