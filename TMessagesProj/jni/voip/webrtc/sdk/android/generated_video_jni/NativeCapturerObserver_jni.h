// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.


// This file is autogenerated by
//     base/android/jni_generator/jni_generator.py
// For
//     org/webrtc/NativeCapturerObserver

#ifndef org_webrtc_NativeCapturerObserver_JNI
#define org_webrtc_NativeCapturerObserver_JNI

#include <jni.h>

#include "webrtc/sdk/android/src/jni/jni_generator_helper.h"


// Step 1: Forward declarations.

JNI_REGISTRATION_EXPORT extern const char kClassPath_org_webrtc_NativeCapturerObserver[];
const char kClassPath_org_webrtc_NativeCapturerObserver[] = "org/webrtc/NativeCapturerObserver";
// Leaking this jclass as we cannot use LazyInstance from some threads.
JNI_REGISTRATION_EXPORT std::atomic<jclass> g_org_webrtc_NativeCapturerObserver_clazz(nullptr);
#ifndef org_webrtc_NativeCapturerObserver_clazz_defined
#define org_webrtc_NativeCapturerObserver_clazz_defined
inline jclass org_webrtc_NativeCapturerObserver_clazz(JNIEnv* env) {
  return base::android::LazyGetClass(env, kClassPath_org_webrtc_NativeCapturerObserver,
      &g_org_webrtc_NativeCapturerObserver_clazz);
}
#endif


// Step 2: Constants (optional).


// Step 3: Method stubs.
namespace  webrtc {
namespace jni {


static std::atomic<jmethodID> g_org_webrtc_NativeCapturerObserver_Constructor(nullptr);
static base::android::ScopedJavaLocalRef<jobject> Java_NativeCapturerObserver_Constructor(JNIEnv*
    env, jlong nativeSource) {
  jclass clazz = org_webrtc_NativeCapturerObserver_clazz(env);
  CHECK_CLAZZ(env, clazz,
      org_webrtc_NativeCapturerObserver_clazz(env), NULL);

  jni_generator::JniJavaCallContextChecked call_context;
  call_context.Init<
      base::android::MethodID::TYPE_INSTANCE>(
          env,
          clazz,
          "<init>",
          "(J)V",
          &g_org_webrtc_NativeCapturerObserver_Constructor);

  jobject ret =
      env->NewObject(clazz,
          call_context.base.method_id, nativeSource);
  return base::android::ScopedJavaLocalRef<jobject>(env, ret);
}

}  // namespace jni
}  // namespace  webrtc

#endif  // org_webrtc_NativeCapturerObserver_JNI
