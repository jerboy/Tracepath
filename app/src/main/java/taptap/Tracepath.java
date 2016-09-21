package taptap;

import android.util.Log;

public class Tracepath {
    static {
        System.loadLibrary("tracert");
    }

    private Callback mCallback;

    public Tracepath(Callback callback){
        this.mCallback = callback;
    }

    public native void beginTrace(String path);

    public void callback(String update) {
        Log.d("callback ", update + " " + Thread.currentThread().getName());
        if (null != mCallback) {
            mCallback.onUpdate(update);
        }
    };

    public  interface Callback{
        void onUpdate(String update);
    }
}
