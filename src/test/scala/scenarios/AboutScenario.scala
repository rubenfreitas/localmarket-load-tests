package scenarios

import actions.{AboutPage, HomePage}
import io.gatling.core.Predef._

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
object AboutScenario {

  val scn = scenario("ABOUT SCENARIO")
    .exec(
      HomePage.homePage.pause(2 seconds, 11 seconds),
      AboutPage.aboutPage
    )

}
