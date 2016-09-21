package taptap;

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
        if (null != mCallback) {
            mCallback.onUpdate(update);
        }
    };

    public void end() {
        if (null != mCallback) {
            mCallback.onEnd();
        }
    }

    public  interface Callback{
        void onUpdate(String update);

        void onEnd();
    }
}
