package scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object RecipesScenario {

  val scn = scenario("Scenario Name")
    .exec(http("HOME PAGE")
    .get("/")
    .check(status.is(200)))
    .pause(1)
    .exec(http("RECIPES PAGE")
    .get("/recipes")
    .check(status.is(200)))

}
