package io.redutan.dangers.inheritance.override;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SuperObjectTest {
    @Test
    public void bad() {
        BadObject badObject = new BadObject(-1L, "");
        assertThat(badObject.getId(), is(-1L));
        assertThat(badObject.getTitle(), is(""));

        BadSuperObject badSuperObject = new BadSuperObject();
        badSuperObject.setId(0L);
        badSuperObject.setTitle("empty");
    }

    @Test
    public void good() {
        GoodObject goodObject = new GoodObject(-1L, "");
        assertThat(goodObject.getId(), is(0L));
        assertThat(goodObject.getTitle(), is("empty"));
    }

    @Test
    public void better() {
        BetterObject betterObject = new BetterObject(-1L, "");
        assertThat(betterObject.getId(), is(0L));
        assertThat(betterObject.getTitle(), is("empty"));

        BetterSuperObject betterSuperObject = new BetterSuperObject(-1L, "");
        assertThat(betterSuperObject.getId(), is(0L));
        assertThat(betterSuperObject.getTitle(), is("empty"));
    }
}

class BadObject extends BadSuperObject {
    public BadObject(Long id, String title) {
        super.id = id;
        super.title = title;
    }
}

class GoodObject extends GoodSuperObject {
    public GoodObject(Long id, String title) {
        super.setId(id);
        super.setTitle(title);
    }
}

class BetterObject extends BetterSuperObject {
    public BetterObject(Long id, String title) {
        super(id, title);
    }
}