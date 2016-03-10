package net.joelbecker.myapp.module1

object LetterFrequency {
  def determinLetterFrequency(text: String): List[(Char, Int)] =
    ('A' to 'Z').map(letter =>
      (letter, text.toUpperCase().count(_ == letter))).toList
}
