package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object BookmarksPage {

  val bookmarksPage = exec(http("BOOKMARKS PAGE")
    .get("/bookmarks")
    .check(
      status.is(200)
    )
  )

}
