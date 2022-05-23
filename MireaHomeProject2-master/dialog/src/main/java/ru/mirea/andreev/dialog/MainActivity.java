package ru.mirea.andreev.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view){
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onClickShowTimeDialog(View view){
        MyTimeDialogFragment myTimeDialogFragment = new MyTimeDialogFragment();
        myTimeDialogFragment.show(getSupportFragmentManager(), "time fragment");
    }
    public void onClickShowProgressDialog(View view){
        MyProgressDialogFragment myProgressDialogFragment = new MyProgressDialogFragment();
        myProgressDialogFragment.show(getSupportFragmentManager(), "progress fragment");
    }
    public void onClickShowDateDialog(View view){
        MyDateDialogFragment dateDialogFragment = new MyDateDialogFragment();
        dateDialogFragment.show(getSupportFragmentManager(), "date fragment");
    }
}