package week_1

fun main() {

    // 1. 다음 코드의 출력 결과는?
    val a = 5
    val b = 2.5
    println(a + b)
    // => 7.5

    // 2. 다음 코드의 결과는?
    val s = "Kotlin"
    println("Hello $s!")
    // => Hello Kotlin!

    // 3.아래 코드에서 사용된 타입은 무엇인가요?
    val isDone = false
    // => Boolean

    // 4. **Char** 타입으로 한 글자 'A'를 변수로 선언하세요.
    val charA: Char = 'A'
    //

    // 5. **val x = 1.23** 은 어떤 타입으로 추론되나요?
    val k = 1.23
    // val x: Double = 1.23
    // => Double


    // 6. **Int**의 최대값을 저장하는 상수는 무엇인가요?
    println("Int의 최대값을 저장하는 상수 : ${Int.MAX_VALUE}")
    // => Int.MAX_VALUE : 2147483647

    // 7. 삼중 큰따옴표를 사용하면 어떤 장점이 있나요?
    // """abcd"""
    val sampleText = """
        Hello World!
        Welcome!
        Wow!
    """
    println("삼중 큰따옴표 :\n$sampleText\n")
    // 삼중 큰따옴표 String or 로(Raw) String
    // => 여러 줄에 걸친 문자열을 만들거나 특수 문자가 들어간 문자열을 만들어야 하는 경우 사용.

    // 8. 다음 코드에서 오류 없이 출력될 수 있도록 수정하세요:
    val x = 1
    println("Value is: ${x + 1}")
    // => Value is: 2

    // 9. 점수가 90점 이상이면 A, 80점 이상이면 B, 아니면 C로 출력하는 if 식을 작성하세요.
    val score: Int = 100
    var rank: String
    if (score > 90) {
        rank = "A"
    } else if (score > 80) {
        rank = "B"
    } else {
        rank = "C"
    }

    // 10. 아래 코드를 for 문으로 바꾸세요:
    /*
    println(1)
    println(2)
    println(3)
     */
    for (i in 1..3) {
        println(i)
    }

    // 11. 다음 **while** 반복문이 몇 번 반복되는지 예측하세요:
    var i = 0
    while (i < 4) {
        println(i)
        i++
    }
    // => 4번

    // 12. 1부터 10까지 짝수만 출력하는 코드를 작성하세요.
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }


    // 13. **val s = "banana"**에서 **"a"**가 몇 번 등장하는지 세는 코드를 작성하세요.
    val targetText = "banana"
    var numberOfA = 0
    for (i in 0..targetText.lastIndex) {
        if (targetText[i] == 'a') {
            numberOfA += 1
        }
    }
    println("banana 에서 a의 개수는 : $numberOfA")

    // 14. for 루프를 사용해 다음을 출력하세요. => 1 4 9 16 25
    for (i in 1..5) {
        println(i * i)
    }

    // 15. 다음 코드의 결과를 예측하세요.
    val n = 7
    val result = if (n % 2 == 0) "even" else "odd"
    println(result)
    // => odd

    // 16. 1부터 10까지 더한 합을 구하세요.
    var amount = 0
    for (num in 1..10) {
        amount += num
    }
    println("1부터 10까지 더한 합 : $amount")


    // 17. 에서 1까지 거꾸로 출력하는 **for**문을 작성하세요.
    for (num in 17 downTo 1) {
        println(num)
    }
}