/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
import spock.lang.Specification
import spock.lang.Unroll

class AppTest extends Specification {

    @Unroll
    def "test1"() {
        setup:
        App app = new App()
        List<List<String>> input = [['9','4','4'],['10','3','1']]

        when:
        def result = app.play(input)

        then:
        result == [playerWin: 1, points: 2]
    }

    def "test2"() {
        setup:
        App app = new App()
        List<List<String>> input = [['10','1','1'],['9','3','4']]

        when:
        def result = app.play(input)

        then:
        result == [playerWin: 2, points: 2]
    }

    def "test3"() {
        setup:
        App app = new App()
        List<List<String>> input = [['5','1','1'],['2','3','4']]

        when:
        def result = app.play(input)

        then:
        result == [playerWin: 2, points: 2]
    }

    def "test4"() {
        setup:
        App app = new App()
        List<List<String>> input = [['J','Q','K'],['Q','J','Q']]

        when:
        def result = app.play(input)

        then:
        result == [playerWin: 1, points: 2]
    }

    def "test5"() {
        setup:
        App app = new App()
        List<List<String>> input = [['1','1','1','1'],['2','2','2','2']]

        when:
        def result = app.play(input)

        then:
        result == [playerWin: 2, points: 4]
    }

    def "final tests"() {
        setup:
        App app = new App()
        List<List<String>> input = [['10','1','4'],['J','3','1']]

        when:
        def result = app.play(input)

        then:
        result == [playerWin: 2, points: 2]
    }
}
