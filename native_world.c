#include "WorldLib.h"
#include <stdio.h>

int world() {
  printf("WORLD");
  return 0; 
}

JNIEXPORT jint JNICALL Java_WorldLib_callNativeWorld(JNIEnv* env, jobject obj) {
    return world();
}

