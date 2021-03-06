/*
 * This Java source file was generated by the Gradle 'init' task.
 */

class App {

    private static final converter = [
            '1': 1,
            '2': 2,
            '3': 3,
            '4': 4,
            '5': 5,
            '6': 6,
            '7': 7,
            '8': 8,
            '9': 9,
            '10': 10,
            'J': 11,
            'Q': 12,
            'K': 13,
    ]

    Map play(List<List<String>> input) {

        Integer player1 = 0
        Integer player2 = 0

        List<List<String>> convertedInput = input.collect { list ->
            list.collect {converter[it]}
        }

        convertedInput[0].eachWithIndex { pair, index ->
            pair > convertedInput[1][index]?
                    player1++ :
                    player2++
        }


        [playerWin: player1 > player2 ? 1 : 2, points: player1 > player2 ? player1 : player2]
    }
}
