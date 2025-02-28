package com.korit.boardback.repository;

import com.korit.boardback.entity.User;
import com.korit.boardback.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(userMapper.selectByUsername(username));
    }

    public Optional<User> findById(int userId) {
        return Optional.ofNullable(userMapper.selectById(userId));
    }

    public User save(User user) {
        userMapper.insert(user);
        return user;
    }

    public Optional<User> login(User user) {
        return Optional.ofNullable(userMapper.select(user.getUsername()));
    }

    public void updateProfileImg(int userId, String profileImg) {
        userMapper.updateProfileImgById(userId, profileImg);
    }

    public void updateNickname(int userId, String nickname) {
        userMapper.updateNicknameById(userId, nickname);
    }

    public void updatePassword(int userId, String password) {
        userMapper.updatePasswordById(userId, password);
    }

    public void updateAccountEnabled(String username) {
        userMapper.updateAccountEnabledByUsername(username);
    }
}
