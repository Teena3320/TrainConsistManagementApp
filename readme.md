# UC1: Initialize Train and Display Consist Summary
## Goal
Initialize the Train Consist Management App and display the initial state of the train.
## Actor
User
## Flow
User runs the program
Application prints welcome message
Train consist is initialized
The initial bogie count is displayed
Program continues

## Key Concepts Used
Class
Main Method
Static keyword
ArrayList (dynamic list)
List Interface abstraction
Console Output
Dynamic Initialization

## Key Requirements
Create Train App class
Print welcome message
Initialize empty list using ArrayList
Display bogie count using size()

## Key Benefits
Introduces startup flow
Demonstrates dynamic collections
Creates foundation for further UCs

# UC2: Add Passenger Bogies to Train (ArrayList Operations)
## Drawback of UC1
No ability to add/remove bogies.
## Goal
Allow dynamic insertion and removal of passenger bogies using ArrayList.
## Actor
User
## Flow
User runs program
Passenger bogies added
Bogies displayed
Bogie removed
Existence checked
Program continues

## Key Concepts Used
ArrayList
add(), remove(), contains()
CRUD operations
Insertion order preservation

## Key Requirements
Create ArrayList<String>
Add Sleeper, AC Chair, First Class
Remove AC Chair
Check if Sleeper exists
Display final list

## Key Benefits
Demonstrates list management
CRUD on collections
Visualizes attachment/detachment

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

# UC4: Maintain Ordered Bogie IDs (LinkedList)
## Drawback of UC3
HashSet does not maintain order.
## Goal
Preserve sequence and support fast insert/remove.
## Actor
User
## Flow
Add bogies
Insert Pantry Car in middle
Remove first and last bogie
Display final ordered consist

## Key Concepts Used
LinkedList
addFirst(), addLast(), removeFirst(), removeLast()
Node structure concept
Order preservation

## Key Requirements
Create LinkedList
Add Engine, Sleeper, AC, Cargo, Guard
Insert Pantry Car at index 2
Remove first & last
Display final consist

## Key Benefits
Models real train chaining
Efficient insert/delete
Visualizes node-based behavior

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

# UC6: Map Bogie to Capacity (HashMap)
## Drawback of UC5
Train only stores names—no attributes.
## Goal
Map bogie to capacity using key–value pairs.
## Actor
User
## Flow

Create map
Insert capacities
Iterate & display

## Key Concepts Used

HashMap
Key–value association
entrySet iteration
Fast lookup

## Key Requirements

HashMap<String, Integer>
Map Sleeper, AC Chair, First Class
Display capacities

## Key Benefits

Real-world attribute mapping
Fast validation
Supports analytics

# UC7: Sort Bogies by Capacity (Comparator)
## Drawback of UC6
No ordering for planning.
## Goal
Sort bogies by capacity using Comparator.
## Actor
User
## Flow

Create Bogie objects
Store in List
Sort using Comparator
Display sorted list

## Key Concepts Used

Comparator
Custom object sorting
Lambda expressions
Separation of data & logic

## Key Requirements

Create Bogie class
Use Comparator.comparingInt()
Display sorted bogies

## Key Benefits

Teaches object-based sorting
Supports planning logic

# UC8: Filter Passenger Bogies Using Streams
## Drawback of UC7
Sorting ≠ selection.
## Goal
Filter bogies using Stream API.
## Actor
User
## Flow

Convert list to stream
Apply filter condition
Collect results
Display filtered list

## Key Concepts Used

Stream API
filter()
Lambda expressions
Declarative programming

## Key Requirements

Filter by capacity > 60
Display result

## Key Benefits

Reduces boilerplate
Enhances readability

# UC9: Group Bogies by Type (groupingBy)
## Drawback of UC8
Filtering creates flat list, no categorization.
## Goal
Group bogies using Collectors.groupingBy.
## Actor
User
## Flow

Create list
Stream & group
Store result in Map
Display groups

## Key Concepts Used

groupingBy()
Aggregation
Structured transformation

## Key Requirements

Group by bogie name
Print grouped result

## Key Benefits

Supports reporting
Creates hierarchical structure

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

# UC12: Safety Compliance Check for Goods Bogies
## Drawback of UC11
Goods bogies not validated for safety.
## Goal
Enforce cargo–bogie safety rules using streams.
## Actor
User
## Flow

Create bogies
Stream & apply safety rule
allMatch() to verify
Display compliance status

## Key Concepts Used

allMatch()
Lambda-based rule checking
Short-circuit evaluation

## Key Requirements

Cylindrical → must carry Petroleum

## Key Benefits

Prevents unsafe configurations
Encodes business rules

# UC13: Performance Comparison (Loops vs Streams)
## Drawback of UC12
Assumes streams always faster.
## Goal
Compare loop vs stream filtering using nanoTime().
## Actor
User
## Flow

Create dataset
Time loop filter
Time stream filter
Display durations

## Key Concepts Used

System.nanoTime()
Benchmarking
Evidence-based optimization

## Key Requirements

Measure both approaches

## Key Benefits

Teaches performance awareness

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

# UC15: Safe Cargo Assignment Using try–catch–finally
## Drawback of UC14
Construction-time validation only.
## Goal
Safely handle runtime cargo assignment errors.
## Actor
User
## Flow

Assign cargo
Check compatibility
Throw runtime exception
Catch & display message
finally executes cleanup

## Key Concepts Used

try-catch-finally
Runtime exceptions
Defensive error handling

## Key Benefits

Prevents app crashes
Ensures safe operations

# UC16: Sort Bogie Capacities (Bubble Sort)
## Goal
Manually sort capacities using Bubble Sort.
## Actor
User
## Flow

Create array
Compare adjacent values
Swap when required
Repeat until sorted
Display final result

## Key Concepts Used

Bubble Sort
Nested loops
Swapping logic

## Key Requirements

No Arrays.sort(), no Collections.sort()

## Key Benefits

Teaches algorithmic fundamentals

# UC17: Sort Bogie Names Using Arrays.sort()
## Goal
Alphabetically sort bogie names using Arrays.sort().
## Actor
User
## Flow

Provide names
Call Arrays.sort()
Display sorted list

## Key Concepts Used

Arrays.sort()
Natural ordering
Efficient O(n log n) sorting

## Key Benefits

Demonstrates library-level optimized sorting

# UC18: Linear Search for Bogie ID
## Goal
Locate bogie ID using linear search.
## Actor
User
## Flow

Input bogie IDs
Input search key
Traverse sequentially
Stop on match
Display result

## Key Concepts Used

Linear search
O(n) scanning

## Key Benefits

Simple & reliable search

# UC19: Binary Search for Bogie ID
## Goal
Efficiently search sorted bogie IDs.
## Actor
User
## Flow

Sort IDs
Perform binary search
Compare mid element
Halve search range
Display result

## Key Concepts Used

Binary Search
Divide‑and‑conquer
O(log n) complexity

## Key Benefits

Fast lookup for large datasets

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
