// Task 4.5.1: Ktor application testing

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication

@Suppress("Unused")
class ApplicationTest : FreeSpec({
    "Path / yields 'Hello World!' greeting" {
        testApplication {
            configure()
            val response = client.get("/")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/plain")
            response.bodyAsText() shouldBe "Hello World!"
        }
    }

    "Path /hello/{name} yields a greeting with the name" {
        testApplication {
            configure()
            val response = client.get("/hello/Charlie")
            response.status shouldBe HttpStatusCode.OK
            response.headers["Content-Type"]?.shouldContain("text/plain")
            response.bodyAsText() shouldBe "Hello Charlie!"
        }
    }

    "Different names have different greetings" {
        testApplication {
            configure()
            val response1 = client.get("/hello/Alice")
            response1.status shouldBe HttpStatusCode.OK
            response1.headers["Content-Type"]?.shouldContain("text/plain")
            response1.bodyAsText() shouldBe "Hello Alice!"

            val response2 = client.get("/hello/Bob")
            response2.status shouldBe HttpStatusCode.OK
            response2.headers["Content-Type"]?.shouldContain("text/plain")
            response2.bodyAsText() shouldBe "Hello Bob!"
        }
    }

    "Path /hello/ with no name yields HttpStatusCode.NotFound" {
        testApplication {
            configure()
            val response = client.get("/hello/")
            response.status shouldBe HttpStatusCode.NotFound
        }
    }
})
