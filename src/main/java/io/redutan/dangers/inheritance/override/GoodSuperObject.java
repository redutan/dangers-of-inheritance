package io.redutan.dangers.inheritance.override;

/**
 * 필드를 private로 닫는다.
 * final로 메서드를 닫는다.
 * 결론 : 부수효과가 없어져서 LSP를 만족할 수 있다.
 */
public class GoodSuperObject {
    private Long id;
    private String title;

    public final Long getId() {
        return id;
    }

    protected final void setId(Long id) {
        if (id < 0) {
            this.id = 0L;
        } else {
            this.id = id;
        }
    }

    public final String getTitle() {
        return title;
    }

    protected final void setTitle(String title) {
        if (title == null || title.length() == 0) {
            this.title = "empty";
        } else {
            this.title = title;
        }
    }
}

