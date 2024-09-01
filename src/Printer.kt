abstract class Printer(val name: String = "", val color: String = "", val pages: Int = 0) {


    abstract fun printerPage()
    abstract fun printInfo()
}