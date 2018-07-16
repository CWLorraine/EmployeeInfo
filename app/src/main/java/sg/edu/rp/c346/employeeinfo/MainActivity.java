package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<employeeList> alEmployee;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewInfo);
        alEmployee = new ArrayList<>();

        employeeList list1 = new employeeList("John","Software Technical Leader", 3400.0);
        employeeList list2 = new employeeList("May","Programmer", 2200.0);
        employeeList list3 = new employeeList("A","Software Technical Leader", 3400.0);
        employeeList list4 = new employeeList("B","Programmer", 2200.0);
        employeeList list5 = new employeeList("C","Software Technical Leader", 3400.0);
        employeeList list6 = new employeeList("D","Programmer", 2200.0);
        employeeList list7 = new employeeList("E","Software Technical Leader", 3400.0);
        employeeList list8 = new employeeList("F","Programmer", 2200.0);
        employeeList list9 = new employeeList("G","Software Technical Leader", 3400.0);
        employeeList list10 = new employeeList("H","Programmer", 2200.0);
        employeeList list11= new employeeList("I","Software Technical Leader", 3400.0);
        employeeList list12 = new employeeList("J","Programmer", 2200.0);
        employeeList list13= new employeeList("K","Software Technical Leader", 3400.0);
        employeeList list14 = new employeeList("L","Programmer", 2200.0);
        employeeList list15= new employeeList("M","Software Technical Leader", 3400.0);
        employeeList list16 = new employeeList("N","Programmer", 2200.0);
        employeeList list17 = new employeeList("E","Software Technical Leader", 3400.0);
        employeeList list18 = new employeeList("F","Programmer", 2200.0);
        employeeList list19 = new employeeList("G","Software Technical Leader", 3400.0);
        employeeList list20 = new employeeList("H","Programmer", 2200.0);
        employeeList list21= new employeeList("I","Software Technical Leader", 3400.0);
        employeeList list22 = new employeeList("J","Programmer", 2200.0);
        employeeList list23= new employeeList("K","Software Technical Leader", 3400.0);
        employeeList list24 = new employeeList("L","Programmer", 2200.0);
        employeeList list25= new employeeList("M","Software Technical Leader", 3400.0);
        employeeList list26 = new employeeList("N","Programmer", 2200.0);
        employeeList list27 = new employeeList("E","Software Technical Leader", 3400.0);
        employeeList list28 = new employeeList("F","Programmer", 2200.0);
        employeeList list29 = new employeeList("G","Software Technical Leader", 3400.0);
        employeeList list30 = new employeeList("H","Programmer", 2200.0);

        alEmployee.add(list1);
        alEmployee.add(list2);
        alEmployee.add(list3);
        alEmployee.add(list4);
        alEmployee.add(list5);
        alEmployee.add(list6);
        alEmployee.add(list7);
        alEmployee.add(list8);
        alEmployee.add(list9);
        alEmployee.add(list10);
        alEmployee.add(list11);
        alEmployee.add(list12);
        alEmployee.add(list13);
        alEmployee.add(list14);
        alEmployee.add(list15);
        alEmployee.add(list16);
        alEmployee.add(list17);
        alEmployee.add(list18);
        alEmployee.add(list19);
        alEmployee.add(list20);
        alEmployee.add(list21);
        alEmployee.add(list22);
        alEmployee.add(list23);
        alEmployee.add(list24);
        alEmployee.add(list25);
        alEmployee.add(list26);
        alEmployee.add(list27);
        alEmployee.add(list28);
        alEmployee.add(list29);
        alEmployee.add(list30);


        caEmployee = new CustomAdapter(this, R.layout.employee_list, alEmployee);
        lvEmployee.setAdapter(caEmployee);

    }
}
