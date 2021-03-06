package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16039013 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<employeeList> employeeList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<employeeList> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        employeeList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView;
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(layout_id, parent, false);

        }
        else {
            rowView = convertView;
        }
        // remaining implementation
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        employeeList currentItem = employeeList.get(position);

        String name = currentItem.getName();
        String title = currentItem.getTitle();
        double salary = currentItem.getSalary();

        tvName.setText(name);
        tvTitle.setText(title);
        tvSalary.setText(salary+"");
        return  rowView;

    }
}
