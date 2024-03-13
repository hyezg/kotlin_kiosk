package com.example.kiosk01
fun main() {
        val or = Order()
        or.menu()

        while(true) {
            val num = readLine()!!.toInt()

            if (num !in 0..3) {
                println("0~3까지 입력가능합니다.")
                main()
            }

            val hamN = Ham()
            val pizN = Piz()
            val chickN = Chicken()


            when (num) {
                1 -> {
                    hamN.orr()
                    hamN.select()
                }

                2 -> {
                    pizN.orr()
                    pizN.select()
                }

                3 -> {
                    chickN.orr()
                    chickN.select()
                }

                0 -> {
                    println("종료 합니다.")
                    break
                }
            }
        }

}
class Order {
    fun menu() {
        println("===메뉴판===")
        println("1. 햄버거")
        println("2. 피자")
        println("3. 치킨")
        println("0. 종료")
        print("번호를 입력하세요: ")
    }
}

open class Food {
    var name =""
    var price = 0
    var material = ""

    fun ordermenu() {
        val num2 = readln().toInt()
        when (num2) {
            1,2,3 -> main()
            0 -> {
                println("뒤로가기입니다.")
                main()
            }
        }
    }

    fun hambuger(): String {
        name = "햄버거"
        price = 100000
        material = "기본 재료"
        return "$name, $price, $material"
    }
}
open class Ham : Food() {

    fun orr() {
        println("===햄버거===")
        println("1.${BurgerA()}")
        println("2.${BurgerB()}")
        println("3.${BurgerC()}")
        println("가장 기본은 ${hambuger()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("셀렉트입니다. 번호를 고르세요")
        ordermenu()

    }


    fun BurgerA(): String {
        name = "burger A"
        price = 9000
        material = "토마토, 체리 페퍼에 쉑소스가.."
        return "$name | $price 원 | $material"
    }
    fun BurgerB(): String {
        name = "burger B"
        price = 10000
        material = "토마토,   체리 페퍼에 쉑소스가.."
        return "$name| $price 원 | $material"
    }
    fun BurgerC(): String {
        name = "burger C"
        price = 8000
        material = "토마토,   체리 페퍼에 쉑소스가.."
        return "$name| $price 원 | $material"
    }
    /*open fun burgerlist(name:String, price:Int, material:String) {
            println("${name}, ${price}, ${material}")
    }*/
}


open class Piz : Food() {
    /*var name =""
    var price = 0
    var material = ""*/

    fun orr() {
        println("===피자===")
        println("1.${PizzaA()}")
        println("2.${PizzaB()}")
        println("3.${PizzaC()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("셀렉트입니다. 번호를 고르세요")
        ordermenu()
    }

    fun PizzaA(): String {
        name = "pizz A"
        price = 9000
        material = "토마토, 체리 페퍼에 쉑소스가.."
        return "$name | $price 원 | $material"
    }
    fun PizzaB(): String {
        name = "pizza B"
        price = 10000
        material = "토마토,   체리 페퍼에 쉑소스가.."
        return "$name| $price 원 | $material"
    }
    fun PizzaC(): String {
        name = "pizza C"
        price = 8000
        material = "토마토,   체리 페퍼에 쉑소스가.."
        return "$name| $price 원 | $material"
    }

}

/*class BurgerA : Ham() {
    override fun burgerlist(name: String, price: Int, material: String) {
        super.burgerlist("buger A", 9000, "토마토, 체리 페퍼에 쉑소스가..")

    }
}

class BurgerB : Ham() {
    override fun burgerlist(name: String, price: Int, material: String) {
        super.burgerlist("buger b", 9000, "토마토, 체리 페퍼에 쉑소스가..")

    }
}

class BurgerC: Ham() {
    override fun burgerlist(name: String, price: Int, material: String) {
        super.burgerlist("buger C", 9000, "토마토, 체리 페퍼에 쉑소스가..")

    }
}*/

open class Chicken : Food() {
    /*var name =""
    var price = 0
    var material = ""*/

    fun orr() {
        println("===치킨===")
        println("1.${ChickenA()}")
        println("2.${ChickenB()}")
        println("3.${ChickenC()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("셀렉트입니다. 번호를 고르세요")
        ordermenu()
    }

    fun ChickenA(): String {
        name = "chicken A"
        price = 9000
        material = "토마토, 체리 페퍼에 쉑소스가.."
        return "$name | $price 원 | $material"
    }
    fun ChickenB(): String {
        name = "chicken B"
        price = 10000
        material = "토마토,   체리 페퍼에 쉑소스가.."
        return "$name| $price 원 | $material"
    }
    fun ChickenC(): String {
        name = "chicken C"
        price = 8000
        material = "토마토,   체리 페퍼에 쉑소스가.."
        return "$name| $price 원 | $material"
    }

}

