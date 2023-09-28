object Main {
  def main(args: Array[String]): Unit = {
    var list1: List[Int] = List(4, 6, 3, 8, 7, 1, 9, 2, 5);
    MinMax(list1);
    Filter(list1);
    Find(list1);
    Exists(list1);
    IsEmpty(list1);
    HeadTail(list1);
    AVG(list1);
    Mult(list1);
  }

  def MinMax(list:List[Int]): Unit = {
    println("Min: " + list.min);
    println("Max: " + list.max);
  }

  def Filter(list: List[Int]): Unit = {
    println("Filter: " + list.filter(_ % 2 == 0));
  }

  def Find(list: List[Int]): Unit = {
    println("Find: " + list.find(_ == 7));
  }

  def Exists(list: List[Int]): Unit = {
    println("Exist: " + list.exists(_ == 4));
  }

  def IsEmpty(list: List[Int]): Unit = {
    println("IsEmpty: " + list.isEmpty);
  }

  def HeadTail(list: List[Int]): Unit = {
    println("Head: " + list.head);
    println("Tail: " + list.tail);
  }

  def AVG(list: List[Int]): Unit = {
    val sum: Int = list.sum;
    val average: Int = sum / list.length;
    println("Average: " + average);
  }

  def Mult(list: List[Int]): Unit = {
    println("Multiplication: " + list.reduce(_ * _));
  }
}