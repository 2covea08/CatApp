fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    binnie.walk()
    clyde.walk()
    repeat(2){
        flathead.eat()
    }
    println(flathead)
    repeat(4){
        cupra.walk()
    }
    println(cupra)
    println(binnie)
    println(clyde)
}