package br.gov.pe.bezerros.view;

import java.util.ArrayList;
import java.util.List;
import br.gov.pe.bezerros.R;
import br.gov.pe.bezerros.view.adapter.ProgramacaoAdapter;
import android.app.ListActivity;
import android.os.Bundle;

public class ProgramacaoActivity extends ListActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.programacao);
        
        List<String> atracoes = new ArrayList<String>();
        atracoes.add("Blocos");
        atracoes.add("Shows");
        atracoes.add("Atrações");
        
        this.setListAdapter(new ProgramacaoAdapter(this, atracoes));
    }
}
