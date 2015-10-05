package com.example.ayvaz.menuclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContextMenuDynoMatic extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_dyno_matic);
        textView = (TextView) findViewById(R.id.textviewdyno);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context_menu_dyno_matic, menu);
        int groupId = 1;
        menu.add(groupId, 11, 100, R.string.menu_item);
        menu.add(groupId, 22, 200, "files");
        menu.add(groupId, 33, 300, "other");
        SubMenu menu_stat = menu.addSubMenu(groupId, 44, 400, "submenu");
        getMenuInflater().inflate(R.menu.context_submenu, menu_stat);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == 11) {
            Toast.makeText(getApplicationContext(), R.string.menu_item, Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.option1) {
            Toast.makeText(getApplicationContext(), "option 1", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.option2) {
            Toast.makeText(getApplicationContext(), "option 2", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == 22) {
            Toast.makeText(getApplicationContext(), "files", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == 33) {
            Toast.makeText(getApplicationContext(), "other", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == 44) {
            Toast.makeText(getApplicationContext(), "submenu", Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onContextItemSelected(item);
    }
}
