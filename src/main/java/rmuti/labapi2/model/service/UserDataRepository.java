package rmuti.labapi2.model.service;

import org.springframework.data.jpa.repository.JpaRepository;
import rmuti.labapi2.model.tables.UserData;

import java.util.Optional;

public interface UserDataRepository extends JpaRepository<UserData, Integer> {
   public UserData findByUserNameAndPassWord(String userName, String passWord);

}
