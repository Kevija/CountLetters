import scala.io.StdIn.readLine

object OtherSolution extends App {

    val myString = readLine("Type something:\n")

    // doesn't work:
    //  var myMuteMap: scala.collection.mutable.Map[Char, Int] = Map(
    //    for (i <- 1 to myString.length) yield (myString(i-1), i))

    val myCollection = for (i <- 1 to myString.length) yield (myString(i-1), i)
    val myMuteMap = myCollection.toMap

    println(myMuteMap.mkString(", "))

}
