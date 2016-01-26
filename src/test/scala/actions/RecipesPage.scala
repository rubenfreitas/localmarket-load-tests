package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object RecipesPage {

  val recipesPage = exec(http("RECIPES PAGE")
    .get("/recipes")
    .check(
      status.is(200)
    )
  )

}
