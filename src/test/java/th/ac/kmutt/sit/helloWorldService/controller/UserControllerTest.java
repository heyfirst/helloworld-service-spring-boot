package th.ac.kmutt.sit.helloWorldService.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserControllerTest {

    UserController userController;
    ArrayList<User> expected;

    @Before
    public void setUp() throws Exception {
        userController = new UserController();

        expected = new ArrayList<User>();
        for(int i = 0; i < 10; i++) {
            expected.add(new User(i, "User No." + i, 21 ));
        }
    }

    @Test
    public void getUsers() {
        Assert.assertEquals(expected, userController.getUsers());

    }

    @Test
    public void getUser() {
        Assert.assertEquals(expected.get(1), userController.getUser(1));

    }
}