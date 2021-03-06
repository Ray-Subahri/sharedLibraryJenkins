package lysori.helloWorldConnections

import lysori.devopsdus2020.*
import groovy.util.logging.Log

@Log
class HelloWorldService implements HelloWorldInterface {
    
    Closure logger
    
    public HelloWorldService (Closure logger){
         this.logger = logger
    }

    Boolean checkSetup() {
        return true
    }

    String echoHelloWorld(){
        
        //logger("Hilfe - ich wurde einem logger uebergeben")
        return "Hello World - Hilfe - ich wurde einem logger uebergeben"
    }

    String generellGenerator(int a){
        String result = "" 
        
        for(int i = 0; i < a; ++i){
            result += "generell"
        }

        return result
    }
}