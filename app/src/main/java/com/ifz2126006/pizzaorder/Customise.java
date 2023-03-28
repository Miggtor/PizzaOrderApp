package com.ifz2126006.pizzaorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class Customise extends AppCompatActivity {

    Pizza pizza;
    TextView total;
    double total_price;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customise);

        pizza = new Pizza();
        total = findViewById(R.id.TOTAL);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }



        });
    }
    public void openactivity3() {
        Intent intent = new Intent(this, Order.class);
        startActivity(intent);
    }


    public void RadioboxClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

    switch(view.getId()){
        case R.id.rb1:
            if(checked)
            pizza.setPizza_size_price(10);
            break;
        case R.id.rb2:
            if(checked)
                pizza.setPizza_size_price(15);
            break;
        case R.id.rb3:
            if(checked)
                pizza.setPizza_size_price(20);
            break;
}
        total.setText("Total Price:"+ pizza.getPizza_size_price()+"Fr.");
        total.setText("Total Price:"+ calculatetotal() +"Fr.");
}



    public void OnCheckChips(View view){

        boolean checked = ((Chip) view).isChecked();

        switch ((view.getId())){
            case R.id.chip:
                if(checked)
                pizza.setSpinach_price(1);
                else
                    pizza.setSpinach_price(0);
                break;

            case R.id.chip2:
                if(checked)
                    pizza.setSalami_price(2);
                else
                    pizza.setSalami_price(0);
                break;
            case R.id.chip3:
                if(checked)
                    pizza.setTomato_price(1);
                else
                    pizza.setTomato_price(0);
                break;

            case R.id.chip4:
                if(checked)
                    pizza.setHam_price(2);
                else
                    pizza.setHam_price(0);
                break;case R.id.chip5:
                if(checked)
                    pizza.setMushroom_price(1);
                else
                    pizza.setMushroom_price(0);
                break;

            case R.id.chip6:
                if(checked)
                    pizza.setBacon_price(2);
                else
                    pizza.setBacon_price(0);
                break;case R.id.chip7:
                if(checked)
                    pizza.setPepperoni_price(1);
                else
                    pizza.setPepperoni_price(0);
                break;

            case R.id.chip8:
                if(checked)
                    pizza.setSucuk_price(2);
                else
                    pizza.setSucuk_price(0);
                break;
        }
        total.setText("Total Price:"+ calculatetotal() +"Fr.");
    }

    private double calculatetotal() {
    total_price = pizza.getPizza_size_price() +
            pizza.getTomato_price()+
            pizza.getHam_price()+
            pizza.getMushroom_price()+
            pizza.getBacon_price()+
            pizza.getSpinach_price()+
            pizza.getSalami_price()+
            pizza.getSucuk_price()+
            pizza.getPepperoni_price();

    return total_price;
    }


}