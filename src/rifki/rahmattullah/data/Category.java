package rifki.rahmattullah.data;

/**
 * Generate Getter and Setter
 * 1. GO to Code navigator
 * 2. Klick Generate
 * 3. Select Getter and Setter
 * 4. Select Variable did you want to generate
 * 5. Klick OK button
 */
// Contoh Getter and Setter
public class Category {

    private String id;

    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null){
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
