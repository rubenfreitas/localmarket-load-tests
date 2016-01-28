package scenarios

import actions._
import io.gatling.core.Predef._

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
object FeedScenario {

  val scn = scenario("FEED SCENARIO")
    .exec(
      HomePage.homePage.pause(2 seconds, 6 seconds),
      FeedPage.feedPage
    )

}
