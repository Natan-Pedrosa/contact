
class Agenda{
    val agenda = mutableListOf<Contact>()

    fun showMenu(){
        var exit = false

        do {
            print("Enter action (add, remove, edit, count, list, exit):")
            val input = readln()

            when(input){
                "add" -> add()
                "edit" -> edit()
                "remove" -> remove()
                "count" -> count()
                "list" -> list()
                "exit" -> exit = true
            }
        }while(!exit)
    }

    private fun add(){

        print("Enter the name:")
        val name = readln()
        print("Enter the surname:")
        val surname = readln()
        print("Enter the number:")
        val number = readln()

        val contact = Contact(name, surname, number)
        if(contact.hasNoNumber()) println("Wrong number format!")

        agenda.add(contact)
        println("The record added.")
    }

    private fun edit(){
        if(agenda.isEmpty()){
            println("No records to edit!")
            return
        }
        list()

        print("Select a record:")
        val index: Int = readln().toInt()

        print("Select a field (name, surname, number):")
        val field = readln()

        when(field){
            "name" -> {
                print("Enter name:")
                agenda[index].name = readln()
            }
            "surname" -> {
                print("Enter surname:")
                agenda[index].surname = readln()
            }
            "number" -> {
                print("Enter number:")
                agenda[index].phoneNumber = readln()
                if(agenda[index].hasNoNumber()) println("Wrong number format!")
            }
        }
        println("The record updated!")
    }
    private fun count(){
        println("The Phone Book has ${agenda.size} records.")
    }
    private fun remove(){
        if(agenda.isEmpty()){
            println("No records to remove!")
            return
        }
        list()

        print("Select the record:")
        val index = readln().toInt()
        agenda.removeAt(index - 1)

        println("The record removed!")
    }
    private fun list(){
        if(agenda.isEmpty()){
            println("The Phone Book has 0 records.")
            return
        }

        for((index, contact) in agenda.withIndex()){
            println("${index + 1}. ${contact.name} ${contact.surname}, ${contact.phoneNumber}")
        }
    }
}