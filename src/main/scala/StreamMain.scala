import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * Created by linos1003 on 26/12/17.
  */
object StreamMain extends App {
  Logger.getLogger("org.apache").setLevel(Level.WARN)
  val sparkConf = new SparkConf().setAppName("WordCount")
  // Create the context
  val ssc = new StreamingContext(sparkConf, Seconds(2))

  val lines = ssc.textFileStream(args(0))
  val words = lines.flatMap(_.split(" "))
  val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)
  wordCounts.print()
  ssc.start()
  ssc.awaitTermination()
}
