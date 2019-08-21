package com.example;

import com.example.dao.PlayerMapper;
import com.example.dao.PublisherMapper;
import com.example.dao.UserDao;
import com.example.model.PlayerInfo;
import com.example.model.Publisher;
import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

  @Autowired
  PlayerMapper playerMapper;
  //PublisherMapper publisherMapper;  // Mybatis generated bean

  /*@Autowired
  UserDao userDao;*/

  /*@Test
  public void findPublishers() {
    System.out.println( publisherMapper.getClass().getName());
    List<Publisher> publishers = publisherMapper.findAll();
    for (Publisher publisher : publishers) {
      System.out.println(publisher);
      assertThat(publisher.getName(), is(not(nullValue())));
    }
    assertThat(publishers.size(), is(greaterThan(0)));
  }*/


 /* @Test
  public void findsSomeUsers() {
    List<User> allUsers = userDao.findOrderedUsers();
    for (User user : allUsers) {
      System.out.println(user);
      assertThat(user.getUserName(), is(not(nullValue())));
    }
    assertThat(allUsers.size(), is(greaterThan(0)));
  }*/

 @Test
  public void findMatchPlayers() throws Exception{
   List<PlayerInfo> playersByMatchId = playerMapper.findPlayersByMatchId(1267);
   playersByMatchId.forEach(t -> {
     System.out.printf("Player Name : %s%nPlayer ID:%d%n", t.getPlayerName(), t.getPlayerId());
   });

   assertThat(playersByMatchId.size(), is(greaterThan(0)));
 }

}
