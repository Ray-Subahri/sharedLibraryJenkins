import andreas.*

def greet(variable) {
    echo "${variable}"


    //String output = "${variable}"
    println "In vars/testgreet"

    String output = 'This test works'

    GreetingService service = new GreetingService()
    Greeting myGreeting = new Greeting(service)
    myGreeting.redirectEcho("redirected", (String msg) -> {println msg})

    myGreeting.greet(output)

}
