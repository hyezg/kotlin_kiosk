package com.example.kiosk01

fun main() {
    menu()
    val list = init()

    while (true) {
        val num = readLine()!!.toInt()

        //num이 0~4이 아니라면 메인으로 돌아감
        if (num !in 0..4) {
            println("잘못입력했습니다.다시 입력해주세요.")
            main()
        }

        when (num) {
            in 1..4 -> list[num - 1].detailmenu()
            0 -> {
                println("종료 합니다.처음페이지에서 종료")
                System.exit(0) //종료
                break
            }
        }
    }
}

fun init(): Array<Food> {
    val hamN = Burger()
    val pizN = Pizza()
    val chickN = Chicken()
    val drinkN = Drink()
    val initlist = arrayOf(hamN, pizN, chickN, drinkN)

    return initlist

}

//처음 메뉴판
fun menu() {
    println("===메뉴판===")
    println("1. 햄버거")
    println("2. 피자")
    println("3. 치킨")
    println("4. 음료")
    println("0. 종료")
    print("번호를 입력하세요: ")
}


//상속하는 Food 클래스 : name,price, material
open class Food {
    //선언 및 초기화
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

    open fun detailmenu() {
    }

    open fun displayInfo() {
        println("$name | $price | $material")
    }
}


//Food클래스한테 상속받은 Burger 클래스
open class Burger : Food() {
    override fun detailmenu() {
        println("===햄버거===")
        print("1.")
        BurgerA().displayInfo()
        print("2.")
        BurgerB().displayInfo()
        print("3.")
        BurgerC().displayInfo()
        println("0. 뒤로가기")
        selectmenu()
    }
}


class BurgerA : Burger() {
    override fun displayInfo() {
        name = "Burger a"
        price = 10000
        material = "양상추, 치즈가 들어간 "
        super.displayInfo()
    }
}

class BurgerB : Burger() {
    override fun displayInfo() {
        name = "Burger b"
        price = 8500
        material = "치킨패티가 들어간"
        super.displayInfo()
    }
}

class BurgerC : Burger() {
    override fun displayInfo() {
        name = "Burger c"
        price = 96000
        material = "버섯이 들어간"
        super.displayInfo()
    }
}

// Food 클래스한테 상속받은 Pizza 클래스
open class Pizza : Food() {
    override fun detailmenu() {
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
}

class PizzaA() : Pizza() {

    override fun displayInfo() {
        name = "Pizza A"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}

class PizzaB() : Pizza() {
    override fun displayInfo() {
        name = "Pizza B"
        price = 19000
        material = "불고기가 들어간"
        super.displayInfo()
    }
}

class PizzaC() : Pizza() {
    override fun displayInfo() {
        name = "Pizza C"
        price = 17000
        material = "새우가 들어간"
        super.displayInfo()
    }
}

// Food 클래스한테 상속받은 Chicken 클래스
open class Chicken : Food() {
    override fun detailmenu() {
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
}

class ChickenA() : Chicken() {
    override fun displayInfo() {
        name = "Chicken A"
        price = 17000
        material = "후라이드"
        super.displayInfo()
    }
}

class ChickenB() : Chicken() {
    override fun displayInfo() {
        name = "Chicken B"
        price = 18000
        material = "양념"
        super.displayInfo()
    }
}

class ChickenC() : Chicken() {
    override fun displayInfo() {
        name = "Chicken C"
        price = 19000
        material = "매운 양념"
        super.displayInfo()
    }
}

// Food 클래스한테 상속받은 Drink 클래스
open class Drink : Food() {
    override fun detailmenu() {
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
}

class DrinkA() : Chicken() {
    override fun displayInfo() {
        name = "Drink A"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}

class DrinkB() : Chicken() {
    override fun displayInfo() {
        name = "Drink B"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}

class DrinkC() : Chicken() {
    override fun displayInfo() {
        name = "Drink C"
        price = 15000
        material = "고구마가 들어간"
        super.displayInfo()
    }
}