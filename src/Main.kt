fun main() {
    val printerOne = object : Printer("HP", "White",300) {
        override fun printerPage() {
            println("Принтер может напечатать $pages страниц")
        }

        override fun printInfo() {
            println("Принтер $name цвет $color запас печати $pages страниц")
        }
    }

    val printerTwo = object : Printer("Samsung", "Black",500) {
        override fun printerPage() {
            println("Принтер может напечатать $pages страниц")
        }

        override fun printInfo() {
            println("Принтер $name цвет $color запас печати $pages страниц")
        }
    }

    printerOne.printerPage()
    printerOne.printInfo()

    println("------------------------------")
    printerTwo.printerPage()
    printerTwo.printInfo()
}