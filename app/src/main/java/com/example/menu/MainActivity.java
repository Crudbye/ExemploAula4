package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
    ///    MenuItem item = menu.findItem(R.id.action_search);
    ///    SearchView searchView = (SearchView) item.getActionView();
      ///  searchView.setOnQueryTextListener(onSearch());
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        if(id == R.id.action_search){
            toast("Clicou no Search!");
        }
        if(id == R.id.action_refresh){
            toast("Clicou no Refresh!");
        }
        if(id == R.id.action_settings){
            toast("Clicou no Settings");
        }
        return super.onOptionsItemSelected(item);
    }
    private void toast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}