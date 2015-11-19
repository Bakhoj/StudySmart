package com.example.anders.studysmart.HomeWorkCalendar;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * HomeWorkFragment (HWFrag)
 * will manage and setup the list for the homework in HWCAct
 *
 * http://www.vogella.com/tutorials/AndroidListView/article.html#listactivity
 */
public class HWFrag extends ListFragment implements AdapterView.OnItemClickListener {

    public HWFrag() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] {"03-09 08:00:00\n" +
                "NaS Session 3\n" +
                "Belknap Harvard: 67-76\n",
        "09-09 13:00:00\n" +
                "NaS Session 4\n" +
                "The Business History Review 34: 1-23\n",
                "03-09 08:00:00\n" +
                        "NaS Session 3\n" +
                        "Belknap Harvard: 67-76\n",
                "09-09 13:00:00\n" +
                        "NaS Session 4\n" +
                        "The Business History Review 34: 1-23\n",
                "03-09 08:00:00\n" +
                        "NaS Session 3\n" +
                        "Belknap Harvard: 67-76\n",
                "09-09 13:00:00\n" +
                        "NaS Session 4\n" +
                        "The Business History Review 34: 1-23\n",
                "03-09 08:00:00\n" +
                        "NaS Session 3\n" +
                        "Belknap Harvard: 67-76\n",
                "09-09 13:00:00\n" +
                        "NaS Session 4\n" +
                        "The Business History Review 34: 1-23\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Item " + position, Toast.LENGTH_SHORT).show();
        System.out.println("item: " + position);
    }
}
