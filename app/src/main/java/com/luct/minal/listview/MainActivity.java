package com.luct.minal.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_text=(TextView)findViewById(R.id.final_result);
        final_text.setEnabled(false);

    }

    public void selectModule(View view){

        boolean checked=((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.module_database:
                if(checked)
                {selection.add("Database");}
                else
                {selection.remove("Database");}
                break;

            case R.id.module_java:
                if(checked)
                {selection.add("Java");}
                else
                {selection.remove("Java");}
                break;

            case R.id.module_architecture:
                if(checked)
                {selection.add("Architecture");}
                else
                {selection.remove("Architecture");}
                break;

            case R.id.module_hci:
                if(checked)
                {selection.add("Human Computer Interaction");}
                else
                {selection.remove("Human Computer Interacton");}
                break;

            case R.id.module_im:
                if(checked)
                {selection.add("Interactive Multimedia");}
                else
                {selection.remove("Interactive Multimedia");}
                break;
            case R.id.module_dm:
                if(checked)
                {selection.add("Discrete Mathematics");}
                else
                {selection.remove("Discrete Mathematics");}
                break;

            case R.id.module_mis:
                if(checked)
                {selection.add("Management Information Systems");}
                else
                {selection.remove("Managements Information Systems");}
                break;

            case R.id.module_dc:
                if(checked)
                {selection.add("Data Communications");}
                else
                {selection.remove("Data Communications");}
                break;

            case R.id.module_ec:
                if(checked)
                {selection.add("ECommerce");}
                else
                {selection.remove("ECommerce");}
                break;

            case R.id.module_wp:
                if(checked)
                {selection.add("Web Programming with JAVA");}
                else
                {selection.remove("Web Programming with JAVA");}
                break;



        }}
    public void finalSelection (View view){
        String final_module_selection="";
        for(String Selections : selection){
            final_module_selection=final_module_selection +Selections +"\n";
        }
        final_text.setText(final_module_selection);
        final_text.setEnabled(true);

    }

}
