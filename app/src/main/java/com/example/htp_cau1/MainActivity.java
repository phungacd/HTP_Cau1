package com.example.htp_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tk, mk;
    Button dangnhap;
    CheckBox luu;
    AlertDialog.Builder builder1;
    AlertDialog.Builder builder2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tk = findViewById(R.id.txttaikhoan);
        mk = findViewById(R.id.txtmatkhau);
        dangnhap = findViewById(R.id.btndangnhap);
        luu = findViewById(R.id.checkBox);
        builder1 = new AlertDialog.Builder(this);
        builder1.setTitle("Thông báo");

        builder2 = new AlertDialog.Builder(this);
        builder2.setTitle("Thông báo");

        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (luu.isChecked()) {
                    builder1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                } else {
                    builder2.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                        }
                builder1.show();


            }
        });

    }
}
