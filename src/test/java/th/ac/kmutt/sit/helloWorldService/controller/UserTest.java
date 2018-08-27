package th.ac.kmutt.sit.helloWorldService.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user;

    @Before
    public void setUp() throws Exception {
        user = new User(1,"John Doe", 22);
    }

    @Test
    public void getId() {
        int expected = 1;
        Assert.assertEquals(expected, this.user.getId());
    }

    @Test
    public void setId() {
        this.user.setId(2);
        int expected = 2;
        Assert.assertEquals(expected, this.user.getId());
    }

    @Test
    public void getName() {
        String expected = "John Doe";
        Assert.assertEquals(expected, this.user.getName());
    }

    @Test
    public void setName() {
        this.user.setName("Robert");
        String expected = "Robert";
        Assert.assertEquals(expected, this.user.getName());
    }

    @Test
    public void getAge() {
        int expected = 22;
        Assert.assertEquals(expected, this.user.getAge());
    }

    @Test
    public void setAge() {
        this.user.setAge(99);
        int expected = 99;
        Assert.assertEquals(expected, this.user.getAge());
    }
}