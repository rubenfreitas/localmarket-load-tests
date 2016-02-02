package scenarios

import actions._
import io.gatling.core.Predef._

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
object RecipesPagesScenario {

  val scn = scenario("RECIPES PAGES SCENARIO")
    .exec(
      HomePage.homePage.pause(2 seconds, 11 seconds),
      randomSwitch(
        0.45 -> RecipePage.recipesPage("/spring-ragu-bolognese"),
        0.30 -> RecipePage.recipesPage("/spring-spanish-asparagus-revuelto"),
        0.15 -> RecipePage.recipesPage("/spring-meatloaf"),
        0.10 -> RecipePage.recipesPage("/summer-apricots-honey-panna-cotta")
      )
    )

}
