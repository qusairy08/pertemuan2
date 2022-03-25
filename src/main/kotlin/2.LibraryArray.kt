fun main(args: Array<String>) {
// Creates an Array<String> with sizes 5 and values ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}

/**Berikut adalah Library Array dan beberapa fungsi anggota seperti size, get(), set() yang ada di
Kotlin:
class Array<T> private constructor() {
val size: Int
operator fun get(index: Int): T
operator fun set(index: Int, value: T): Unit
operator fun iterator(): Iterator<T>
// ...
}*/