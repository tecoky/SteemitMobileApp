package tutorial.android.tecoky2u.steemitmobileapp.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static {
        addItem(new DummyItem("1", "Steemit", "www.steemit.com"));
        addItem(new DummyItem("2", "Utopian-io", "www.utopian.io"));
        addItem(new DummyItem("3", "Dtube", "www.dtube.com"));
        addItem(new DummyItem("4", "DLive", "www.dlive.com"));
        addItem(new DummyItem("5", "Busy", "www.busy.com"));
        addItem(new DummyItem("6", "AdSactly", "www.steemit.com/@adsactly"));
        addItem(new DummyItem("7", "Utopian-Edu", "www.steemit.com/@utopian-edu"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String item_name;
        public final String url;

        public DummyItem(String id, String item_name, String url) {
            this.id = id;
            this.item_name = item_name;
            this.url = url;
        }


        @Override
        public String toString() {
            return item_name;

        }
    }
}
