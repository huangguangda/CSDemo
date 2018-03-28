package cn.edu.gdmec.android.csdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout view;
    private TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (LinearLayout) findViewById(R.id.view);
        findViewById(R.id.send).setOnClickListener(this);
        show = (TextView) findViewById(R.id.show);
    }

    private EditText getInput(){
        return (EditText) findViewById(R.id.input);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send:
                break;
        }
    }
}
