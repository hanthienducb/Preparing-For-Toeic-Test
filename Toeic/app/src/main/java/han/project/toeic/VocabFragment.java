package han.project.toeic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Han on 18/10/2015.
 */
public class VocabFragment extends Fragment{
    ListView lv;
    Representative re = null;
    MyAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vocab_fragment,container,false);
        lv = (ListView) view.findViewById(R.id.listView);
        adapter = new MyAdapter(getActivity(), generateData());
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        return view;
    }
    private ArrayList<Representative> generateData() {
        ArrayList<Representative> list = new ArrayList<Representative>();
        list.add(new Representative("1","Unit 1 - Recruitment 1","34 common words",R.mipmap.toeic_vocabulary_unit1));
        list.add(new Representative("2","Unit 2 - Recruitment 2","41 more common words",R.mipmap.recruitment));
        list.add(new Representative("3","Unit 3 - Workplace ","46 common words ",R.mipmap.workplace));
        list.add(new Representative("4","Unit 4 - Business 1 ","27 common words ",R.mipmap.business));
        list.add(new Representative("5","Unit 5 - Business 2","36 common words",R.mipmap.business2));
        list.add(new Representative("6","Unit 6 - Trade ","44 common words ",R.mipmap.trade1));
        list.add(new Representative("7","Unit 7 - Money and Banking ","44 common words ",R.mipmap.bank));
        list.add(new Representative("8","Unit 8 - Marketing","47 common words ",R.mipmap.marketing));
        list.add(new Representative("9","Unit 9 - Communications","46 common words ",R.mipmap.communications));
        list.add(new Representative("10","Unit 10 - Shopping ","30 common words ",R.mipmap.shopping));
        list.add(new Representative("11","Unit 11 - Eating out","37 common words ",R.mipmap.eatingout));
        list.add(new Representative("12","Unit 12 - Travel 1","39 common words ",R.mipmap.travel));
        list.add(new Representative("13","Unit 13 - Travel 2","37 common words ",R.mipmap.traveling2));
        list.add(new Representative("14","Unit 14 - Housing and Property","41 common words",R.mipmap.housing));
        list.add(new Representative("15","Unit 15 - Weather ","43 common words",R.mipmap.weather));
        list.add(new Representative("16","Unit 16 - Health 1","41 common words ",R.mipmap.health1));
        list.add(new Representative("17","Unit 17 - Health 2","33 common words ",R.mipmap.health2));
        list.add(new Representative("18","Unit 18 - Entertainment ","39 common words ",R.mipmap.entertainment));

        return list;
    }
}
