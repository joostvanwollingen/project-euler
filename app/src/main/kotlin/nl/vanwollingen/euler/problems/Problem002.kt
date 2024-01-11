package nl.vanwollingen.euler.problems

fun main() {
    Problem002().solve()
}

class Problem002 {
    fun solve() {
        var prev = 1 to 2
        var sum = 2
        while ((prev.first + prev.second) <= 4000000) {
            if ((prev.first + prev.second) % 2 == 0) {
                sum += prev.first + prev.second
            }
            prev = prev.second to prev.first + prev.second
        }
        println(sum)
    }
}