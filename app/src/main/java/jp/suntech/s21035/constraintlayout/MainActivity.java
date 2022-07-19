
package jp.suntech.s21035.constraintlayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btn = (Button)findViewById(R.id.btConfirm);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText input1 = findViewById(R.id.etMtitle);
//                EditText input2 = findViewById(R.id.etName);
//                EditText input3 = findViewById(R.id.etMail);
//                EditText input4 = findViewById(R.id.etComment);
//                MyDialog dialog = new MyDialog();
//                dialog.show(getSupportFragmentManager(), "my_dialog");
//                String inputStr1 = input1.getText().toString();
//                String inputStr2 = input2.getText().toString();
//                String inputStr3 = input3.getText().toString();
//                String inputStr4 = input4.getText().toString();
//                String show = "タイトル:" + inputStr1+ "\nお名前" + inputStr2 + "\nメールアドレス" + inputStr3 + "\n質問内容"+inputStr4+"\n";
//                Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
//            }
//        });


        Button btClick =findViewById(R.id.btSend);
        Button btClickClear =findViewById(R.id.btClear);
        Button btClickClearCon =findViewById(R.id.btConfirm);
        ButtonClickListener listener = new ButtonClickListener();

        btClick.setOnClickListener(listener);
        btClickClear.setOnClickListener(listener);
        btClickClearCon.setOnClickListener(listener);
    }

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            EditText input1 = findViewById(R.id.etMtitle);
            EditText input2 = findViewById(R.id.etName);
            EditText input3 = findViewById(R.id.etMail);
            EditText input4 = findViewById(R.id.etComment);

            String inputStr1 = input1.getText().toString();
            String inputStr2 = input2.getText().toString();
            String inputStr3 = input3.getText().toString();
            String inputStr4 = input4.getText().toString();

            String show = "タイトル:" + inputStr1+ "\nお名前" + inputStr2 + "\nメールアドレス" + inputStr3 + "\n質問内容"+inputStr4+"\nを送信しました";


            int id = view.getId();
            switch (id) {
                case R.id.btConfirm:
                    MyDialog myDialog = new MyDialog();
                    myDialog.show(getSupportFragmentManager(), "MyDialog");
                    Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
                    break;


                case R.id.btSend:
                    Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
                    break;

                    case R.id.btClear:
                    input1.setText("");
                    input2.setText("");
                    input3.setText("");
                    input4.setText("");
                    break;


            }
        }
    }

}

