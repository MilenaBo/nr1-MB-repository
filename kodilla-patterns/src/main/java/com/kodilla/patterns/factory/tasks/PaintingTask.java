package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String getTaskName()     { return taskName;      }

    @Override
    public String executeTask()     {return color;    }

    @Override
    public Boolean isTaskExecuted() {
        System.out.println(taskName+"  na kolor  "+color);
        Boolean a = true;
        String s="";
        s=whatToPaint;
        if (s=="") {a=false; System.out.println("!!!  NIE WYKONANO MALOWANIA na kolor:  "+color);}
        return a;
    }

}
