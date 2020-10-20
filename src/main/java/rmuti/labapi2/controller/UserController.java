package rmuti.labapi2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rmuti.labapi2.model.bean.APIResponse;
import rmuti.labapi2.model.service.UserDataRepository;
import rmuti.labapi2.model.tables.UserData;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserDataRepository userDataRepository;


    @PostMapping("/login")
    public Object login(@RequestParam String userName, String passWord) {
        APIResponse res = new APIResponse();

        UserData userData = userDataRepository.findByUserNameAndPassWord(userName, passWord);
        if (userData == null) {
            res.setData(0);
        } else {
            res.setData(1);

        }
        return res;
    }

    @PostMapping("/register")
    public Object register(UserData userData) {
        APIResponse res = new APIResponse();
        UserData dbUserData = userDataRepository.save(userData);
        return res;
    }

}
