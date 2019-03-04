package com.levkovskiy.patterncheatnote.behavioral.mediator

class AuthenticationDialog : MediatorInterface {
    lateinit var title: String
    var loginOrRegisterChkBx: Checkbox = Checkbox(this)
    var loginUsername: Textbox = Textbox(this, "User")
    var loginPassword: Textbox = Textbox(this, "Password")
    var registrationUsername: String = "userName"
    var registrationPassword: String = "password"
    var registrationEmail: Textbox = Textbox(this, "email@gmail.com")
    var okBtn: Button = Button(this)
    var cancelBtn: Button = Button(this)

    private val found = false
    override fun notify(sender: Component, event: String) {
        if (sender == loginOrRegisterChkBx && event == "check") {
            title = if (loginOrRegisterChkBx.checked)
                "Log in"
            else
                "Register"
            System.out.println(title)
        }
        if (sender == okBtn && event == "click")
            if (loginOrRegisterChkBx.checked)
                if (found)
                    title = "user with name " + loginUsername.text + "not found"
                else
                    createUser(registrationUsername, registrationEmail.text, registrationPassword)
    }

    private fun createUser(name: String, email: String, password: String) {
        System.out.println("name $name email $email password $password")
    }
}
