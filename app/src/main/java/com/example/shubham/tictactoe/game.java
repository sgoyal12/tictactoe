package com.example.shubham.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class game extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,xb;
int turn,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        turn=1;
        t=0;
        xb=findViewById(R.id.xb);
        xb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b1.setText("O");
                }
                else
                {
                    turn=1;
                    b1.setText("X");
                }
                t++;
                endgame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b2.setText("O");
                }
                else
                {
                    turn=1;
                    b2.setText("X");
                }
                t++;
                endgame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b3.setText("O");
                }
                else
                {
                    turn=1;
                    b3.setText("X");
                }
                t++;
                endgame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b4.setText("O");
                }
                else
                {
                    turn=1;
                    b4.setText("X");
                }
                t++;
                endgame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b5.setText("O");
                }
                else
                {
                    turn=1;
                    b5.setText("X");
                }
                t++;

                endgame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b6.setText("O");
                }
                else
                {
                    turn=1;
                    b6.setText("X");
                }
                t++;
                endgame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b7.setText("O");
                }
                else
                {
                    turn=1;
                    b7.setText("X");
                }
                t++;
                endgame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b8.setText("O");
                }
                else
                {
                    turn=1;
                    b8.setText("X");
                }
                t++;
                endgame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1)
                {
                    turn=2;
                    b9.setText("O");
                }
                else
                {
                    turn=1;
                    b9.setText("X");
                }
                t++;
                endgame();
            }
        });}
    public void endgame(){
        Boolean end=false;
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("X") && d.equals("X") && g.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("X")&& e.equals("X") && i.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(b.equals("X")&& e.equals("X") && h.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(c.equals("X")&& f.equals("X") && i.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(d.equals("X")&& e.equals("X") && f.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(g.equals("X")&& h.equals("X") && i.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(c.equals("X")&& e.equals("X") && g.equals("X"))
        {
            Toast.makeText(game.this, "Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("O") && b.equals("O") && c.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("O") && d.equals("O") && g.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(a.equals("O")&& e.equals("O") && i.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(b.equals("O")&& e.equals("O") && h.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(c.equals("O")&& f.equals("O") && i.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(d.equals("O")&& e.equals("O") && f.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(g.equals("O")&& h.equals("O") && i.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else if(c.equals("O")&& e.equals("O") && g.equals("O"))
        {
            Toast.makeText(game.this, "Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        else
        {
            if(t==9)
            {      Toast.makeText(game.this, "Drawn game",Toast.LENGTH_LONG).show();
                end=true;
        }}

        if(end)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            Intent ir=new Intent(game.this , game.class);
            startActivity(ir);
            finish();
        }


    }
}
