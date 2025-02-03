enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

import CrustSize.*
import CrustType.*
import Topping.*

case class Pizza(
  crustSize: CrustSize,
  crustType: CrustType,
  toppings: Seq[Topping]
)

val myFavPizza = Pizza(Small, Regular, Seq(Cheese, Pepperoni))
println(myFavPizza.crustType) // prints Regular

case class Address(
  street1: String,
  street2: Option[String],
  city: String,
  state: String,
  zipCode: String
)

case class Customer(
  name: String,
  phone: String,
  address: Address
)

case class Order(
  pizzas: Seq[Pizza],
  customer: Customer
)

def toppingPrice(t: Topping): Double = t match
  case Cheese | Onions => 0.5
  case Pepperoni | BlackOlives | GreenOlives => 0.75

def crustPrice(s: CrustSize, t: CrustType): Double =
(s, t) match
  // if the crust size is small or medium,
  // the type is not important
  case (Small | Medium, _) => 0.25
  case (Large, Thin) => 0.50
  case (Large, Regular) => 0.75
  case (Large, Thick) => 1.00

def pizzaPrice(p: Pizza): Double = p match
  case Pizza(crustSize, crustType, toppings) =>
    val base  = 6.00
    val crust = crustPrice(crustSize, crustType)
    val tops  = toppings.map(toppingPrice).sum
    base + crust + tops

println(pizzaPrice(myFavPizza))
