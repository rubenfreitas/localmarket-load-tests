package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object FeedPage {

  val feedPage = exec(http("FEED PAGE")
    .get("/feed")
    .check(
      status.is(200)
    )
  )

}
