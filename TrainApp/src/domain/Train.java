package domain;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private final List<String> bogies;

    public Train() {
        bogies = new ArrayList<>();
    }

    public List<String> getBogies() {
        return bogies;
    }

    public int getBogieCount() {
        return bogies.size();
    }
}