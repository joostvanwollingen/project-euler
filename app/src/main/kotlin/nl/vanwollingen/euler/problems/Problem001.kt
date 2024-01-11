package nl.vanwollingen.euler.problems

fun main() {
    Problem001().solve()
}

class Problem001 {
    fun solve() {
        val multipleOf3: MutableList<Int> = mutableListOf()
        val multipleOf5: MutableList<Int> = mutableListOf()

        for (i in 1..999) {
            if (i % 5 == 0) {
                multipleOf5 += i
                continue
            }
            if (i % 3 == 0) {
                multipleOf3 += i
            }
        }
        println((multipleOf3 + multipleOf5).sum())
    }
}