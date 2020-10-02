package andreas

class Greeting {

    InterfaceGreetingService service
    // Constructor
    public Greeting(InterfaceGreetingService service) {
        echo("In Greeting constructor")
        this.service = service
    }

    void greet(String greeting) {
        echo("In Greeting.greet()")
        service.greet(greeting)
    }

    // void redirectEcho(String msg, Closure myecho)
    // {
    //     myecho(msg)
    // }

}