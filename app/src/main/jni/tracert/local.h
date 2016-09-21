#ifndef LOCAL_H
#define LOCAL_H
#include <android/log.h>

#define TAG "taptap_trace"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, TAG, "%s",  __VA_ARGS__)
#define LOGDD(...) __android_log_print(ANDROID_LOG_DEBUG, TAG,  __VA_ARGS__)

int notifyUpdateToJava(const char* logs, ...);

void notifyEnd();
#endif