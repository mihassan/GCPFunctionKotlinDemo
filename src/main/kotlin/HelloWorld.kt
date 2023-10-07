import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import models.Quote

class HelloWorld : HttpFunction {
  override fun service(request: HttpRequest, response: HttpResponse) {
    val writer = response.writer
    val q = Quote("Hello World!", "Mihai")
    response.setContentType("application/json; charset=utf-8")
    writer.write(Json.encodeToString(q))
  }
}