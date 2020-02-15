package `in`.co.droidcon
import `in`.co.droidcon.BreedModelTest
import `in`.co.droidcon.SqlDelightTest
import kotlinx.coroutines.runBlocking

actual fun <T> runTest(block: suspend () -> T) { runBlocking { block() } }

class SqlDelightTestJvm : SqlDelightTest()

class BreedModelTestJvm: BreedModelTest()