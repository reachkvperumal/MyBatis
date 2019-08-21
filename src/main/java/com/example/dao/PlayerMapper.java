package com.example.dao;

import com.example.model.PlayerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayerMapper {

    @Select("select  t.Name, t.TeamID, mp.PlayerID, p.PlayerName from MatchPlayer mp inner join Players p on mp.PlayerID = p.PlayerID " +
            " inner join Teams t on mp.TeamID = t.TeamID where  mp.MatchID =#{matchId} order by t.Name, mp.PlayerID")
    @Results(
            {
                    @Result(property = "teamName", column = "Name"),
                    @Result(property = "teamId", column = "TeamID"),
                    @Result(property = "playerId", column = "PlayerID"),
                    @Result(property = "playerName", column = "PlayerName")
            }
    )
    List<PlayerInfo> findPlayersByMatchId(int matchId);

}
