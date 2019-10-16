package ditha.com.aplikasigajipegawailatujk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class ActivityGaji extends AppCompatActivity {

    protected EditText edNama, edGolongan, edStatus, edGapok, edHariKerja, edLembur, edMakan, edTrans, edPph, edGator, edGasih,edPphStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji);

        edNama = (EditText) findViewById(R.id.edt_nama);
        edGolongan = (EditText) findViewById(R.id.edt_golongan);
        edStatus = (EditText) findViewById(R.id.edt_status);
        edGapok = (EditText)  findViewById(R.id.edt_gapok);
        edHariKerja = (EditText)  findViewById(R.id.edt_hari);
        edLembur = (EditText) findViewById(R.id.edt_lembur);
        edMakan = (EditText) findViewById(R.id.edt_makan);
        edTrans = (EditText) findViewById(R.id.edt_trans);
        edPph = (EditText) findViewById(R.id.edt_pph);
        edGator = (EditText) findViewById(R.id.edt_gator);
        edGasih = (EditText) findViewById(R.id.edt_gaber);
        edPphStatus = (EditText) findViewById(R.id.edt_pphStatus);



        edNama.setText(getIntent().getStringExtra("dataNama"));
        edGolongan.setText(getIntent().getStringExtra("dataGolongan"));
        edHariKerja.setText(getIntent().getStringExtra("hariKerja"));
        edStatus.setText(getIntent().getStringExtra("status"));
        edPphStatus.setText(getIntent().getStringExtra("pphStatus"));

        int golongan = Integer.parseInt(edGolongan.getText().toString());
        if (golongan == 1){
            edGapok.setText(3000000 + "");
        } else if (golongan == 2){
            edGapok.setText(4000000 + "");
        } else if (golongan == 3){
            edGapok.setText(5000000 + "");
        } else if (golongan == 4){
            edGapok.setText(6000000 + "");
        } else if (golongan == 5){
            edGapok.setText(7000000  + "");
        } else {
            edGapok.setText("Golongan Tidak ada");
        }



//        int lembur = Integer.parseInt(edLembur.getText().toString());
        double gapok = Double.parseDouble(edGapok.getText().toString());
        double hariKer = Double.parseDouble(edHariKerja.getText().toString());
        double lembur = (gapok/173) * 2;
        double makan = 25000 * hariKer;
        double trans = 15000 * hariKer;
        double gator = gapok + makan + trans + lembur;
        double pphStatus = Double.parseDouble(edPphStatus.getText().toString());
        double pph = pphStatus * gator;
        double gaber = gator - pph;

        edLembur.setText("" + lembur);
        edMakan.setText("" + makan);
        edTrans.setText("" + trans);
        edGator.setText("" + gator);
        edPph.setText("" + pph);
        edGasih.setText("" + gaber);





    }
}
