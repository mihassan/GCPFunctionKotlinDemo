import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import kotlinx.serialization.json.Json
import kotlinx.serialization.encodeToString
import repository.QuoteRepository

class Quote : HttpFunction {
  override fun service(request: HttpRequest, response: HttpResponse) {
    val writer = response.writer
    val quote = QuoteRepository.getRandomQuote()

    response.setContentType("application/json; charset=utf-8")
    writer.write(Json.encodeToString(quote))
  }
}