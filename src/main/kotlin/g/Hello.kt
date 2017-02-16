package g

import com.fasterxml.jackson.databind.ObjectMapper
import win.sourcecode.test.TestBean


// mvn exec:java -Dexec.args="argument1" -Dexec.mainClass=g.HelloKt
fun main(args: Array<String>) {
    println("Hello, World")

    val bean = TestBean()
    bean.age = 18
    bean.name = "wenyou"

    println(ObjectMapper().writeValueAsString(bean))
    println("123")
}
