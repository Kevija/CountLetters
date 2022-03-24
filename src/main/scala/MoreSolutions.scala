import scala.io.StdIn.readLine

object MoreSolutions extends App {

    val sentence = readLine("Please enter sentence. ")
    val words = sentence.split(" ")

    val wordLengths = words.map(words => words.length)
    val wordsMap = Map(words.mkString(", ") -> wordLengths.mkString(", "))
    println(wordsMap)
}
