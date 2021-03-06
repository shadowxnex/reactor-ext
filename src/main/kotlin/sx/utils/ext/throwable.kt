package sx.utils.ext

import java.io.PrintWriter
import java.io.StringWriter

fun Throwable.stackDump(): String {
    val sw = StringWriter()
    val pw = PrintWriter(sw)
    this.printStackTrace(pw)
    return sw.toString()
}
