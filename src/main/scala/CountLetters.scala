import scala.io.StdIn.readLine

object CountLetters extends App {

  //TODO ask user for some sentence or word
  //Count the number of characters in this string
  //Store them in a mutable Map of type Char, Int
  //print the results
  //you can count whitespace as well

  //you could store results in some sort of Sequence and then convert to Map later, but that would just complicate things

  val sentence = readLine("Please enter some sentence of word:\n")
  println(sentence)

  val count = sentence.length
  println(count)

  val word = sentence.split(" ")
  println(s"The words from sentence:\n${word.mkString(",")}")

  val numberOfCharacters = word.map(_.length)
  println(s"Word lengths:\n${numberOfCharacters.mkString(",")}")

 //val numericMap = Map(word -> numberOfCharacters)
  //println(numericMap)

  val mutMap = scala.collection.mutable.Map[Char, Int]()

  for (c<-sentence) {
    //println(s"$c")
    mutMap += (c-> sentence.count(t => t ==c))

  }
  println(mutMap)

}
