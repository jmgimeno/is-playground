val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val sum = nums.reduceLeft(_ + _)
val y = for i <- nums yield i * 2
val z = nums
  .filter(_ > 100)
  .filter(_ < 10_000)
  .map(_ * 2)

