package tris.papa_applition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class LifeBestAchievements extends AppCompatActivity {

    Button buttonachievements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_best_achievements);
        buttonachievements=findViewById(R.id.bestachievements);

    }
}
