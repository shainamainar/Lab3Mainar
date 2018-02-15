package csci490.cofc.edu.lab3mainar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by smainar on 2/15/2018.
 */

public class CourseAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Course> array;

    public CourseAdapter(Context context, ArrayList<Course> array){
        this.mContext = context;
        this.array = array;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int position) {
        return array.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        TextView courseNumberView = rowView.findViewById(android.R.id.text1);
        TextView courseNameView = rowView.findViewById(android.R.id.text2);
        Course array = (Course) getItem(position);
        courseNameView.setText(array.getCourseName());
        courseNumberView.setText(array.getCourseNumber());
        return rowView;
    }
}
