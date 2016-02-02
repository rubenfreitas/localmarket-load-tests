package actions

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by rfreitas
  */
object RecipePage {

  def recipesPage(recipe:String) = exec(http("RECIPE PAGE - " + recipe)
    .get("/recipes/" + recipe)
    .check(
      status.is(200)
    )
  )

}
