package br.gov.pe.bezerros.view.adapter;

import java.util.List;
import br.gov.pe.bezerros.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ProgramacaoAdapter extends BaseAdapter {
	private Context context;
	private List<String> atracoes;
	
	public ProgramacaoAdapter(Context context, List<String> atracoes) {
		this.context = context;
		this.atracoes = atracoes;
	}
	
	public int getCount() {
		return this.atracoes.size();
	}

	public Object getItem(int position) {
		return this.atracoes.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View v, ViewGroup vg) {
		String atracao = this.atracoes.get(position);
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.programacaolistitem, null);
		
		TextView txtNome = (TextView) view.findViewById(R.id.programacaolistitem);
		txtNome.setText(atracao);
		txtNome.setTextColor(Color.BLACK);
		
		Drawable image = this.context.getResources().getDrawable(R.drawable.bloco);;
		if(atracao.equals("Shows")) {
			image = this.context.getResources().getDrawable(R.drawable.show);
		} else if(atracao.equals("Atrações")) {
			image = this.context.getResources().getDrawable(R.drawable.atracao);
		}
		
		image.setBounds(-10, 0, 20, 30);
		txtNome.setCompoundDrawables(image, null, null, null);
		
		return view;
	}

}
