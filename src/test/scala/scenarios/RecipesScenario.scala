package scenarios

import actions.{HomePage, RecipesPage}
import io.gatling.core.Predef._

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
object RecipesScenario {

  val scn = scenario("RECIPES SCENARIO")
    .exec(
      HomePage.homePage.pause(1 seconds, 3 seconds),
      RecipesPage.recipesPage
    )

}
