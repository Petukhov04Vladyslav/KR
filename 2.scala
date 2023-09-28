class Human(val name: String, val second_name: String, val age: Int, val gender: String, val address: Address){
  def onScreen(): Unit = {
    println(s"Name: $name")
    println(s"Second name: $second_name")
    println(s"Age: $age")
    println(s"Gender: $gender")
    println(s"Address: ")
    address.onScreen()
  }
}

class Address(val country: String, val city: String, val street: String) {
  def onScreen(): Unit = {
    println(s"Country: $country")
    println(s"City: $city")
    println(s"Street: $street")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val address = new Address("Ukraine", "Oleshky", "Velyka Sadova");
    val person = new Human("Vladyslav", "Petukhov", 18, "man", address);
    person.onScreen();
  }
}