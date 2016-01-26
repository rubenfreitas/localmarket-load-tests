package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object AboutPage {

  val aboutPage = exec(http("ABOUT PAGE")
    .get("/")
    .check(
      status.is(200)
    )
  )

}
