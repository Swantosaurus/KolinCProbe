object WorldLib {
  external fun callNativeWorld(): Int // Signature matches C's 'int world()' conceptually

  init {
    try {
      System.loadLibrary("world")
      println("Native library 'world' loaded successfully.")
    } catch (e: UnsatisfiedLinkError) {
      println("Error loading native library:")
      println("Make sure the compiled shared library (libworld.dylib)")
      println("is in your system's library path or specified via -Djava.library.path=.")
      e.printStackTrace()
    }
  }
}

fun main() {
  println("Hello")

  try {
    println("Calling native world() function...")
    val result = WorldLib.callNativeWorld()
    println("Native function returned: $result")
  } catch (e: UnsatisfiedLinkError) {
    println("Failed to call native method: ${e.message}")
    e.printStackTrace()
  }
}
