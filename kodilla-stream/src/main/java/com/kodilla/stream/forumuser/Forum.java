package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();
    public Forum() {
        theForumUser.add(new ForumUser(1,"Ala",'F',1989,12));
        theForumUser.add(new ForumUser(2,"Ania",'F',1999,0));
        theForumUser.add(new ForumUser(3,"Adam",'M',1979,100));
        theForumUser.add(new ForumUser(4,"Alex",'M',1960,33));
        theForumUser.add(new ForumUser(5,"Alojz",'M',1959,44));
    }
public List<ForumUser> getList() {
        return new ArrayList<>(theForumUser);
}

}
