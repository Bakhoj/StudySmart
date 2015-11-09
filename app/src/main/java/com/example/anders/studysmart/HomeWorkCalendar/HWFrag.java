package com.example.anders.studysmart.HomeWorkCalendar;

import android.app.ListFragment;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.anders.studysmart.R;

/**
 * HomeWorkFragment (HWFrag)
 * will manage and setup the list for the homework in HWCAct
 *
 * http://stackoverflow.com/questions/6510550/android-listview-in-fragment
 */
public class HWFrag extends ListFragment implements AdapterView.OnItemClickListener{

    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";

   // private String mParam1;
   // private String mParam2;

    //private OnFragmentInteractionListener mListener;

   /* public static HWFrag newInstance(String param1, String param2) {
        HWFrag fragment = new HWFrag();
       /* Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    } */

    public HWFrag() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
//        String[]values = new String[] { "Android", "iPhone", "WindowsMobile",
//                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//                "Linux", "OS/2" };
        String[] values = new String[] {"03-09 08:00:00\n" +
                "NaS Session 3\n" +
                "Belknap Harvard: 67-76\n",
        "09-09 13:00:00\n" +
                "NaS Session 4\n" +
                "The Business History Review 34: 1-23\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


}
