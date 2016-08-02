package happycoding.kenp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listContainer;
    private String[] citys = {"Hà Nội", "Hồ Chí Minh", "Hải Phòng", "Đà Nẵng", "Nha Trang", "Vinh",
    "Cần Thơ", "Đà Lạt", "Vũng Tàu", "Huế", "Sapa", "Thanh Hóa", "Quy Nhơn", "Biên Hòa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listContainer = (ListView) findViewById(R.id.listContainer);
        listContainer.setAdapter(new ArrayAdapter<String>(this, R.layout.custom_list_item, citys));

        listContainer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, citys[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
