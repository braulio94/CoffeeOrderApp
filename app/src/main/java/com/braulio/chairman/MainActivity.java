package com.braulio.chairman;

import java.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity, quantity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void increment (View view){
        quantity = quantity + 1;
        display(quantity);
    }
    public void decrement(View view){
        quantity = quantity - 1;
        display(quantity);
    }
    private void display(int number){
        TextView quantityText = (TextView) findViewById(R.id.quantity_number);
        quantityText.setText("" + number);
    }
    private void displayPrice(int number){
        TextView priceText = (TextView) findViewById(R.id.price_number);
        priceText.setText(NumberFormat.getCurrencyInstance().format(number));
    }

// This is to display the second Order

    public  void SecIncrement (View view){
        quantity2 = quantity2 + 1;
        SecDisplay(quantity2);
    }
    public void SecDecrement(View view){
        quantity2 = quantity2 - 1;
        SecDisplay(quantity2);
    }
    private void SecDisplay(int number){

        TextView SecQuantityText = (TextView) findViewById(R.id.quantity_number2);
        SecQuantityText.setText("" + number);
    }
    private void displaySecPrice(int number){
        TextView SecPriceText = (TextView) findViewById(R.id.price_number2);
        SecPriceText.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void submitOrder(View view){
        display(quantity);
        displayPrice(quantity * 5);
        SecDisplay(quantity2);
        displaySecPrice(quantity2 * 5);

    }
}
