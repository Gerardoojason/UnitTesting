package id.ac.umn.app.unittesting

object registerpassword {
    private val user = "abc"

    fun validpassword(
        password : String,
        confirmpassword : String
    ):Boolean{
        if (password.isEmpty()|| confirmpassword.isEmpty()){
            return false
        }
        if (password !=confirmpassword){
            return false
        }
        if (password.count(){it.isDigit()} <8){
            return false
        }
        return true
    }
}