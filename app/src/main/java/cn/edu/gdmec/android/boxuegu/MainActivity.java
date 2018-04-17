package cn.edu.gdmec.android.boxuegu;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private FrameLayout mBodyLayout;
public LinearLayout mBottomLayout;
private View mExercisesBtn;
private View mCourseBtn;
private View mMyInfoBtn;
private TextView tv_course;
private TextView tv_exercies;
private TextView tv_myInfo;
private ImageView iv_course;
private ImageView iv_myInfo;
private ImageView iv_exercies;
private TextView tv_back;
private  TextView tv_main_title;
private RelativeLayout rl_title_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        init();
        initBottomBar();
        setListener();
        setInitStatus();


    }

    private void setInitStatus() {
    }

    private void setListener() {
        
    }

    private void initBottomBar() {
        
    }

    private void init() {
        tv_back=(TextView)findViewById(R.id.tv_back);
        tv_main_title=(TextView)findViewById(R.id.tv_main_title);
        tv_main_title.setText("博学谷课程");
        rl_title_bar=(RelativeLayout)findViewById(R.id.title_bar);
        rl_title_bar.setBackgroundColor(Color.parseColor("#30B4FF"));
        tv_back.setVisibility(View.GONE);
        initBodyLayout();
        
    }

    private void initBodyLayout() {
    }

    @Override
    public void onClick(View view) {
        
    }
}
