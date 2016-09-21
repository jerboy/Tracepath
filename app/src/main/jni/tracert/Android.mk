LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

# Enable PIE manually. Will get reset on $(CLEAR_VARS). This
# is what enabling PIE translates to behind the scenes.
#LOCAL_CFLAGS += -fPIE
# LOCAL_LDFLAGS += -fPIE -pie
LOCAL_LDLIBS := -llog
LOCAL_MODULE    := tracert
LOCAL_SRC_FILES := tracepath.c \
                    local.c

include $(BUILD_SHARED_LIBRARY)