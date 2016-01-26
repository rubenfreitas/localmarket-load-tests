package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object HomePage {

  private val homePageTitle = "<title>Local Market - Your Neighborhood Grocer</title>"

  val homePage = exec(http("HOME PAGE")
    .get("/")
    .check(
      status.is(200),
      regex(homePageTitle).exists
    )
  )

}
