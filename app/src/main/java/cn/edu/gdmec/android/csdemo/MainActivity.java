package cn.edu.gdmec.android.csdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout view;
    private TextView show;
    private EditText input;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        view = (LinearLayout) findViewById(R.id.view);
        findViewById(R.id.send).setOnClickListener(this);
        show = (TextView) findViewById(R.id.show);
    }

    private EditText getInput() {
        return (EditText) findViewById(R.id.input);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.send:
                break;
        }
    }

    private void initView() {
        input = (EditText) findViewById(R.id.input);
        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(this);
    }

    private void submit() {
        // validate
        String inputString = input.getText().toString().trim();
        if (TextUtils.isEmpty(inputString)) {
            Toast.makeText(this, "inputString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
