package android.example.hello_tripper_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.val);
       recyclerViewLayoutManager= new LinearLayoutManager(getApplicationContext());
       recyclerView.setLayoutManager(recyclerViewLayoutManager);
        ArrayList<String> source = new ArrayList<>();
        source.add("Escape in Himachal");
        source.add("Rajasthan's Architecture");
        source.add("Pondicherry temprature");
        adapter adapter = new adapter(source,this);

        LinearLayoutManager HorizontalLayout;
        HorizontalLayout
                = new LinearLayoutManager(
                MainActivity.this,
                LinearLayoutManager.HORIZONTAL,
                false);
        recyclerView.setLayoutManager(HorizontalLayout);

        recyclerView.setAdapter(adapter);

    }
}
