package io.redutan.dangers.inheritance.override;

/**
 * 필드가 캡슐화 되지 않고 열려 있다.
 * getter 변경(override)에 열려 있다.
 */
public class BadSuperObject {
    protected Long id;
    protected String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id < 0L) {
            this.id = 0L;
        } else {
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.length() == 0) {
            this.title = "empty";
        } else {
            this.title = title;
        }
    }
}
