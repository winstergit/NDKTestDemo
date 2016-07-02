#include "com_example_wyx_ndktestdemo_ndk_JNIUtils.h"
#include <string.h>
JNIEXPORT jstring JNICALL Java_com_example_wyx_ndktestdemo_ndk_JNIUtils_getStringFormC
  (JNIEnv *env,jobject jclass){
  return (*env)->NewStringUTF(env,"ceshi:这里是来自c的String");
  }