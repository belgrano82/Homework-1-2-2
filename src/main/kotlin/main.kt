//я долго искал, но так и не нашел правила, по которому бы определялось в каком случае лучше использовать "человекам", а в каком "людям") но вроде вот так)

fun main() {
    println("Введите количество лайков: ")

    val likes: Int = readln().toInt()

    if (likes.toString().length > 2 && likes.toString().endsWith("11")) println("Понравилось $likes человекам!")
    else if (likes.toString().endsWith("2") || likes.toString().endsWith("3") || likes.toString().endsWith("4")) println("Понравилось $likes людям!")
    else if (likes == 1 || likes.toString().endsWith("1") && likes != 11) println("Понравилось $likes человеку!")
    else println("Понравилось $likes человекам!")
}