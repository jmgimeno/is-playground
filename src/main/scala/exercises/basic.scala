package exercises

import scala.annotation.tailrec

// 1. Sum of Two Integers
def sum(a: Int, b: Int): Int = a + b

// 2. Check Even or Odd
def isEven(n: Int): Boolean = n % 2 == 0

// 3. Find Maximum of Two Numbers
def max(a: Double, b: Double): Double = if a > b then a else b
def max2(a: Double, b: Double): Double = if (a > b) a else b

// 4. Absolute Value
def abs(n: Int): Int = ???

// 5. Sign of a Number
def sign(n: Int): Int = ???

// 6. Grade Evaluation
def grade(score: Int): String = ???

// 7. Print Numbers from 1 to N
def printNumbers(n: Int): Unit = for (i <- 1 to n) println(i)
def printNumbers2(n: Int): Unit = for {i <- 1 to n} println(i)
def printNumbers3(n: Int): Unit = for i <- 1 to n do println(i)
def printNumbers4(n: Int): Unit = (1 to n).foreach(println)

// 8. Sum of First N Numbers
def sumN(n: Int): Int =
  if n > 0 then
    n + sumN(n - 1)
  else
    0

def sumN2(n: Int): Int =
  @tailrec
  def go(i: Int, acc: Int): Int =
    if i > 0 then
      go(i - 1, acc + i)
    else
      acc
  go(n, 0)
  
def sumN3(n: Int): Int =
  var i = n
  var acc = 0
  while i > 0 do
    acc = acc + i
    i = i - 1
  acc
  
// 9. Factorial Calculation
def factorial(n: Int): Int = ???

// 10. Fibonacci Sequence
def fibonacci(n: Int): List[Int] = ???

// 11. Sum of a List
def sumList(lst: List[Int]): Int = ???

// 12. Count Even Numbers in a List
def countEvens(lst: List[Int]): Int = ???

// 13. Filter Positive Numbers
def filterPositive(lst: List[Int]): List[Int] = ???

// 14. Find Maximum in a List
def maxInList(lst: List[Double]): Double = ???

// 15. Reverse a List
def reverseList[A](lst: List[A]): List[A] = ???

// 16. Define a Person Case Class and a "way" to know is adult
case class Person(name: String, age: Int)

// 17. Create a Rectangle Case Class and a "way" to know its area
case class Rectangle(width: Double, height: Double)

// 18. List of Persons Over a Certain Age
def adults(people: List[Person]): List[Person] = ???

// 19. Find Oldest Person in a List
def oldest(people: List[Person]): Option[Person] = ???

// 20. Check if All People are Adults
def allAdults(people: List[Person]): Boolean = ???

