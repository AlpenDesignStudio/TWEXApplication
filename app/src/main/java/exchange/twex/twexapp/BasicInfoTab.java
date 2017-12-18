package exchange.twex.twexapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by TAPAN-PC on 12/14/2017.
 */

public class BasicInfoTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View basicView = inflater.inflate(R.layout.basicinfo_investor_registration, container, false);
        String [] values =
                {"Male","Female",};
        Spinner spinner = (Spinner) basicView.findViewById(R.id.spinnerSex);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        return inflater.inflate(R.layout.basicinfo_investor_registration, container, false);
    }
}






























































