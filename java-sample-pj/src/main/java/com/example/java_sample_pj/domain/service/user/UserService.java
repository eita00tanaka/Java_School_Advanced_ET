package com.example.java_sample_pj.domain.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// import com.example.java_sample_pj.domain.model.user.ResponseUserRegist;
import com.example.java_sample_pj.domain.model.user.User;
import com.example.java_sample_pj.domain.repository.UserRepository;
// import com.example.java_sample_pj.util.user.PasswordUtil;

/**
 * ユーザー情報 Service
 */
// @RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepository userRepository;

  /**
   * ユーザー情報 全検索
   * 
   * @return 検索結果
   */
  public List<User> searchAll() {
    return userRepository.findAll();
  }
}
