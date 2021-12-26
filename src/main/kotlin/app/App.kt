package app

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }

    fun run() {
        printHeader()
        playerInput()
    }

    private fun printHeader() {
        println("===============================")
        println("GAME SUIT TERMINAL IKHSAN VERSION")
        println("===============================")
    }

    private fun playerInput() {
        println("Please Input with Batu/Gunting/Kertas")
        println("Player 1 turn  =")
        val playerOne = readLine().toString()
        println("Player 2 turn  =")
        val playerTwo = readLine().toString()

        printResult(playerOne,playerTwo)
    }

    private fun printResult(playerOne: String, playerTwo: String) {
        val inputList = listOf(playerOne,playerTwo)
        val separator = "-"
        val inputString = inputList.joinToString(separator)

        when(inputString.lowercase()){
            "batu-gunting","kertas-batu","gunting-kertas"-> println("Player 1 WIN!!")
            "gunting-batu","batu-kertas","kertas-gunting"-> println("Player 2 WIN!!")
            "kertas-kertas","batu-batu","gunting-gunting"-> println("DRAW!!")
            else -> {
                println("Wrong Input,Please Try again!")
                run()
            }
        }
    }

}