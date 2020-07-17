# Introduction To Java ☕ + Programming Fundamentals

![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https://github.com/anishLearnsToCode/java-wac-batch-32)
![made-with-java](https://img.shields.io/badge/Made%20with-Java-1f425f.svg)
[![license](https://img.shields.io/badge/LICENSE-MIT-<COLOR>.svg)](LICENSE)
[![hackerrank-java](https://img.shields.io/badge/hackerrank-java-1f72ff.svg)](https://github.com/anishLearnsToCode/hackerrank-java)
[![hackerrank-ds](https://img.shields.io/badge/hackerrank-Data%20Structures-1f72ff.svg)](https://github.com/anishLearnsToCode/hackerrank-data-structures)
[![hackerrank-algo](https://img.shields.io/badge/hackerrank-algorithms-1f72ff.svg)](https://github.com/anishLearnsToCode/hackerrank-algorithms)
[![hackerrank-interview-prep](https://img.shields.io/badge/hackerrank-Interview%20Preparation%20Kit-1f72ff.svg)](https://github.com/anishLearnsToCode/hackerrank-interview-preparation-kit)

<details>
    <summary><b>Workshop Timings</b></summary>
    Workshop Dates: 16th - 29th July 2020 (weekdays) <br>
    Workshop Timings: 12:00 AM - 3:30 PM (12 - 15.30) <br>
    Break Timings: 2:00 - 2:20 PM (14 - 14.20)
</details>

## Index
- [Introduction](#introduction)
- [Environment Setup](#environment-setup)
- [Day 1](#day-1)  
- [Day 2](#day-2)  
- [Day 3](#day-3)  
- [Day 4](#day-4)  
- [Day 5](#day-5)  
- [Day 6](#day-6)  
- [Day 7](#day-7)  
- [Day 8](#day-8)  
- [Day 9](#day-9)  
- [Day 10](#day-10)
- [Capstone Project](#capstone-project)  
- [Further Reading](#further-reading)
- [Future Path? What to do next? 🤔🐱‍🏍](#future-path)

## Introduction
Solutions to all sample problems on HackerRank under the 
[Java domain](https://www.hackerrank.com/domains/java) can be 
looked up [here](https://github.com/anishLearnsToCode/hackerrank-java).

Programming is a very hands process and is both an art as well as a science. We are
engineers and are required to create efficient solutions but at the same time our programs should be 
highly readable and flexible and all the other snappy terms which makes it an art as well.

To become proficient in this art, there are many resources, and books and tutorials. Each has it's merit
and making the first step in any direction is commendable, but the cardinal factor at the end of the day
will be you sitting down (or standing) and writing code. No book or resource can substitute that.

So, what are you waiting for 😀😉 - try as many questions (below or otherwise) as you can....  

Stalk your Instructor on 
[GitHub](https://github.com/anishLearnsToCode) &
[linkedIn](https://www.linkedin.com/in/anishsachdeva1998/).

## Environment Setup
we need to install and configure a few things before we can write and run any Java code. To write Java code we 
need the Java runtime environment (JRE) and the Java Development Kit. 

### 1. Install the Java Development Kit (JDK) 
JDK Version >= 1.8 is recommended i.e. Java version 8 or above is recommended for this course and personal 
development projects. Install Java for your OS from the 
[Oracle Website](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html).

To check that java has been correctly installed on your machine run the following command on your terminal:
```shell script
java -version
```

It should have an output akin to:
```shell script
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
```

Once that Java has been successfully installed, we need to install a code editor or IDE so that we can write 
programs and run them. I suggest using __VS Code__ if you prefer a Code editor over an IDE (or if you don't know the
difference between Code editor and IDE 😉). using a code editor will aso be less intensive on computing resources.

I personally prefer the __JetBrains IntelliJ IDEA__, but warning ⚠ it is a heavy software and might not run properly on 
all machines (especially laptops that are constrained for resources).

### 2. Installing VS Code (or go to step 3 - installing IntelliJ IDEA)
1. Download the setup from [here](https://code.visualstudio.com/).
2. Run the setup which is pretty straight forward. Just click next like 10 times and voila!

### 3. Installing JetBrains IntelliJ IDEA
1. You can either install the community edition (free) from [here](https://www.jetbrains.com/idea/download).
2. Or you can create an account on JetBrains if you have a university email address and then install the 
    [JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/).
3. You can easily manage JetBrains IDE's and projects using the ToolBox app. From the ToolBox app you can now install
    either IntelliJ IDEA Community Edition or Ultimate Edition.    

### 4. Installing git (Optional - Only required for Windows users)
This is an optional step of your getting started guide and can be skipped. Although installing git and using it
in your projects is highly recommended. For a learning path to learn git have a look at the 
[Future Path + Scope](#future-path) section.

Install git from the [git-scm](https://git-scm.com/downloads) website. Run the setup and click next like 10 times
and use the recommended settings for installation. 

There will be a section when it will ask the standard text editor and gie you an option between _Vim_ and _nano_. 
If you are not familiar with _Vim_ then opt for _nano_.

__IMPORTANT__ Opt for _nano_ if not familiar with _Vim_.

To check your installation of git check that git bash has been intalled and run the following command on your 
terminal.
```shell script
git --version
```

The output should be akin to 
```shell script
git version 2.24.1.windows.2
```

### 5. Writing your first Java Program
Open your text editor/IDE and create a new file `HelloWorld.java` and in that file copy paste the following code 
snippet.
```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

To run the code navigate to file in terminal and run the following commands.

```shell script
javac HelloWorld.java
java HelloWorld
Hello World # output
```

## Day 1
### Topics Covered
- [Hello World](src/day1/HelloWorld.java)
- [Comments](src/day1/Comments.java)
- [Data Types](src/day1/DataTypes.java)
- [Variable Names](src/day1/VariableNames.java)
- [Taking User Input](src/day1/UserInput.java)
- [Arithmetic Expressions](src/day1/ArithmeticExpressions.java)
- [Operators Short Syntax](src/day1/OperatorShortSyntax.java)
- [Logical Expressions](src/day1/LogicalExpressions.java)
- [If Else Statements](src/day1/IfElse.java)
- [Finding number is Even or Odd](src/day1/EvenOdd.java)
- [Ternary Operator](src/day1/TernaryOperator.java)
- [While Loops](src/day1/WhileLoops.java)
- [Sum N Natural Numbers](src/day1/SumNNaturalNumbers.java)
- [Factorial of a Number](src/day1/FactorialNumber.java)

### Sample Problems To Try
| Problem   | Source     |Solution Link|
|-----------|------------|-------------|
| [Welcome to Java](https://www.hackerrank.com/challenges/welcome-to-java/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/WelcomeToJava.java)
| [Java StdIn and StdOut I](https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaStdInAndStdOutI.java) |
| [Java If Else](https://www.hackerrank.com/challenges/java-if-else/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaIfElse.java) |
| [Data Types Problem](https://www.hackerrank.com/challenges/java-datatypes/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaDatatypes.java) |
| [Java Int To String](https://www.hackerrank.com/challenges/java-int-to-string/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaIntToString.java) |
| [Java Currency Formatter Problem](https://www.hackerrank.com/challenges/java-currency-formatter/problem)  | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaCurrencyFormatter.java) |
| [Java String Reverse](https://www.hackerrank.com/challenges/java-string-reverse/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaStringReverse.java) |

## Day 2
### Topics Covered
- [Hello World Once Again !](src/day2/HelloWorld.java)
- [While Loop](src/day2/While.java)
- [For Loops](src/day2/ForLoops.java)
- [Do While Loop](src/day2/DoWhile.java)
- [Sum N Natural Numbers](src/day2/SumNNaturalNumbers.java)
- [Sum of Squares of N natural Numbers](src/day2/SumNNaturalNumbersSquare.java)
- [Pattern Question 1](src/day2/Pattern1.java)
- [Pattern Question 2](src/day2/Pattern2.java)
- [Pattern Question 3](src/day2/Pattern3.java)
- [Pattern Question 4](src/day2/Pattern5.java)
- [Pattern Question 5](src/day2/Pattern6.java)
- [Control Flow Statements](src/day2/ControlFlowStatements.java)
- [Switch Statements](src/day2/SwitchStatements.java)

### Sample Problems To Try
| Problem | Source | Solution Link |
|---------|--------|---------------|
| [Java Output Formatting](https://www.hackerrank.com/challenges/java-output-formatting/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaOutputFormatting.java) |
| [Java Strings Introduction](https://www.hackerrank.com/challenges/java-strings-introduction/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaStringsIntroduction.java) |
| [Java Substring](https://www.hackerrank.com/challenges/java-substring/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaSubstring.java) |
| [Java String Compare](https://www.hackerrank.com/challenges/java-string-compare/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaSubstringComparison.java) |
| [Java Date and Time](https://www.hackerrank.com/challenges/java-date-and-time/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaDateAndTime.java) |


#### Loop based & Pattern based questions given [here](http://www.beginwithjava.com/java/loops/questions.html) 
| Problem No. | Solution |
|-------------|----------|
| Question 1 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question1.java) |
| Question 2 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question2.java) |
| Question 3 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question3.java) |
| Question 4 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question4.java) |
| Question 5 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question5.java) |
| Question 6 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question6.java) |
| Question 7 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question7.java) |
| Question 8 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question8.java) |
| Question 9 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question9.java) |
| Question 10 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question10.java) |
| Question 11 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question11.java) |
| Question 12 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question12.java) |
| Question 13 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question13.java) |
| Question 14 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question14.java) |
| Question 15 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question15.java) |
| Question 16 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question16.java) |
| Question 17 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question17.java) |
| Question 19 | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question19.java) |


## Day 3
### Topics Covered

### Sample Problems to Try
- Question 18 of the [loops section](http://www.beginwithjava.com/java/loops/questions.html) 
of begin with java.

| Problem        | Solution Link |
|----------------|--------------|
| Question 18. a | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question18a.java) |
| Question 18. b | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question18b.java) |
| Question 18. c | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question18c.java) |
| Question 18. d | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question18d.java) |
| Question 18. e | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question18e.java) |
| Question 18. f | [Solution](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/loops/Question18f.java) |

<details>
    <summary>Question 1</summary>
    WAP (Write a program) to a print the following pattern. User enters <code>rows</code> 
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern1.java">[See Solution]</a>
<pre>
********
***  ***
**    **
*      *    <br>        
*      *
**    **
***  ***
********
</pre>
</details>

<details>
    <summary>Question 2</summary>
    WAP to print the following pattern. User will enter number of rows (<code>rows</code> >= 2). If user
    enters <code>rows</code> < 2 then no pattern is printed. You can also add a second variable called
    <code>columns</code> that takes how many stars <code>*</code> to print in the first and last line.
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern2.java">[See Solution]</a>
<pre>
********
*      *
*      *
*      *
*      *
********
</pre>
</details>

<details>
    <summary>Question 3</summary>
    WAP to print the following pattern, User enters <code>rows</code>
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern3.java">[See Solution]</a>
<pre>
*****
*  *
* *
*
</pre>
</details>

<details>
    <summary>Question 4</summary>
    WAP to print the following pattern. User enters <code>rows</code>.
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern4.java">[See Solution]</a>
<pre>
* * * * *
 * * * *
  * * *
   * *
    *
</pre>
</details>

<details>
    <summary>Question 5</summary>
    WAP to print the following pattern. User enters <code>rows</code>.
<pre>
    *
   * *
  * * *
 * * * *
* * * * *
</pre>  
</details>

<details>
    <summary>Question 6</summary>
    WAP to print the following pattern. User enters <code>rows</code>.
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern6.java">[See Solution]</a>
<pre>
    *
   * *
  *   *
 *     *
* * * * *
</pre>
</details>

<details>
    <summary>Question 7</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern7.java">[See Solution]</a>
<pre>
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
</pre>
</details>

<details>
    <summary>Question 8</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern8.java">[See Solution]</a>
<pre>
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
</pre>
</details>

<details>
    <summary>Question 9</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern9.java">[See Solution]</a>
<pre>
1
1 2
1 x 3
1 x x 4
1 x x x 5
1 2 3 4 5 6
</pre>
</details>

<details>
    <summary>Question 10</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern10.java">[See Solution]</a>
<pre>
A
A B A
A B C B A
A B C D C B A
</pre>
</details>

<details>
    <summary>Question 11</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern11.java">[See Solution]</a>
<pre>
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****
***6*6*6*6*6*6***
**7*7*7*7*7*7*7**
*8*8*8*8*8*8*8*8*
</pre>
</details>

<details>
    <summary>Question 12</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern12.java">[See Solution]</a>
<pre>
   *
  * *
 * * *
  * *
   *
</pre>
</details>

<details>
    <summary>Question 13</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern13.java">[See Solution]</a>
<pre>
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
</pre>
</details>

<details>
    <summary>Question 14</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern14.java">[See Solution]</a>
<pre>
*
**
***
****
***
**
*
</pre>

In case <code>rows = 4</code>
<pre>
*
**
**
*
</pre>
</details>

<details>
    <summary>Question 15</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern15.java">[See Solution]</a>
For <code>rows = 3</code>
<pre>
3
44
555
6666
555
44
3
</pre>

For <code>rows = 2</code>
<pre>
2
33
444
33
2
</pre>

For <code>rows = 5</code>
<pre>
5
66
777
8888
99999
101010101010
99999
8888
777
66
5
</pre>
</details>

<details>
    <summary>Question 16</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern16.java">[See Solution]</a>
For <code>rows = 4</code>
<pre>
1
2 3
4 5 6
7 8 9 10
</pre>

For <code>rows = 2</code>
<pre>
1
2 3
</pre>
</details>

<details>
    <summary>Question 17</summary>
    WAP to print the following pattern. User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern17.java">[See Solution]</a>
For <code>rows = 4</code>
<pre>
1
2*3
4*5*6
4*5*6
2*3
1
</pre>

If <code>rows = 4</code>
<pre>
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1
</pre>
</details>

<details>
    <summary>Question 18</summary>
    WAP to print the following pattern (Pascal's Triangle). User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern18.java">[See Solution]</a>
For <code>rows = 5</code>
<pre>
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
</pre>

The pattern is derived in the pascal's triangle using values in the previous row.
<pre>
1
1 1
1 (1 + 1) 1
1 (1 + 2) (2 + 1) 1
1 (1 + 3) (3 + 3) (3 + 1) 1
</pre>
</details>

<details>
    <summary>Question 18</summary>
    WAP to print the following pattern (Hollow Rhombus). User enters <code>rows</code>.  
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern1.java">[See Solution]</a>
For <code>rows = 3</code>
<pre>
******
**  **
*    *
*    *
**  **
******
</pre>

For <code>rows = 5</code>
<pre>
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
**** *****
**********
</pre>
</details>

<details>
    <summary>Question 19</summary>
    <p>WAP to print the following pattern (Butterfly pattern)
    <a href="https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/patterns/Pattern19.java">[See Solution]</a></p>
    <p>For <code>rows = 3</code></p>
<pre>
*    *
**  **
******
******
**  **
*    *
</pre>

<p>For <code>rows = 5</code></p>
<pre>
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
</pre>
</details>

## Day 4
### Topics Covered

### Sample Problems
1. [Time Complexity Problems](https://www.interviewbit.com/problems/loopcmpl/) [InterviewBit]

2. WAP to create a function `add()` that takes 2 integer values and returns the sum.
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Sum2Integers.java)
````java
public static int add(int a, int b) {
}
```` 

3. WAP to create a function `difference()` that takes 2 integer values and returns the difference.
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program3.java)
````java
public static int difference(int a, int b) {
}
```` 

4. WAP to create a function `product()` that takes 2 integer values and returns the product.
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program4.java)
````java
public static int product(int a, int b) {
}
```` 

5. WAP to create a function `divide()` that takes 2 integer values and returns the quotient.
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program5.java)
````java
public static int divide(int a, int b) {
}
```` 

6. WAP that creates a function which calculates the factorial of a number `n`. Where:
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program6.java)
````text
0! = 1
1! = 1
3! = 1 * 2 * 3 = 6
5! = 1 * 2 * 3 * 4 * 5 = 120
````

7. WAP to create a function that calculates the Binomial Coefficient `nCr`. Where:
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program7.java)
````text
nCr = n! / (r! * (n-r)!)
4C0 = 4! / 0! 4! = 1
3C2 = 3! / 2!*1! = 6 / 2 = 3
````

8. WAP to create a function that calculates the Permutation value `nPr`. Where
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program7.java)
````text
nPr = n! / (n-r)!
5P0 = 5! / 5! = 1
6P3 = 6! / 3! = 6*5*4 = 120
```` 

9. WAP to create a function to check whether a given number is prime or not.
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program9.java)
````java
private static boolean isPrime(int number) {
} 
````

10. WAP to create a function that returns the length of a hypotenuse of a right angle 
triangle given the lengths of the other 2 sides
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program10.java)
````java
private static double hypotenuseLength(double a, double b) {
}
````

11. WAP to create a function to return the day of the week (name) from the day number. 
Example
[[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/functions/Program11.java)
````java
private static String dayFrom(int value) {
}
```` 

```text
dayFrom(0) --> "Sunday"
dayFrom(1) --> "Monday"
...
...
dayFrom(6) --> "Saturday"
```

## Day 5
### Topics Covered

### Sample Problems
- WAP to return the value of the sum of the following series recursively given `n`.
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/recursion/Problem1.java)
    ```text
    1^1 + 2^2 + 3^3 + 4^4 + ... + n^n 
    ```

- WAP a program that returns that sum of the first N natural numbers and finds 
this sum recursively.
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/recursion/Problem2.java) 
    ````text
    f(N) = 1 + 2 + 3 + ... + N   
    ````
    so, for `N = 3` `f(3) = 1 + 2 + 3 = 6` and for `N = 5` `f(5) = 15`.

- WAP a program that calculates the sum of the series 
    ````text
    f(N) = 1 + 2^2 + 3^2 + ... + N^2
    ````  
  using a recursive function.
  [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/recursion/Problem3.java)

## Day 6
### Topics Covered

### Sample Problems
1. WAP to input an integer number `length` from the user and then instantiate an integer array of size
    `length` and then display that array on the terminal with all entered values.  
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem1.java)
    
2. WAP that inputs an integer array from the user and returns the sum of all its elements. Create a dedicated
    method for calculating array sum with the following signature. 
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem2.java)
    ````java
    private static int sum(int[] array);
    ````
   
3. WAP that inputs an integer array from the user and prints the number of even, odd and zero elements.
   [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem3.java)
   
4. WAP to implement linear searching in an array. The user enters an array of size `n` and then an integer 
    `element`. search for this `element` in the array and return the first index at which it is found otherwise
    return -1 if not found in the array. 
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem4.java)
    
5. WAP that takes an array from the user and returns a reverse array with the order of all elements reversed
    and then prints this reversed array. 
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem5.java)
    ```text
    If the input array is array = [1, 2, 3, 4, 5] then the resultant array should be = [5, 4, 3, 2, 1]
    ```
   The method should have the following signature.
   ```java
    private static int[] reverse(int[] array);
    ```
   
6. WAP that takes an integer array from the user and returns the product of all it's elements. 
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem6.java)
    The method signature should be 
    ````java
    private static long product(int[] array);
    ````
    
7. WAP to tell whether an array is an anagram or not. The user will enter an integer array. 
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem7.java) 
    For example
    ````text
    array = [1, 2, 1] this is an anagram as the reverse of this array is also [1, 2, 1]
    array = [1, 1, 1, 1] This is also an anagram as the reverse is the same [1, 1, 1, 1]
    array = [] The empty array is also an anagram as the reverse is [] the same.
    array  = [-1, 0] is not an aanagram as the reverse = [0, -1] isn't the same.
    ````
   
   Crete a method with the following signature that returns boolean; true or false i it is an anagram 
   or not.
   ````java
    private static boolean isAnagram(int[] array);
    ````
   
8. WAP to Merge 2 sorted arrays and return the new array which is also sorted. 
    [[See Solution]](https://github.com/anishLearnsToCode/java-wac-batch-32/blob/master/src/arrays/Problem8.java)
    For example 
    ````text
    Let there be 2 arrays first = [1, 10, 20] and second = [1, 2, 4, 10, 67] Define a function with 
   a sigature as:
    ````
   ````java
    private static int[] merge(int[] first, int[] second);
    ````
   ```text
    which should return an array = [1, 1, 2, 4, 10, 10, 20, 67]
    ```


## Day 7
### Topics Discussed

### Sample Problems
| Problem | Platform | Solution Link |
|---------|----------|---------------|
| [Java Inheritance I](https://www.hackerrank.com/challenges/java-inheritance-1/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaInheritanceI.java) | 
| [Java Inheritance II](https://www.hackerrank.com/challenges/java-inheritance-2/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaInheritenceII.java) | 
| [Java Abstract Class](https://www.hackerrank.com/challenges/java-abstract-class) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaAbstractClass.java) | 
| [Java Interface](https://www.hackerrank.com/challenges/java-interface/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaInterface.java) | 
| [Java Method Overriding](https://www.hackerrank.com/challenges/java-method-overriding/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaMethodOverriding.java) | 
| [Java Overriding II (Super Keyword)](https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaMethodOverridingIISuperKeyword.java) | 


## Day 8
### Topics Covered

### Sample Problems
Try the problems given below and have a look at the solution only after you have solved it to see the 
different implementations and ideas we might've used or to use as a reference if unable to solve yourself.

| Problem | Platform | Solution Link |
|---------|--------|---------------|
| [Java List](https://www.hackerrank.com/challenges/java-list/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaList.java) |
| [Java ArrayList](https://www.hackerrank.com/challenges/java-arraylist/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaArraylist.java) |
| [Java Comparator](https://www.hackerrank.com/challenges/java-comparator/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaComparator.java) |
| [Covariant Return Types](https://www.hackerrank.com/challenges/java-covariance/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/CovariantReturnTypes.java)|

## Day 9
### Topics Discussed

### Sample Problems
Try the problems given below and have a look at the solution only after you have solved it to see the 
different implementations and ideas we might've used or to use as a reference if unable to solve yourself.

| Problem | Platform | Solution Link |
|---------|----------|---------------|
| [Java Stack](https://www.hackerrank.com/challenges/java-stack/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaStack.java) |
| [Java Priority Queue](https://www.hackerrank.com/challenges/java-priority-queue/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaPriorityQueue.java) |
| [Maximum Element](https://www.hackerrank.com/challenges/maximum-element/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-data-structures/blob/master/src/stacks/MaximumElement.java) |
| [Equal Stacks](https://www.hackerrank.com/challenges/equal-stacks/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-data-structures/blob/master/src/stacks/EqualStacks.java) |
| [Balanced Brackets](https://www.hackerrank.com/challenges/balanced-brackets/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-data-structures/blob/master/src/stacks/BalancedBrackets.java) |

## Day 10
### Topics Discussed

### Sample Problems
| Problem | Platform | Solution Link |
|---------|--------|---------------|
| [Java Anagrams](https://www.hackerrank.com/challenges/java-anagrams/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaAnagrams.java) |
| [Java Hashset](https://www.hackerrank.com/challenges/java-hashset/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaHashset.java) |
| [Java Map](https://www.hackerrank.com/challenges/phone-book/problem) | HackerRank | [Solution](https://github.com/anishLearnsToCode/hackerrank-java/blob/master/src/JavaMap.java) |

## Capstone Project
To showcase what we have learnt in this 10 day training workshop I have built a small hangman cli game
that  covers the different language constructs we have seen and also shows an example project that
can be built using Java. [See here :octocat:](https://github.com/anishLearnsToCode/hangman-cli-java).

## Further Reading
The following online resources/videos, practice Questions and Books 📚 are a good place to further enhance 
your Java Knowledge.

- [HackerRank Java Domain](https://www.hackerrank.com/domains/java) [:octocat:](https://github.com/anishLearnsToCode/hackerrank-java)
- [HackerRank Data Structures Domain](https://www.hackerrank.com/domains/data-structures) [:octocat:](https://github.com/anishLearnsToCode/hackerrank-data-structures)
- [HackerRank Algorithms Domain](https://www.hackerrank.com/domains/algorithms) [:octocat:](https://github.com/anishLearnsToCode/hackerrank-algorithms)
- [HackerRank Java (Basic) Skill Certification](https://www.hackerrank.com/skills-verification) [:octocat:](https://github.com/anishLearnsToCode/hackerrank-java-basic-skill-test)
- [HackerRank Problem Solving (Basic) Skill Certification](https://www.hackerrank.com/skills-verification/problem_solving_basic) [:octocat:](https://github.com/anishLearnsToCode/hackerrank-problem-solving-skill-test)
- [w3 Schools Java](https://www.w3schools.com/java/)
- [Herbert Schildt Java 9e 📕](https://github.com/anishLearnsToCode/books/blob/master/java/Java%20-%20The%20Complete%20Reference%2C%209th%20Edition%20-%20Herbert%20Schildt.pdf)
- [Programming Pearls 2e 📙](https://github.com/anishLearnsToCode/books/blob/master/programming-best-practices/programming-pearls-2e.pdf)
- [Clean Code 📘](https://github.com/anishLearnsToCode/books/blob/master/programming-best-practices/Clean%20Code.pdf)
- [Stack Overflow Survey 2020](https://insights.stackoverflow.com/survey/2020)

_Hint: :octocat: points to solution repo links..._
 
## Future Path??
Java is a very popular programming language and by learning the basics and stepping out into the Object Oriented 
Programing using Java could never be a bad step ;)

You can now advance in many different directions and learn many varied skill-sets.

### Core Java
Something that you think about doing is further learning more Java basics and improving your fundamental understanding
of the different concepts in Java such as different recipes to use the Object Oriented Programming to 
create different design patterns etc. 

Also learning about threads and multi-threaded programs and understanding the core library and interfaces and
concepts such as Reflection in a better manner.

This can be done by going through the questions on the [Java Domain](https://www.hackerrank.com/domains/java) 
on hackerRank whose solutions can be found 
[here](https://github.com/anishLearnsToCode/hackerrank-java).

You could also read up about the language comprehensively in Herbert Schildt's Excellent Reference volume 
[here 📘](https://github.com/anishLearnsToCode/books/blob/master/java/Java%20-%20The%20Complete%20Reference%2C%209th%20Edition%20-%20Herbert%20Schildt.pdf)

### Data Structures and Algorithms 👩‍💻
Or like me you can take a deep dive in solving problems because that's just too much fun 🎉. I highly recommend
HackerRank's [Data Structures](https://www.hackerrank.com/domains/data-structures) &
[Algorithms](https://www.hackerrank.com/domains/algorithms) domain whose solutions can be found 
[here](https://github.com/anishLearnsToCode/hackerrank-data-structures) &
[here](https://github.com/anishLearnsToCode/hackerrank-algorithms). 
I also recommend trying out programming challenges on 
[leet code](https://leetcode.com/problemset/algorithms/) for those who may not like HackerRank's UI. And if you do try 
that, do help me in building up my 
[leet code solutions](https://github.com/anishLearnsToCode/leetcode-algorithms) 
repository by contributing (making pull requests).

### Learning Git ![git-scm](https://img.icons8.com/color/25/000000/git.png)
This is not very correlated to Java, but Git is a technology being used by all organizations big and small 
that wish to maintain their code over teams of varied sizes and manage projects. Even this repository which you 
are currently reading in is being maintained by [git]() &
has been deployed on [github]().

Being proficeint with git and version control will help you manage all your projects, be in any language Java,
Python, C++ and even non-programming projects very efficiently and you will be able to easily maintain project 
state over all your devices.

There is an excellent [Version Control with Git](https://www.coursera.org/learn/version-control-with-git) 
course on Coursera by Atlassian or you can even try this 
[Git Introductory 30min Video](https://www.youtube.com/watch?v=SWYqp7iY_Tc)
on YouTube to learn the basics of git.

So, what are you waiting for git started 😁 (bad pun!)

### Web Development
Java being such a versatile and popular language has many web frameworks that have been built on it. The most popular 
ones being:

- [Java Spring](https://spring.io/)
- [Spring Boot](https://spring.io/projects/spring-boot)

<details>
    <summary><b>What is the Difference between Spring and Spring Boot?</b></summary>
    <p>
        Spring Boot is basically an extension of the Spring framework which eliminated the boilerplate configurations 
        required for setting up a Spring application. It takes an opinionated view of the Spring platform which paved 
        the way for a faster and more efficient development eco-system
    </p>
</details>

Web development consists of 2 major parts. One is designing the client side that mainly covers designing the 
interface and front end controls that the client will be able to see and interact with. The core front-end technologies
are HTML, CSS and JavaScript and all popular frameworks such as 
[Angular](https://angular.io/),
[Vue](https://vuejs.org/) &
[React](https://reactjs.org/) 
have been built using these core technologies only!

So, if you are interested in front-end design you can learn the basics of HTML5 + CSS3 + js @ 
[w3 schools](https://www.w3schools.com/html/) and then learn any popular front-end framework. The other part of web development is the server side
part which is hidden from the user and this is where all the heavy lifting and computation takes place. This is also 
where all the logic such as validation, authentication and parsing of data takes place. 

Both Spring ad Spring Boot are server side frameworks built on Java and after this course you can easily get started
with either as you are now familiar with all Language constructs.
  