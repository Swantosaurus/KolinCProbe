#include <jni.h>

#ifndef _Included_WorldLib
#define _Included_WorldLib
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jint JNICALL Java_WorldLib_callNativeWorld(JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
