package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{

    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String getTaskName() {   return taskName;      }
    @Override
    public String executeTask()  {  return where;}
    @Override
    public Boolean isTaskExecuted() {
        System.out.println(taskName+"  do miejscowości  "+where+"   "+using);
        Boolean a = true;
        String s="";
        s=using;
        if (s=="") {a=false; System.out.println("!!!  NIE ODBYŁA SIĘ JAZDA DO:  "+where);}
        return a;
    }
}
