package org.peace.DrawableDemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import org.peace.DrawableDemo.R;
import org.peace.DrawableDemo.util.LogHelper;


public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = LogHelper.getNativeSimpleLogTag(MainActivity.class, LogHelper.DEFAULT_LOG_TAG);

    @InjectView(R.id.btn1)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);
    }

    @OnClick({R.id.btn1})
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn1) {

        }
    }
}
