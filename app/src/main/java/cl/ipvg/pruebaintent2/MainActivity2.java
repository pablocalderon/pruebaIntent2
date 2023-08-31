package cl.ipvg.pruebaintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btaceptar2;
    String stNombre="";
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btaceptar2 = (Button) findViewById(R.id.btaceptar);
        tvResultado=(TextView) findViewById(R.id.tvResultado);

        Context context=getApplicationContext();
        //Bundle intentR=this.getIntent().getExtras();
        //if (intentR !=null){
            stNombre= getIntent().getStringExtra("nombre");
            Toast.makeText(context,"su nombre es:"+stNombre,Toast.LENGTH_SHORT).show();
            tvResultado.setText("Su nombre es :"+stNombre);
        //}

        Intent intent= new Intent(this,MainActivity.class);
         btaceptar2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(intent);
             }
         });








    }
}