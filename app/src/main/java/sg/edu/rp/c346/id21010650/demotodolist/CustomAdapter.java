package sg.edu.rp.c346.id21010650.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context,int resource,
                         ArrayList<AndroidVersion> objects) {
        super(context,resource,objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewActivity);
        TextView tvVersion = rowView.findViewById(R.id.textViewDate);

        AndroidVersion currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getActivity());
        tvVersion.setText(currentVersion.getDate());
        return rowView;
    }
}