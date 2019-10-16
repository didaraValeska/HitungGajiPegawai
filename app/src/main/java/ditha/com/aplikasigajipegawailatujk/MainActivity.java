package ditha.com.aplikasigajipegawailatujk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    protected EditText edNama, edGolongan, edGapok, edHariKerja;
    Button btnHitung;
    RadioButton rdSingle, rdMenikah, rdDujan;
    String single,menikah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = (EditText) findViewById(R.id.edt_nama);
        edGolongan = (EditText) findViewById(R.id.edt_golongan);
        edGapok = (EditText) findViewById(R.id.edt_gapok);
        edHariKerja = (EditText) findViewById(R.id.edt_hari_kerja);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        rdSingle = (RadioButton) findViewById(R.id.rdb1);
        rdMenikah = (RadioButton) findViewById(R.id.rdb2);



        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                single = "0.15";
                menikah = "0.1";
                Intent i = new Intent(MainActivity.this, ActivityGaji.class);
                //lempar data ke aktifiti kedua
                i.putExtra("dataNama", edNama.getText().toString());
                i.putExtra("dataGolongan", edGolongan.getText().toString());
                i.putExtra("hariKerja", edHariKerja.getText().toString());
                //radio button checked
                if (rdSingle.isChecked()){
                    i.putExtra("status", rdSingle.getText().toString());
                    i.putExtra("pphStatus", single);
                }else {
                    i.putExtra("status", rdMenikah.getText().toString());
                    i.putExtra("pphStatus", menikah);
                }


                startActivity(i);
            }
        });
//    RadioGroup statusGroup = (RadioGroup) findViewById(R.id.rdbGp1);

    }
}







