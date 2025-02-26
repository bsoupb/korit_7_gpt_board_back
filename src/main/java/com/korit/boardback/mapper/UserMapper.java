package com.korit.boardback.mapper;

import com.korit.boardback.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectByUsername(String username);
    User selectById(int userId);

    int insert(User user);

    User select(String username);

    int updateProfileImgById(
            @Param("userId") int userId,
            @Param("profileImg") String profileImg);

    int updateNicknameById(@Param("userId") int userId,
                           @Param("nickname") String nickname);

}
