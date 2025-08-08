# Kotlin Study Guide 🎯

A comprehensive, hands-on learning repository for mastering Kotlin fundamentals and algorithms through practice. This project follows a learn-by-doing approach similar to JetBrains' Kotlin Puzzlers, where you implement solutions to make failing tests pass.

## 🎯 Learning Objectives

- Master Kotlin syntax and language features
- Practice algorithmic thinking and problem-solving
- Understand object-oriented programming concepts in Kotlin
- Learn coroutines and asynchronous programming
- Implement classic algorithms and data structures

## 📁 Project Structure

```
src/
├── main/kotlin/
│   ├── easy/          # Basic Kotlin concepts
│   ├── medium/        # OOP, coroutines, advanced features
│   └── hard/          # Algorithms and complex problems
└── test/kotlin/
    ├── easy/          # Tests for easy problems
    ├── medium/        # Tests for medium problems
    └── hard/          # Tests for hard problems
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Git

### Setup
1. Clone this repository:
   ```bash
   git clone <your-repository-url>
   cd kotlin-study-guide
   ```

2. Run all tests to see what needs to be implemented:
   ```bash
   ./gradlew test
   ```
   
   All tests will initially fail - this is expected! Your goal is to implement the functions to make them pass.

3. Start with easy problems and work your way up.

## 📚 Difficulty Levels

### 🟢 Easy Level
**Focus:** Variables, functions, control flow, collections, null safety, basic string operations

Problems included:
- **ReverseString**: Implement string reversal without built-in functions
- **FindMaxNumber**: Find maximum in a list without using max()
- **CountVowels**: Count vowels in a string (case-insensitive)

### 🟡 Medium Level
**Focus:** OOP, data classes, higher-order functions, coroutines basics, collections transformations

Problems included:
- **GroupAnagrams**: Group words that are anagrams of each other
- **PersonDataClass**: Create a comprehensive data class with computed properties and factory methods
- **SimpleCoroutine**: Learn coroutine basics with async operations

### 🔴 Hard Level
**Focus:** Algorithms, recursion, graph theory, performance optimization

Problems included:
- **MergeSort**: Implement the classic divide-and-conquer sorting algorithm
- **BinarySearch**: Implement efficient search in sorted arrays
- **FindShortestPath**: Implement Dijkstra's algorithm and BFS for graph traversal

## 🧪 How to Solve Problems

### Step-by-Step Approach:

1. **Pick a problem**: Start with easy difficulty
2. **Read the requirements**: Check the function signature and comments in the source file
3. **Understand the tests**: Look at the test file to understand expected behavior
4. **Implement the solution**: Write your code in the corresponding source file
5. **Test your solution**: Run tests for that specific problem
6. **Iterate**: Fix any failing tests

### Running Tests

```bash
# Run all tests
./gradlew test

# Run tests for a specific difficulty
./gradlew test --tests "easy.*"
./gradlew test --tests "medium.*"
./gradlew test --tests "hard.*"

# Run a specific test class
./gradlew test --tests "ReverseStringTest"
```

### Example Workflow

Let's solve the ReverseString problem:

1. Open `src/main/kotlin/easy/ReverseString.kt`
2. Read the TODO comments and function signature
3. Check `src/test/kotlin/easy/ReverseStringTest.kt` to understand the expected behavior
4. Implement your solution:
   ```kotlin
   fun reverseString(input: String): String {
       return input.reversed() // Simple solution, but try without using built-in!
   }
   ```
5. Run the test: `./gradlew test --tests "ReverseStringTest"`
6. See all tests pass! ✅

## 💡 Learning Tips

- **Start simple**: Begin with easy problems to build confidence
- **Read tests carefully**: Tests show exactly what's expected
- **Don't use built-ins when asked**: Many problems ask you to implement without using built-in functions - this is for learning!
- **Understand time complexity**: Especially important for hard problems
- **Experiment**: Try different approaches and see what works
- **Use Kotlin idioms**: Learn to write idiomatic Kotlin code

## 🏃‍♂️ Progress Tracking

Create a checklist to track your progress:

### Easy Level Progress
- [ ] ReverseString
- [ ] FindMaxNumber  
- [ ] CountVowels

### Medium Level Progress
- [ ] GroupAnagrams
- [ ] PersonDataClass
- [ ] SimpleCoroutine

### Hard Level Progress
- [ ] MergeSort
- [ ] BinarySearch
- [ ] FindShortestPath

## 🎓 What You'll Learn

### Kotlin Language Features
- Variables and functions
- Null safety and safe calls
- Data classes and sealed classes  
- Extension functions
- Higher-order functions and lambdas
- Coroutines and async programming

### Algorithmic Concepts
- Sorting algorithms (merge sort)
- Searching algorithms (binary search)
- Graph algorithms (shortest path, BFS/DFS)
- Time and space complexity analysis
- Recursion and divide-and-conquer

### Best Practices
- Writing clean, readable Kotlin code
- Testing and test-driven development
- Error handling and edge cases
- Performance considerations

## 🔧 Tools and Dependencies

- **Kotlin 2.0.0**: Latest Kotlin version
- **JUnit 5**: Modern testing framework
- **Kotlinx Coroutines**: For asynchronous programming
- **Gradle**: Build tool with Kotlin DSL

## 🤝 Contributing

Feel free to:
- Add new problems and tests
- Improve existing problems
- Fix bugs or typos
- Suggest better test cases

## 📖 Additional Resources

- [Official Kotlin Documentation](https://kotlinlang.org/docs/)
- [Kotlin Koans](https://kotlinlang.org/docs/koans.html)
- [Algorithm Visualizations](https://visualgo.net/)
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)

---

Happy coding! 🚀 Remember, the goal is learning through doing. Take your time, experiment, and most importantly, have fun solving these challenges!