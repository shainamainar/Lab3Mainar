package csci490.cofc.edu.lab3mainar;

import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private ListView classSched;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        classSched = this.findViewById(R.id.class_schedule);
        ArrayList<Course> courses = populateData();

        //String[] listItems = {"Math", "English", "History", "Science", "PE"};

        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        CourseAdapter adapter = new CourseAdapter(this, courses);
        classSched.setAdapter(adapter);
        classSched.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Short click", Toast.LENGTH_SHORT).show();
            }
        });
        classSched.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "loooooong", Toast.LENGTH_SHORT).show();
                return true;
            }

        });


    }

    public ArrayList<Course> populateData(){
        Course course;
        ArrayList<Course> courses = new ArrayList<>();
        course = new Course();
        course.setCourseName("Math");
        course.setCourseNumber("1");
        course.setProfessor("Shaina");
        courses.add(course);

        course = new Course();
        course.setCourseName("English");
        course.setCourseNumber("2");
        course.setProfessor("Daniel");
        courses.add(course);
        return courses;
    }


}


