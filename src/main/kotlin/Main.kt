fun main() {
    print("Input size of list: ")
    val size = readln().toInt()
    println("Enter the numbers one at a time:")
    val list = mutableListOf<Int>()
    repeat(size) {
        val num = readln().toInt()
        list.add(num)
    }
    var count = 0
    repeat(size) { index ->
        if (size - index >= 3) {
            if (list[index] + 1 == list[index + 1] &&
                list[index + 1] + 1 == list[index + 2]
            ) count ++
        }
    }

    println()
    println("Number of triples in this list: $count")
}