case class TvShow(title: String, start: Int, end: Int)

object TvShowParser {
  def main(args: Array[String]): Unit = {
    val rawShow1 = "Mad Men (2007-2015)"
    val rawShow2 = "Chernobyl (2019)"

    val parsedShow1 = parseShow(rawShow1)
    val parsedShow2 = parseShow(rawShow2)

    println(parsedShow1)
    println(parsedShow2)
  }

  def parseShow(rawShow: String): Option[TvShow] = {
    for {
      name      <- extractName(rawShow)
      yearStart <- extractYearStart(rawShow).orElse(extractSingleYear(rawShow))
      yearEnd   <- extractYearEnd(rawShow).orElse(extractSingleYear(rawShow))
    } yield TvShow(name, yearStart, yearEnd)
  }

  def extractName(rawShow: String): Option[String] = {
    val bracketOpen = rawShow.indexOf('(')
    if (bracketOpen > 0)
      Some(rawShow.substring(0, bracketOpen).trim)
    else
      None
  }

  def extractYearStart(rawShow: String): Option[Int] = {
    val dash = rawShow.indexOf('-')
    val bracketOpen = rawShow.indexOf('(')
    if (bracketOpen != -1 && dash > bracketOpen + 1) {
      val yearStr = rawShow.substring(bracketOpen + 1, dash)
      Some(yearStr.toInt)
    } else
      None
  }

  def extractYearEnd(rawShow: String): Option[Int] = {
    val dash = rawShow.lastIndexOf('-')
    if (dash > 0) {
      val bracketClose = rawShow.lastIndexOf(')')
      Some(rawShow.substring(dash + 1, bracketClose).toInt)
    } else
      None
  }

  def extractSingleYear(rawShow: String): Option[Int] = {
    val bracketOpen  = rawShow.indexOf('(')
    val bracketClose = rawShow.indexOf(')')
    for {
      yearStr <- if (bracketOpen != -1 && bracketClose > bracketOpen + 1)
        Some(rawShow.substring(bracketOpen + 1, bracketClose))
      else None
      year    <- yearStr.toIntOption
    } yield year
  }
}
