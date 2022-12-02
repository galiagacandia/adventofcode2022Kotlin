fun main() {
    fun part1(calories: List<String>): Int {
        var contadorElfo: Int = 0;
        var totalCalories: Int = 0
        var maximasCalories: Int = 0
        var elfoConMasCalories: String = ""
        var mapElfosCalories = mutableMapOf<Int, Int>()
        for (calorie in calories) {
            println(calorie)
            if (calorie.isNotEmpty()){
                totalCalories += calorie.toInt();
            } else {
                contadorElfo++
                // Vacia llenamos la suma a una variable
                if(totalCalories > maximasCalories){
                    maximasCalories = totalCalories
                    elfoConMasCalories = contadorElfo.toString()
                    totalCalories = 0
                    mapElfosCalories[contadorElfo] = maximasCalories
                }
            }
        }
        //calories.forEach { s -> s.toBigInteger() }.
        return maximasCalories
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    var resultado: Int = part1(testInput)
    println("Maxima: " + resultado)
    //check(part1(testInput) == 14)

    //val input = readInput("Day01")
    //println(part1(input))
    //println(part2(input))
}
