package mx.edu.ittepic.tam14_zulmacoronel;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zulma on 12/03/2018.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderAlumnos> implements View.OnClickListener,View.OnCreateContextMenuListener {
    ArrayList<Alumnos> listaAlumnos;
    private View.OnClickListener listener;
    Context context;
    public Adaptador(ArrayList<Alumnos> listaAlumnos,Context context) {
        this.listaAlumnos = listaAlumnos;
        this.context=context;
    }

    @Override
    public ViewHolderAlumnos onCreateViewHolder(ViewGroup parent, int viewType) {
        int layout=R.layout.activity_vista;
        View view= LayoutInflater.from(parent.getContext()).inflate(layout,null,false);
        view.setOnClickListener(this);
        view.setOnCreateContextMenuListener(this);
        return new ViewHolderAlumnos(view);
    }
    @Override
    public void onBindViewHolder(ViewHolderAlumnos holder, int position) {

        holder.card.setCardBackgroundColor(listaAlumnos.get(position).getColor());
        holder.nombrealumno.setText(listaAlumnos.get(position).getNombre());
        holder.informacionalumno.setText(listaAlumnos.get(position).getNumeroControl());

        int imageResource = context.getResources().getIdentifier(listaAlumnos.get(position).getFoto(), null, context.getPackageName());
        holder.imagen.setImageDrawable(context.getResources().getDrawable(imageResource));

    }

    @Override
    public int getItemCount() {
        return listaAlumnos.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {

    }


    public class ViewHolderAlumnos extends RecyclerView.ViewHolder {

        TextView nombrealumno,informacionalumno;
        ImageView imagen;
        CardView card;

        public ViewHolderAlumnos(View itemView) {
            super(itemView);
            card=(CardView) itemView.findViewById(R.id.caview);
            nombrealumno= (TextView) itemView.findViewById(R.id.nombre);
            informacionalumno= (TextView) itemView.findViewById(R.id.detalles);
            imagen= (ImageView) itemView.findViewById(R.id.icono);
        }
    }
}

