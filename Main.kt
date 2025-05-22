// Main.kt

object WorldLib {
  // Declare the native method. 'external' is Kotlin's keyword for native methods.
  // 'native' keyword is also used.
  external fun callNativeWorld(): Int // Signature matches C's 'int world()' conceptually

  // This block runs when the WorldLib object is first accessed.
  // It loads the native library.
  init {
    try {
      // Load the library named "world". JNI expects "libworld.dylib" on macOS
      System.loadLibrary("world")
      println("Native library 'world' loaded successfully.")
    } catch (e: UnsatisfiedLinkError) {
      println("Error loading native library:")
      println("Make sure the compiled shared library (libworld.dylib)")
      println("is in your system's library path or specified via -Djava.library.path=.")
      e.printStackTrace()
      // Exit or handle the error appropriately if the native lib is crucial
      // System.exit(1)
    }
  }
}

fun main() {
  println("Hello")

  // Call the native method via the object
  try {
    println("Calling native world() function...")
    val result = WorldLib.callNativeWorld()
    println("Native function returned: $result")
  } catch (e: UnsatisfiedLinkError) {
    // This catch block might be redundant if loading failed in init,
    // but good practice if the call itself could fail for other reasons.
    println("Failed to call native method: ${e.message}")
    e.printStackTrace()
  }
}
