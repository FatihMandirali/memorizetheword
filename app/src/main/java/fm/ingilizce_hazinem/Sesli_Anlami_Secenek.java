package fm.ingilizce_hazinem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by user on 22.8.2017.
 */
public class Sesli_Anlami_Secenek extends Fragment {
    RelativeLayout relativeLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.sesli_anlami_secenek,container,false);
        relativeLayout= (RelativeLayout) view.findViewById(R.id.relative);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),Sesli_Anlami.class);
                startActivity(in);
                deneme.tiklanan=2;
            }
        });

        return view;
    }
}
