# CS 1632 Midterm 1 Exam Study Guide - Fall 2019

The midterm is on OCT 9 (Wed), 2019.

The midterm will cover everything we have covered up to Writing Testable Code on 2 OCT (i.e., nothing from Pairwise and Combinatorial Testing will be included).  I recommend you review the slides and the textbook (See syllabus.md for which chapters are required reading.  The reading is also on the last slide of each lecture).  You are also expected to have completed Exercises 1 and 2, and be able to answer related questions.

The exam will consist of these types of questions:
  * Multiple choice questions
  * Fill in the blank questions
  * Short answer questions (explain a concept, discuss pros/cons, etc.)
  * Code tracing questions
  * JUnit coding questions

Here are the key topics to study in preparation for the test.

## TESTING THEORY AND TERMINOLOGY
* Equivalence class partitioning
* Boundary and interior values
* Base, Edge, and Corner cases
* Static vs Dynamic testing
  * Know the differences and examples of each
* Black/White/Grey box testing
  * Know the differences and examples of each

## REQUIREMENTS ANALYSIS
* What makes a good or bad requirement?
* Testability - requirements must be:
  * Complete, consistent, unambiguous, quantitative, feasible
* Functional Requirements vs Non-Functional (Quality Attributes)
  * Be able to define and write your own
* Traceability Matrices
  * Be able to define and write your own

## TEST PLANS
* Given a list of requirements, be able to write a test plan
* Terminology: test cases, test plans, test suites, test runs
* Verification vs validation

## DEFECT REPORTING
* Be prepared to report a defect based on a test case
* Remember the defect template:
  * SUMMARY, DESCRIPTION, REPRODUCTION STEPS, EXPECTED BEHAVIOR, OBSERVED BEHAVIOR
  * Optionally: SEVERITY/IMPACT, NOTES
  * Levels of severity: CRITICAL, MAJOR, NORMAL, MINOR, TRIVIAL
* Enhancements vs defects
  * Be prepared to argue if something is a defect or enhancement
* Coding mistakes vs defects

## AUTOMATED TESTING
* Pros and cons of automated testing
* Unit tests vs system/acceptance/integration tests
* Writing automated tests:
  * PRECONDITIONS, POSTCONDITIONS, EXECUTION STEPS, INPUT/OUTPUT VALUES

## UNIT TESTING
* Be prepared to write some unit tests in JUnit
  * Names of JUnit methods will be provided, but you should know _how_ to use them
* Stubs, test doubles, mocks, and behavior verification
* Testing private methods
  * You will NOT need to use/know about reflection
  * Why/why not one might not test them?

## BREAKING SOFTWARE
* Be prepared to think of happy path vs edge case testing
* What are various ways that software can break?

## TDD
* The red-green-refactor loop
* Principles of TDD:
  * YAGNI
  * KISS
  * "Fake it 'til you make it"
  * Avoid interdependency
  * Avoid slow tests
* Benefits and drawbacks of TDD
  * When to use it?
  * When not to use it?

## WRITING TESTABLE CODE
* Basic strategies for testable code
  * The DRY Principle
  * TUFs and TUCs
  * Make it repeatable
* Dealing with legacy code
  * Pinning tests
  * Seams

