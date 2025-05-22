// native_world.c
#include "WorldLib.h" // Include the MANUALLY CREATED header
#include <stdio.h>

// Your original world function
int world() {
  printf("WORLD\n"); // Added newline for cleaner output
  return 0; // Returns 0, which matches the 'jint' return type
}

// Implementation of the JNI function required by MainKt.h
// The signature MUST exactly match the one in MainKt.h
// Note: jclass clazz is used because callNativeWorld is a static method (from Kotlin object)
JNIEXPORT jint JNICALL Java_WorldLib_callNativeWorld(JNIEnv* env, jobject obj) {
    // In this simple case, we just call our original C function
    return world();
}

