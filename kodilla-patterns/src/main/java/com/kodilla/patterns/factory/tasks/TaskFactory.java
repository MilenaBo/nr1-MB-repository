package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final  String SHOPPING = "SHOPPING";
    public static final  String PAINTING = "PAINTING";
    public static final  String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("zakupy w Biedronce","pomidory",10);
            case PAINTING:
                return new PaintingTask("mieszkanie J.Kowalskiego","bialy","");
            case DRIVING:
                return new DrivingTask("jazda próbna ","Kraków","odbyła się 10wrz2020" );
            default: return null;
        }
    }
}
