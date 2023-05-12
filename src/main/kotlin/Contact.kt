const val NO_NUMBER = "[no number]"
class Contact (var name: String, var surname: String, phoneNumber: String = NO_NUMBER){
    var phoneNumber: String = phoneNumber
        get() : String = this.toString()
        set(value){
            field = if(isNumberValid(value)) value else NO_NUMBER
        }
    private fun isNumberValid(phone: String): Boolean {
        val regex = "(\\+\\d(\\s|-))?(\\(\\w{2,}\\)(\\s|-))?(\\d{2,}(\\s|-))+\\w{2,}".toRegex()
        return regex.matches(phone)
    }

    fun hasNumber(): Boolean{
        return phoneNumber != NO_NUMBER
    }

    fun hasNoNumber(): Boolean{
        return phoneNumber == NO_NUMBER
    }
}