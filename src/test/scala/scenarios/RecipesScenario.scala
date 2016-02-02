package scenarios

import actions._
import io.gatling.core.Predef._

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
object RecipesScenario {

  val scn = scenario("RECIPES SCENARIO")
    .exec(
      HomePage.homePage.pause(1 seconds, 3 seconds),
      RecipesPage.recipesPage,
      randomSwitch(
        0.45 -> RecipesPage.recipesPage,
        0.30 -> FeedPage.feedPage,
        0.15 -> BookmarksPage.bookmarksPage,
        0.10 -> AboutPage.aboutPage
      )
    )

}
