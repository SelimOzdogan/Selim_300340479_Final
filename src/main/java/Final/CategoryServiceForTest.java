package Final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoryServiceForTest {
    private SavingInterface ck;

    public CategoryServiceForTest(SavingInterface ck) {
        this.ck = ck;
    }

    public List<Saving> retrievedata() {
        List<Saving> filtered = new ArrayList<>();
//        List<Saving> categories = ck.retrieveTodos();
//
//        for (Saving cats : categories) {
//            if (cats.getCatcode().contains("catcode1")) {
//                filtered.add(cats);
//            }
//        }
        return filtered;
    }

    public HashMap<String, String> Discount() {
//        List<Saving> categories = ck.retrieveTodos();
        HashMap<String, String> map2 = new HashMap<String, String>();

//        for (Saving cats : categories) {
//            if (cats.getCatcode().contains("1")) {
//                map2.put(cats.getCatcode(), "1");
//            }
//        }
        return map2;
    }
}
