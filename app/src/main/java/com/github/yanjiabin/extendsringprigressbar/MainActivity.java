package com.github.yanjiabin.extendsringprigressbar;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.yanjiabin.extendsringprogressbarlib.RingProgressBar;


public class MainActivity extends AppCompatActivity {
    private RingProgressBar progressBar1;
    private RingProgressBar progressBar2;
    private int progress = 1;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar1 = (RingProgressBar) findViewById(R.id.progress_bar_1);
        progressBar2 = (RingProgressBar) findViewById(R.id.progress_bar_2);
        progressBar2.setProgress(1);
        handler.post(runnable);
        progressBar2 = (RingProgressBar) findViewById(R.id.progress_bar_2);
        progressBar2.setOnProgressListener(new RingProgressBar.OnProgressListener() {

            @Override
            public void progressToComplete() {
                Toast.makeText(MainActivity.this, "complete", Toast.LENGTH_SHORT).show();
            }
        });
    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (progress > 100) {
                handler.removeCallbacks(this);
            } else {
                progress++;
                progressBar2.setProgress(progress);
                progressBar1.setProgress(progress);
                handler.postDelayed(this, 1000);
            }
        }
    };
}