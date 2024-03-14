package com.example.kiosk01
fun main() {
        val order = Order()
        order.menu()

        while(true) {
            val num = readLine()!!.toInt()

            //num이 0~3이 아니라면 메인으로 돌아감
            if (num !in 0..4) {
                println("0~4까지 입력가능합니다.")
                main()
            }

            val hamN = Burger()
            val pizN = Pizza()
            val chickN = Chicken()
            val drinkN = Drink()

            when (num) {
                1 -> {
                    hamN.detailmenu()
                    hamN.select()
                }

                2 -> {
                    pizN.detailmenu()
                    pizN.select()
                }

                3 -> {
                    chickN.detailmenu()
                    chickN.select()
                }
                4 -> {
                    drinkN.detailmenu()
                    drinkN.select()
                }

                0 -> {
                    println("종료 합니다.")
                    break
                }
            }
        }

}

//Order 클래스 : 처음 메뉴판
class Order {
    fun menu() {
        println("===메뉴판===")
        println("1. 햄버거")
        println("2. 피자")
        println("3. 치킨")
        println("4. 음료")
        println("0. 종료")
        print("번호를 입력하세요: ")
    }
}

//상속하는 Food 클래스 : name,price, material/
open class Food {
    var name = ""
    var price = 0
    var material = ""

    //상세메뉴판에서 상세 메뉴 고르기. 일단 1,2,3하면 메인화면으로 돌아감
    fun ordermenu() {
        val num2 = readln().toInt()
        when (num2) {
            1, 2, 3 -> main()
            0 -> {
                println("뒤로갑니다.")
                main()
            }
        }
    }

    //기본 세팅 그냥 해봄
    /*fun hambuger(): String {
        name = "햄버거"
        price = 100000
        material = "기본 재료"
        return "$name, $price, $material"
    }*/
}
//Food클래스한테 상속받은 Burger 클래스
open class Burger : Food() {
    fun detailmenu() {
        println("===햄버거===")
        //println("가장 기본은 ${hambuger()}")
        println("1.${burgerA()}")
        println("2.${burgerB()}")
        println("3.${burgerC()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("셀렉트입니다. 번호를 고르세요")
        ordermenu()

    }

    private fun burgerA(): String {
        name = "burger A"
        price = 9000
        material = "토마토, 양상추"
        return "$name | $price 원 | $material"
    }
    fun burgerB(): String {
        name = "burger B"
        price = 10000
        material = "베이컨, 치즈"
        return "$name| $price 원 | $material"
    }
    fun burgerC(): String {
        name = "burger C"
        price = 8000
        material = "체다치즈"
        return "$name| $price 원 | $material"
    }
    /*open fun burgerlist(name:String, price:Int, material:String) {
            println("${name}, ${price}, ${material}")
    }*/
}

// Food 클래스한테 상속받은 Pizza 클래스
open class Pizza : Food() {
    /*var name =""
    var price = 0
    var material = ""*/

    fun detailmenu() {
        println("===피자===")
        println("1.${pizzaA()}")
        println("2.${pizzaB()}")
        println("3.${pizzaC()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("==========셀렉트입니다. 번호를 고르세요")
        ordermenu()
    }

    fun pizzaA(): String {
        name = "pizza A"
        price = 15000
        material = "고구마가 들어간"
        return "$name | $price 원 | $material"
    }
    fun pizzaB(): String {
        name = "pizza B"
        price = 10000
        material = "페퍼로니가 들어간"
        return "$name| $price 원 | $material"
    }
    fun pizzaC(): String {
        name = "pizza C"
        price = 20000
        material = "고기가 들어간"
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

// Food 클래스한테 상속받은 Chicken 클래스
open class Chicken : Food() {
    /*var name =""
    var price = 0
    var material = ""*/

    fun detailmenu() {
        println("===치킨===")
        println("1.${chickenA()}")
        println("2.${chickenB()}")
        println("3.${chickenC()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("치킨 중 선택하세요.")
        ordermenu()
    }

    fun chickenA(): String {
        name = "chicken A"
        price = 18000
        material = "매운 양념이 들어간"
        return "$name | $price 원 | $material"
    }
    fun chickenB(): String {
        name = "chicken B"
        price = 19000
        material = "치즈 가루가 들어간"
        return "$name| $price 원 | $material"
    }
    fun chickenC(): String {
        name = "chicken C"
        price = 20000
        material = "마늘이 들어간~"
        return "$name| $price 원 | $material"
    }

}

// Food 클래스한테 상속받은 Drink 클래스
open class Drink : Food() {
    /*var name =""
    var price = 0
    var material = ""*/

    fun detailmenu() {
        println("===음료===")
        println("1.${drinkA()}")
        println("2.${drinkB()}")
        println("3.${drinkC()}")
        println("0. 뒤로가기")
    }

    fun select(){
        println("음료 중 선택하세요.")
        ordermenu()
    }

    fun drinkA(): String {
        name = "Drink A"
        price = 3000
        material = "자몽 에이드"
        return "$name | $price 원 | $material"
    }
    fun drinkB(): String {
        name = "Drink B"
        price = 6000
        material = "치즈 가루가 들어간"
        return "$name| $price 원 | $material"
    }
    fun drinkC(): String {
        name = "Drink C"
        price = 4500
        material = "마늘이 들어간~"
        return "$name| $price 원 | $material"
    }

}

