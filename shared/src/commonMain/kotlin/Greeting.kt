import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    /**
     * Returns a greeting for the given platform.
     *
     */
    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"

        return "$firstWord Guess what this is! > ${platform.name.reversed()}!"
    }
}