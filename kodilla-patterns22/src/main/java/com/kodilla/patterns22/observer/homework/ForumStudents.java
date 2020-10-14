package com.kodilla.patterns22.observer.homework;

public class ForumStudents implements CourseObserver    {
    private final String username;
    private int updateCount;

    public ForumStudents(String username) {
        this.username = username;
    }
    @Override
    public void update(ForumCourse forumCourse) {
        System.out.println(username+":  New message  "+forumCourse.getName()+"\n"+"(total: "+
                forumCourse.getMessages().size()+" messages");
        updateCount++;
    }
    public String getUsername() {
        return username;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
