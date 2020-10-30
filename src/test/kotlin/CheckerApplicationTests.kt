import com.webpage.checker.CheckerService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheckerApplicationTests {
    private val audioBooksURL = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37479"
    private val ebooksURL = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37473"

    @Test
    fun `Test New AudioBook Counts`() {
        assertEquals(0, CheckerService.retrieveNewBookCount(audioBooksURL))
    }

    @Test
    fun `Test New eBook Counts`() {
        assertEquals(0, CheckerService.retrieveNewBookCount(ebooksURL))
    }
}
