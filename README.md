# Counter with exception handling

Java exercise from Santander Bootcamp 2024 for practicing control flow and custom exceptions.

## Behavior

Reads two integers and prints a sequence whose length is the difference between them. If the first value is greater than the second, it throws and handles a custom exception.

## Run locally

With a JDK installed:

```bash
javac -encoding UTF-8 -d out src/Contador.java src/ParametrosInvalidosException.java
java -cp out Contador
```

## Example

Inputs 2 and 5 produce the numbers 1, 2 and 3. Equal inputs produce an empty sequence, following the implemented rule.

## Concepts practiced

Scanner, loops, methods, checked exceptions and parameter validation. This study project has no persistence or external services.
