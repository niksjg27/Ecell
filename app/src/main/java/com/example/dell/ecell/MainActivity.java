package com.example.dell.ecell;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends Activity {

    private     EditText e, e1;

    private Button buy_plus;
    private Button sell_plus;
    View layout;

    private String name , edition, price,edition1;
     private  int Price;

    private  String name1 = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        buy_plus = (Button) findViewById(R.id.b1);
        sell_plus = (Button) findViewById(R.id.b2);

        buy_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertForBuy();


                // AlertDialog.Builder builder= new AlertDialog.Builder(getApplicationContext());
            }
        });

        sell_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertForSell();
            }
        });
    }


    private  void alertForBuy(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        layout = inflater.inflate(R.layout.alert , null);
        builder.setView(layout);

          e = (EditText) findViewById(R.id.buy_book);
         e1 = (EditText) findViewById(R.id.buy_edition);
       /* builder.setTitle("Enter book name :");
       final EditText edbookNmae = new EditText(this);

        builder.setView(edbookNmae);

        final EditText edEdition = new EditText(this);

        final TextView tvEdition = new TextView(this);
        tvEdition.setText("Enter the Edition");

        builder.setView(tvEdition);

        builder.setView(edEdition);*/

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

//                name1 = e.getText().toString();
                edition1 = e1.getText().toString();
               /* name1 = edbookNmae.getText().toString();
                edition1 = edEdition.getText().toString();
*/
                //if (TextUtils.isEmpty(name1 )|| TextUtils.isEmpty(edition1)){
                //if(name1.isEmpty()|| edition1.isEmpty()){
                    Toast.makeText(getApplicationContext(),name1,Toast.LENGTH_LONG).show();

                //}

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        builder.show();

    }


    private  void alertForSell(){

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final TextView tvname = new TextView(this);
        tvname.setText("Enter name ");
        builder.setView(tvname);

        final EditText edbookNmae = new EditText(this);

        builder.setView(edbookNmae);

        final EditText edEdition = new EditText(this);

        final TextView tvEdition = new TextView(this);
        tvEdition.setText("Enter the Edition");

        builder.setView(tvEdition);

        builder.setView(edEdition);

        final TextView tvPrice = new TextView(this);
        tvEdition.setText("Enter the Price ");
        final EditText edPrice = new EditText(this);

        builder.setView(tvPrice);
        builder.setView(edPrice);


        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                name = edbookNmae.getText().toString();
                edition = edbookNmae.getText().toString();
                price = edbookNmae.getText().toString();

                if (TextUtils.isEmpty(name )|| TextUtils.isEmpty(edition) || TextUtils.isEmpty(price)){

                    Toast.makeText(getApplicationContext(),"Please enter the details ",Toast.LENGTH_LONG).show();

                }else {
                    Price = Integer.parseInt(price);
                }
            }


        });


        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });






        builder.show();


    }



}
