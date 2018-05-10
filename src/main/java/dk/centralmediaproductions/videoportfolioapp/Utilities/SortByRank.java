package dk.centralmediaproductions.videoportfolioapp.Utilities;

import dk.centralmediaproductions.videoportfolioapp.Entities.Video;

import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;

public class SortByRank {



    public ArrayList<Video> getListByRank(Iterable<Video> list) {
        ArrayList<Video> unsortedList = Lists.newArrayList(list);
        ArrayList<Video> sortedList = new ArrayList<>();

        //lægger første ind
        for (Video v : unsortedList) {
            if (v.getRankNumber()==1) {
                sortedList.add(v);
                unsortedList.remove(v);
            }
        }

        //finder størrelse på video
        while(!unsortedList.isEmpty()) {
            for (int i=0; i<unsortedList.size(); i++) {
                if(unsortedList.get(i).getRankNumber() + 1 == sortedList.get(sortedList.size()-1).getRankNumber());
                    sortedList.add(unsortedList.get(i));
                    unsortedList.remove(i);
                }
            return sortedList;
        } return null;
    }



        public int size(Iterable<?> it) {
            if (it instanceof Collection)
                return ((Collection<?>)it).size();

            // else iterate

            int i = 0;
            for (Object obj : it) i++;
            return i;
        }
}
