package br.gov.pe.bezerros.view;

import br.gov.pe.bezerros.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);

		int height = getWindowManager().getDefaultDisplay().getHeight();
		int width = getWindowManager().getDefaultDisplay().getWidth();
		int buttonWidth = (int) (width * 0.6);
		int buttonMargin = (int) (height * 0.0125);
		int buttonMarginBottom = (int) (height * 0.05);

		Button evento = (Button) findViewById(R.id.buttonEvento);
		evento.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startEventoActivity();
			}
		});

		Button programacao = (Button) findViewById(R.id.buttonProgramacao);
        programacao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startProgramacaoActivity();
			}
		});
        
        Button turismo = (Button) findViewById(R.id.buttonTurismo);
        turismo.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startTurismoActivity();
			}
		});
        
        Button interatividade = (Button) findViewById(R.id.buttonInteratividade);
        interatividade.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startInteratividadeActivity();
			}
		});
        
        LinearLayout.LayoutParams lpp = new LinearLayout.LayoutParams(buttonWidth, 0);
        lpp.weight = 0.1f;
        lpp.setMargins(0, 0, 0, buttonMargin);
        
        LinearLayout.LayoutParams lppb = new LinearLayout.LayoutParams(buttonWidth, 0);
        lppb.weight = 0.1f;
        lppb.setMargins(0, 0, 0, buttonMarginBottom);
        
        LinearLayout layout = (LinearLayout) evento.getParent();
        layout.removeAllViews();
        
        layout.addView(evento, lpp);
        layout.addView(programacao, lpp);
        layout.addView(turismo, lpp);
        layout.addView(interatividade, lppb);
    }
    
    public void startEventoActivity() {
    	Intent intent = new Intent(this, EventoActivity.class);
    	this.startActivity(intent);
    }
    
    public void startProgramacaoActivity() {
    	Intent intent = new Intent(this, ProgramacaoActivity.class);
    	this.startActivity(intent);
    }
    
    public void startTurismoActivity() {
    	Intent intent = new Intent(this, ProgramacaoActivity.class);
    	this.startActivity(intent);
    }
    
    public void startInteratividadeActivity() {
    	Intent intent = new Intent(this, ProgramacaoActivity.class);
    	this.startActivity(intent);
    }
}
