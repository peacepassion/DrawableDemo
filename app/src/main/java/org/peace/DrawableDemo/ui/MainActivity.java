package org.peace.DrawableDemo.ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import org.peace.DrawableDemo.R;
import org.peace.DrawableDemo.util.LogHelper;


public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = LogHelper.getNativeSimpleLogTag(MainActivity.class, LogHelper.DEFAULT_LOG_TAG);

    @InjectView(R.id.v_l_1)
    View vl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        vl1.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.red)));
    }

    @OnClick({R.id.v_l_1, R.id.v_r_1})
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.v_l_1) {

        }
    }
}
