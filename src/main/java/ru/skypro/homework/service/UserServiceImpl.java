package ru.skypro.homework.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPasswordDTO;
import ru.skypro.homework.dto.UpdateUserDTO;
import ru.skypro.homework.dto.UserDTO;

public class UserServiceImpl implements UserService {
    @Override
    public UserDTO getCurrentUser() {
        return null;
    }

    @Override
    public UserDTO updateUser(UpdateUserDTO updateUserDTO) {
        return null;
    }

    @Override
    public Void setPassword(NewPasswordDTO newPasswordDTO) {
        return null;
    }

    @Override
    public void updateUserImage(MultipartFile image, String userName) {

    }
}
