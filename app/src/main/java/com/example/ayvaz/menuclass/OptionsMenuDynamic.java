package com.example.ayvaz.menuclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class OptionsMenuDynamic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu_dynamic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_options_menu_dynamic, menu);
        int groupId = 1;
        menu.add(groupId,11,100,R.string.menu_item);
        menu.add(groupId,22,200,"files");
        menu.add(groupId,33,300,"other");

        SubMenu menu4 = menu.addSubMenu(1,44,400,"Menu No. 4");
        menu4.add(6,3,1,"SubMenu No. 1");
        menu4.add(6,4,2, "Submenu No. 2");

        menu4.setGroupCheckable(6,true,true);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == 11) {
            Toast.makeText(getApplicationContext(),R.string.menu_item, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == 22) {
            Toast.makeText(getApplicationContext(),R.string.menu_item, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == 33) {
            Toast.makeText(getApplicationContext(),R.string.menu_item, Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
