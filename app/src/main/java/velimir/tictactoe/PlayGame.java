package velimir.tictactoe;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.Random;


public class PlayGame extends AppCompatActivity {


    private Button[] buttons = new Button[9];
    private ArrayList<Button> availableBtns = new ArrayList<>();
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_reset_game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_reset_game = findViewById(R.id.btnResetGame);


        buttons[0] = btn1;
        buttons[1] = btn2;
        buttons[2] = btn3;
        buttons[3] = btn4;
        buttons[4] = btn5;
        buttons[5] = btn6;
        buttons[6] = btn7;
        buttons[7] = btn8;
        buttons[8] = btn9;


        fillTheList();
        playGame();


    }


    // Player O  logic
    private void computerTurn() {
        for (int i = 0; i < buttons.length; i++) {

            if (availableBtns.size() > 0) {
                int random = new Random().nextInt(availableBtns.size());
                availableBtns.get(random).setText("O");
                availableBtns.get(random).setEnabled(false);
                availableBtns.remove(random);
            }

            break;

        }
    }


    // Fill ArrayList with buttons
    private void fillTheList() {
        for (Button button : buttons) {
            availableBtns.add(button);

        }
    }

    // PlayGame logic
    private void playGame() {
        for (int i = 0; i < buttons.length; i++) {

            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.btn1:

                            if (btn1.getText().toString().equals("")) {
                                playerXTurn(btn1);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn2:

                            if (btn2.getText().toString().equals("")) {
                                playerXTurn(btn2);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn3:
                            if (btn3.getText().toString().equals("")) {
                                playerXTurn(btn3);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn4:
                            if (btn4.getText().toString().equals("")) {
                                playerXTurn(btn4);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn5:
                            if (btn5.getText().toString().equals("")) {

                                playerXTurn(btn5);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn6:
                            if (btn6.getText().toString().equals("")) {

                                playerXTurn(btn6);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn7:
                            if (btn7.getText().toString().equals("")) {

                                playerXTurn(btn7);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn8:
                            if (btn8.getText().toString().equals("")) {

                                playerXTurn(btn8);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                        case R.id.btn9:
                            if (btn9.getText().toString().equals("")) {

                                playerXTurn(btn9);
                                if (checkPlayerXresult()) {
                                    break;
                                }

                            }
                            computerTurn();
                            checkPlayerOresult();
                            break;
                    }


                }
            });

        }
    }


    // First, check if player X has won
    // Second, check if we have a draw after player X pick
    private boolean checkPlayerXresult() {

        //Player X
        if (btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;

        } else if (btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X")) {
            closeGame();
            Toast.makeText(this, "Player X wins!", Toast.LENGTH_SHORT).show();

            return true;

        } else if (allButtonsFilled()) {
            Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

    // Check result of player O
    private boolean checkPlayerOresult() {


        if (btn1.getText().toString().equals("O") && btn2.getText().toString().equals("O") && btn3.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn4.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn6.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn7.getText().toString().equals("O") && btn8.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn1.getText().toString().equals("O") && btn4.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn2.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn8.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn3.getText().toString().equals("O") && btn6.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;


        } else if (btn1.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn9.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;

        } else if (btn3.getText().toString().equals("O") && btn5.getText().toString().equals("O") && btn7.getText().toString().equals("O")) {
            closeGame();
            Toast.makeText(this, "Player O wins!", Toast.LENGTH_SHORT).show();

            return true;

        }

        return false;

    }

    // If we dont have a winner yet
    // Check to see if all buttons have some value, if yes, we have draw
    private boolean allButtonsFilled() {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].getText().toString().isEmpty()) {
                return false;
            }

        }
        return true;
    }


    // Set all butons available for the next gamepick
    // Set all buttons empty
    // Delete all buttons stacked in the list
    // And fill the list again
    public void onBtnResetClick(View view) {

        for (int i = 0; i < buttons.length; i++) {

            buttons[i].setEnabled(true);
            buttons[i].setText("");

        }
        availableBtns.clear();
        fillTheList();

    }

    // If we have a winner, disable all buttons for the next pick
    private void closeGame() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
        }
    }


    private void playerXTurn(Button button) {
        button.setText("X");
        availableBtns.remove(button);
        button.setEnabled(false);

    }


}





