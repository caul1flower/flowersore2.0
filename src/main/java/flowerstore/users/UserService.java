package flowerstore.users;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(AppUser appUser) {
        if (userRepository.findAppUserByEmail(appUser.getEmail()).isEmpty()) {
            userRepository.save(appUser);
        }
        userRepository.save(appUser);
    }
}
