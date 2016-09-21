package util.taptap.com.traceroute;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import taptap.Tracepath;

public class MainActivity extends AppCompatActivity {

    private TextView mText;

    private Handler mHandler;

    private StringBuilder builer = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.text);

        mHandler = new Handler();

        new Thread(new Runnable() {
            @Override
            public void run() {
                new Tracepath(new Tracepath.Callback() {
                    @Override
                    public void onUpdate(final String update) {
                        Log.d("traceroutelog", update) ;
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                builer.append(update);
                                mText.setText(builer.toString());
                            }
                        });
                    }
                }).beginTrace("www.taptap.com");
            }
        }).start();
    }
}
