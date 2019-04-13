package com.soumalyapakrashi.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


// Enumeration to define the possible sources of inputs in the grid
enum Turn {
    PLAYER1, PLAYER2, NO_ONE;
}


public class MainActivity extends AppCompatActivity {

    Turn player = Turn.PLAYER1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeText();
    }


    void changeText() {
        final TextView grid1 = findViewById(R.id.grid1);
        grid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid1.getText() != "X"  &&  grid1.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid1.setText("X");
                        grid1.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 1);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid1.setText("O");
                        grid1.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 1);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid2 = findViewById(R.id.grid2);
        grid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid2.getText() != "X"  &&  grid2.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid2.setText("X");
                        grid2.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player,2);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid2.setText("O");
                        grid2.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 2);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid3 = findViewById(R.id.grid3);
        grid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid3.getText() != "X"  &&  grid3.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid3.setText("X");
                        grid3.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player,3);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid3.setText("O");
                        grid3.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 3);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid4 = findViewById(R.id.grid4);
        grid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid4.getText() != "X"  &&  grid4.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid4.setText("X");
                        grid4.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 4);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid4.setText("O");
                        grid4.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 4);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid5 = findViewById(R.id.grid5);
        grid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid5.getText() != "X"  &&  grid5.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid5.setText("X");
                        grid5.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 5);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid5.setText("O");
                        grid5.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 5);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid6 = findViewById(R.id.grid6);
        grid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid6.getText() != "X"  &&  grid6.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid6.setText("X");
                        grid6.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 6);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid6.setText("O");
                        grid6.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 6);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid7 = findViewById(R.id.grid7);
        grid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid7.getText() != "X"  &&  grid7.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid7.setText("X");
                        grid7.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 7);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid7.setText("O");
                        grid7.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 7);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid8 = findViewById(R.id.grid8);
        grid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid8.getText() != "X"  &&  grid8.getText() != "O"  && player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid8.setText("X");
                        grid8.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 8);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid8.setText("O");
                        grid8.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 8);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        final TextView grid9 = findViewById(R.id.grid9);
        grid9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid9.getText() != "X"  &&  grid9.getText() != "O"  &&  player != Turn.NO_ONE) {
                    if(player == Turn.PLAYER1) {
                        grid9.setText("X");
                        grid9.setTextColor(getResources().getColor(R.color.colorX));
                        WinLogic.updateMatrix(player, 9);
                        player = Turn.PLAYER2;
                    }
                    else if(player == Turn.PLAYER2){
                        grid9.setText("O");
                        grid9.setTextColor(getResources().getColor(R.color.colorY));
                        WinLogic.updateMatrix(player, 9);
                        player = Turn.PLAYER1;
                    }

                    int win = WinLogic.checkWin();
                    if(win == 1  ||  win == 2) {
                        player = Turn.NO_ONE;
                        Toast.makeText(getApplicationContext(), "Player " + win + " Won", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


        // Reset the grids to default
        final Button resetGrid = findViewById(R.id.resetGrid);
        resetGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid1.setText("");
                grid2.setText("");
                grid3.setText("");
                grid4.setText("");
                grid5.setText("");
                grid6.setText("");
                grid7.setText("");
                grid8.setText("");
                grid9.setText("");

                player = Turn.PLAYER1;
                WinLogic.resetMatrix();
            }
        });
    }
}
