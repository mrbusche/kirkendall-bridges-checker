import com.webpage.checker.CheckerService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheckerApplicationTests {
    private val audioBooksURL = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37479"
    private val ebooksURL = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37473"

    @Test
    fun `Test New AudioBook Counts`() {
        val newBooks = CheckerService.retrieveNewBookCount(audioBooksURL)
        if (newBooks != 0) {
            assertEquals(86, newBooks)
        }
    }

    @Test
    fun `Test New eBook Counts`() {
        val newBooks = CheckerService.retrieveNewBookCount(ebooksURL)
        if (newBooks != 0) {
            assertEquals(77, newBooks)
        }
    }
}
