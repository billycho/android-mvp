package com.qwerapps.androidmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BattleOfBastards a = new BattleOfBastards();
//        a.startWar();

        ButterKnife.bind(this);
        title.setText("Hello from Butterknife");

    }

    @OnClick(R.id.button)
    public void submit()
    {
        Toast.makeText(MainActivity.this, "Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT).show();

    }
}
