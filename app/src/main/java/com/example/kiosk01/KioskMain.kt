package com.example.kiosk01

fun main() {
    val order = Order()
    order.menu()

    val hamN = Burger()
    val pizN = Pizza()
    val chickN = Chicken()
    val drinkN = Drink()

    while(true) {
        val num = readLine()!!.toInt()

        //num이 0~4이 아니라면 메인으로 돌아감
        if (num !in 0..4) {
            println("잘못입력했습니다.다시 입력해주세요.")
            main()
        }

        when (num) {
            1 -> hamN.detailmenu()
            2 -> pizN.detailmenu()
            3 -> chickN.detailmenu()
            4 -> drinkN.detailmenu()
            0 -> {
                println("종료 합니다.처음페이지에서 종료")
                System.exit(0) //종료
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
    //음식들 기본값?
    var name = ""
    var price = 0
    var material = ""

    //상세메뉴판에서 상세 메뉴 고르기. 일단 1,2,3하면 메인화면으로 돌아감.
    fun ordermenu() {
        val num2 = readln().toInt()
        when (num2) {
            1, 2, 3 -> main()
            0 -> {
                println("뒤로갑니다.")
                main()
            }
            else -> {
                println("0~4까지 입력가능합니다.")
            }
        }
    }

    fun selectmenu() {
        println("상세 메뉴에서 고르세요")
        ordermenu()
    }
}


//Food클래스한테 상속받은 Burger 클래스
open class Burger : Food() {
    fun detailmenu() {
        println("===햄버거===")
        print("1.")
        BurgerA().burgerlist()
        print("2.")
        BurgerB().burgerlist()
        print("3.")
        BurgerC().burgerlist()
        println("0. 뒤로가기")
        selectmenu()
    }

    open fun burgerlist() {
        println("$name | $price | $material")
    }
}

//상세 메뉴 따로 클래스 만들어야하나?
class BurgerA : Burger() {
    override fun burgerlist() {
        name = "burger a"
        price = 10000
        material = "버거 에이 "
        super.burgerlist()
    }
}
class BurgerB : Burger() {
    override fun burgerlist() {
        name = "burger b"
        price = 20000
        material = "버거 비~"
        super.burgerlist()
    }
}
class BurgerC: Burger() {
    override fun burgerlist() {
        name = "burger c"
        price = 18000
        material = "버거 c~"
        super.burgerlist()
    }
}

// Food 클래스한테 상속받은 Pizza 클래스
open class Pizza : Food() {
    fun detailmenu() {
        println("===피자===")
        print("1.")
        PizzaA().displayInfo()
        print("2.")
        PizzaB().displayInfo()
        print("3.")
        PizzaC().displayInfo()
        println("0. 뒤로가기")
        selectmenu()
    }
    open fun displayInfo() {
        println("$name | $price | $material")
    }
}

class PizzaA(): Pizza() {
    override fun displayInfo() {
        name = "pizza A"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}
class PizzaB(): Pizza() {
    override fun displayInfo() {
        name = "pizza B"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}
class PizzaC(): Pizza() {
    override fun displayInfo() {
        name = "pizza C"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}

// Food 클래스한테 상속받은 Chicken 클래스
open class Chicken : Food() {
    fun detailmenu() {
        println("===치킨===")
        print("1.")
        ChickenA().displayInfo()
        print("2.")
        ChickenB().displayInfo()
        print("3.")
        ChickenC().displayInfo()
        println("0. 뒤로가기")
        selectmenu()
    }
    open fun displayInfo() {
        println("$name | $price | $material")
    }
}

class ChickenA(): Chicken() {
    override fun displayInfo() {
        name = "chicken A"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}
class ChickenB(): Chicken() {
    override fun displayInfo() {
        name = "chicken B"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}
class ChickenC(): Chicken() {
    override fun displayInfo() {
        name = "chicken C"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}

// Food 클래스한테 상속받은 Drink 클래스
open class Drink : Food() {
    fun detailmenu() {
        println("===음료===")
        print("1.")
        DrinkA().displayInfo()
        print("2.")
        DrinkB().displayInfo()
        print("3.")
        DrinkC().displayInfo()
        println("0. 뒤로가기")
        selectmenu()
    }
    open fun displayInfo() {
        println("$name | $price | $material")
    }
}

class DrinkA(): Chicken() {
    override fun displayInfo() {
        name = "Drink A"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}
class DrinkB(): Chicken() {
    override fun displayInfo() {
        name = "Drink B"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}
class DrinkC(): Chicken() {
    override fun displayInfo() {
        name = "Drink C"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}