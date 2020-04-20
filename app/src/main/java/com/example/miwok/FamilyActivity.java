package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of family members
        final ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("Mother", "Maama", R.drawable.family_mother, R.raw.family_mother));
        familyMembers.add(new Word("Father", "Taata", R.drawable.family_father, R.raw.family_father));
        familyMembers.add(new Word("Wife", "Mukyala", R.drawable.family_older_sister, R.raw.family_wife));
        familyMembers.add(new Word("Husband", "Mwami", R.drawable.family_older_brother, R.raw.family_husband));
        familyMembers.add(new Word("Child", "Mwana", R.drawable.family_younger_brother, R.raw.family_child));
        familyMembers.add(new Word("Son", "Mutabani", R.drawable.family_son, R.raw.family_son));
        familyMembers.add(new Word("Daughter", "Muwala", R.drawable.family_daughter, R.raw.family_daughter));
        familyMembers.add(new Word("Grand Mother", "Jjajja Mukyala", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyMembers.add(new Word("Grand Father", "Jjajja Mwami", R.drawable.family_grandfather, R.raw.family_grandfather));
        familyMembers.add(new Word("Father-in-law.", "Ssezaala", R.drawable.family_grandfather, R.raw.family_father_in_law));
        familyMembers.add(new Word("Mother-in-law", "Nnyazaala", R.drawable.family_grandmother, R.raw.family_mother_in_law));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, familyMembers, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = familyMembers.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getmAudioResourceID());
                mMediaPlayer.start();
            }
        });
    }
}
