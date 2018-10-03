package gorental.com.day8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = findViewById(R.id.lv);
        final String[] value = getResources().getStringArray(R.array.Student);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.sample_view, R.id.tv, value);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String set = value[position];
                Toast.makeText(MainActivity.this, set + " " + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                    startActivity(intent);
                }

            }

        });
}
}
