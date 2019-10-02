package model

case class ImportAssessment(
                             totalNumberOfItems: Long,
                             totalValueInGBP: Double,
                             totalVATDue: Double,
                             totalExciseDutyDue: Double,
                             isSubjectToControls: Boolean
                           )
