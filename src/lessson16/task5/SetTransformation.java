package lessson16.task5;
import java.util.Set;

public class SetTransformation {

    public Set union(Set... set){
        Set[] sets = new Set[set.length];
        System.arraycopy(set,0,sets,0,set.length);
        for (int i = 0; i < sets.length-1; i++) {
        sets[i+1].addAll(sets[i]);
        }
        return sets[sets.length-1];
    }

    public Set intersect(Set... set){
        for (int i = 0; i < set.length-1; i++) {
            set[i+1].retainAll(set[i]);
        }
        return set[set.length-1];
    }
}
