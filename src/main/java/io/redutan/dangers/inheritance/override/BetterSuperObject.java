package io.redutan.dangers.inheritance.override;

/**
 * 필드를 불변으로 만든다.
 */
public class BetterSuperObject {
    private final Long id;
    private final String title;

    // public or protected ?
    public BetterSuperObject(Long id, String title) {
        if (id < 0L) {
            this.id = 0L;
        } else {
            this.id = id;
        }
        if (title == null || title.length() == 0) {
            this.title = "empty";
        } else {
            this.title = title;
        }
    }

    public final Long getId() {
        return id;
    }

    public final String getTitle() {
        return title;
    }
}
