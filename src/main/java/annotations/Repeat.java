package annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Repeats.class)
public @interface Repeat {
    int parm() default 0;
}
