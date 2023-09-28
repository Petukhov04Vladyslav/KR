import scala.collection.mutable.ListBuffer

class Human(name: String, second_name: String, age: Int) {
  override def toString: String = s"Name: $name, Second name: $second_name Age: $age"
}

class ListHuman {
  var humans: ListBuffer[Human] = ListBuffer()

  def addNewHuman(human: Human): Unit = {
    humans += human
  }

  def deleteByName(name: String): Unit = {
    humans = humans.filterNot(_.toString.contains(name))
  }

  def findByName(name: String): Option[Human] = {
    humans.find(_.toString.contains(name))
  }

  def filterHumans(predicate: Human => Boolean): List[Human] = {
    humans.filter(predicate).toList
  }

  def printHumans(): Unit = {
    humans.foreach(println)
  }
}


object Main {
  def main(args: Array[String]): Unit = {
    val listHuman = new ListHuman()

    listHuman.addNewHuman(new Human("Vladyslav", "Petukhov", 18))
    listHuman.addNewHuman(new Human("Kevin", "Levrone", 59))
    listHuman.addNewHuman(new Human("Jay", "Cutler", 50))

    println("All humans:")
    listHuman.printHumans()

    println("\nDeleting by name:")
    listHuman.deleteByName("Jay")
    listHuman.printHumans()

    println("\nFinding by name:")
    listHuman.findByName("Vladyslav") match {
      case Some(human) => println(s"Found: $human")
      case None => println("Not found")
    }

    println("\nFiltering by name:")
    listHuman.filterHumans(_.toString.contains("Kevin")).foreach(println)
  }
}