package repository

import models.Quote

object QuoteRepository {
  fun getRandomQuote(): Quote = quotes.random()

  private val quotes: List<Quote> = listOf(
    Quote("You must be the change you wish to see in the world.", "Mahatma Gandhi"),
    Quote(
      "Spread love everywhere you go. Let no one ever come to you without leaving happier.",
      "Mother Teresa"
    ),
    Quote("The only thing we have to fear is fear itself.", "Franklin D. Roosevelt"),
    Quote(
      "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.",
      "Martin Luther King Jr."
    ),
    Quote("Do one thing every day that scares you.", "Eleanor Roosevelt"),
    Quote("Well done is better than well said.", "Benjamin Franklin"),
    Quote(
      "The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.",
      "Helen Keller"
    ),
    Quote("It is during our darkest moments that we must focus to see the light.", "Aristotle"),
    Quote(
      "Do not go where the path may lead, go instead where there is no path and leave a trail.",
      "Ralph Waldo Emerson"
    ),
    Quote("Be yourself; everyone else is already taken.", "Oscar Wilde"),
  )
}