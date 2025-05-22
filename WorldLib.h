// WorldLib.h (MANUALLY CREATED - CORRECTED)
/*
 * This file defines the JNI function signature required by WorldLib.class.
 * It was manually created based on 'javap -s -p WorldLib' output,
 * accounting for Kotlin objects compiling to static methods.
 */
#include <jni.h>

#ifndef _Included_WorldLib
#define _Included_WorldLib
#ifdef __cplusplus
extern "C" {
#endif

/*
 * Class:     WorldLib
 * Method:    callNativeWorld
 * Signature: ()I
 */
// Correct: Use jclass for a static method
JNIEXPORT jint JNICALL Java_WorldLib_callNativeWorld(JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
