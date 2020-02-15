package `in`.co.droidcon

import `in`.co.droidcon.BreedModelTest
import `in`.co.droidcon.SqlDelightTest
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.runBlocking
import org.junit.runner.RunWith

actual fun <T> runTest(block: suspend () -> T) { runBlocking { block() } }

@RunWith(AndroidJUnit4::class)
class SqlDelightTestJvm : SqlDelightTest()

@RunWith(AndroidJUnit4::class)
class BreedModelTestJvm: BreedModelTest()