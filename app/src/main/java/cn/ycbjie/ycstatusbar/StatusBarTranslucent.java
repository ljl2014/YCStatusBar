package cn.ycbjie.ycstatusbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.ycbjie.ycstatusbarlib.bar.YCAppBar;


public class StatusBarTranslucent extends AppCompatActivity {

    boolean isHide;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_translucent);
        YCAppBar.translucentStatusBar(this, false);

        findViewById(R.id.toggle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHide = !isHide;
                YCAppBar.translucentStatusBar(StatusBarTranslucent.this, isHide);
            }
        });
    }
}
