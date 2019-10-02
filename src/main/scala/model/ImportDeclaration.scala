package model


sealed trait ItemType
case object Food extends ItemType
case object Fuel extends ItemType
case object Beer extends ItemType
case object Wine extends ItemType
case object Clothing extends ItemType
case object Fireworks extends ItemType


case class Item(
                 itemName: String,
                 itemType: ItemType
               )

case class Consignment(
                        item: Item,
                        quantity: Long,
                        consignmentValueInGBP: Double
                      )

case class ImportDeclaration(consignments: Seq[Consignment])
