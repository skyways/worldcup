package fixtures.table.a2018.prediction.football.goal.cup.world.com.worldcup2018;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView date,teams,time,stadium;
    Button home,away,draw;

    public ViewHolder(View itemView) {
        super(itemView);
        date=(TextView)itemView.findViewById(R.id.date);
        teams=(TextView)itemView.findViewById(R.id.teams);
        time=(TextView)itemView.findViewById(R.id.time);
        stadium=(TextView)itemView.findViewById(R.id.stadium);

       home=(Button)itemView.findViewById(R.id.home);
       away=(Button)itemView.findViewById(R.id.away);
       draw=(Button)itemView.findViewById(R.id.draw);


    }
}
