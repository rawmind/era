package era

import spock.lang.Specification

class StateTest extends Specification {

    def "concept"() {
        def doSome = new ShelCommand("ping ya.ru -c1");

        expect:
        def execute = new InitState().execute(doSome)



    }





    class InitState implements State {


        @Override
        Event execute(Action action) {
            return Mock(Event)
        }
    }
}
