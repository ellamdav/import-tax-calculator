
import model._
import org.scalatest.{MustMatchers, WordSpec}
import service.ImportAssessmentService


class ImportAssessmentServiceSpec extends WordSpec with MustMatchers {

  val importAssessmentService = new ImportAssessmentService

  "ImportAssessmentService.assess" should {

    "calculate the total number of items being imported" in {
      // arrange
      val importDeclaration = ImportDeclaration(
        List(
          Consignment(Item("tin of biscuits", Food), 200, 1000.00),
          Consignment(Item("pair of trousers (XL)", Clothing), 100, 5000.00)
        )
      )

      // act
      val assessment = importAssessmentService.assess(importDeclaration)

      // assert
      assessment.totalNumberOfItems mustBe 300
    }

    "calculate the total value of items being imported" in {
      pending
    }

    "calculate the correct amount of VAT due on the import" in {
      // 20% of all non-Food goods
      pending
    }

    "calculate the correct amount of Excise duty due on the import" in {
      // 60p per litre on Fuel
      // 20p per litre on Beer
      // 300p per litre on Wine
      pending
    }

    "determine if the import is subject to any controls" in {
      // eg. Fireworks require a special licence
      pending
    }
  }

}
