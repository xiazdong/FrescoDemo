package xiazdong.me.frescodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BasicUsageActivity extends AppCompatActivity {

    @BindView(R.id.btn_image)
    SimpleDraweeView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_usage);
        ButterKnife.bind(this);
        //mImageView.setImageURI("res:///" + R.mipmap.img_01);
    }
}
