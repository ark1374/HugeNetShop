package ir.hugenet.hugenetshop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Category_Fragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category, container, false);

/*
        view.findViewById(R.id.sub_m_daneshjooii1_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.qut.ac.ir/fa/studentsdepartment/disciplinary_committee"));
                startActivity(browserIntent);
            }
        });
*/

        return view;
    }

    public static Category_Fragment newInstance() {

        Bundle args = new Bundle();

        Category_Fragment fragment = new Category_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
}
