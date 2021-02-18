import com.webpage.checker.CheckerService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheckerApplicationTests {
    private val audioBooksURL = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37479"
    private val ebooksURL = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37473"

    @Test
    fun `Test New AudioBook Counts`() {
        val audiobooks = CheckerService.retrieveNewBookCount(audioBooksURL)
        if (audiobooks != 0) {
            assertEquals(83, audiobooks)
        }
    }

    @Test
    fun `Test New eBook Counts`() {
        val ebooks = CheckerService.retrieveNewBookCount(ebooksURL)
        if (ebooks != 0) {
            assertEquals(70, ebooks)
        }
    }
}
