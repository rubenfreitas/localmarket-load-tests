package scenarios

import actions._
import io.gatling.core.Predef._

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
object KnowTheCornersScenario {

  val scn = scenario("KNOW THE CORNERS SCENARIO")
    .exec(
      HomePage.homePage.pause(2 seconds, 11 seconds),
      randomSwitch(
        0.45 -> RecipesPage.recipesPage,
        0.30 -> FeedPage.feedPage,
        0.15 -> BookmarksPage.bookmarksPage,
        0.10 -> AboutPage.aboutPage
      )
    )

}