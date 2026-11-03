// Task 4.4: serving JSON data

import kotlinx.serialization.Serializable

@Serializable
class DieRoll(val sides: Int) {
    val result: Int

    init {
        require(sides > 0) { "Number of sides must be positive" }

        result = (1..sides).random()
    }
}
