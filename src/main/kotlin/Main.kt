fun main(args: Array<String>) {
    val contact = Contact()
    println("Enter the name of the person:")
    contact.name = readln()
    println("Enter the surname of the person:")
    contact.surnname = readln()
    println("Enter the number")
    contact.phone = readln()

    println("A record created!")
    println("A Phone Book with a single record created!")
}