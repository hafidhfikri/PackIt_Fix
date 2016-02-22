package packit.qubit.proclub.packit_fix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import packit.qubit.proclub.packit_fix.adapter.CustomList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String names[] = {
            "Hafidh Fikri Rasyid",
            "Zulfikar Fauzi",
            "Ridho Maulana",
            "Grace"
    };

    private String desc[] = {
            "Berkemah di sidoarjo",
            "Survival di Tangkuban Parahu",
            "Bertahan hidup di depok",
            "bertahan hidup di bandung"
    };


    private Integer imageid[] = {
            R.drawable.html,
            R.drawable.css,
            R.drawable.js,
            R.drawable.wp
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList customList = new CustomList(this, names, desc, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"You Clicked "+names[i],Toast.LENGTH_SHORT).show();
            }
        });
    }

}
