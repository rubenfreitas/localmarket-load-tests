package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scenarios.{RecipesPagesScenario, AboutScenario, FeedScenario, RecipesScenario}

import scala.concurrent.duration._

/**
  * Created by rfreitas
  */
class BasicSimulation extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:3000")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .inferHtmlResources()


  setUp(
    RecipesScenario.scn.inject(heavisideUsers(10) over (25 seconds)).protocols(httpConf),
    FeedScenario.scn.inject(heavisideUsers(10) over (25 seconds)).protocols(httpConf),
    RecipesPagesScenario.scn.inject(heavisideUsers(15) over (25 seconds)).protocols(httpConf),
    AboutScenario.scn.inject(heavisideUsers(2) over (25 seconds)).protocols(httpConf)
  )
    .assertions(
      global.responseTime.max.lessThan(1000),
      global.successfulRequests.percent.greaterThan(97)
    )

}
