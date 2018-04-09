package velimir.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    private TextView tictactoe;
    private Button playGame,aboutGame;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tictactoe = findViewById(R.id.textViewGame);
        playGame = findViewById(R.id.buttonPlayGame);
        aboutGame = findViewById(R.id.buttonAboutGame);
    }


    public void onButtonGamePlayClick(View view){
      Intent intentPlayGame = new Intent(this, PlayGame.class);
      startActivity(intentPlayGame);
    }



    public void onButtonAboutGameClick(View view){
        Intent intentAboutGame = new Intent(this, AboutGame.class);
        startActivity(intentAboutGame);
    }




}
