# jvandior Project Documentation

## Project Overview

jvandior is a programming language written in Java. It's a multi-module Gradle project that demonstrates a simple language implementation with string processing capabilities. The project is structured as a multi-project build with three main modules: `app`, `list`, and `utilities`.

### Architecture
- **app**: Main application module containing the entry point and core logic
- **list**: Custom LinkedList implementation used throughout the project
- **utilities**: String manipulation utilities for processing text
- **buildSrc**: Contains custom Gradle build logic and conventions

### Key Features
- Custom LinkedList data structure implementation
- String splitting and joining utilities
- Integration with Apache Commons Text library
- Modular architecture with clear separation of concerns

## Building and Running

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Gradle (wrapper provided)

### Build Commands
```bash
# Build the entire project
./gradlew build

# Run the application
./gradlew run

# Run tests
./gradlew test

# Clean build artifacts
./gradlew clean
```

### Manual Execution
After building, you can run the application directly:
```bash
java -jar app/build/libs/app.jar
```

## Development Conventions

### Project Structure
- All source code follows the standard Maven/Gradle directory structure
- Java packages follow the `org.example` namespace (generated structure)
- Modules are organized by functionality (data structures, utilities, main app)

### Dependencies
- Uses Apache Commons Text library for advanced string manipulation
- Leverages Gradle's version catalogs for dependency management
- Modular dependencies between project modules

### Code Style
- Standard Java naming conventions
- Clear separation between data structures, utilities, and application logic
- Well-commented code with JavaDoc-style comments

## Module Details

### App Module
The main application module contains:
- `App.java`: Entry point of the application
- `MessageUtils.java`: Simple message utility class

The application processes a hardcoded message "Hello      World!" by:
1. Splitting it using the custom string utilities
2. Joining the tokens back together
3. Capitalizing the result using Apache Commons Text

### List Module
Implements a custom `LinkedList` data structure with:
- Basic operations: add, remove, get, size
- Internal Node class for linked list nodes
- Proper handling of edge cases and exceptions

### Utilities Module
Provides string processing utilities:
- `StringUtils.java`: Public interface for string operations
- `SplitUtils.java` and `JoinUtils.java`: Implementation classes
- Integration with the custom LinkedList implementation

## Testing
The project includes unit tests in the standard `src/test` directories for each module. Tests can be run with the `./gradlew test` command.

## Configuration
- Gradle configuration is stored in `.gradle` directory
- Build settings in `settings.gradle.kts`
- Project-wide properties in `gradle.properties`
- Version catalogs in `gradle/libs.versions.toml`