cmake_minimum_required(VERSION 3.5)
project(jni)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES
    traceroute6/Android.mk
    traceroute6/SNAPSHOT.h
    traceroute6/traceroute6.c
    tracert/Android.mk
    tracert/local.c
    tracert/tracepath.c
    Android.mk)


include_directories(/Users/caojianbo/DEV/android-ndk-r10e/platforms/android-21/arch-arm64/usr/include)
add_executable(jni ${SOURCE_FILES})