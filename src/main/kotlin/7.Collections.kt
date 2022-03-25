/**Collections
Koleksi biasanya berisi sejumlah objek (mungkin berjumlah 0) yang memiliki tipe yang sama.
Objek dalam sebuah koleksi dipanggil dengan elemen atau item. Jenis koleksi di Kotlin terdiri
dari:
1) List : adalah sebuah koleksi terurut yang dapat menyimpan elemen yang sama lebih dari
satu kali. Contohnya kelompok kata dalam sebuah kalimat.
2) Set : adalah koleksi yang memiliki elemen yang unik. Contohnya set alpabhet.
3) Map (atau kamus) : adalah sebuah set pasangan kunci dan nilai (key-value). Kunci
bersifat unik dan hanya memiliki satu nilai. Sedangkan nilai yang ada pada Map dapat
bernilai ganda/sama.
Menurut sifatnya jenis koleksi terbagi menjadi 2 yaitu :
 A read-only interface yang menyediakan operasi untuk mengakses elemen.
 A mutable interface adalah perluasan dari read-only interface yang berkorespodensi
dengan operasi : menambahkan, menghapus, dan mengubah elemen.*/

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}
fun main(args: Array<String>) {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}