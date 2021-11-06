package org.generation.jpamysqlsample.service;


import org.generation.jpamysqlsample.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService
{

    User getUser( Integer id );

    List<User> getBetween(Integer first, Integer second);

    public List<User> findByName(String name);

    User save( User user );

    void delete( Integer id );

}
